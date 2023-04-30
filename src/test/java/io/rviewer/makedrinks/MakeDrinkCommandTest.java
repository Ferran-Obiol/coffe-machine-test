package io.rviewer.makedrinks;


import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import picocli.CommandLine;

import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class MakeDrinkCommandTest {

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

 //   @Ignore
    @Test
    @UseDataProvider("drinkCombinations")
    public void testCoffeeMachineReturnsExpectedOutputForCoffeeCombinations(
            String[] args, String expectedMessage
    ) {
        StringWriter sw = new StringWriter();
        MakeDrinkCommand makeDrinkCommand = new MakeDrinkCommand();
        CommandLine cmdline = new CommandLine(makeDrinkCommand);
        cmdline.setOut(new PrintWriter(sw));

        cmdline.execute(args);
        System.out.println("ExpectedMessage = " + expectedMessage);
        System.out.println("Result from printwriter = " + sw);
        assertEquals(expectedMessage, sw.toString());
    }

    @DataProvider
    public static Object[][] drinkCombinations() {
        return new Object[][]{
                {new String[]{"COFFEE", "1", "1"}, "You have ordered a coffee with 1 sugars (stick included)\r\n"},
                {new String[]{"COFFEE", "1", "1", "-e"}, "You have ordered a coffee extra hot with 1 sugars (stick included)\r\n"},
                {new String[]{"COFFEE", "1", "0"}, "You have ordered a coffee with 0 sugar\r\n"},
                {new String[]{"COFFEE", "0.1", "1"}, "The coffee costs 0.5.\r\n"},

                {new String[]{"TEA", "1", "1"}, "You have ordered a tea with 1 sugars (stick included)\r\n"},
                {new String[]{"TEA", "1", "1", "-e"}, "You have ordered a tea extra hot with 1 sugars (stick included)\r\n"},
                {new String[]{"TEA", "1", "0"}, "You have ordered a tea with 0 sugar\r\n"},
                {new String[]{"TEA", "0.1", "1"}, "The tea costs 0.4.\r\n"},

                {new String[]{"CHOCOLATE", "1", "1"}, "You have ordered a chocolate with 1 sugars (stick included)\r\n"},
                {new String[]{"CHOCOLATE", "1", "1", "-e"}, "You have ordered a chocolate extra hot with 1 sugars (stick included)\r\n"},
                {new String[]{"CHOCOLATE", "1", "0"}, "You have ordered a chocolate with 0 sugar\r\n"},
                {new String[]{"CHOCOLATE", "0.1", "1"}, "The chocolate costs 0.6.\r\n"},
        };
    }

}

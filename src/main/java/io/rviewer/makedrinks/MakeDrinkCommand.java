package io.rviewer.makedrinks;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Option;
import java.math.BigDecimal;
import java.util.concurrent.Callable;

@Command(name = "makedrink")
public class MakeDrinkCommand implements Callable<Integer> {
    @CommandLine.Spec
    CommandLine.Model.CommandSpec spec;
    @Parameters(arity = "1", index = "0", description = "The type of the drink."
            + " Valid values: ${COMPLETION-CANDIDATES}")
    private Drink drinkType;

    @Parameters(arity = "1", index = "1", description = "The amount of money "
            + "given by the user")
    private BigDecimal userMoney;

    //TODO: Check if constants can be used on arity
    @Parameters(arity = "0...1", index = "2", description = "The number of "
            + "sugars the user wants. (0, 1, 2)", defaultValue = "0")
    private Integer sugarsNo;

    @Option(names = {"-e", "--extra-hot"}, required = false,
            description = "If the user wants to make the drink extra hot",
            defaultValue = "false")
    private Boolean isExtraHot;

    @Override
    public Integer call() {
        if (ArgumentsValidator.checkParameters(userMoney, drinkType, sugarsNo, spec)) {
            String message;
            message = "You have ordered a " + drinkType.getName();
            if (isExtraHot) {
                message += " extra hot";
            }
            if (sugarsNo > 0) {
                message += " with " + sugarsNo + " sugars (stick included)";
            } else {
                message += " with " + sugarsNo + " sugar";
            }
            spec.commandLine().getOut().println(message);
            return 0;
        }
        else return 1;
    }
}

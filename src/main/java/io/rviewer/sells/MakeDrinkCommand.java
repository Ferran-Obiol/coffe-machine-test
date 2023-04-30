package io.rviewer.sells;

import io.rviewer.makedrinks.ArgumentsValidator;
import io.rviewer.makedrinks.Drink;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.math.BigDecimal;
import java.util.concurrent.Callable;

@Command(name = "sells")
public class MakeDrinkCommand implements Callable<Integer> {
    @CommandLine.Spec
    CommandLine.Model.CommandSpec spec;

    @Override
    public Integer call() {
return 0;
    }
}

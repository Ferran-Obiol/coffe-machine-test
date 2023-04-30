package io.rviewer;

import io.rviewer.makedrinks.MakeDrinkCommand;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;


@Command(name = "CoffeeMachine",  mixinStandardHelpOptions = true, description = "...",
        subcommands = {MakeDrinkCommand.class})
public class CoffeeMachine implements Callable<Integer> {

  public static void main(String[] args) {
    new CommandLine(new CoffeeMachine()).
            setCaseInsensitiveEnumValuesAllowed(true).
            execute(args);
  }

  @Override
  public Integer call() {
    System.out.println("Subcommand needed: 'makecofee', 'sells'");
    return 0;
  }
}

package io.rviewer.makedrinks;

import picocli.CommandLine;

import java.math.BigDecimal;

public class ArgumentsValidator {

  public static final Integer MIN_NUMBER_OF_SUGAR = 0;
  public static final Integer MAX_AMOUNT_OF_SUGAR = 2;

  public static boolean checkParameters(BigDecimal userMoney, Drink drink, Integer sugarsNo, CommandLine.Model.CommandSpec spec) {
    boolean correct = true;
      if (drink.getPrice().compareTo(userMoney) > 0) {
        spec.commandLine().getOut().println("The " + drink.getName() + " costs " + drink.getPrice() + ".");
        correct = false;
      }
      if (sugarsNo < MIN_NUMBER_OF_SUGAR || sugarsNo > MAX_AMOUNT_OF_SUGAR) {
        spec.commandLine().getOut().println("The number of sugars should be between " + MIN_NUMBER_OF_SUGAR + " and " + MAX_AMOUNT_OF_SUGAR + ".");
        correct = false;
      }
    return correct;
  }
}

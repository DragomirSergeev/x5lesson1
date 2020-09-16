package ru.x5.hw05.task1;

import java.util.ArrayList;

public class Calculator {

    private final LoggerFactory factory;
    private final Logger logger;

    private String action = " ";
    private Double[] opr = new Double[2];

    public Calculator(LoggersType type) {
        switch (type) {
            case DB:
                factory = new DbLoggerFactory();
                break;
            case FILE:
                factory = new FileLoggerFactory();
                break;
            case CONSOLE:
                factory = new ConsoleLoggerFactory();
                break;
            default:
                factory = new ConsoleLoggerFactory();
        }
        this.logger = factory.createLogger();

    }

    boolean validString(String in) {
        if (in.contains("+")) {
            action = "\\+";
        } else if (in.contains("-")) {
            action = "-";
        } else if (in.contains("*")) {
            action = "\\*";
        } else if (in.contains("/")) {
            action = "/";
        } else {
            printError("Выражение должно содержать + - * или / для выполнения действия!");
            return false;
        }
        String[] expr = in.split(action);
        if (expr.length > 2 || expr.length < 1) {
            printError("Выражение должно содержать 2 значения.");
            return false;
        }
        for (int i = 0; i < 2; i++) {
            try {
                opr[i] = Double.parseDouble(expr[i].trim());
            } catch (NumberFormatException ex) {
                printError("Число должно быть либо целым, либо double ( '1' или '1.55'");
                opr = new Double[2];
                return false;
            }
        }

        return true;
    }

    void calculate(String expression) {
        if (!validString(expression)) return;
        if (action.equals("-")) {
            subtraction(opr[0], opr[1]);
        } else if (action.equals("\\+")) {
            summation(opr[0], opr[1]);
        } else if (action.equals("/")) {
            division(opr[0], opr[1]);
        } else if (action.equals("\\*")) {
            multiplication(opr[0], opr[1]);
        }
        opr = new Double[2];
    }

    void logResult(Double d) {
        logger.log(String.format("%(.1f", d));
    }

    void subtraction(double a, double b) {
        logResult(a - b);
    }

    void summation(double a, double b) {
        logResult(a + b);
    }

    void division(double a, double b) {
        logResult(a / b);
    }

    void multiplication(double a, double b) {
        logResult(a * b);
    }

    void printError(String message) {
        System.out.println("Ошибка: " + message);
    }
}

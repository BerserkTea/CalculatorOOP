package view;

import log.ConsoleLogger;
import log.LogCalculableFactorySimpl;
import service.CalculableSimpl;
import service.ICalculableFactorySimpl;

import java.util.Scanner;

/**
 * Вью-функция для работы с простым калькулятором
 * Реализует действия: сложение, вычитание, умножение, деление
 */
public class ViewSimpleCalculator {

    private ICalculableFactorySimpl calculableFactorySimpl;

    public ViewSimpleCalculator(ICalculableFactorySimpl calculableFactory) {
        this.calculableFactorySimpl = new LogCalculableFactorySimpl(new ConsoleLogger());
    }

    public void run() {
        while (true) {
            Double primaryArg = promptDouble("Введите первый аргумент: ");
            CalculableSimpl calculator = calculableFactorySimpl.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, -, /, =) : ");
                if (cmd.equals("*")) {
                    double arg = promptDouble("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    double arg = promptDouble("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("-")) {
                    double arg = promptDouble("Введите второй аргумент: ");
                    calculator.difference(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    double arg = promptDouble("Введите второй аргумент: ");
                    calculator.division(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    double result = calculator.getResult();
                    System.out.print("Результат " + result + "\n");
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}

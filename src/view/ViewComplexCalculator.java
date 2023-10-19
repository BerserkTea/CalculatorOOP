package view;

import log.ConsoleLogger;
import log.LogCalculableFactoryCompl;
import service.CalculableCompl;
import service.ICalculableFactoryCompl;

import java.util.Scanner;

/**
 * Вью-функция для работы с простым калькулятором
 * Реализует действия: сложение, вычитание, умножение, деление
 * INPUT1, INPUT2 - константы для уменьшения объема текста
 */
public class ViewComplexCalculator {
    private ICalculableFactoryCompl calculableFactoryCompl;
    String INPUT1 = "Введите вещественное число второго комплексного числа: ";
    String INPUT2 = "Введите мнимое число второго комплексного числа: ";

    public ViewComplexCalculator(ICalculableFactoryCompl calculableFactory) {
        this.calculableFactoryCompl = new LogCalculableFactoryCompl(new ConsoleLogger());
    }

    public void run() {
        while (true) {
            Double primaryArgReal = promptDouble("Введите вещественное число комплексного числа: ");
            Double primaryArgImaginary = promptDouble("Введите мнимое число комплексного числа: ");
            CalculableCompl calculator = calculableFactoryCompl.create(primaryArgReal, primaryArgImaginary);
            while (true) {
                String cmd = prompt("Введите команду (*, +, -, /, =) : ");
                if (cmd.equals("*")) {
                    Double realArg = promptDouble(INPUT1);
                    Double imagionaryArg = promptDouble(INPUT2);
                    calculator.multi(realArg, imagionaryArg);
                    continue;
                }
                if (cmd.equals("+")) {
                    Double realArg = promptDouble(INPUT1);
                    Double imagionaryArg = promptDouble(INPUT2);
                    calculator.sum(realArg, imagionaryArg);
                    continue;
                }
                if (cmd.equals("-")) {
                    Double realArg = promptDouble(INPUT1);
                    Double imagionaryArg = promptDouble(INPUT2);
                    calculator.difference(realArg, imagionaryArg);
                    continue;
                }
                if (cmd.equals("/")) {
                    Double realArg = promptDouble(INPUT1);
                    Double imagionaryArg = promptDouble(INPUT2);
                    calculator.division(realArg, imagionaryArg);
                    continue;
                }
                if (cmd.equals("=")) {
                    String result = calculator.getResult();
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

package controller;

import service.CalculableFactoryCompl;
import service.CalculableFactorySimpl;
import service.ICalculableFactoryCompl;
import service.ICalculableFactorySimpl;
import view.ViewComplexCalculator;
import view.ViewSimpleCalculator;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Controller {
    private ICalculableFactorySimpl calculableFactorySimpl;
    private ICalculableFactoryCompl calculableFactoryCompl;

    public Controller() {
        calculableFactorySimpl = new CalculableFactorySimpl();
        calculableFactoryCompl = new CalculableFactoryCompl();
    }

    public void start() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Какой калькулятор желаете использовать? " +
                    "\n 1 - для комплексных чисел" +
                    "\n 2 - стандартный");
            String startChoice = scanner.nextLine();
            if (startChoice.equals("1")) {
                try {
                    ViewComplexCalculator view = new ViewComplexCalculator(calculableFactoryCompl);
                    view.run();
                } catch (Exception E) {
                    System.out.println("Вероятнее всего ошибка входных данных!");
                }

            }
            if (startChoice.equals("2")) {
                try {
                    ViewSimpleCalculator view = new ViewSimpleCalculator(calculableFactorySimpl);
                    view.run();
                } catch (Exception E) {
                    System.out.println("Вероятнее всего ошибка входных данных!");
                }
            }
            System.out.println("Вернуться к выбору калькулятора (Y/N)?");
            startChoice = scanner.nextLine();
            if (startChoice.equals("Y")) {
                continue;
            }
            break;
        }
    }
}

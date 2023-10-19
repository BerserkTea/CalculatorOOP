package log;

import service.CalculableSimpl;

/**
 * Ведение и вывод логов для простого калькулятора
 * Здесь реализован прицнип Single Responsibility Principle
 * Класс LogSimpleCalculator используется исключительно для логирования
 * калькулятора простых чисел
 */
public class LogSimpleCalculator implements CalculableSimpl {
    private Logable logger;
    private CalculableSimpl calculatorSimple;

    public LogSimpleCalculator(CalculableSimpl calculatorSimple, Logable logger) {
        this.logger = logger;
        this.calculatorSimple = calculatorSimple;
    }

    @Override
    public CalculableSimpl sum(double arg) {
        logger.log("Сложение старого значения " + calculatorSimple.getResult() + " с новым " + arg);
        return calculatorSimple.sum(arg);
    }

    @Override
    public CalculableSimpl multi(double arg) {
        logger.log("Умножение старого значения " + calculatorSimple.getResult() + " на новое " + arg);
        return calculatorSimple.multi(arg);
    }

    @Override
    public CalculableSimpl difference(double arg) {
        logger.log("Вычитание из " + calculatorSimple.getResult() + " значение " + arg);
        return calculatorSimple.difference(arg);
    }

    @Override
    public CalculableSimpl division(double arg) {
        logger.log("Деление значения " + calculatorSimple.getResult() + " на значение " + arg);
        return calculatorSimple.division(arg);
    }

    @Override
    public double getResult() {
        return calculatorSimple.getResult();
    }
}

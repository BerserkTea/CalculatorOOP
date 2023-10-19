package log;

import service.CalculableCompl;

/**
 * Ведение и вывод логов для калькулятора комплексных чисел
 * Здесь реализован прицнип Single Responsibility Principle
 * Класс LogComplexCalculator используется исключительно для логирования
 * калькулятора комплексных чисел
 */
public class LogComplexCalculator implements CalculableCompl {
    private Logable logger;
    private CalculableCompl calculableCompl;

    public LogComplexCalculator(CalculableCompl calculableCompl, Logable logger) {
        this.logger = logger;
        this.calculableCompl = calculableCompl;
    }

    @Override
    public CalculableCompl sum(Double realArg, Double imaginaryArg) {
        if (imaginaryArg > 0) {
            logger.log("Сложение старого значения " + calculableCompl.toString() + "i" +
                    " с новым " + realArg + "+" + imaginaryArg + "i");
        } else {
            logger.log("Сложение старого значения " + calculableCompl.toString() + "i" +
                    " с новым " + realArg + imaginaryArg + "i");
        }
        return calculableCompl.sum(realArg, imaginaryArg);
    }

    @Override
    public CalculableCompl multi(Double realArg, Double imaginaryArg) {
        if (imaginaryArg > 0) {
            logger.log("Умножение старого значения " + calculableCompl.toString() + "i" +
                    " на новое " + realArg + "+" + imaginaryArg + "i");
        } else {
            logger.log("Умножение старого значения " + calculableCompl.toString() + "i" +
                    " на новое " + realArg + imaginaryArg + "i");
        }
        return calculableCompl.multi(realArg, imaginaryArg);
    }

    @Override
    public CalculableCompl difference(Double realArg, Double imaginaryArg) {
        if (imaginaryArg > 0) {
            logger.log("Вычитание из старого значения " + calculableCompl.toString() + "i" +
                    " нового " + realArg + "+" + imaginaryArg + "i");
        } else {
            logger.log("Вычитание из старого значения " + calculableCompl.toString() + "i" +
                    " нового " + realArg + imaginaryArg + "i");
        }
        return calculableCompl.difference(realArg, imaginaryArg);
    }

    @Override
    public CalculableCompl division(Double realArg, Double imaginaryArg) {
        if (imaginaryArg > 0) {
            logger.log("Деление старого значения " + calculableCompl.toString() + "i" +
                    " на новое " + realArg + "+" + imaginaryArg + "i");
        } else {
            logger.log("Деление старого значения " + calculableCompl.toString() + "i" +
                    " на новое " + realArg + imaginaryArg + "i");
        }
        return calculableCompl.division(realArg, imaginaryArg);
    }

    @Override
    public String getResult() {
        return calculableCompl.getResult();
    }
}

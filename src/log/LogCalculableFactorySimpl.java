package log;

import models.SimpleCalculator;
import service.CalculableSimpl;
import service.ICalculableFactorySimpl;

/**
 * Создает логгер либо для простого калькулятора,
 * либо для калькулятора с комплексными числами
 */
public class LogCalculableFactorySimpl implements ICalculableFactorySimpl {

    private Logable logger;

    public LogCalculableFactorySimpl(Logable logger) {
        this.logger = logger;
    }

    @Override
    public CalculableSimpl create(double primaryArg) {
        return new LogSimpleCalculator(new SimpleCalculator(primaryArg), logger); // create logCalculator from SIMPLE
    }
}

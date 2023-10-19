package log;

import models.ComplexNumbCalc;
import service.CalculableCompl;
import service.ICalculableFactoryCompl;

public class LogCalculableFactoryCompl implements ICalculableFactoryCompl {
    private Logable logger;

    public LogCalculableFactoryCompl(Logable logger) {
        this.logger = logger;
    }
    @Override
    public CalculableCompl create(Double realArg, Double imaginaryArg) {
        return new LogComplexCalculator(new ComplexNumbCalc(realArg, imaginaryArg), logger); // create logCalculator from COMPLEX
    }
}

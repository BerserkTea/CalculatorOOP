package service;

import models.ComplexNumbCalc;

/**
 * Здесь реализован Single Responsibility Principle
 * В данном классе реализован только метод создания калькулятора комплексных чисел
 */
public class CalculableFactoryCompl implements ICalculableFactoryCompl{
    @Override
    public CalculableCompl create(Double realArg, Double imaginaryArg) {
        return new ComplexNumbCalc(realArg, imaginaryArg); // create calculator
    }
}

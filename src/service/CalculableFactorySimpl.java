package service;

import models.SimpleCalculator;

/**
 * Здесь реализован Single Responsibility Principle
 * В данном классе реализован только метод создания простого калькулятора
 */
public class CalculableFactorySimpl implements ICalculableFactorySimpl {
    @Override
    public CalculableSimpl create(double primaryArg) {
        return new SimpleCalculator(primaryArg); // create calculator
    }
}

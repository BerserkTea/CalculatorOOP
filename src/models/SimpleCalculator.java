package models;

import service.CalculableSimpl;

/**
 * Класс SimpleCalculator является моделью простого калькулятора
 * Здесь реализован принцип Single Responsibility Principle, т к в данном
 * классе описан только один функционал простого калькулятора
 * Так же здесь реализован Interface Segregation Principle
 * Используются все методы, реализуемые от интерфейса
 */
public final class SimpleCalculator implements CalculableSimpl {

    private Double primaryArg;

    public SimpleCalculator(double primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public CalculableSimpl sum(double arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public CalculableSimpl multi(double arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public CalculableSimpl difference(double arg) {
        primaryArg -= arg;
        return this;
    }

    @Override
    public CalculableSimpl division(double arg) {
        primaryArg /= arg;
        return this;
    }

    @Override
    public double getResult() {
        return primaryArg;
    }
}

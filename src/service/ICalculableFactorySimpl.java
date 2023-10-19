package service;

/**
 * Здесь, и в ICalculableFactoryCompl реализован Interface Segregation Principle
 * Интерфейсы содержат только используемые методы
 */
public interface ICalculableFactorySimpl {
    CalculableSimpl create(double primaryArg); // create simple calculator
}

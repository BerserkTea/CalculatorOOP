package service;

/**
 * Здесь, и в ICalculableFactorySimpl реализован Interface Segregation Principle
 * Интерфейсы содержат только используемые методы
 */
public interface ICalculableFactoryCompl {
    CalculableCompl create(Double realArg, Double imagioaryArg); // create complex calculator
}

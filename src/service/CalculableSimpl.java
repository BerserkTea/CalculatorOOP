package service;

/**
 * Интерфейс с методами для работы с простыми числами
 * Здесь реализван Interface Segregation Principle
 * В данном интерфейсе используются все методы, реализуемые в классе
 * А так же Open-Closed Principle на добавление нового функционала
 */
public interface CalculableSimpl {
    CalculableSimpl sum(double arg);
    CalculableSimpl multi(double arg);
    CalculableSimpl difference(double arg);
    CalculableSimpl division(double arg);
    double getResult();
}

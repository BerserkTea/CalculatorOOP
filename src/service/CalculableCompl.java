package service;

/**
 * Интерфейс с методами для работы с комплексными числами
 * Здесь реализван Interface Segregation Principle
 * В данном интерфейсе используются все методы, реализуемые в классе
 * А так же Open-Closed Principle на добавление нового функционала
 */
public interface CalculableCompl {
    CalculableCompl sum(Double realArg, Double imaginaryArg);
    CalculableCompl multi(Double realArg, Double imaginaryArg);
    CalculableCompl difference(Double realArg, Double imaginaryArg);
    CalculableCompl division(Double realArg, Double imaginaryArg);
    String getResult();
}

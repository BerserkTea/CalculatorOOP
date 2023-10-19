package models;

import service.CalculableCompl;


/**
 * Класс ComplexNumbCalc является моделью калькулятора комплексных чисел
 * Здесь реализован принцип Single Responsibility Principle, т к в данном
 * классе описан только один функционал калькулятора комплесных чисел
 * Так же здесь реализован Interface Segregation Principle
 * Используются все методы, реализуемые от интерфейса
 */
public class ComplexNumbCalc implements CalculableCompl {
    private Double primaryRealNumber;
    private Double primaryImaginaryNumber;

    public ComplexNumbCalc(Double primaryRealNumber, Double primaryImaginaryNumber) {
        this.primaryRealNumber = primaryRealNumber;
        this.primaryImaginaryNumber = primaryImaginaryNumber;
    }

    @Override
    public ComplexNumbCalc sum(Double real, Double imaginary) {
        primaryRealNumber += real;
        primaryImaginaryNumber += imaginary;
        return this;
    }

    @Override
    public ComplexNumbCalc multi(Double real, Double imaginary) {
        Double resReal = (primaryRealNumber * real) - (primaryImaginaryNumber * imaginary);
        Double resImagionary = (primaryRealNumber * imaginary) + (primaryImaginaryNumber * real);
        primaryRealNumber = resReal;
        primaryImaginaryNumber = resImagionary;
        return this;
    }

    @Override
    public ComplexNumbCalc difference(Double real, Double imaginary) {
        primaryRealNumber -= real;
        primaryImaginaryNumber -= imaginary;
        return this;
    }

    @Override
    public ComplexNumbCalc division(Double realNumber, Double imaginaryNumber) {
        Double resReal = (primaryRealNumber * realNumber + primaryImaginaryNumber * imaginaryNumber) /
                (realNumber * realNumber + imaginaryNumber * imaginaryNumber);
        Double resImagionary = (primaryImaginaryNumber * realNumber - primaryRealNumber * imaginaryNumber) /
                (realNumber * realNumber + imaginaryNumber * imaginaryNumber);
        primaryRealNumber = resReal;
        primaryImaginaryNumber = resImagionary;
        return this;
    }

    @Override
    public String getResult() {
        if (primaryImaginaryNumber > 0) {
            return primaryRealNumber.toString() + "+" + primaryImaginaryNumber.toString() + "i";
        } else {
            return primaryRealNumber.toString() + primaryImaginaryNumber.toString() + "i";
        }
    }

    @Override
    public String toString() {
        if (primaryImaginaryNumber > 0) {
            return primaryRealNumber.toString() + "+" + primaryImaginaryNumber.toString();
        } else {
            return primaryRealNumber.toString() + primaryImaginaryNumber.toString();
        }
    }
}

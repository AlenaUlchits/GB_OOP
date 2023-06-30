package hw7.service;

import hw7.model.ComplexNumber;

public class ComplexNumOperationsServiceImpl implements ComplexNumOperationsService{
    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2){
        double resultReal = num1.getReal() + num2.getReal();
        double resultIm = num1.getIm() + num2.getIm();
        ComplexNumber result = new ComplexNumber(resultReal, resultIm);
        return  result;
    }
    @Override
    public ComplexNumber subtraction(ComplexNumber num1, ComplexNumber num2) {
        double resultReal = num1.getReal() - num2.getReal();
        double resultIm = num1.getIm() - num2.getIm();
        ComplexNumber result = new ComplexNumber(resultReal, resultIm);
        return  result;
    }
    @Override
    public ComplexNumber multiplication(ComplexNumber num1, ComplexNumber num2) {
        double resultReal = num1.getReal() * num2.getReal() - num1.getIm() * num2.getIm() ;
        double resultIm = num1.getIm() * num2.getReal() + num1.getReal() * num2.getIm();
        ComplexNumber result = new ComplexNumber(resultReal, resultIm);
        return  result;
    }
    @Override
    public ComplexNumber division(ComplexNumber num1, ComplexNumber num2) {
        double resultReal = (num1.getReal() * num2.getReal() + num1.getIm() * num2.getIm()) /
                (num2.getReal() * num2.getReal() + num2.getIm() * num2.getIm());
        double resultIm = (num1.getIm() * num2.getReal() - num1.getReal() * num2.getIm()) /
                (num2.getReal() * num2.getReal() + num2.getIm() * num2.getIm());
        ComplexNumber result = new ComplexNumber(resultReal, resultIm);
        return  result;
    }
}

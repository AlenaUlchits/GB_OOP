package hw7.service;

import hw7.model.ComplexNumber;

public interface ComplexNumOperationsService {
    ComplexNumber add(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber subtraction(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber multiplication(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber division(ComplexNumber num1, ComplexNumber num2);
}

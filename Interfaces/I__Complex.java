package Homeworks.Seminar5.Interfaces;

import Homeworks.Seminar5.Operations.Complex;

public interface I__Complex extends I__GetNumbers{
    Complex add(Complex c1, Complex c2);
    Complex sub(Complex c1, Complex c2);
    Complex mult(Complex c1, Complex c2);
    Complex div(Complex c1, Complex c2);
}

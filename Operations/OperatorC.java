package Homeworks.Seminar5.Operations;

import Homeworks.Seminar5.Interfaces.I__Complex;

public class OperatorC extends Complex implements I__Complex {
    public OperatorC(){

    }
    @Override
    public <T extends Number> void getX(T val) {
        this.real = (Double)val;
    }

    @Override
    public <T extends Number> void getY(T val) {
        this.image = (Double)val;
    }
    @Override
    public Complex add(Complex c1, Complex c2) {
        Complex c3 = new Complex();
        c3.real = c1.real + c2.real;
        c3.image = c1.image + c2.image;
        return c3;
    }
    @Override
    public Complex sub(Complex c1, Complex c2) {
        Complex c3 = new Complex();
        c3.real = c1.real - c2.real;
        c3.image = c1.image - c2.image;
        return c3;
    }
    @Override
    public Complex mult(Complex c1, Complex c2) {
        Complex c3 = new Complex();
        c3.real = c1.real*c2.real - c1.image*c2.image;
        c3.image = c1.real*c2.image + c1.image*c2.real;
        return c3;
    }
    @Override
    public Complex div(Complex c1, Complex c2) {
        Complex c3 = new Complex();
        c3.real = (c1.real*c2.real - c1.image*c2.image)/(c2.real*c2.real + c2.image*c2.image);
        c3.image = (c1.image*c2.real - c1.real*c2.image)/(c2.real*c2.real + c2.image*c2.image);
        return c3;
    }

}

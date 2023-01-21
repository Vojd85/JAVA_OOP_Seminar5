package Homeworks.Seminar5;

public class OperatorC extends Complex implements I__Complex {
    public OperatorC(){

    }
    @Override
    public void getReal(int re) {
        this.real = re;
    }
    @Override
    public void getImage(int im) {
        this.image = im;
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
}

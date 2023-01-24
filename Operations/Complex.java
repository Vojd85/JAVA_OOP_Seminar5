package Homeworks.Seminar5.Operations;

public class Complex{
    public double real;
    public double image;
    public Complex(double re, double im){
        this.real = re;
        this.image = im;
    }
    public Complex(){
        this(0,0);
    }
    @Override
    public String toString() {
        if (image>0) return String.format("%.1f+%.1fi", real, image);
        else return String.format("%.1f%.1fi", real, image);
    }



}

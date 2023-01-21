package Homeworks.Seminar5;

public class Complex{
    int real, image;
    public Complex(int re, int im){
        this.real = re;
        this.image = im;
    }
    public Complex(){
        this(0,0);
    }
    @Override
    public String toString() {
        if (image>0) return String.format("%d+%di", real, image);
        else return String.format("%d%di", real, image);
    }



}

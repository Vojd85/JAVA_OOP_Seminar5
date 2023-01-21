package Homeworks.Seminar5;

import java.util.Scanner;

public class UserView{
    Scanner sc = new Scanner(System.in);

    public double getValue(){
        System.out.println("Введите число: ");
        double val;
        if (sc.hasNextDouble()){
            val = sc.nextDouble();
            sc.nextLine();
        } else {
            System.out.println("Неверное значение! Попробуйте снова: ");
            sc.next();
            val = getValue();
        }
        return val;
    }

    public int getInt(){
        int val;
        if(sc.hasNextInt()){
            val = sc.nextInt();
            sc.nextLine();
        } else {
            System.out.println("Неверное значение! Попробуйте снова: ");
            sc.next();
            val = getInt();
            
        }
        return val;
    }

    public Complex getComplex(){
        Complex temp = new Complex();
        System.out.println("Введите реальную часть: ");
        temp.real = getInt();
        System.out.println("Введите мнимую часть: ");
        temp.image = getInt();
        return temp;

    }

    public char getOperation(){
        char op;
        System.out.println("Введите символ операции(+ - * /): ");
        if (sc.hasNext()){
            op = sc.next().charAt(0);
        } else {
            System.out.println("Неверный символ! Попробуйте снова:");
            op = getOperation();
        }
        return op;
    }

    public char getOperationD(){
        char op;
        System.out.println("Введите символ операции(+ -): ");
        if (sc.hasNext()){
            op = sc.next().charAt(0);
        } else {
            System.out.println("Неверный символ! Попробуйте снова:");
            op = getOperation();
        }
        return op;
    }

    public <T> void printRes(T res){
        System.out.println("Результат: " + res);
    }

}

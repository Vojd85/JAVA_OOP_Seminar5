package Homeworks.Seminar5.Operations;

import java.util.Scanner;

// Принцип единственной ответственности 

public class GetValue { // Класс отвечает за сбор символов операции и числовых значений
    Scanner sc = new Scanner(System.in);

    public double getDouble(){
        double val;
        if (sc.hasNextDouble()){
            val = sc.nextDouble();
            sc.nextLine();
        } else {
            System.out.println("Неверное значение! Попробуйте снова: ");
            sc.next();
            val = getDouble();
        }
        return val;
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
}

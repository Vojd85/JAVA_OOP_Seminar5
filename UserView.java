package Homeworks.Seminar5;

import Homeworks.Seminar5.Interfaces.I__PrintConsole;
import Homeworks.Seminar5.Operations.Complex;
import Homeworks.Seminar5.Operations.GetValue;

// Принцип открытости/закрытости - расширяет поведение GetValue

// Принцип подстановки Лисков - не ломает поведение GetValue и делает больше, как наследник

public class UserView extends GetValue implements I__PrintConsole{
    
    public Complex getComplex(){
        Complex temp = new Complex();
        System.out.println("Введите реальную часть: ");
        temp.real = getDouble();
        System.out.println("Введите мнимую часть: ");
        temp.image = getDouble();
        
        return temp;

    }
    
    public <T> void printRes(T res){
        System.out.println("Результат: " + res);
    }

}

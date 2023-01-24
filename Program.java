/*
Рефакторинг и\или оптимизация проекта предыдущего дз с учетом теоретических основ SOLID’а
*/

package Homeworks.Seminar5;

import java.io.IOException;

import Homeworks.Seminar5.Operations.OperatorC;
import Homeworks.Seminar5.Operations.OperatorDoubleNum;

public class Program {
    public static void main(String[] args) throws SecurityException, IOException{
        Config calc = new Config(new UserView(), new OperatorDoubleNum(), new OperatorC());
        
        calc.start();
        
    }
}

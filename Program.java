/*
Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, 
добавив в неё систему логирования. 
*/

package Homeworks.Seminar5;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws SecurityException, IOException{
        Config calc = new Config(new UserView(), new OperatorDoubleNum(), new OperatorC());
        
        calc.start();
        
    }
}

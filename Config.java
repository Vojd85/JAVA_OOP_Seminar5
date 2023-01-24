package Homeworks.Seminar5;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import Homeworks.Seminar5.Interfaces.I__Complex;
import Homeworks.Seminar5.Interfaces.I__DoubleNum;
import Homeworks.Seminar5.Operations.Complex;

import java.util.logging.FileHandler;

public class Config {
    UserView view;
    I__DoubleNum modelD;
    I__Complex modelC;

    public Config(UserView v, I__DoubleNum m, I__Complex c){
        view = v;
        modelD = m;
        modelC = c;
    }
    public void start()throws SecurityException, IOException{
        
        Logger logger = Logger.getLogger(Program.class.getName());
        FileHandler toFile = new FileHandler("C:/Users/Вождь/Desktop/SecondQuarter/OOP/Homeworks/Seminar5/calc_log.txt", true);
        logger.setUseParentHandlers(false);
        logger.addHandler(toFile);
        SimpleFormatter sFormat = new SimpleFormatter();
        toFile.setFormatter(sFormat);

        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while(b){
            System.out.println("Выберите тип чисел: 1 - рациональные числа; 2 - комплексные числа; 3 - Выход ");
            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    System.out.println("Введите первое число: ");
                    double num1 = view.getDouble();
                    System.out.println("Введите второе число: ");
                    double num2 = view.getDouble();
                    char op = view.getOperation();
                    modelD.getX(num1);;
                    modelD.getY(num2);
                    double res;
                    switch(op){
                        case '+':
                            res = modelD.sumNumbers();
                            logger.info("Результат: " + num1 + op + num2 + "=" + res);
                            view.printRes(res);
                            break;
                        case '-':
                            res = modelD.subtractNumbers();
                            logger.info("Результат: " + num1 + op + num2 + "=" + res);
                            view.printRes(res);
                            break;
                        case '*':
                            res = modelD.multNumbers();
                            logger.info("Результат: " + num1 + op + num2 + "=" + res);
                            view.printRes(res);
                            break;
                        case '/':
                            res = modelD.divisionNumbers();
                            logger.info("Результат: " + num1 + op + num2 + "=" + res);
                            view.printRes(res);
                            break;
                        default:
                            System.out.println("такой операции нет");
                            logger.info("Ошибка ввода операции: " + op);
                    }
                    break;
                case 2:
                    System.out.println("Введите поля для первого числа");
                    Complex c1 = view.getComplex();
                    System.out.println("Введите поля для второго числа");
                    Complex c2 = view.getComplex();
                    Complex temp = new Complex();
                    char oper = view.getOperation();
                    switch(oper){
                        case '+':
                            temp = modelC.add(c1, c2);
                            logger.info(String.format("(%s)+(%s) = %s", c1, c2, temp));
                            view.printRes(temp);
                            break;
                        case '-':
                            temp = modelC.sub(c1, c2);
                            logger.info(String.format("(%s)-(%s) = %s", c1, c2, temp));
                            view.printRes(temp);
                            break;
                        case '*':
                            temp = modelC.mult(c1, c2);
                            logger.info(String.format("(%s)*(%s) = %s", c1, c2, temp));
                            view.printRes(temp);
                            break;
                        case '/':
                            temp = modelC.div(c1, c2);
                            logger.info(String.format("(%s)*(%s) = %s", c1, c2, temp));
                            view.printRes(temp);
                            break;
                        default:
                            System.out.println("Такой операции нет!");
                            logger.info("Ошибка ввода операции: " + oper);
                    }
                    break;
                case 3:
                    System.out.println("До новых встреч!");
                    sc.close();
                    b = false;
                    break;
                default: System.out.println("Неправильный ввод! Попробуйте еще раз ");
            }
        }
    }
}

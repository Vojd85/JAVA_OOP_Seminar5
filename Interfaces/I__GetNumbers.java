package Homeworks.Seminar5.Interfaces;

// Принцип разделения интерфейса

public abstract interface I__GetNumbers {
    <T extends Number> void getX(T val);
    <T extends Number> void getY(T val);
}

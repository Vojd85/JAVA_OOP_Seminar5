package Homeworks.Seminar5;

public class OperatorDoubleNum extends CalcNumber {
    public OperatorDoubleNum(){

    }
    @Override
    public double sumNumbers() {
        return x + y;
    }
    @Override
    public double subtractNumbers() {
        return x - y;
    }
    @Override
    public double multNumbers() {
        return x * y;
    }
    @Override
    public double divisionNumbers() {
        return x / y;
    }
    @Override
    public void getX(double val) {
        super.x = val;
    }
    @Override
    public void getY(double val) {
        super.y = val;
    }

}

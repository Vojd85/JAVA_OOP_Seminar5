package Homeworks.Seminar5.Operations;

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
    public <T extends Number> void getX(T val) {
        super.x = (Double)val;
    }
    @Override
    public <T extends Number> void getY(T val) {
        super.y = (Double)val;
    }

}

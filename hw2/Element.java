package hw2;

public class Element {
    private Double firstNum;

    public Element() {
    }

    public Element(Double firstNum) {
        this.firstNum = firstNum;
    }

    public Double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(Double firstNum) {
        this.firstNum = firstNum;
    }

    public Double add(Double secondNum){
        return this.firstNum + secondNum;
    }

    public Double minus(Double secondNum){
        return this.firstNum - secondNum;
    }

    public Double multiple(Double secondNum){
        return this.firstNum * secondNum;
    }

    public Double divide(Double secondNum){
        return this.firstNum/secondNum;
    }
}

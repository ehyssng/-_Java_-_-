package Inheritance.example2;

class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {	// SubstractionableCalculator 클래스에 매개변수가 있는 생성자를 생성.
        this.left = left;
        this.right = right;
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);	// 인자를 넣어주어, 생성자 호출
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
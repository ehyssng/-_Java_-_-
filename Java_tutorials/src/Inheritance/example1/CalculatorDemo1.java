package Inheritance.example1;
 
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
 
class SubstractionableCalculator extends Calculator {	// Calculator 부모 클래스로부터 상속 받은 SubstractionableCalculator 자식 클래스는 부모 클래스의 변수 및 메소드를 사용할 수 있다.
    public void substract() {
        System.out.println(this.left - this.right);	// this.left와 this.right 변수는 SubstractionableCalculator 클래스에 선언이 안되어 있기 때문에 부모 클래스의 변수를 사용한다.
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);	// Calculator 클래스의 기존 메소드
        c1.sum();	// Calculator 클래스의 기존 메소드
        c1.avg();	// Calculator 클래스의 기존 메소드
        c1.substract();	// SubstractionableCalculator 클래스에서 추가로 생성한 메소드
    }
 
}
package Inheritance.example1;
 
class MultiplicationableCalculator extends Calculator {	// MultiplicationableCalculator 자식 클래스는 Calculator 부모 클래스로부터 상속을 받아 부모 클래스의 필드, 메소드를 호출할 수 있다.
    public void multiplication() {
        System.out.println(this.left * this.right);	// 부모 클래스의 인스턴스 변수인 this.left, this.right를 호출하여 사용함.
    }
}
 
public class CalculatorDemo2 {
 
    public static void main(String[] args) {
 
        MultiplicationableCalculator c1 = new MultiplicationableCalculator();
        c1.setOprands(10, 20);	// 부모 클래스의 메소드 사용
        c1.sum();	// 부모 클래스의 메소드 사용
        c1.avg();	// 부모 클래스의 메소드 사용
        c1.multiplication();	// 자식 클래스의 메소드 사용
    }
 
}
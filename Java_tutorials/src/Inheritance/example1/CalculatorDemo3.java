package Inheritance.example1;
 
class DivisionableCalculator extends MultiplicationableCalculator {	// DivisionableCalculator 자식 클래스는 MultiplicationableCalculator 부모 클래스로부터 상속을 받아 부모 클래스의 필드, 메소드를 호출할 수 있다. 
    public void division() {
        System.out.println(this.left / this.right);	// DivisionableCalculators 클래스는 자신의 메소드 division()를 생성하였고, 이 메소드는 자신의 부모 클래스의 부모 클래스인 Calculator 클래스의 인스턴스 변수를 호출하여 사용한다.
    }
    // 하나의 부모 클래스로부터 여러 개의 자식 클래스는 상속을 받을 수 있고, 상속 받은 자식 클래스는 자신이 부모 클래스가 되어 자신의 자식 클래스에게 상속할 수 있다. 이렇게 상속은 무궁무진하게 사용이 가능하다.
}
 
public class CalculatorDemo3 {
 
    public static void main(String[] args) {
 
        DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();
    }
 
}
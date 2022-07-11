package Inheritance.example2;

class Calculator3 {
    int left, right;
     
    public Calculator3(){}
     
    public Calculator3(int left, int right){
        this.left = left;
        this.right = right;
    }
     
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
class SubstractionableCalculator3 extends Calculator3 {
    public SubstractionableCalculator3(int left, int right) {
        super(left, right);	// super는 부모클래스를 뜻하고, super 옆에 ()가 붙으면 생성자라는 뜻함.
    }	// 부모 클래스의 매개변수가 있는 생성자는 left, right에 자식 클래스 생성자 매개변수를 인자로 받는다.
    	// 자식 클래스의 초기화 코드는 무조건 super 밑으로 코딩되어야 한다. 안그러면 에러가 발생한다.
    
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo3 {
    public static void main(String[] args) {
        SubstractionableCalculator3 c1 = new SubstractionableCalculator3(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
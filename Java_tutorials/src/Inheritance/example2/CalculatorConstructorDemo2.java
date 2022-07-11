package Inheritance.example2;

class Calculator2 {	// 기본 생성자가 존재하지 않는다. java는 어떠한 생성자가 명시되어 있는 경우, 자동으로 기본 생성자를 생성해주지 않는다.
    int left, right;
    // 자식 클래스가 부모 클래스의 기본 생성자를 호출하는데, 기본 생성자가 존재하지 않아 에러가 발생한다.
    
    public Calculator2(){    // 기본 생성자를 명시적으로 생성해주면 된다. (수정 코드)
        
    }
    
    public Calculator2(int left, int right){
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
 
class SubstractionableCalculator2 extends Calculator2 {	// 자식 클래스의 생성자가 호출되면, 자식 클래스는 부모 클래스의 생성자를 자동으로 호출하도록 되어있다.
    public SubstractionableCalculator2(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo2 {
    public static void main(String[] args) {
        SubstractionableCalculator2 c1 = new SubstractionableCalculator2(10, 20);	// 자식 클래스의 생성자를 호출.
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
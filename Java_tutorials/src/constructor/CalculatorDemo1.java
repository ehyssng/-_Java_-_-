package constructor;
 
class Calculator {
    int left, right;
 
    public Calculator(int left, int right) {	// 생성자(Constructor)를 생성할 때는 클래스와 동일한 이름으로 메소드를 만들어야 한다.
        this.left = left;
        this.right = right;
    }
    // 생성자는 클래스가 실행될 때, 최우선으로 실행되도록 약속되어있다. 그래서 최우선으로 초기화 작업을 실행해준다.
    // 클래스는 객체가 생성될 때, 생성자가 없으면 자동으로 생성하고, 있으면 생성된 생성자를 실행한다.
    
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator(10, 20);	// new 뒤에 Calculator는 클래스가 아닌 생성자를 호출하는 것이다.
        c1.sum();
        c1.avg();
 
        Calculator c2 = new Calculator(20, 40);
        c2.sum();
        c2.avg();
    }
 
}
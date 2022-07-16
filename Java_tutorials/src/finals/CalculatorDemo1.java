package finals;
 
class Calculator {
    static final double PI = 3.14;	// final을 통해 변수 PI는 3.14로 고정함.
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6;	// 변수 PI는 final로 고정되어 있기 때문에 다른 상수로 할당하려고 한다면 에러가 발생하게 된다.
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10;	// 변수 PI는 final로 고정되어 있기 때문에 다른 상수로 할당하려고 한다면 에러가 발생하게 된다.
 
 
    }
 
}
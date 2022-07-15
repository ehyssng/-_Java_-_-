package abstractclass.example3;

abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    public abstract void sum();  
    public abstract void avg();
    public void run(){
        sum();	// 추상 메소드 sum을 호출
        avg();	// 추상 메소드 avg를 호출
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){	// sum() 메소드를 오버라이딩
        System.out.println("+ sum :"+(this.left+this.right));
    }
    public void avg(){	// avg() 메소드를 오버라이딩
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){	// sum() 메소드를 오버라이딩
        System.out.println("- sum :"+(this.left+this.right));
    }
    public void avg(){	// avg() 메소드를 오버라이딩
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) { 
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);	// CalculatorDecoPlus 클래스에는 setOprands 메소드가 없기 때문에 부모 클래스의 setOprands 메소드를 호출한다.
        c1.run();	// CalculatorDecoPlus 클래스에는 run 메소드가 없기 때문에 부모 클래스의 run 메소드를 호출한다.
        // 자식 클래스에는 run 메소드가 호출하는 sum(), avg() 메소드가 오버라이딩 되어있어서 자식 클래스의 sum(),avg() 메소드를 호출한다.
         
        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();
    }
   
}
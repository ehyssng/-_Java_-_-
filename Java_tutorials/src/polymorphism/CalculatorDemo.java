package polymorphism;
abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    int _sum() {
        return this.left + this.right;
    }
    public abstract void sum();  
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+_sum());
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+_sum());
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
} 
public class CalculatorDemo {
    public static void execute(Calculator cal){	// Calculator 클래스가 데이터 타입인 cal이라는 매개변수를 가진 execute 메소드를 정의함.
        System.out.println("실행결과");	// "실행결과"라는 문자열을 출력
        cal.run();	// 매개변수로 들어온 인스턴스의 run()를 호출
    }
    public static void main(String[] args) { 
        Calculator c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
         
        Calculator c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
         
        execute(c1);
        execute(c2);
        // 두 개의 인스턴스가 Calculator라는 같은 데이터 타입을 가지고 있기 때문에
        // Calculator 데이터 타입을 매개변수로 가지는 execute 메소드를 오버로딩을 사용하지 않고, 중복도 제거하며 사용.
    }
}
package accessmodifier;
 
class Calculator{
    private int left, right;    // 전역변수를 private으로 설정하여, 외부에서 전역변수에 할당을 못하도록 함.
     
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    private int _sum(){ // 민감한 계산 로직을 private로 설정하여, 외부에서 접근하지 못하게 함.
        return this.left+this.right;
    }
    public void sumDecoPlus(){
        System.out.println("++++"+_sum()+"++++");
    }
    public void sumDecoMinus(){
        System.out.println("----"+_sum()+"----");
    }
}
  
public class CalculatorDemo {
    public static void main(String[] args) {        
        Calculator c1 = new Calculator();   // private을 통해 사용자가 Calculator라는 클래스의 사용법을 제한할 수 있고, 간결하게 만들어줄 수 있다.
        c1.setOprands(10, 20);
        c1.sumDecoPlus();
        c1.sumDecoMinus();
    }
}
package object;
 
class Calculator{	// 객체의 설계도 = 클래스
    int left, right;	// 변수 선언
      
    public void setOprands(int left, int right){
        this.left = left; // 매개변수로 받은 인자는 left에 들어가게된다.
        this.right = right;	// this는 인스턴스 자기 자신을 의미하고, 앞에 this. 붙은 변수는 class 초입에 선언한 변수이다.
    }
    // 결과적으로 초입에 선언한 변수에 매개변수로 받은 인자가 들어가게 된다.

    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
  
public class CalculatorDemo4 {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();	// Calculator라는 객체를 new을 사용해 호출해주고, c1이라는 변수에 담아준다. 그리고 변수 c1은 Calculator라는 데이터 타입을 가진다.
        c1.setOprands(10, 20);	// c1이라는 변수에 담긴 Calculator라는 객체의 setOprands라는 메소드를 호출해준다.
        c1.sum();	// c1이라는 변수에 담긴 Calculator라는 객체의 sum이라는 메소드를 호출해준다.       
        c1.avg();	// c1이라는 변수에 담긴 Calculator라는 객체의 avg라는 메소드를 호출해준다.       
 
        // 변수 c1에 담은 실제 객체의 내용(구체적인 객체)을 인스턴스라고 한다.
        
        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();
    }
  
}
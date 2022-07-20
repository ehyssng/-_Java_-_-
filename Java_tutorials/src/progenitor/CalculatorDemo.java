package progenitor;
 
class Calculator{	// 암시적으로 Object라는 부모 클래스를 모든 클래스가 상속 받고 있다.
    int left, right;
      
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
    
    public String toString(){	// Object 클래스의 toString() 메소드 오버라이딩
        return super.toString()+", left : " + this.left + ", right : "+ this.right;	// 기존의 toString() 메소드 로직에 새로운 로직을 추가
    }
}
  
public class CalculatorDemo {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        System.out.println(c1);	// 객체만을 println 메소드의 인자로 넣게되면, Java는 내부적으로 .toString을 호출한다.
        System.out.println(c1.toString());	// toString() 메소드를 호출하건 안하건 동일한 결과를 보여준다.
        // toString() 메소드는 Object의 메소드이며, 모든 클래스는 Object 클래스를 상속 받기 때문에 정의하지 않아도 사용이 가능하다.
        // toString은 어떠한 객체가 있을 때, 그 객체를 문자화 시켜주는 메소드이다.
    }
  
}
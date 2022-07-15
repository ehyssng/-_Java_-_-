package abstractclass.example1;

abstract class A{	// abstract 클래스는 상속을 강제한다.
    public abstract int b();	// abstract 메소드는 오버라이딩을 강제한다.
    //본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    //public abstract int c(){System.out.println("Hello")}
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다. 
    public void d(){
        System.out.println("world");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
//        A obj = new A();	// 상속과 오버라이딩이 되지 않아 에러가 발생한다.
    }
}
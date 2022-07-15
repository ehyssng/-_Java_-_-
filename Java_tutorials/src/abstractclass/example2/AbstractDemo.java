package abstractclass.example2;
abstract class A{
    public abstract int b();
    public void d(){
        System.out.println("world");
    }
}
class B extends A{	// abstract 클래스인 A를 상속하는 B 자식 클래스를 생성해야 한다.
    public int b(){return 1;}	// abstract 메소드인 b()를 오버라이딩해야 한다.
}
public class AbstractDemo {
    public static void main(String[] args) {
        B obj = new B();	// 상속받은 자식 클래스를 obj로 인스턴스함.
        System.out.println(obj.b());	// B 클래스의 메소드 b() 호출
    }
}
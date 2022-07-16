package polymorphism;
class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}	// 부모 클래스 A의 메소드 x()를 오버라이딩함.
    public String y(){return "y";}
}
class B2 extends A{
    public String x(){return "B2.x";}	// 부모 클래스 A의 메소드 x()를 오버라이딩함.
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();	// 클래스 B를 인스턴스화한 obj는 데이터 타입을 부모 클래스인 A를 가진다.
        A obj2 = new B2();	// 클래스 B2를 인스턴스화한 obj2도 데이터 타입을 부모 클래스인 A를 가진다.
        System.out.println(obj.x());	// 자식 클래스 B에서 오버라이딩한 메소드 x()가 호출되지만, 부모 클래스 A에서 가지고 있지 않은 메소드 y()를 호출할 시에는 에러가 발생한다.
        System.out.println(obj2.x());	// 자식 클래스 B2에서 오버라이딩한 메소드 x()가 호출된다.
    }
}
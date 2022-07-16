package polymorphism;
interface I2{
    public String A();	// 메소드 A를 강제함.
}
interface I3{
    public String B();	// 메소드 B를 강제함.
}
class D implements I2, I3{	// 클래스 D는 인터페이스 I2, I3를 구현함.
    public String A(){	// I2의 메소드 A를 구현
        return "A";
    }
    public String B(){	// I3의 메소드 B를 구현
        return "B";
    }
}
public class PolymorphismDemo3 {
    public static void main(String[] args) {
        D obj = new D();	// 클래스 D를 obj 변수에 인스턴스화하고, 데이터 타입은 D를 가짐.
        I2 objI2 = new D();	// 클래스 D를 objI2 변수에 인스턴스화하고, 데이터 타입은 I2를 가짐.
        I3 objI3 = new D();	// 클래스 D를 objI3 변수에 인스턴스화하고, 데이터 타입은 I3를 가짐.
         
        obj.A();
        obj.B();	// 인스턴스 obj는 데이터 타입을 D를 가지기 때문에, 클래스 D에 정의된 메소드 A, B 모두를 호추할 수 있다.
         
        objI2.A();
        //objI2.B();	// 인스턴스 objI2는 데이터 타입을 I2를 가지기 때문에, I2에서 강제한 메소드 A만 호출할 수 있다.
         
        //objI3.A();
        objI3.B();	// 인스턴스 objI3는 데이터 타입을 I3를 가지기 때문에, I3에서 강제한 메소드 B만 호출할 수 있다.
    }
}
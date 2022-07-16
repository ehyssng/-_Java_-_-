package polymorphism;
interface I{}
class C implements I{}
public class PolymorphismDemo2 {
    public static void main(String[] args) {
        I obj = new C();	// 클래스 C를 obj 변수에 인스턴스화 하고, 이 인스턴스는 데이터 타입을 인터페이스 I를 가짐.
    }
}
package polymorphism;
class O{	// 오버로딩도 하나의 다형성이라고 할 수 있다. 같은 메소드이지만 매개변수의 자료형에 따른 다양한 동작 방법이 생기기 때문이다.
    public void a(int param){
        System.out.println("숫자출력");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("문자출력");
        System.out.println(param);
    }
}
public class PolymorphismOverloadingDemo {
    public static void main(String[] args) {
        O o = new O();
        o.a(1);;
        o.a("one");
    }
}
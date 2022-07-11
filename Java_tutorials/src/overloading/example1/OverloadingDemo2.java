package overloading.example1;
public class OverloadingDemo2 extends OverloadingDemo{	// OverloadingDemo 클래스로부터 상속받고 있다.
    void A (String arg1, String arg2){System.out.println("sub class : void A (String arg1, String arg2)");}	// 부모 클래스중에 string 매개변수 2개를 가진 동일한 이름의 메소드가 없기 때문에 오버로딩이 된다.
    void A (){System.out.println("sub class : void A ()");}	// 부모 클래스에 매개변수가 없는 동일한 이름의 메소드가 존재하기 때문에 이 부분은 오버라이딩이 된다.
    public static void main(String[] args) {
        OverloadingDemo2 od = new OverloadingDemo2();
        od.A();
        od.A(1);
        od.A("coding everybody");
        od.A("coding everybody", "coding everybody");
         
    }
}
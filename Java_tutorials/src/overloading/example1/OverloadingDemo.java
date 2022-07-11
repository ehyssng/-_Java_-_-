package overloading.example1;
public class OverloadingDemo {
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");}
//  void A (int param1){System.out.println("void A (int arg1)");}
    // 위의 처럼 매개변수의 이름이 다르다고 해서 오버로딩이 되지 않고, 에러를 발생한다. 오버로딩은 매개변수의 갯수, 타입, 순서가 달라야지 사용이 된다.
    void A (String arg1){System.out.println("void A (String arg1)");}
    //int A (){System.out.println("void A()");}	// 다른 반환 타입을 가져서 에러가 발생함.
    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("coding everybody");
    }
}
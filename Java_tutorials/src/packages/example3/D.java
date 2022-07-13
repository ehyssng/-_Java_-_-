package packages.example3;
import packages.example1.*;
import packages.example2.*;
 
public class D {
    public static void main(String[] args) {
    	packages.example1.B b = new packages.example1.B();	// 이렇게 패키지와 클래스를 명시적으로 인스턴스하게 되면 에러가 발생하지 않는다.
//        B b = new B();	// import한 두 개의 패키지에는 B이라는 동일한 이름을 가진 클래스가 각각 존재하여, 어떤 패키지의 클래스를 가져와야할지 java가 인식하지 못해 에러가 발생하게 된다.
    }
}
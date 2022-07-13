package packages.example2;
import packages.example1.*;	// import할 패키지뒤에 .*를 붙여서 import하게 되면 해당 패키지의 모든 클래스를 불러올 수 있다.
 
public class C {
    public static void main(String[] args) {
        A a = new A();
    }
}
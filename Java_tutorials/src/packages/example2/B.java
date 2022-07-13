package packages.example2;

import packages.example1.A;	// import를 통해 다른 패키지에 있는 클래스를 가져올 수 있다. import할 패키지 뒤에 .A 처럼 원하는 클래스 이름을 입력하면 된다.
import packages.example1.*;	// import할 패키지뒤에 .*를 붙여서 import하게 되면 해당 패키지의 모든 클래스를 불러올 수 있다.

public class B {
    public static void main(String[] args) {
        //클래스 A가 다른 패키지에 있기 때문에 로드 할 수 없다.
        A a = new A();
        // import후에는 에러가 발생하지 않는다.
    }
}
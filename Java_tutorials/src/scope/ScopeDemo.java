package scope;
 
public class ScopeDemo {
 
    static void a() {
        int i = 0;	// 메소드 안에서만 동작하는 변수 = 지역변수(Local variables)
    }	// 지역변수 선언 및 할당.
 
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {	// 지역변수 선언 및 할당.
            a();	// 메소드를 호출했지만 메소드 안에 있는 변수는 메소드 밖에서는 영향을 주지 않는다.
            System.out.println(i);	// 정상적으로 for문의 결과가 나온다.
        }
    }
 
}
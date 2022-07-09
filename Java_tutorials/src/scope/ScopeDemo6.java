package scope;
 
public class ScopeDemo6 {
    static int i = 5;	// 전역변수 i 선언 및 할당
 
    static void a() {
        int i = 10;	// 지역변수 i 선언 및 할당
        b();	// 메소드 b 호출
    }
 
    static void b() {
        System.out.println(i);	// 메소드 b에서는 메소드 a의 지역변수를 인식할 수 없기 때문에 전역변수를 인식해서 출력
    }
 
    public static void main(String[] args) {
        a();	// 메소드 a 호출
    }
    // 메소드가 우선 자기 자신의 지역변수를 사용하거나, 전역변수를 사용하는 것을 정적인 유효범위(static scope, lexical scope)라고 한다.
    // 메소드가 다른 메소드의 있는 지역변수를 사용하는 것을 동적인 유효범위(dynamic scope)라고 한다.
}
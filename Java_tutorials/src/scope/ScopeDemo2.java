package scope;
 
public class ScopeDemo2 {
    static int i;	// 클래스에 직접적으로 속해있는 변수는 전역변수(Global variables)이라고 한다.
    // 전역변수 선언 
    static void a() {
        i = 0;	// 전역변수 할당
    }
 
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {	// 전역변수 할당
            a();	// 전역변수를 0으로 되돌려놓음.
            System.out.println(i);	// i를 계속 0으로 되돌려 놓아서 무한반복.
        }
    }
 
}
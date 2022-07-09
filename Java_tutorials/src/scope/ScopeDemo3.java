package scope;
 
public class ScopeDemo3 {
    static int i;	// 전역변수 선언
     
    static void a() {
        int i = 0;	// 지역변수 선언 및 할당
    }
 
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {	// 전역변수 할당
            a();	// 지역변수는 메소드 밖에서는 영향을 주지 않음.
            System.out.println(i);	// 전역변수 i가 for문의 영향만 받아 출력.
        }
    }
 
}
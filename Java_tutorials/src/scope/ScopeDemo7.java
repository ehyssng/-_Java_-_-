package scope;
 
class C {
    int v = 10;	// 전역변수 v 선언 및 할당
 
    void m() {
        System.out.println(v);	// 전역변수 v 사용
    }
}
 
public class ScopeDemo7 {
 
    public static void main(String[] args) {
        C c1 = new C();	// 인스턴스 c1 선언 및 할당
        c1.m();	// 인스턴스 c1의 m 메소드 호출
    }
 
}
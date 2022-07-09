package scope;
 
class C2 {
    int v = 10;	// 전역변수 v 선언 및 할당
 
    void m() {
        int v = 20;	// 지역변수 v 선언 및 할당
        System.out.println(v);	// 지역변수가 전역변수보다 우선순위가 높기 때문에 변수 v 사용 시 지역변수를 사용.
    }
}
 
public class ScopeDemo8 {
 
    public static void main(String[] args) {
        C2 c1 = new C2();	// 인스턴스 c1 선언 및 할당
        c1.m();	// 인스턴스 c1의 메소드 m 사용
    }
 
}
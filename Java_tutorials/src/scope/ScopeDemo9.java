package scope;
 
class C3 {
    int v = 10; // 전역변수 v 선언 및 할당
 
    void m() {
        int v = 20; // 지역변수 v 선언 및 할당
        System.out.println(this.v); // 전역변수 v 사용(this는 인스턴스 자기 자신을 뜻함. 즉, this.v는 전역변수v를 뜻함.)
    }
}
 
public class ScopeDemo9 {
 
    public static void main(String[] args) {
        C3 c1 = new C3();   // 인스턴스 c1 선언 및 할당
        c1.m(); // 인스턴스 c1의 메소드 m 사용
    }
 
}
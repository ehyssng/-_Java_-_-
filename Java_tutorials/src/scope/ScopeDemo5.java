package scope;
 
public class ScopeDemo5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {	// 지역변수 i 선언 및 할당
            System.out.println(i);	// 지역변수 i 호출
        }
        // System.out.println(i);	// for문 밖에 어디에도 i가 선언되지 않았기 때문에 i를 인식하지 못함.
    }
 
}
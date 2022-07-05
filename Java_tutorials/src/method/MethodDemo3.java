package method;

public class MethodDemo3 {	// 0~9까지 출력하는 애플리케이션을 5번 출력하려고 한다면?(이중 반복문 제외)
	public static void numbering() {	// 메소드 정의
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }	// 메소드는 재활용할 수 있으며, 이 재활용성을 활용하여 코드의 양을 줄일 수 있고, 유지보수에 유리해진다.
    }
 
    public static void main(String[] args) {
        numbering();	// 메소드 호출
        numbering();	// 메소드 호출
        numbering();	// 메소드 호출
        numbering();	// 메소드 호출
        numbering();	// 메소드 호출
    }
}

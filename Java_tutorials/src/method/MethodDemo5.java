package method;

public class MethodDemo5 {	// 여러 개의 인자를 받고 싶을 때
	public static void numbering(int init, int limit) {	// 메소드 정의할 때 받을 여러 개의 인자의 순서에 맞게 매개변수를 정의해주고, 매개변수들 사이에는 ,를 찍어 구분 지어준다.
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering(1, 5);	// 메소드 호출할 때 여러 개의 인자를 보낼 때에는 메소드 정의의 매개변수 순서에 맞게 인자를 넣어주고, 인자들 사이에는 ,를 찍어 구분 지어준다.
    }
}

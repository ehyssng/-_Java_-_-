package method;

public class MethodDemo4 {
	public static void numbering(int limit) {	// 메소드 정의에서 메소드 이름 옆 소괄호 안에 들어가는 변수를 매개변수(parameter)라고 한다.
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering(5);	// 메소드 호출에서 메소드 이름 옆 소괄호 안에 들어가는 값을 인자(argument)라고 한다.
    }
}

// 매개변수(parameter)와 인자(argument)는 대게 혼용해서 사용힌다.
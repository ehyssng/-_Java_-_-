package loop;

public class BreakDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
            if (i == 5)	// i가 5가 되면 break를 통해 반복문이 종료됨.
                break;	// 조건문이나 반복문에서 중괄호 안에 들어가 코드가 한줄이라면 중괄호를 생략할 수 있다.
            System.out.println("Coding Everybody " + i);
        }
	}

}

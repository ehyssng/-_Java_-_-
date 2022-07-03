package loop;

public class ForDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {	// int i = 0은 초기화로 for문 시작 시 1회만 실행된다. 이렇게 초기화를 시키고,
//			두번째 종료조건에서 비교를 해보고 true이면 중괄호 안에 있는 코드를 실행시킨다.
//			그 후 세번째 반복실행인 i++를 하여 i를 1 증가 시킨 후, 종료조건를 비교한 후 true이면 중괄호 안에 코드를 다시 실행시킨다.
//			이렇게 반복을 하다가 종료조건과 비교하여 false인 경우가 되면 for문은 종료가 된다.
            System.out.println("Coding Everybody " + i);
        }
	}

}

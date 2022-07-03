package loop;

public class LoopDepthDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {	// i가 0인 상태에서 아래 반복문이 실행이 된다.
            for (int j = 0; j < 10; j++) {	// j가 0부터 9까지 반복을 하고 나면 위의 i가 1이 되고, 아래 j 반복문을 다시 반복한다.
//            	이렇게 i가 10이 될 때까지 반복문이 중첩되어 반복된다.
                System.out.println(i + "" + j);
            }
        }
	}

}

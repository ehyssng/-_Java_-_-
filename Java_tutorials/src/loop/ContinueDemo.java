package loop;

public class ContinueDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;	// 반복문에서 continue를 만나면 거기서 일단 중단이 되고 반복실행(i++)부터 다시 시작되게 된다.
            System.out.println("Coding Everybody " + i);
        }
	}

}

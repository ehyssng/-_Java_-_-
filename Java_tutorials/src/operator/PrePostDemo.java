package operator;

public class PrePostDemo {

	public static void main(String[] args) {
		int i = 3;
        i++;
        System.out.println(i); // 4 출력
        ++i;
        System.out.println(i); // 5 출력
        System.out.println(++i); // 6 출력
        System.out.println(i++); // 6 출력 i++는 해당 문장이 끝나고 나서 +1이 된다. 때문에 6을 출력한 후 문장이 끝나게 되고, 그 다음 출력문에서 i는 7을 출력하게 된다.
        System.out.println(i); // 7 출력
	}

}

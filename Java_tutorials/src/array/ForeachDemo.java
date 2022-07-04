package array;

public class ForeachDemo {

	public static void main(String[] args) {
		String[] members = { "최진혁", "최유빈", "한이람" };
        for (String e : members) {	// : 뒤에 있는 배열의 데이터를 하나씩 꺼내 e라는 변수 안에 반복하며 담는다.
            System.out.println(e + "이 상담을 받았습니다");
        }
	}

}

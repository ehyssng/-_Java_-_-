package array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		String[] members = { "최진혁", "최유빈", "한이람" };	// members는 문자열로 구성된 배열
        for (int i = 0; i < members.length; i++) {	// members.length는 members라는 배열이 갖을 수 있는 데이터의 갯수
            String member = members[i];	// member라는 변수는 i에 따른 members 인덱스의 데이터를 담는다.
            System.out.println(member + "이 상담을 받았습니다");
        }
	}

}

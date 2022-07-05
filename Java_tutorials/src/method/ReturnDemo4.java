package method;

public class ReturnDemo4 {
	public static String[] getMembers() {
        String[] members = { "최진혁", "최유빈", "한이람" };
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
    }
}
// return은 하나의 값만 출력할 수 있지만, 메소드 본문에서 여러 개의 값들을 배열로 담아
// 배열을 return하게 되면 여러 개의 값들을 배열 형태로 반환할 수 있다.
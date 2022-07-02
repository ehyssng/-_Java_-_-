package compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);	// false
        System.out.println(a.equals(b));	// true
        
//        문자와 문자를 비교할 때에는 "=="를 쓰면 false가 나오기 때문에 .equals 메소드를 사용해야 된다.
	}

}
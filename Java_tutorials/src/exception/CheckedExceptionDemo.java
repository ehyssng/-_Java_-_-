package exception;
import java.io.*;	// 사용할 클래스들이 java.io 패키지에 들어가 있기 때문에 import 해준다.
public class CheckedExceptionDemo {
    public static void main(String[] args) {
    	BufferedReader bReader = null;	// bReader를 전역변수로 선언 및 null 할당
        String input = null;	// input 전역변수 선언 및 null 할당

		try {   // FileNotFoundException로 인해 발생하는 에러를 예외 처리해준다.
			bReader = new BufferedReader(new FileReader("out.txt"));	// FileReader 클래스에 out.txt라는 텍스트 파일을 인자로 주고, 이 객체를 BufferedReader 클래스 생성자의 인자로 전달하고, 인스턴스한다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {   // IOException로 인해 발생하는 에러를 예외처리 해준다.
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println(input); 
    }
}
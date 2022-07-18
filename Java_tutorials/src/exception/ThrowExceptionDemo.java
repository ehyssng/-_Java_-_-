package exception;

import java.io.*;

class B{
    void run() throws IOException, FileNotFoundException{	// run() 메소드 정의 및 IOException, FileNotFoundException 예외처리를 다음 사용자에게 강제
    	BufferedReader bReader = null;	// bReader를 전역변수로 선언 및 null 할당
        String input = null;	// input 전역변수 선언 및 null 할당

		bReader = new BufferedReader(new FileReader("out.txt"));    // FileReader 클래스에 out.txt라는 텍스트 파일을 인자로 주고, 이 객체를 BufferedReader 클래스 생성자의 인자로 전달하고, 인스턴스한다.
		input = bReader.readLine();
		System.out.println(input); 
    }
}
class C{
    void run() throws IOException, FileNotFoundException{	// run() 메소드 정의 및 IOException, FileNotFoundException 예외처리를 다음 사용자에게 강제
        B b = new B();	// 클래스 B를 변수 b로 인스턴스함
        b.run();
    }
}
public class ThrowExceptionDemo {
    public static void main(String[] args) {
         C c = new C();	// 클래스 C를 변수 c로 인스턴스함
         try {
             c.run();
         } catch (FileNotFoundException e) {	// FileNotFoundException 예외처리
        	 System.out.println("out.txt 파일은 설정 파일 입니다. 이 파일이 프로잭트 루트 디렉토리에 존재해야 합니다.");
         } catch (IOException e) {	// IOException 예외처리
             e.printStackTrace();
         }
    }   
}

// 클래스 B로 부터 클래스 C는 사용자이고, 클래스 C로부터 클래스 ThrowExceptionDemo는 사용자이다. 그리고 클래스 ThrowExceptionDemo 사용자는 애플리케이션 사용자(End User)이다.
// B => C => ThrowExceptionDemo => End-User
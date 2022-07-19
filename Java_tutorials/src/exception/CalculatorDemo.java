package exception;
class DivideException extends Exception {	// Exception 예외 클래스를 상속 받는 checked인 DivideException 생성.
    public int left;
    public int right;	// Calculator의 left와 right 값을 DivideException 예외 클래스가 내부적으로 갖는다.
	
	DivideException(){	// 기본 생성자 생성.
        super();
    }
    DivideException(String message){	// String을 매개변수로 받는 생성자 생성.
        super(message);
    }
    DivideException(String message, int left, int right){	// String과 left값, right값을 매개변수로 받는 생성자 생성
        super(message);
        this.left = left;
        this.right = right;
    }
}
class Calculator{
    int left, right;
    public void setOprands(int left, int right){        
        this.left = left;
        this.right = right;
    }
    // checked 예외는 반드시 예외 처리를 해줘야 한다.
    public void divide() throws DivideException {	// 두번째 방법으로는 사용자에게 예외를 던진다.
        if(this.right == 0){
        	throw new DivideException("0으로 나누는 것은 허용되지 않습니다.", this.left, this.right);	// 메세지와, left, right 값을 인자로 전달.
        }
        System.out.print(this.left/this.right);
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        try {	// 사용자는 반드시 예외 처리를 해야한다.
            c1.divide();
        } catch (DivideException e) {
            System.out.println(e.getMessage());	// 메세지 호출
            System.out.println(e.left);	// left 값 호출
            System.out.println(e.right);	// right 값 호출
        }
    }
}
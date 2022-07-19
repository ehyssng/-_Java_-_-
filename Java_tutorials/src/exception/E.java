package exception;
import java.io.IOException;
class E{
    void throwArithmeticException(){	// throwArithmeticException 경우 예외 처리를 안해줘도 된다.
        throw new ArithmeticException();
    }
    void throwIOException1(){	// IOException 경우 예외 처리를 반드시 해야된다.
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void throwIOException2() throws IOException{
        throw new IOException();
    }
}
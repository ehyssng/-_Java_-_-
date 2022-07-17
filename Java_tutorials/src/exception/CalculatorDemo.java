package exception;
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());	// 에러가 뜬 이유만 간략하게 나온다.
            System.out.println("\n\ne.toString()\n"+e.toString());	// 어떠한 에러의 종류인지와 이유가 나온다.
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();	// 어떠한 에러의 종류와 이유, 그리고 에러가 뜬 코드까지 나온다.
        }
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}
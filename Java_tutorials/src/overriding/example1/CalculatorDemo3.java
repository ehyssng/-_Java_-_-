package overriding.example1;
 
class Calculator3 {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public int avg() {	// 에러를 해결하기 위해서 부모 클래스의 메소드 signature를 자식 클래스의 메소드와 동일하게 수정을 해주면 된다. 하지만 이 방법은 바람직한 방법이 아니다.
        return ((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator3 extends Calculator3 {
     
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
     
    public int avg() {
        return ((this.left + this.right) / 2);	// 부모 클래스의 메소드 signature를 변경하니 자식 클래스와 동일한 메소드가 되었다. 이럴 경우 코드의 중복이 발생하게 된다.
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo3 {
    public static void main(String[] args) {
        SubstractionableCalculator3 c1 = new SubstractionableCalculator3();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
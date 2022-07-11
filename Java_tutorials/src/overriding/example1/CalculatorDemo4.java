package overriding.example1;
 
class Calculator4 {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public int avg() {
        return ((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator4 extends Calculator4 {
     
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
     
    public int avg() {
        return super.avg();	// 코드 중복의 제거를 위해 부모 클래스 avg()의 내용을 입력하지 않고, 부모 클래스를 뜻하는 super 뒤에 .avg()를 호출하면 된다.
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo4 {
    public static void main(String[] args) {
        SubstractionableCalculator4 c1 = new SubstractionableCalculator4();
        c1.setOprands(10, 20);
        c1.sum();
        System.out.println("실행 결과는 " + c1.avg());	// 부모 클래스와 자식 클래스의 sum() 메소드는 동일한 코드이기 때문에, 자식 클래스에서 sum() 메소드를 정의하지 않고, 객체에서 sum()을 호출하면 부모 클래스의 메소드를 호출하기 때문에 불필요한 코드를 줄일 수 있겠다.
        // 하지만 super.(부모 클래스 메소드)를 한 후, 추가적으로 코드를 더한다면 다른 코드가 되기 때문에 부모 클래스 메소드를 추가 수정할 시에는 중복의 제거를 할 수 있다.
        c1.substract();
    }
}
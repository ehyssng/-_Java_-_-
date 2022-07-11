package overriding.example1;
 
class Calculator2 {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator2 extends Calculator2 {
     
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
     
//    public int avg() {	// 오버라이딩을 하려면 부모 클래스의 해당 메소드와 메소드 이름, 반환 타입, 매개변수 수와 타입이 순서가 같아야하는데, 이 경우 반환 타입이 다르기 때문에 에러가 발생하게 된다.
//        return (this.left + this.right)/2;
//    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo2 {
    public static void main(String[] args) {
        SubstractionableCalculator2 c1 = new SubstractionableCalculator2();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
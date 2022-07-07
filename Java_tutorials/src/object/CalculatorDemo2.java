package object;
 
public class CalculatorDemo2 {
 
    public static void sum(int left, int right) {   // 메솓를 사용하여 중복의 제거를 함.
        System.out.println(left + right);
    }
 
    public static void main(String[] args) {
        sum(10, 20);
        sum(20, 40);
    }
    // 기존의 코드랑 동일하게 동작하지만, 내용을 보다 효율적으로 만드는 행위이며,
    // 예를 들어 로직은 동일하지만, 중복의 제거하는 것을 리팩토링(refactoring)이라고 한다.
}
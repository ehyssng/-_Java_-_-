package classninstance;
 
class Calculator3{
  
    public static void sum(int left, int right){
        System.out.println(left+right);
    }
     
    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}
 
public class CalculatorDemo3 {
     
    public static void main(String[] args) {
        Calculator3.sum(10, 20);	// 클래스 메소드는 인스턴스를 따로 선언해 메모리를 사용할 필요 없이,
        Calculator3.avg(10, 20);	// 간단하게 일회용성으로 사용할 메소드를 호출하여 빠르게 사용이 가능하다.
         
        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    }
 
}
package interfaces.example1;
class CalculatorDummy{	// 가짜 계산기 클래스를 생성
    public void setOprands(int first, int second, int third){}
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
public class CalculatorConsumer {
    public static void main(String[] args){
        CalculatorDummy c = new CalculatorDummy();	// 가짜 계산기 클래스로 사용 로직 구현
        c.setOprands(10,20,30);	// 사용 로직을 세 개의 인자를 받아서
        System.out.println(c.sum()+c.avg());	// sum()과 avg()이 값이 나오도록 구현
    }
}
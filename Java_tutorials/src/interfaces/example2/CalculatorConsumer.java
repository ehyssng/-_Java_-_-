package interfaces.example2;
class CalculatorDummy implements Calculatable{	// 가짜 계산기 클래스는 Calculatable 인터페이스를 구현함.
    public void setOprands(int first, int second, int third){
    }
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
// 인터페이스로 인해 규제가 되었기 때문에 규제에 맞춰서 구현이 가능함.
public class CalculatorConsumer {
    public static void main(String[] args) {	// 사용 로직을 개발하는 입장에서는 구현 규제가 잘 정해져있기 때문에 안심하고 사용 로직을 잘 구현할 수가 있다.
//        CalculatorDummy c = new CalculatorDummy();
        Calculator c = new Calculator();	// 완성된 계산기 로직 클래스를 인스턴스해주면 문제없이 실행이 된다.
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}
package interfaces.example3;
 
interface I1{
    public void x();
}
 
interface I2{
    public void z();
}
 
class A implements I1, I2{	// 인터페이스는 클래스 상속과는 다르게 여러 개의 인터페이스를 구현할 수 있다.
    public void x(){}	// 인터페이스 I1에 정의된 메소드 x()를 반드시 구현해야 된다.
    public void z(){}   // 인터페이스 I2에 정의된 메소드 z()를 반드시 구현해야 한다.
}
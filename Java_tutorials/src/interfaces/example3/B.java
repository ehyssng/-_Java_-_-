package interfaces.example3;
 
interface I3{
    public void x();
}
 
interface I4 extends I3{	// 인터페이스도 상속을 할 수 있다. 인터페이스 I4는 인터페이스 I3를 상속하고 있다.
    public void z();
}
 
class B implements I4{	// 클래스 B는 인터페이스 I4를 구현함.
    public void x(){}	// 인터페이스 I4는 인터페이스 I3를 상속하였기 때문에 인터페이스 I4를 구현할 때에는 부모 인터페이스에 정의된 메소드 x() 메소드도 구현해야 된다.
    public void z(){}   // 인터페이스 I4에 정의된 메소드 z()를 반드시 구현해야 된다.
}
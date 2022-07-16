package interfaces.example3;
 
interface I5{
//    private void x();
}
// 인터페이스는 그 인터페이스를 구현한 클래스를 어떻게 조작할 것인가를 규정하기 때문에
// 모든 외부에서 제어할 수 있는 가장 개방적인 접근 제어자인 `public`만을 허용한다.
// 위의 코드는 인터페이스에 private 메소드를 정의하였기 때문에 에러가 발생하게 된다.
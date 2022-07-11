package Inheritance.example2;
public class ConstructorDemo2 {
    public ConstructorDemo2(int param1) {}	// 기본 생성자가 아닌 생성자, 즉 매개변수가 있는 생성자를 생성했다.
    // 어떠한 생성자가 명시적으로 만들어지면, java는 기본 생성자를 자동으로 생성해주지 않는다.
    public static void main(String[] args) {
//        ConstructorDemo2  c = new ConstructorDemo2();	// 기본 생성자를 생성해주지 않는데, 기본 생성자를 호출하여 에러가 발생하게 된다.
    }
}
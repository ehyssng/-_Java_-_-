package Inheritance.example2;
public class ConstructorDemo3 {
    public ConstructorDemo3(){}	// 기본 생성자가 아닌 다른 생성자가 존재할 시에는 명시적으로 기본 생성저라를 생성해줘야한다.
    public ConstructorDemo3(int param1) {}
    public static void main(String[] args) {
        ConstructorDemo3  c = new ConstructorDemo3();
    }
}
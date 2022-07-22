package generic;
 
class Person<T>{	// 클래스의 데이터 타입을 미리 지정하지 않고 인스턴스화 될 때 지정
    public T info;	// 클래스 필드 info 또한 데이터 타입이 인스턴스화 될 때 지정
}
 
public class GenericDemo {
 
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>();	// Person 클래스를 인스턴스하고 데이터 타입을 String으로 지정
        Person<StringBuilder> p2 = new Person<StringBuilder>();
    }
 
}
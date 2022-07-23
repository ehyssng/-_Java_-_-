package generic;
interface Info{
    int getLevel();
}
class EmployeeInfo implements Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class Person2<T extends Info>{	// 제네릭은 꼭 클래스가 아니고, 인터페이스라도 제한할 수 있다. 제네릭 안에서 extends는 상속이 아니라 부모가 누구인지를 가르키는 코드이다.
    public T info;
    Person2(T info){
    	this.info = info;
    	info.getLevel();	// extends로 제한을 건 경우, 부모 클래스 혹은 인터페이스의 필드를 호출할 수 있다.
	}
}
public class GenericDemo2 {
    public static void main(String[] args) {
        Person2 p1 = new Person2(new EmployeeInfo(1));
//        Person2<String> p2 = new Person2<String>("부장");	// Person2 클래스의 제네릭은 Info 클래스 혹은 Info 클래스를 상속받은 자식 클래스만 들어올 수 있다.
    }
}
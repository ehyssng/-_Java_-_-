package reference;
class A{
    public int id;	// 인스턴스 변수 int형 id 선언
    A(int id){	// 매개변수를 가진 생성자 정의
        this.id = id;	// 매개변수로 들어온 인자를 전역변수 id에 할당
    }
}
public class ReferenceDemo1 {
 
	public static void runValue(){
        int a = 1;	// a 라는 변수에 1을 할당
        int b = a;	// a 라는 변수에 할당된 1를 복제하여 변수 b에 할당
        b = 2;	// b 라는 변수에 2를 새롭게 할당
        System.out.println("runValue, "+a);	// 변수 b에는 변수 a에 담긴 1를 복제하여 할당하였기 때문에 변수 a에 담긴 1은 변하지 않는다.
    }
     
    public static void runReference(){
        A a = new A(1);	// a라는 변수에 클래스 A를 인스턴스하고 인자로 1를 전달, 그리하여 인스턴스 a의 id는 1이 할당
        A b = a;	// A라는 참조형 데이터 타입을 똑같이 가진 b라는 변수에 인스턴스 a 할당
        b = new A(2);	// 변수 b에 새로운 인스턴스를 할당을 해주어 더 이상 변수 b는 인스턴스 a를 참조하지 않는다.
        System.out.println("runReference, "+a.id);	// 그래서 a.id를 출력하면 인스턴스 a의 id는 새롭게 할당이 되지 않아서 그대로 1을 출력한다.
    }
 
    public static void main(String[] args) {
        runValue();
        runReference();
    }
 
}
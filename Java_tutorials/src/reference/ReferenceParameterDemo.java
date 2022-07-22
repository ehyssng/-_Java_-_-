package reference;
 
public class ReferenceParameterDemo {
     
    static void _value(int b){	// 인자 변수 a를 매개변수 b에 할당
        b = 2;	// 매개변수로 받은 인자에 2를 할당
    }
     
    public static void runValue(){
        int a = 1;	// 변수 a에 1를 할당
        _value(a);	// 메소드 _value에 변수 a를 인자로 전달
        System.out.println("runValue, "+a);	// 변수 a 호출 시 1 출력
    }
     
    static void _reference1(A b){	// 인자 인스턴스 a를 매개변수 b에 할당
        b = new A(2);	// 매개변수로 받은 인자에 새로운 인스턴스 할당
    }
     
    public static void runReference1(){
        A a = new A(1);	// 변수 a에 인스턴스 할당
        _reference1(a);	// 메소드 _reference1에 인스턴스 a를 인자로 전달
        System.out.println("runReference1, "+a.id);	// b는 새로운 인스턴스를 할당 받았기 때문에 각 변수는 서로 다른 인스턴스를 참조하기 때문에 인스턴스 a의 id값은 변하지 않고 1이 출력된다.  
    }
     
    static void _reference2(A b){	// 인자 인스턴스 a를 매개변수 b에 할당
        b.id = 2;	// 인스턴스 a를 인자로 받은 매개변수 b의 id를 2로 할당
    }
 
    public static void runReference2(){
        A a = new A(1);	// 변수 a에 클래스 A 인스턴스를 할당
        _reference2(a);	// _reference2 메소드에 인스턴스 a 인자로 전달
        System.out.println("runReference2, "+a.id);	// 인스턴스 b는 인스턴스 a를 할당 받았기 때문에 인스턴스 b는 인스턴스 a를 참조하고 있다. 인스턴스 b에서 id 값을 바꿨기 때문에 인스턴스 a의 id 값도 바뀌게 된다.
    }
     
    public static void main(String[] args) {
        runValue(); // runValue, 1
        runReference1(); // runReference1, 1
        runReference2(); // runReference2, 2
    }
 
}
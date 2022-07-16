package polymorphism;
 
interface father{}
interface mother{}
interface programmer{
    public void coding();
}
interface believer{}
class Steve implements father, programmer, believer{	// 클래스 Steve는 인터페이스 father, programmer, believer를 구현
    public void coding(){	// programmer 인터페이스에서 강제된 coding() 메소드 구현
        System.out.println("fast");
    }
}
class Rachel implements mother, programmer{	// 클래스 Rachel은 인터페이스 mother, programmer 구현
    public void coding(){	// programmer 인터페이스에서 강제된 coding() 메소드 구현
        System.out.println("elegance");
    }
}
public class Workspace{
    public static void main(String[] args){
        programmer employee1 = new Steve();	// 클래스 Workspace에 클래스 Steve의 programmer의 내용만 인식시켜줌.
        programmer employee2 = new Rachel();	// 클래스 Workspace에 클래스 Rachel의 programmer의 내용만 인식시켜줌.
         
        employee1.coding();
        employee2.coding();	// 두 클래스가 같은 데이터 타입을 갖고, 같은 메소드를 가졌지만 다른 데이터를 호출시킴.(다형성)
    }
}
package collection;
 
import java.util.*;
 
class Computer implements Comparable{	// Collections 클래스의 sort() 메소드를 사용하려면 List안에 그 객체들은 Comparable 인터페이스를 구현하고 있어야 한다.
    int serial;	// 전역변수 int형의 serial 선언
    String owner;	// 전역변수 String형의 owner 선언
    Computer(int serial, String owner){	// 첫번째 매개변수로 int형을 두번째 매개변수로 String형을 받는 생성자 정의
        this.serial = serial;	// 생성자를 통해 전달된 첫번째 인자를 serial 전역변수에 할당
        this.owner = owner;	// 생성자를 통해 전달된 두번째 인자를 owner 전역변수에 할당
    }
    public int compareTo(Object o) {	// Comparable 인터페이스는 compareTo(Object o)를 구현하게 강제 되어있다.
        return this.serial - ((Computer)o).serial;	// 각 객체의 serial값을 비교하여, 선후 관계를 판별하여 정렬한다.
    }
    public String toString(){	// String형을 반환하는 toString() 메소드 정의
        return serial+" "+owner;	// 메소드 호출시 serial값과 owner값 반환
    }
}
 
public class CollectionsDemo {
     
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<Computer>();	// Computer 데이터 타입의 값을 받는 List 데이터 타입의 ArrayList를 인스턴스 
        computers.add(new Computer(500, "egoing"));	// add() 메소드 안에서 Computer 인스턴스 생성 serial = 500, owner = egoing
        computers.add(new Computer(200, "leezche"));	// 생성된 객체들을 ArrayList에 담음
        computers.add(new Computer(3233, "graphittie"));
        Iterator i = computers.iterator();
        System.out.println("before");
        while(i.hasNext()){	// while문을 통해 computers에 담긴 객체 출력
            System.out.println(i.next());
        }
        Collections.sort(computers);	// Collections 클래스의 sort()라는 메소드에 List를 인자로 전달하면 List를 정렬해준다.
        System.out.println("\nafter");
        i = computers.iterator();
        while(i.hasNext()){	// while문을 통해 정렬한 computers에 담긴 객체 출력
            System.out.println(i.next());
        }
    }
 
}
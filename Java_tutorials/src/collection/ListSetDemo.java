package collection;
 
import java.util.ArrayList;	// ArrayList 컨테이너를 사용하기 위해 java.util.ArrayList 패키지 import
import java.util.HashSet;	// HashSet 컨테이너를 사용하기 위해 java.util.HashSet 패키지 import
 
import java.util.Iterator;
 
public class ListSetDemo {
 
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();	// ArrayList 컨테이너를 al 변수에 인스턴스하고, al ArrayList에는 제네릭을 통해 String 데이터 타입의 값을 담을 것이란 것을 지정
        al.add("one");	// Array은 add()라는 메소드 인자에 값을 할당해 추가할 수 있다.
        al.add("two");
        al.add("two");
        al.add("three");
        al.add("three");
        al.add("five");
        System.out.println("array");
        // iterator는 반복자라는 뜻을 가진다.
        Iterator ai = al.iterator();	// iterator() 메소드를 호출하게 되면, Iterator라는 데이터 타입을 가진 인스턴스를 반환하고, 그 인스턴스를 변수 al에 할당
        while(ai.hasNext()){	// ai 인스턴스는 메소드를 호출한 al 인스턴스의 원소들을 갖게 되고, hasNext() 메소드는 ai 인스턴스에 원소가 존재하는지 확인
            System.out.println(ai.next());	// next() 메소드는 ai 인스턴스 안의 원소중에 하나를 반환하고 없앤다. (이 때, ai 인스턴스의 원소를 없애는 것이지, 오리지널 al 인스턴스의 원소를 없애는 것이 아니다.)
        }
        // List는 값의 중복을 허용한다.
        // List는 순서가 보장된다.
         
        HashSet<String> hs = new HashSet<String>();	// HashSet 컨테이너를 hs 변수에 인스턴스하고, hs HashSet에는 제네릭을 통해 String 데이터 타입의 값을 담을 것이란 것을 지정
        hs.add("one");	// HashSet은 add()라는 메소드 인자에 값을 할당해 추가할 수 있다.
        hs.add("two");
        hs.add("two");
        hs.add("three");
        hs.add("three");
        hs.add("five");
        Iterator hi = hs.iterator();
        System.out.println("\nhashset");
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
        // Set은 값의 중복을 허용하지 않는다.
        // 순서가 보장되지 않는다.
    }
 
}
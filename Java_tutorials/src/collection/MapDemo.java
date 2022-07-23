package collection;
 
import java.util.*;
 
public class MapDemo {
 
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<String, Integer>();	// Map 같은 경우에는 key와 value 두 개의 값을 가지기 때문에 제네릭으로 두 개의 데이터 타입을 지정해주어야 된다.
        a.put("one", 1);	// put() 메소드는 Collection 인터페이스에는 존재하지 않고, Map 인터페이스에만 존재하는 메소드이다.
        a.put("two", 2);	// put() 메소드는 두 개의 인자를 받는데, 첫번째 인자로는 key값을 두번째 인자로는 value값을 받는다.
        a.put("three", 3);
        a.put("four", 4);
        System.out.println(a.get("one"));	// Map에서 get() 메소드를 사용할 떄에는 인자로 key값을 주면, 그 key값에 해당하는 value값을 반환하게 된다.
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));
         
        iteratorUsingForEach(a);
        iteratorUsingIterator(a);
    }
     
    static void iteratorUsingForEach(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();	// Map 인터페이스에 있는 entrySet() 메소드를 호출하면 Set 데이터 타입을 가진 객체가 반환되고, 그 객체를 entries라는 변수에 담는다.
        // Set 객체 안에는 Map 안에 있는 값들이 Map.Entry라는 객체로 담긴다. 첫번째 제네릭 데이터 타입은 getKey() 메소드가 가지는 데이터 타입이고, 두번째 제네릭 데이터 타입은 getValue() 메소드가 가지는 데이터 타입이다.
        for (Map.Entry<String, Integer> entry : entries) {	// for-each문을 통해서 entries라는 변수에 담긴 Set 객체안에 Map.Entry 객체들을 하니씩 꺼내 entry라는 변수에 담는다.
            System.out.println(entry.getKey() + " : " + entry.getValue());	// entry 변수에 담긴 Map.Entry 객체를 getKey() 메소드를 통해 key값을 호출하고, getValue() 통해 value값을 호출한다.
        }
    }
     
    static void iteratorUsingIterator(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();	// Map 인터페이스에 있는 entrySet() 메소드를 호출하면 Set 데이터 타입을 가진 객체가 반환되고, 그 객체를 entries라는 변수에 담는다.
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();	// Map.Entry가 담긴 Set 객체를 iterator() 메소드를 활용하여 얻은 반복자를 i 변수에 할당
        while(i.hasNext()){	// hasNext()를 통해 i 객체에 호출할 데이터가 있는지 조회
            Map.Entry<String, Integer> entry = i.next();	// next()를 통해 Set 객체에 있는 Map.Entry 객체를 하나씩 entry라는 변수 담고 없앤다.
            System.out.println(entry.getKey()+" : "+entry.getValue());	// entry 변수에 담긴 Map.Entry 객체를 getKey() 메소드를 통해 Key값을 호출하고, getValue()라는 메소드를 통해 value값을 호출한다.
        }
    }
 
}
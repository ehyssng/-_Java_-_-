package collection;
 
import java.util.ArrayList;	// ArrayList를 사용하기 위해선, java.util,ArrayList 패키지를 import 해야된다.
 
public class ArrayListDemo {
 
    public static void main(String[] args) {
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[2] = "three"; 오류가 발생한다.
        for(int i=0; i<arrayObj.length; i++){	// 배열은 배열 인스턴스의 length라는 속성값을 이용해서 배열의 길이를 알 수 있다.
            System.out.println(arrayObj[i]);	// 배열 같은 경우 배열 안의 값을 출력할 때, 배열 인스턴스뒤에 []안에 인덱스 값을 넣어 해당 인덱스의 값을 호출할 수 있다.
        }
         
        ArrayList<String> al = new ArrayList<String>(); // al이라는 ArrayList에 제네릭을 통해 ArrayList에 들어오는 값을 String 데이터타입이 되도록 지정을 함
        al.add("one");	// ArrayList는 add()라는 인스턴스 메소드를 통해 ArrayList에 값을 추가할 수 있다.
        al.add("two");	// ArrayList의 add()라는 메소드는 어떠한 데이터 타입도 수용한다.
        al.add("three");	// add() 메소드에 인자들은 ArrayList에 저장될 때 Object 타입으로 저장이 된다.
        for(int i=0; i<al.size(); i++){	// ArrayList는 배열고 다르게 length가 아니라 size()라는 메소드를 사용해서 ArrayList의 길이를 알 수 있다.
        	String val = al.get(i); // get() 메소드를 통해 호출한 값을 String으로 형변환 하지 않아도 된다. 제네릭을 통해 String 데이터 타입으로 저장이 되기 때문에 String 데이터 타입으로 호출이 된다.
            System.out.println(val);
        }
    }
 
}
package collection;
 
import java.util.HashSet;
 
import java.util.Iterator;
 
public class SetDemo {
 
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
         
        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);
         
        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);
         
        System.out.println(A.containsAll(B)); // false
        // containsAll() 메소드는 인자 Set이 인스턴스 Set의 부분집합인지를 boolean형으로 반환한다.
        System.out.println(A.containsAll(C)); // true
         
        //A.addAll(B);	// 인스턴스 Set과 인자 Set의 합집합
        //A.retainAll(B);	// 인스턴스 Set과 인자 Set의 교집합
        //A.removeAll(B);	// 인스턴스 Set에 인자 Set의 차집합
         
        Iterator hi = A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
 
}
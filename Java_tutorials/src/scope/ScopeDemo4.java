package scope;
 
public class ScopeDemo4 {
    static void a(){
        String title = "coding everybody";
    }
    public static void main(String[] args) {
        a();
        //System.out.println(title);    // title 변수는 a 라는 메소드의 지역변수이기 때문에 a 메소드 밖에서는 인식할 수가 없다.
    }
 
}
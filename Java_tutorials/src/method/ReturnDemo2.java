package method;

public class ReturnDemo2 {
	public static String num(int i) {
        if(i==0){
            return "zero";
        } else if(i==1){
            return "one";
        } else if(i==2){
            return "two";
        }
        return "none";
    }
 
    public static void main(String[] args) {
        System.out.println(num(1));	// one이 출력됨.
    }
}
// return이 메소드안에 많으면 컴파일 자체가 안된다고 했는데, 무조건 그런 것은 아니고, if 같은 조건문에 들어있는 경우에는 return을 각 절마다 사용이 가능하다.
// 조건에 맞는 return만 실행되기 때문이다.
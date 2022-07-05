package method;

public class ReturnDemo {
	public static int one() {
        return 1;
//        return 2;
//        return 3;
    }
 
    public static void main(String[] args) {
        System.out.println(one());
    }
}
// 메소드 본문에 return을 만나면 메소드는 그 즉시 중단하게 된다. 그래서 위의 결과는 처음 만난 return값인 1을 출력해야되는데,
// java에서는 처음 만난 return으로 인해 다음 return들이 실행되지 않는 것을 알기 때문에 컴파일 자체가 되지 않는다.
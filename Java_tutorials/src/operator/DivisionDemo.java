package operator;

public class DivisionDemo {

	public static void main(String[] args) {
		int a = 10;
        int b = 3;
          
        float c = 10.0F;
        float d = 3.0F;
          
        System.out.println(a/b);	// 정수와 정수의 나누기이기 때문에 소수점 이하의 수는 손실된다.
        System.out.println(c/d);
        System.out.println(a/d);	// 정수와 실수의 나누기인데 정수형이 실수형으로 형변환이 되어 나누어져서 손실 없이 소수점 이하의 수도 출력된다.
	}

}

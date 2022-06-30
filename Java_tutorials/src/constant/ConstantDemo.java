package constant;

public class ConstantDemo {

	public static void main(String[] args) {
		int a = 2;
		
//		int b = 2.2;	// 2.2이라는 상수는 실수형 데이터 타입을 가지고 있기 때문에 오류가 발생한다.
		
//		float c = 2.2;
		
		double d = 2.2;	// 실수 2.2라는 상수는 double이라는 데이터 타입을 가진다.
		
		float e = 2.2F;	// 실수 2.2라는 상수를 float형의 데이터 타입을 써주려면 상수 뒤에 F를 넣어 명시적으로 지정을 해줘야된다.
		
//		int f = 2147483648;	// 상수가 int로 표현할 수 있는 숫자보다 큰 숫자를 할당해서 에러가 발생한다.
		
//		long g = 214783648;	// 정수형 상수가 int의 데이터 타입을 가지기 때문에 에러가 발생한다.
		
		long h = 214783648L;	// float와 동일하게 long 데이터 타입을 사용할 때에는 상수 뒤에 L을 넣어 명시적으로 지정을 해줘야된다.
		
		byte i = 100;	// Java에서는 byte와 short 데이터 타입 경우에는 그 변수에 int를 사용하는 것이 허용되기 때문에 에러가 발생하지 않는다.
		short j = 200;	// 단, byte나 short 각자의 데이터 타입 범위 안에서만 허용이 된다.
	}

}

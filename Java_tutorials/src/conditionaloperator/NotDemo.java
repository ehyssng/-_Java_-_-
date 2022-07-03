package conditionaloperator;

public class NotDemo {

	public static void main(String[] args) {
		if (!true) {	// true 앞에 !를 붙여주므로 false로 결괏값이 반전이 됨.
            System.out.println(1);	// 1이 출력이 되지 않음.
        }
        if (!false) {	// false 앞에 !를 붙여주므로 true로 결괏값이 반전이 됨.
            System.out.println(2);	//  2가 출력됨.
        }
	}

}

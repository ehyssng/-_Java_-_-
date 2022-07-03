package conditionaloperator;

public class LoginDemo4 {

	public static void main(String[] args) {
		String id = args[0];
        String password = args[1];
        if ((id.equals("egoing") || id.equals("k8805") || id.equals("sorialgi"))	// id가 egoing, k8805, sorialgi 셋 중에 하나이고,
                && password.equals("111111")) {	// 패스워드가 111111일 경우
            System.out.println("right");	// right를 출력
        } else {
            System.out.println("wrong");	// id나 패스워드중 하나라도 틀릴 시 wrong을 출력
        }
	}

}

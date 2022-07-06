package io;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	// System.in은 사용자가 입력한 값이라고 생각하자.
        int i = sc.nextInt();
        System.out.println(i*1000);
        sc.close();
    }
}

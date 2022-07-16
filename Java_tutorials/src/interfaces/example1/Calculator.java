package interfaces.example1;
 
class Calculator {	// 실제 계산기 로직 클래스
    int left, right;
    public void setOprands(int left, int right) {	// 두 개의 매개변수가 받을 수 있게 구현
        this.left = left;
        this.right = right;
    }
    public void sum() {
        System.out.println(this.left + this.right);
    }
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
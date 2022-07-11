package overloading.example1;
 
class Calculator2{
    int[] oprands;	// 정수형 배열 전역변수 oprands 선언
     
    public void setOprands(int[] oprands){	// 정수형 배열을 매개변수로 받는 메소드 생성
        this.oprands = oprands;	// 매개변수를 통해 받은 정수형 배열 인자를 전역변수 oprands에 넣어줌.
    }
     
    public void sum(){
        int total = 0;	// 정수형 지역변수 total 선언 및 0으로 할당
        for(int value : this.oprands){	// 배열의 데이터들을 value라는 변수에 하나씩 반복하며 담아준다.
            total += value;	// for문을 통해 배열의 데이터들을 total에 반복하며 하나씩 더해준다.
        }
        System.out.println(total);	// 배열의 데이터들을 다 total에 더해줬으면 출력한다.
    }
      
    public void avg(){
        int total = 0;	// 정수형 지역변수 total 선언 및 0으로 할당
        for(int value : this.oprands){	// oprands 배열에 담긴 데이터들을 반복하며 하나씩 value 변수에 담아준다.
            total += value;	// 배열 oprands의 데이터들을 하나씩 total 변수에 더해준다.
        }
        System.out.println(total/this.oprands.length);	// 배열 oprands의 모든 데이터를 total 변수에 다 더해줬으면, total 값에 배열의 데이터 갯수만큼 나눠준다.
    }
}
public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();	// c1 인스턴스 선언 및 Calculator 기본 생성자 호출
        c1.setOprands(new int[]{10,20});	// c1 인스턴스 setOprands 메소드에 정수형 배열 선언 후, 2개의 인자 넣어줌.
        c1.sum();	// 2개의 인자로 sum() 메소드 호출
        c1.avg();	// 2개의 인자로 avg() 메소드 호출
        c1.setOprands(new int[]{10,20,30});	// c1 인스턴스 setOprands 메소드에 정수형 배열 선언 후, 3개의 인자 넣어줌.
        c1.sum();	// 3개의 인자로 sum() 메소드 호출
        c1.avg();   // 3개의 인자로 avg() 메소드 호출
    }
}
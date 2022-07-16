package interfaces.example2;
 
public interface Calculatable {
    public void setOprands(int first, int second, int third);	// setOprands 메소드는 int형 세 개의 매개변수를 가져야하고,
    public int sum();	// int형으로 반환하는 sum() 메소드, 
    public int avg();	// int형으로 반환하는 avg() 메소드를 가져야한다고 규제함.
}
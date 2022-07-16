package interfaces.example2;
 
class Calculator implements Calculatable {	// 인터페이스를 구현하고 있기 때문에 계산기 로직 개발자도 규제에 맞춰 더 잘 구현할 수 있다.
    int first, second, third;
    public void setOprands(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public int sum() {
        return this.first + this.second + this.third;
    }
    public int avg() {
        return (this.first + this.second + this.third) / 3;
    }
}
// 인터페이스로 인해 규제가 정해져있기 때문에 계산기 로직 클래스를 사용 로직에 그대로 결합을 하여도 아무 문제가 없을 거라는 보장이 있기 때문에
// 서로 안심하고 각각의 역할을 더 잘 수행할 수 있게 된다.
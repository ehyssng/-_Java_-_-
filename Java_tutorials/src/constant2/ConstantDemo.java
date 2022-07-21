package constant2;
 
enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    Fruit(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
}
 
enum Company{
    GOOGLE, APPLE, ORACLE;
}
 
public class ConstantDemo {
     
    public static void main(String[] args) {	// 클래스에는 어떠한 필드가 있는지 확인할 수가 없다. 하지만 enum은 values()라는 메소드를 통해 enum 안에 있는 필드를 확인할 수 있다.
        for(Fruit f : Fruit.values()){	// for-each문을 통해 Fruit enum안에 필드들을 f라는 변수에 하나씩 담는다.
            System.out.println(f+", "+f.getColor());
        }
    }
}
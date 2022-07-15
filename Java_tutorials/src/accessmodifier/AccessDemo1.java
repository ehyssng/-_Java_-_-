package accessmodifier;
class A {
    public String y(){  // 접근 제어자가 public이면 어디서든 접근을 할 수가 있다.
        return "public void y()";
    }
    private String z(){ // 접근 제어자가 private이면 그 메소드가 속한 내부 클래스를 제외한 외부에서는 접근이 불가능하다.
        return "public void z()";
    }
    public String x(){
        return z();
    }
}
public class AccessDemo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // 아래 코드는 오류가 발생한다.
        //System.out.println(a.z());
        System.out.println(a.x());  // 접근 제어자가 public인 메소드 x()에 외부 클래스인 AccessDemo1이 접근하여 호출하였고, 메소드 x()는 접근 제어자가 private인 메소드 z()와 같은 내부 클래스에 있어서 접근할 수가 있는 상황이고, 메소드 x()는 메소드 z()를 호출하고 있다. 그래서 결과적으로 외부 클래스인 AccessDemo1에서 메소드 x()를 통해 private인 메소드 z()를 호출하게된다.
    }
}
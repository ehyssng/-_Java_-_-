package progenitor;
 
class Student implements Cloneable{
    String name;
    Student(String name){
        this.name = name;
    }
    protected Object clone() throws CloneNotSupportedException{	// Object 클래스 clone() 메소드 오버라이딩
        return super.clone();	// 부모 클래스(Object 클래스)의 clone() 메소드 반환
        // Object 클래스의 clone() 메소드는 CloneNotSupportedException라는 checked Exception이 throws 되어있다.
        // 예외를 이 클래스에서 처리하지 않고 다음 사용자에게 던진다.
    }
}
 
class ObjectDemo {
 
    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        try {
            Student s2 = (Student)s1.clone();	// s1 객체를 clone() 메소드를 통해 Student 데이터 타입의 s2로 복제를 하는데 s1은 Object 데이터 타입으로 반환되었기 때문에 (Student)를 앞에 명시해주어 형변환을 한다.
            System.out.println(s1.name);
            System.out.println(s2.name);
        } catch (CloneNotSupportedException e) {	// Student 클래스에서 CloneNotSupportedException 예외를 다음 사용자에게 던졌기 때문에 try...catch문을 통해 처리해준다.
            e.printStackTrace();
        }
    }
 
}
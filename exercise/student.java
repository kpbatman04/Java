package exercise;

public class student {
    String name;
    int enrollmentNo;
    int age;
    float marks;
    student(String name,int enrollmentNo,int age,float marks){
        this.name = name;
        this.age = age;
        this.enrollmentNo = enrollmentNo;
        this.marks = marks;

    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", enrollmentNo=" + enrollmentNo +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        student s1 = new student("bruce",116,18,89);
        System.out.println(s1);

    }
}

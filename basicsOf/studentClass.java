package basicsOf;
public class studentClass {
    public static class Student {

        private int rno;
        private String name;
        double percent;

    }

    public static void change(Student s){
        s.name = "Bruce";
        return;
    }
    public static void main(String[] args) {

        Student x = new Student();
        x.name = "Krish";
        x.rno = 19;
        x.percent = 89;
        System.out.println(x.rno);
//        System.out.println(x.name);
//        change(x);
//        System.out.println(x.name);

    }
}

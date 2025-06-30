package exercise;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("prashant","25",50000);
        System.out.println(e1.getEmployeeDetails());
        e1.setName("golu");
        System.out.println(e1.getEmployeeDetails());
    }
}

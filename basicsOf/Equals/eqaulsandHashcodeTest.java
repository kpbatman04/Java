package basicsOf.Equals;

public class eqaulsandHashcodeTest {

    public static void main(String[] args) {
        Person person1 = new Person("Krish",19,001);
        Person person2 = new Person("Krish",19,001);
        if (person1.equals(person2) ){
            System.out.println("Equals");
        }
        else System.out.println("Not equal");
        System.out.println( person1.hashCode());
        System.out.println( person2.hashCode());
    }

}

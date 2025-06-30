package basicsOf;

public class stringTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("start");
        sb.append(45);
        sb.append("it is now ");
        sb.append(87);
//        sb.toString();
        System.out.println(sb);
    }
}

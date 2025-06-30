package basicsOf;

public class bike {
    String name ;
    int wheels ;

    bike(String name , int wheels){
        this.name = name;
        this.wheels = wheels;
    }
//
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("bike{");
//        sb.append("name='").append(name).append('\'');
//        sb.append(", wheels=").append(wheels);
//        sb.append('}');
//        return sb.toString();
//    }

    @Override
    public String toString() {
        return "bike{" +
                "name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    public static void main(String[] args) {
       bike newBike = new bike("batMobile",2);
        System.out.println(newBike.toString());

    }
}

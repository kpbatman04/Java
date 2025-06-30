package exercise;

import java.util.Scanner;

public class circle {
    double rad;
    circle(double rad){
        this.rad = rad;
    }

    double getCircumference(){
        return Math.PI*rad*2;
    }
    double getArea(){
        return Math.PI*Math.pow(rad,2);
    }

    @Override
    public String toString() {
        return "circle{" +
                "rad=" + rad +
                "area = " + getArea() +
                " ,circumference = " + getCircumference()+
                '}';
    }

    public static void main(String[] args) {

        System.out.println("Enter radius :");
        Scanner sc = new Scanner(System.in);
         double radius = sc.nextDouble();
         circle c1 = new circle(radius);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1);
    }
}

package exercise.utils;

import exercise.geometry.Circle;
import exercise.geometry.square;

public class calculator {

    public static void main(String[] args) {


        Circle c1 = new Circle(3);
        square s1 = new square(3, 5);

        double circArea = Math.PI*Math.pow(c1.radius, 2);
        double recArea = s1.length*s1.width;
        System.out.printf("%-10.2f circle \n %10.2f rectangle ",circArea,recArea);
    }

}

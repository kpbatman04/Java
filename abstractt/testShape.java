package abstractt;

import exercise.geometry.Circle;

public class testShape  {
    public static void main(String[] args) {
       circle cir = new circle(2);
       square sq = new square(3);

        System.out.println("The area for circle is "+cir.calculateArea());
        System.out.println("The area for square is "+sq.calculateArea());
    }
}

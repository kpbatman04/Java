package passby;

public class testreference {
    public static void main(String[] args) {
        Point first = new Point(5,10);
        System.out.println("first "+ first);
        move(first);
        System.out.println("first "+ first);

    }
    public static void move (Point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }
    public static class Point{
        int x; int y;


        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

    }

}

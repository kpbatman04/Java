package exception;
class Myexception extends Exception{
    public Myexception(String string){
        super(string);
    }
}
public class thowClass {
    public static void main(String[] args) {
        int i = 4;
        int j = 0;
        try {
            if (j == 0) {
                throw new Myexception("No zero");
            }
            j = 3 / i;
//           System.out.println(j);
        }
        catch (Myexception e){
            j = 3/1;
            System.out.println("Thats the defualt" +e);
        }


    }
}

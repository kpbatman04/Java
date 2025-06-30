package exercise;

 public class dice {
  int roll(){
   double random = Math.random()*6;
   int num = (int) Math.ceil(random);
   return num;
  }

  public static void main(String[] args) {
        dice d1  = new dice();
        for (int i = 0; i<10;i++){
         System.out.println(d1.roll());
        }
  }

}

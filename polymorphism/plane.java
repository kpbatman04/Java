package polymorphism;

 class plane extends Vehicle{

     @Override
     public void start() {
         super.start();
         System.out.println("Plane is taking off");
     }
 }

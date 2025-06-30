package polymorphism;

 class Car extends Vehicle{
    public int noofdoors(){
        return 5;
    }
    Car(int noOftires){
        super(noOftires);
    }
     @Override
     public void start() {
//         System.out.println(getNoOftires());
         System.out.println("car is starting");
     }
 }

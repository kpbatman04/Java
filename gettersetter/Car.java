package gettersetter;

public class Car {
    private String color;    //public
     private  String model;   //public
    private  double fuelLeval;
    private long  cost; //default

    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }

    public Car(String color, String model, double fuelLeval, long cost) {
        this.color = color;
        this.model = model;
        this.fuelLeval = fuelLeval;
        this.cost = cost;
    }
    public  void setColor(String color){
        this.color = color;
    }
}

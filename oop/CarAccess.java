package oop;

public class CarAccess {
     String color;
   public String model;
    private  double fuelLeval;
     long  cost;

    public CarAccess() {

    }

    public CarAccess(String color, String model, double fuelLeval, long cost) {
        this.color = color;
        this.model = model;
        this.fuelLeval = fuelLeval;
        this.cost = cost;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuelLeval=").append(fuelLeval);
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }
}

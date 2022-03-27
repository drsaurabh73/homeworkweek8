package carpetcostcalculator;

public class Calculator {
      Floor floor;
      Carpet  carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost() {
        double totalcost;

        totalcost = floor.getArea() * carpet.getCost();
        return totalcost;
    }
    }



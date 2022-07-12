package jmu.cs.SE.design_pattern.structure.P3_Decorator;

public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost() ;

}

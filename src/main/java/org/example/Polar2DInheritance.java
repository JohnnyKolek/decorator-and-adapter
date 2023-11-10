package org.example;

public class Polar2DInheritance extends Vector2D {
    public Polar2DInheritance(double x, double y) {
        super(x, y);
    }

    public double getAngle() {
        double x = this.getComponents()[0];
        double y = this.getComponents()[1];
        return Math.atan(y / x);
    }

}

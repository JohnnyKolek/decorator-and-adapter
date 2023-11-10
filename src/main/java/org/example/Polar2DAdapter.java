package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Polar2DAdapter implements IVector, IPolar2D {

    private Vector2D srcVector;

    @Override
    public double abs() {
        return srcVector.abs();
    }

    @Override
    public double getAngle() {
        double x = srcVector.getComponents()[0];
        double y = srcVector.getComponents()[1];
        return Math.atan(y / x);
    }

    @Override
    public double cdot(IVector vector) {
        return srcVector.cdot(vector);
    }

    @Override
    public double[] getComponents() {
        return srcVector.getComponents();
    }
}

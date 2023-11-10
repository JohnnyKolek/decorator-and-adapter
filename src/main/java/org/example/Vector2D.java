package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Vector2D implements IVector {

    private double x;
    private double y;

    @Override
    public double abs() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public double cdot(IVector vector) {
        return this.x * vector.getComponents()[0] + this.y * vector.getComponents()[1];
    }

    @Override
    public double[] getComponents() {
        return new double[]{x, y};
    }
}

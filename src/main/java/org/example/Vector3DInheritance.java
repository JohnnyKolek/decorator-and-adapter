package org.example;


public class Vector3DInheritance extends Vector2D {
    private final double z;

    public Vector3DInheritance(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double abs() {
        double[] components = getComponents();
        return Math.sqrt(components[0] * components[0] + components[1] * components[1] + components[2] * components[2]);
    }

    @Override
    public double cdot(IVector vector) {
        double[] components1 = getComponents();
        double[] components2 = vector.getComponents();
        if (components2.length == 2) {
            return components1[0] * components2[0] + components1[1] * components2[1];
        }
        return components1[0] * components2[0] + components1[1] * components2[1] + components1[2] * components2[2];
    }

    @Override
    public double[] getComponents() {
        double[] components = super.getComponents();
        return new double[]{components[0], components[1], z};
    }

    public Vector3DInheritance cross(IVector vector) {
        double[] result = new double[3];

        int length = vector.getComponents().length;

        if (length == 2) {
            result[0] = 0;
            result[1] = 0;
        } else {
            result[0] = this.getComponents()[1] * vector.getComponents()[2] - this.getComponents()[2] * vector.getComponents()[1];
            result[1] = this.getComponents()[2] * vector.getComponents()[0] - this.getComponents()[0] * vector.getComponents()[2];
        }
        result[2] = this.getComponents()[0] * vector.getComponents()[1] - this.getComponents()[1] * vector.getComponents()[0];

        return new Vector3DInheritance(result[0], result[1], result[2]);
    }

    public IVector getSrcV() {
        return new Vector3DInheritance(this.getComponents()[0], this.getComponents()[1], this.getComponents()[2]);
    }
}

package org.example;

public class Vector3DDecorator implements IVector{

    private final IVector srcVector;

    private double z = 0.0;

    public Vector3DDecorator(IVector vector){
        this.srcVector = vector;
    }

    public Vector3DDecorator(IVector vector, double z){
        this.srcVector = vector;
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
        double result = 0.0;
        if (components2.length == 2) {
            result =  components1[0] * components2[0] + components1[1] * components2[1];
            return result;
        }
        result += components1[2] * components2[2];
        return result;
    }

    @Override
    public double[] getComponents() {
        double[] components = srcVector.getComponents();
        return new double[]{components[0], components[1], z};
    }

    public Vector3DInheritance cross(IVector vector) {
        double[] result = new double[3];
        double[] components1 = getComponents();
        double[] components2 = vector.getComponents();

        if (components2.length == 2) {
            result[0] = 0;
            result[1] = 0;
        } else {
            result[0] = components1[1] * components2[2] - components1[2] * components2[1];
            result[1] = components1[2] * components2[0] - components1[0] * components2[2];
        }
        result[2] = components1[0] * components2[1] - components1[1] * components2[0];

        return new Vector3DInheritance(result[0], result[1], result[2]);
    }

    public IVector getSrcV(){
        return this.srcVector;
    }


}

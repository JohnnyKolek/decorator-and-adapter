package org.example;

public class Main {
    public static void main(String[] args) {

        Vector2D vector2D1 = new Vector2D(1, 2);
        Vector2D vector2D2 = new Vector2D(4, 5);

        Polar2DAdapter polar2DAdapter = new Polar2DAdapter(vector2D1);
        Polar2DInheritance polar2DInheritance = new Polar2DInheritance(3,8);
        Vector3DDecorator vector3DDecorator = new Vector3DDecorator(vector2D2);

        System.out.println("\nUKŁAD KARTEZJAŃSKI");
        System.out.println("polar2DAdapter");
        System.out.println("x: " + polar2DAdapter.getComponents()[0] + ", y: " + polar2DAdapter.getComponents()[1]);
        System.out.println("polar2DInheritance");
        System.out.println("x: " + polar2DInheritance.getComponents()[0] + ", y: " + polar2DInheritance.getComponents()[1]);
        System.out.println("vector3DDecorator");
        System.out.println("x: " + vector3DDecorator.getComponents()[0] + ", y: " + vector3DDecorator.getComponents()[1] + ", z: " + vector3DDecorator.getComponents()[2]);

        System.out.println("\nUKŁAD BIEGUNOWY");
        System.out.println("polar2DAdapter");
        System.out.printf("promień wodzący: %f wartość kąta: %f%n", polar2DAdapter.abs(), polar2DAdapter.getAngle());
        System.out.println("polar2DInheritance");
        System.out.printf("promień wodzący: %f wartość kąta: %f%n", polar2DInheritance.abs(), polar2DInheritance.getAngle());

        System.out.println("\nILOCZYN SKALARNY");
        System.out.println("polar2DAdapter i polar2DInheritance: " + polar2DAdapter.cdot(polar2DInheritance));
        System.out.println("vector3DDecorator i polar2DAdapter: " + vector3DDecorator.cdot(polar2DAdapter));
        System.out.println("vector3DDecorator o polar2DInheritance: " + vector3DDecorator.cdot(polar2DInheritance));
        System.out.println("polar2DAdapter i polar2DAdapter: " + polar2DAdapter.cdot(polar2DAdapter));

        System.out.println("\nILOCZYN WEKTOROWY");
        System.out.println("vector3DDecorator i polar2DAdapter: ");
        Vector3DInheritance cross1 = vector3DDecorator.cross(polar2DAdapter);
        System.out.printf("x: %.2f, y: %.2f, z: %.2f%n", cross1.getComponents()[0],cross1.getComponents()[1], cross1.getComponents()[2]);
        System.out.println("vector3DDecorator o polar2DInheritance: ");
        Vector3DInheritance cross2 = vector3DDecorator.cross(polar2DInheritance);
        System.out.printf("x: %.2f, y: %.2f, z: %.2f%n", cross2.getComponents()[0],cross2.getComponents()[1], cross2.getComponents()[2]);



    }
}
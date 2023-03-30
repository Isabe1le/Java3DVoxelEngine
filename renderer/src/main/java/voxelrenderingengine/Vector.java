package voxelrenderingengine;

public class Vector {

    public double x;
    public double y;
    public double z;
    
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return "(x: "+ this.x + ", y: " + this.y + ", z: " + this.z + ")";
    }
}

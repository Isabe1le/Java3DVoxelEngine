package voxelrenderingengine;

public class Voxel {
    // The voxels (x, y, z) coordinates.
    private double[] positionVector = new double[3];

    // The voxels movement vector (movement in terms of m/s for (x, y, z))
    private double[] movementVector = new double[3];

    // The voxels mass in kg.
    private double mass;

    // Side length of the voxel.
    private double size;

    /**
     * @param positionVector the voxels starting position vector.
     * @param movementVector the voxels starting movement vector.
     * @param mass the voxels mass.
     * @param size the voxels size.
     */
    public Voxel(double[] positionVector, double[] movementVector, double mass, double size) {
        this.positionVector = positionVector;
        this.movementVector = movementVector;
        this.mass = mass;
        this.size = size;
    }

    /**
     * @return double[3] of the voxels position vector.
     */
    public double[] getPositionVector() {
        return this.positionVector;
    }

    /**
     * @return double[3] of the voxels movement vector.
     */
    public double[] getMovementVector() {
        return this.movementVector;
    }

    /**
     * @return double of the voxels mass.
     */
    public double getMass() {
        return this.mass;
    }

    /**
     * @return double of the voxels size.
     */
    public double getSize() {
        return this.size;
    }

}

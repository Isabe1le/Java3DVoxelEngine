package voxelrenderingengine;

public class Voxel {
    // The voxels position vector.
    public Vector position;

    // The voxels momentum vector (movement in terms of m/s)
    public Vector momentum;

    // The voxels mass in kg.
    public double mass;

    // Side length of the voxel.
    public double size;

    /**
     * @param positionVector the voxels starting position vector.
     * @param momentumVector the voxels starting momentum vector.
     * @param mass the voxels mass.
     * @param size the voxels size.
     */
    public Voxel(Vector positionVector, Vector momentumVector, double mass, double size) {
        this.position = positionVector;
        this.momentum = momentumVector;
        this.mass = mass;
        this.size = size;
    }
}

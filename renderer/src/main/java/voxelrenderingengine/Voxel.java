package voxelrenderingengine;

public class Voxel {
    // The voxels position vector.
    public Vector position;

    // The voxels velocity vector (movement in terms of m/s)
    public Vector velocity;

    // The voxels mass in kg.
    public double mass;

    // Side length of the voxel.
    public double size;

    /**
     * @param positionVector the voxels starting position vector.
     * @param velocityVector the voxels starting velocity vector.
     * @param mass the voxels mass.
     * @param size the voxels size.
     */
    public Voxel(Vector positionVector, Vector velocityVector, double mass, double size) {
        this.position = positionVector;
        this.velocity = velocityVector;
        this.mass = mass;
        this.size = size;
    }
}

package voxelrenderingengine;

public class Voxel {
    // The voxels position vector.
    public Vector position;

    // The voxels motion vector (movement in terms of m/s)
    public Vector motion;

    // The voxels mass in kg.
    public double mass;

    // Side length of the voxel.
    public double size;

    /**
     * @param positionVector the voxels starting position vector.
     * @param motionVector the voxels starting motion vector.
     * @param mass the voxels mass.
     * @param size the voxels size.
     */
    public Voxel(Vector positionVector, Vector motionVector, double mass, double size) {
        this.position = positionVector;
        this.motion = motionVector;
        this.mass = mass;
        this.size = size;
    }
}

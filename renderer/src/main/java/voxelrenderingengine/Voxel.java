package voxelrenderingengine;

import java.util.List;

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

    /**
     * @return the Voxels momentum vector.
     */
    public Vector getMomentumVector() {
        // p = mv
        // p = momentum
        // m = mass
        // v = velocity

        double px = this.mass * this.velocity.x;
        double py = this.mass * this.velocity.y;
        double pz = this.mass * this.velocity.z;

        Vector momentum = new Vector(px, py, pz);

        return momentum;
    }

    public Vector[] getPointPositionVectors() {
        Vector[] vectorList = new Vector[8];

        //  0--------------1
        //  |\             |\
        //  | \            | \
        //  |  \           |  \
        //  |   3--------------2
        //  |   |          |   |
        //  7---|----------6   |
        //   \  |           \  |
        //    \ |            \ |
        //     \|             \|
        //      4--------------5

        return vectorList;

    }
}

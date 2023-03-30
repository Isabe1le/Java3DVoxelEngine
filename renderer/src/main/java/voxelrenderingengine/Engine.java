package voxelrenderingengine;

import java.util.ArrayList;
import java.util.List;

public class Engine
{
    // The simulations gravity (m/s).
    private double gravity;

    // The simulations width (in meters)
    private double simWidth;
    // The simulations height (in meters)
    private double simHeight;

    // A list of all voxles this engine handles.
    private List<Voxel> voxelList = new ArrayList<Voxel>();

    /**
     * @param simWidth the simulation width in meters.
     * @param simHeight the simulation height in meters.
     * @param gravity the simulation gravity in m/s
     */
    public Engine(double simWidth, double simHeight, double gravity) {
        this.simWidth = simWidth;
        this.simHeight = simHeight;
        this.gravity = gravity;
    }

    /**
     * @return double of the simulations gravity.
     */
    public double getGravity() {
        return this.gravity;
    }

    /**
     * @return double of the simulations width in meters.
     */
    public double getSimWidth() {
        return this.simWidth;
    }

    /**
     * @return double of the simulations height in meters.
     */
    public double getSimHeight() {
        return this.simHeight;
    }


    /**
     * @param voxelToAdd the Voxel object that you wish to add to the engines renderer.
     */
    public void addVoxel(Voxel voxelToAdd) {
        this.voxelList.add(voxelToAdd);
    }

    /**
     * @return List<Voxel> of all of the Voxels this engine handles.
     */
    public List<Voxel> getVoxelList() {
        return this.voxelList;
    }
}

package voxelrenderingengine;

public class App {
    public static void main(String[] args) {
        Engine engine = new Engine(1000, 600, 5);

        Vector voxelPositionVector = new Vector(10, 15, 30);

        Vector voxelMovementVector = new Vector(10, 15, 30);

        Voxel voxel = new Voxel(voxelMovementVector, voxelPositionVector, 10.0, 5.0);
        engine.addVoxel(voxel);

        // Print out the list
        System.out.println(engine.getVoxelList());

        // Print out the first Voxel
        System.out.println(engine.getVoxelList().get(0));

        // Print out the first Voxels momentum vector
        System.out.println(engine.getVoxelList().get(0).getMomentumVector());
    }
}

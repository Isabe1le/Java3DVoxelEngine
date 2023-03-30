package voxelrenderingengine;

public class App {
    public static void main(String[] args) {
        Engine engine = new Engine(100, 100, 5);

        Vector voxelPositionVector = new Vector(10, 15, 30);

        Vector voxelMovementVector = new Vector(10, 15, 30);

        Voxel voxel = new Voxel(voxelMovementVector, voxelPositionVector, 10.0, 5.0);
        engine.addVoxel(voxel);

        System.out.println(engine.getVoxelList());
    }
}

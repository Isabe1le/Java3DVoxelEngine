package voxelrenderingengine;

public class App {
    public static void main(String[] args) {
        Engine engine = new Engine(100, 100, 5);

        double[] voxelPositionVector = new double[3];
        voxelPositionVector[0] = 10;
        voxelPositionVector[1] = 15;
        voxelPositionVector[2] = 30;

        double[] voxelMovementVector = new double[3];
        voxelMovementVector[0] = 10;
        voxelMovementVector[1] = 15;
        voxelMovementVector[2] = 30;

        Voxel voxel = new Voxel(voxelMovementVector, voxelPositionVector, 10.0, 5.0);
        engine.addVoxel(voxel);

        System.out.println(engine.getVoxelList());
    }
}

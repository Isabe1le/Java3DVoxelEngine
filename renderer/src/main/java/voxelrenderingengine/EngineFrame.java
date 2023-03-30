package voxelrenderingengine;

import java.util.List;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EngineFrame extends JPanel {

    private JPanel renderPanel;
    private JFrame frame;
    private Container pane;
    
    private Engine engine;

    private final int width;
    private final int height;

    public void paintComponent(Graphics graphicsContext) {
        Graphics2D grapics2DContext = (Graphics2D) graphicsContext;
        grapics2DContext.setColor(Color.BLACK);
        grapics2DContext.fillRect(0, 0, getWidth(), getHeight());
        
        // rendering magic will happen here
        grapics2DContext.translate(getWidth() / 2, getHeight() / 2);
        grapics2DContext.setColor(Color.WHITE);

        List<Voxel> listOfVoxels = this.engine.getVoxelList();

        for (Voxel voxel : listOfVoxels) {
            Vector[] voxelVectors = voxel.getPointPositionVectors();
            Path2D path = new Path2D.Double();
            boolean initial = true;
            for (Vector vector : voxelVectors) {
                if (initial) {
                    path.moveTo(vector.x, vector.y);
                    initial = false;
                } else {
                    path.lineTo(vector.x, vector.y);
                }
            }
            path.closePath();
            grapics2DContext.draw(path);
        }
    }

    public EngineFrame(int width, int height, Engine engine) {
        this.engine = engine;

        this.renderPanel = new JPanel();
        this.frame = new JFrame();
        this.pane = frame.getContentPane();
        this.pane.setLayout(new BorderLayout());

        this.width = width;
        this.height = height;
       
        this.pane.add(renderPanel, BorderLayout.CENTER);
        
        this.frame.setSize(this.width, this.height);
        this.frame.setVisible(true);
    }
}

package voxelrenderingengine;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EngineFrame extends JPanel {

    private JPanel renderPanel;
    private JFrame frame;
    private Container pane;
    
    private final int width;
    private final int height;

    public void paintComponent(Graphics graphicsContext) {
        Graphics2D grapics2DContext = (Graphics2D) graphicsContext;
        grapics2DContext.setColor(Color.BLACK);
        grapics2DContext.fillRect(0, 0, getWidth(), getHeight());
        
        // rendering magic will happen here
    }

    public EngineFrame(int width, int height) {
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

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class vehicle extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawVehicle(g);
    }

    private void drawVehicle(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(Color.BLUE); 
        g2.fillRect(100, 110, 270, 80);

        g2.setColor(Color.BLACK); 

        g2.fillOval(100, 180, 70, 70); 
        g2.fillOval(300, 180, 70, 70); 

        g2.dispose();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(50, 50, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        vehicle vehiclePanel = new vehicle();
        frame.add(vehiclePanel);

        frame.setVisible(true);
    }
}


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class Panel extends JPanel {
    private BufferedImage cloud, DBServer, Webserver, Firewall, Loadbalancer;
    public Panel(){
        setPreferredSize(new Dimension(400, 200));
        setBackground(Color.LIGHT_GRAY);
        try {
            cloud = ImageIO.read(new File("src/internet.png"));
            DBServer = ImageIO.read(new File("src/Database.png"));
            Webserver = ImageIO.read(new File("src/Webserver.png"));
            Firewall = ImageIO.read(new File("src/Firewall.png"));
            Loadbalancer = ImageIO.read(new File("src/Loadbalancer.png"));
        } catch (IOException ex) {
            System.out.println("Plaatje niet gevonden.");
        }
    }
    public void paint(Graphics g){
        paintComponent(g);
        g.drawImage(cloud, 0, 75, null);
    }
}
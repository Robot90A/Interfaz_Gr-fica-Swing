package INICIO_SESION;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;


public class Diseño_INICIO_SESION extends Botones_SESION {

    Image user_login;

    public Diseño_INICIO_SESION(){

        File direccionFile = new File("src/IMAGENES/user_login2.jpeg");
        
        try{
        user_login = ImageIO.read(direccionFile);
        }catch(IOException e){

            JOptionPane.showMessageDialog(null, "ERROR: NO SE ENCUENTRA LA IMAGEN");
        }

    }
    
    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D)g;

        Rectangle2D rectangulo = new Rectangle2D.Double(0, 483, 500, 100);

        g2d.setPaint(new Color(255, 181, 82));

        g2d.fill(rectangulo);

        Rectangle2D rectangulo2 = new Rectangle2D.Double(0, 0, 500, 500);

        g2d.setPaint(new Color(255, 255, 255));

        g2d.fill(rectangulo2);

        g.drawImage(user_login, 150, 20, null);

    }
    
}

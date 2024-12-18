package CREAR_CUENTA;

import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class DiseñoDelmarco extends  BotonesDelmarco {

    Image logo;

    public DiseñoDelmarco(){

        File direccion = new File("src/IMAGENES/Hacker.jpg");
        
        try{
        logo = ImageIO.read(direccion);
        }catch(IOException e){

            JOptionPane.showMessageDialog(null, "ERROR: IMAGEN NO ENCONTRADA");
        }

    }
    
    @Override
    public void paintComponent(Graphics g){

        Graphics2D g2d = (Graphics2D)g;

        Font letraTitulo = new Font("Calibri", Font.BOLD, 20);

        g2d.setPaint(Color.BLACK);

        g2d.setFont(letraTitulo);

        g2d.drawString("CREAR PERFIL DE USUARIO", 390, 50);

        Font letraCuadros = new Font("Calibri", Font.BOLD, 15);

        g2d.setPaint(Color.BLACK);

        g2d.setFont(letraCuadros);

        g2d.drawString("Nombre", 85, 120);

        g2d.drawString("Apellido", 82, 170);

        g2d.drawString("Correo", 90, 220);

        g2d.drawString("Dirreccion", 78, 270);

        g2d.drawString("Telefono", 80, 320);

        g2d.drawString("Contraseña", 70, 370);

        g2d.drawImage(logo, 410, 70, null);


        Rectangle2D Cuadro = new Rectangle2D.Double(0, 475, 1000, 150);

        g2d.setPaint(new Color(255, 181, 82));

        g2d.fill(Cuadro);

    }

}

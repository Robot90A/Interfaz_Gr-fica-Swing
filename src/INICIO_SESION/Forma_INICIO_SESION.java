package INICIO_SESION;

import java.awt.*;
import javax.swing.*;

public class Forma_INICIO_SESION extends JFrame {

    public Forma_INICIO_SESION(){

        Toolkit Windowconfigurate = Toolkit.getDefaultToolkit();

        setTitle("INICIO DE SESION");

        setBounds(400, 40, 500, 620);

        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Image iconoHacker = Windowconfigurate.getImage("src/IMAGENES/logo_Hacker.JPG");

        setIconImage(iconoHacker);

        add(new Diseño_INICIO_SESION());

        setVisible(true);

        
    }

    
}

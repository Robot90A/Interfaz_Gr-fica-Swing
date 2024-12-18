package CREAR_CUENTA;

import java.awt.*;
import javax.swing.*;

public class FormaDelmarco extends JFrame {

    public FormaDelmarco(){

        Toolkit configuracionDepantalla = Toolkit.getDefaultToolkit();

        setTitle("INTERFAZ DE USUARIO");

        setSize(1000, 650);

        setLocation(180, 20);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Image icono = configuracionDepantalla.createImage("src/IMAGENES/imagen.jpg");

        setIconImage(icono);

        setResizable(false);

        DiseñoDelmarco diseño = new DiseñoDelmarco();

        add(diseño);

        setVisible(true);

    }


}

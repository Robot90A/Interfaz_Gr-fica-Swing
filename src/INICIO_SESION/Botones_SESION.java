package INICIO_SESION;

import APLICACION.*;
import CREAR_CUENTA.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Botones_SESION extends JPanel implements ActionListener{

    private JButton Boton1;
    private JButton Boton2;

    public Botones_SESION(){

        setLayout(null);

        JLabel ingresar_usuario = new JLabel("Nombre");
        JLabel ingresar_contraseña = new JLabel("Contraseña");

        ingresar_usuario.setBounds(50, 250, 250, 35);
        ingresar_contraseña.setBounds(40, 300, 250, 35);

        add(ingresar_usuario);
        add(ingresar_contraseña);

        JTextField cuadroNombre = new JTextField();
        JTextField cuadroContraseña = new JTextField();

        cuadroNombre.setBounds(120, 250, 250, 35);
        cuadroContraseña.setBounds(120, 300, 250, 35);

        add(cuadroNombre);
        add(cuadroContraseña);

        Botones dameIngresar = new Botones(" INGRESAR ", new ImageIcon("src/IMAGENES/bola_Azul.jpeg"));
        Botones dameCrear = new Botones(" CREAR CUENTA ", new ImageIcon("src/IMAGENES/bola_Azul.jpeg"));

        Boton1 = new JButton(dameIngresar);
        Boton2 =new JButton(dameCrear);

        Boton1.setBounds(120, 370, 250, 40);
        Boton1.setBackground(Color.WHITE);
        Boton2.setBounds(120, 420, 250, 40);
        Boton2.setBackground(Color.WHITE);

        add(Boton1);
        add(Boton2);

        Boton1.addActionListener(this);
        Boton2.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent e){

        Object Click_Open = e.getSource();

        if(Click_Open == Boton1){

            Interfaz_Aplicacion Open_Aplicacion = new Interfaz_Aplicacion();

            Open_Aplicacion.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            Open_Aplicacion.setVisible(true);

        }

        if(Click_Open == Boton2){

            FormaDelmarco Open_SESION = new FormaDelmarco();

            Open_SESION.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            Open_SESION.setVisible(true);

            Open_SESION.setBackground(new Color(173, 216, 230).brighter());
        }

    }

}

class Botones extends AbstractAction{
        
    public Botones(String nombre, Icon icono){

      putValue(Action.NAME, nombre);

      putValue(Action.SMALL_ICON, icono);

    
    }

   @Override
    public void actionPerformed(ActionEvent e){

        
    }

}

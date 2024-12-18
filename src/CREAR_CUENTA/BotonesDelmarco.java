package CREAR_CUENTA;

import APLICACION.*;
import javax.swing.*;
import java.awt.event.*;


public class BotonesDelmarco extends JPanel implements ActionListener {

    JButton botonA = new JButton("CREAR PERFIL DE USUARIO");

    JTextField cuadroA = new JTextField();
    JTextField cuadroB = new JTextField();
    JTextField cuadroC = new JTextField();
    JTextField cuadroD = new JTextField();
    JTextField cuadroE = new JTextField();
    JTextField cuadroF = new JTextField();


    public BotonesDelmarco(){

        setLayout(null);

        botonA = new JButton();

        cuadroA = new JTextField();
        cuadroB = new JTextField();
        cuadroC = new JTextField();
        cuadroE = new JTextField();
        cuadroF = new JTextField();

        botonA.setBounds(430, 500, 140, 40);
        botonA.setText("CREAR PERFIL");

        cuadroA.setBounds(150, 100, 300, 30);
        cuadroB.setBounds(150, 150, 300, 30);
        cuadroC.setBounds(150, 200, 300, 30);
        cuadroD.setBounds(150, 250, 300, 30);
        cuadroE.setBounds(150, 300, 300, 30);
        cuadroF.setBounds(150, 350, 300, 30);

        add(botonA);

        add(cuadroA);
        add(cuadroB);
        add(cuadroC);
        add(cuadroD);
        add(cuadroE);
        add(cuadroF);

        
        botonA.addActionListener(this);

    } 

    public void actionPerformed(ActionEvent e){

       Object Click = (Object)e.getSource();

       if(Click == botonA){

        Interfaz_Aplicacion APLICACION_INTERFAZ = new Interfaz_Aplicacion();

        APLICACION_INTERFAZ.setVisible(true);


        }  

    }
    
}

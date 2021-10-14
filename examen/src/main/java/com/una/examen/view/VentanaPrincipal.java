package com.una.examen.view;

import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;


public class VentanaPrincipal {
    private JButton actores, directores,peliculas;
    private JFrame panel;


    public VentanaPrincipal() throws HeadlessException {

        panel = new JFrame();
        panel.setTitle("Menu principal");

        panel.setSize(400, 300);
        panel.setLayout(null);

        panel.setLocationRelativeTo(null);
        panel.setResizable(false);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agregarComponentes();
        panel.setVisible(true);
    }

    public void agregarListener(ActionListener action){
        actores.addActionListener(action);
        directores.addActionListener(action);
        peliculas.addActionListener(action);

    }

    public void agregarComponentes(){
        agregarBotones();
    }

    public void agregarBotones(){
        //ImageIcon icono1 = new ImageIcon("Iconos/actor.png");

        this.actores = new JButton("Actores");
        this.actores.setBounds(100,25, 200, 50 );
        this.actores.setActionCommand("1");
        //this.actores.setIcon(icono1);
        //this.actores.setIconTextGap(2);
        this.panel.add(actores);

        this.directores = new JButton("Directores");
        this.directores.setBounds(100, 100, 200, 50);
        this.directores.setActionCommand("2");
        this.panel.add(directores);

        this.peliculas = new JButton("Peliculas");
        this.peliculas.setBounds(100, 175,200,50);
        this.peliculas.setActionCommand("3");
        this.panel.add(peliculas);
    }
    public void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(panel, errorMessage, "WARNING: FORMAT ERROR!!", JOptionPane.ERROR_MESSAGE);
    }

    public void displayMessage(String texto){

        JOptionPane.showMessageDialog(panel, texto);
    }

    
}

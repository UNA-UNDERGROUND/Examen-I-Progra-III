package com.una.examen.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;


class Ventana1 {

    int id;
    private JFrame a;
    private JLabel IDLabel, nombreLabel, premiosLabel;
    private JTextField IDTF, nombreTF, premiosTF;
    private JButton agregar, buscar, listar, actualizar, regresar;
    private JTable jt;
    private DefaultTableModel model;

    public DefaultTableModel getModel() {
        return model;
    }

    public Ventana1(int id) throws HeadlessException {
        a = new JFrame();
        a.setTitle("Actores");

        a.setSize(675, 500);
        a.setLayout(null);

        a.setLocationRelativeTo(null);
        a.setResizable(false);
        a.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        agregarComponentes();
        //a.setVisible(true);
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void agregarListener(ActionListener action){
        agregar.addActionListener(action);
        buscar.addActionListener(action);
        listar.addActionListener(action);
        actualizar.addActionListener(action);
        regresar.addActionListener(action);
    }

    public void agregarComponentes(){
        agregarLabels();
        agregarTextFields();
        agregarBotones();
        agregarJTable();
    }

    public void agregarLabels(){
        this.IDLabel = new JLabel("ID:");
        this.IDLabel.setBounds(123,25, 20,30);
        this.a.add(IDLabel);

        this.nombreLabel = new JLabel("Nombre:");
        this.nombreLabel.setBounds(90, 50, 100,30);
        this.a.add(nombreLabel);

        this.premiosLabel = new JLabel("Cantidad de premios:");
        this.premiosLabel.setBounds(20, 75, 150, 30);
        this.a.add(premiosLabel);
    }
    public void agregarTextFields(){
        this.IDTF = new JTextField();
        this.IDTF.setBounds(150, 30, 100, 20);
        this.a.add(IDTF);

        this.nombreTF = new JTextField();
        this.nombreTF.setBounds(150, 55, 100, 20);
        this.a.add(nombreTF);

        this.premiosTF = new JTextField();
        this.premiosTF.setBounds(150,80,100,20);
        this.a.add(this.premiosTF);


    }
    public void agregarBotones(){
        this.agregar = new JButton("Agregar");
        this.agregar.setBounds(25, 400, 100,30);
        this.agregar.setActionCommand("11");
        this.a.add(this.agregar);

        this.buscar = new JButton("Buscar");
        this.buscar.setBounds(150, 400, 100, 30);
        this.buscar.setActionCommand("12");
        this.a.add(this.buscar);

        this.listar = new JButton("Listar");
        this.listar.setBounds(275, 400, 100, 30);
        this.listar.setActionCommand("13");
        this.a.add(this.listar);

        this.actualizar = new JButton("Actualizar");
        this.actualizar.setEnabled(false);
        this.actualizar.setBounds(400,400,100,30);
        this.actualizar.setActionCommand("14");
        this.a.add(this.actualizar);

        this.regresar = new JButton("Regresar");
        this.regresar.setBounds(525,400,100,30);
        this.regresar.setActionCommand("15");
        this.a.add(this.regresar);
    }
    public void agregarJTable(){
        Object[] colHeadings = {"COLUMN1","COLUMN2", "COLUMN3"};
        //Object[] row = new Object[0];

        model = new DefaultTableModel(0, colHeadings.length);
        model.setColumnIdentifiers(colHeadings);

        jt = new JTable(model);

        jt.setBounds(25, 150, 600, 240);
        this.a.add(jt);
    }

    public void setnullJt() {
        this.jt = null;
    }

    public String getIDTF() { return IDTF.getText(); }
    public String getNombreTF() { return nombreTF.getText(); }
    public String getPremiosTF() { return premiosTF.getText(); }
    //public JTableData getJt() { return jt; }


    public JTable getJt() {
        return jt;
    }

    public void displayErrorMessage(String errorMessage)
    {
        JOptionPane.showMessageDialog(a, errorMessage, "WARNING: FORMAT ERROR!!", JOptionPane.ERROR_MESSAGE);

    }

    public void displayMessage(String texto){

        JOptionPane.showMessageDialog(a, texto);
    }

    public void setVisible(Boolean b){
        a.setVisible(b);
    }

    public boolean getVisible(){

        return a.isActive();
    }

    public void actualizarBoton(boolean b){
        
        this.actualizar.setEnabled(b);
    }

    public boolean prueba(int i){
        if(i == 1){
            return true;
        }
        else{
            return false;
        }
    }

}

    



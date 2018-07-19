/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import DAO.DAO8;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Oliva
 */
public class LibroMostrar extends javax.swing.JInternalFrame {

    JTable tb;
    public LibroMostrar() {
        initComponents();
        DAO8 d1= new DAO8();
        DefaultTableModel dtm= new DefaultTableModel();
        tb = this.JTB;
        tb.setModel(dtm);

        dtm.setColumnIdentifiers(new Object[] {"ISBN","Número de Serie", "Título", "Número de Páginas", "Valor", "Año de Publicación", " Código Editorial",
                                                "Código Autor", "Código Categoría", "Código Idioma", "ID Estado"});

        ResultSet rs=d1.Mostrar();
        try
        {
            while (rs.next())
            {
                dtm.addRow(new Object []{rs.getString("isbn"), rs.getInt("numero_serie"), rs.getString("titulo_libro"), rs.getInt("numero_paginas"),
                                            rs.getInt("precio_libro"), rs.getInt("año_publicacion"), rs.getString("cod_edi"), rs.getString("cod_autor"),
                                            rs.getString("cod_cat"), rs.getString("cod_idi"), rs.getInt("id_estado")});
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTB = new javax.swing.JTable();
        btnCargar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Mostrar Libros");

        JTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTB);

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(735, 735, 735)
                .addComponent(btnCargar)
                .addContainerGap(770, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnCargar)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        DAO8 d1= new DAO8();
        DefaultTableModel dtm= new DefaultTableModel();
        tb = this.JTB;
        tb.setModel(dtm);

        dtm.setColumnIdentifiers(new Object[] {"ISBN","Número de Serie", "Título", "Número de Páginas", "Valor", "Año de Publicación", " Código Editorial",
                                                "Código Autor", "Código Categoría", "Código Idioma", "ID Estado"});

        ResultSet rs=d1.Mostrar();
        try
        {
            while (rs.next())
            {
                dtm.addRow(new Object []{rs.getString("isbn"), rs.getInt("numero_serie"), rs.getString("titulo_libro"), rs.getInt("numero_paginas"),
                                            rs.getInt("precio_libro"), rs.getInt("año_publicacion"), rs.getString("cod_edi"), rs.getString("cod_autor"),
                                            rs.getString("cod_cat"), rs.getString("cod_idi"), rs.getInt("id_estado")});
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTB;
    private javax.swing.JButton btnCargar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

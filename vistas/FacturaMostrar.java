
package vistas;

import DAO.DAO6;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Oliva
 */
public class FacturaMostrar extends javax.swing.JInternalFrame {

    
    JTable tb;
    public FacturaMostrar() {
        initComponents();
        DAO6 d1= new DAO6();
        DefaultTableModel dtm= new DefaultTableModel();
        tb = this.JTB;
        tb.setModel(dtm);

        dtm.setColumnIdentifiers(new Object[] {"Codigo","Valor","Fecha","Hora","Rut Distribuidor","Código Metodo Pago"});

        ResultSet rs=d1.Mostrar();
        try
        {
            while (rs.next())
            {
                dtm.addRow(new Object []{rs.getString("cod_foliof"), rs.getInt("valor"), rs.getString("fecha_compra"), rs.getString("hora_compra"), rs.getString("rut_distribuidor"),
                                            rs.getString("cod_pago")});
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
        setTitle("Mostrar Facturas");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCargar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        DAO6 d1= new DAO6();
        DefaultTableModel dtm= new DefaultTableModel();
        tb = this.JTB;
        tb.setModel(dtm);

        dtm.setColumnIdentifiers(new Object[] {"Codigo","Valor","Fecha","Hora","Rut Distribuidor","Código Metodo Pago"});

        ResultSet rs=d1.Mostrar();
        try
        {
            while (rs.next())
            {
                dtm.addRow(new Object []{rs.getString("cod_foliof"), rs.getInt("valor"), rs.getString("fecha_compra"), rs.getString("hora_compra"), rs.getString("rut_distribuidor"),
                                            rs.getString("cod_pago")});
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

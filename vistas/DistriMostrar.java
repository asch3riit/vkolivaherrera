
package vistas;

import javax.swing.JTable;
import DAO.DAO3;
import DTO.DTO3;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Oliva
 */
public class DistriMostrar extends javax.swing.JInternalFrame {

    JTable tb;
    
    public DistriMostrar() {
        initComponents();
        DAO3 d1= new DAO3();
        DefaultTableModel dtm= new DefaultTableModel();
        tb = this.JTB;
        tb.setModel(dtm);
        
        dtm.setColumnIdentifiers(new Object[] {"RUT","Nombre","Dirección","Teléfono","Años de Servicio"});
        
        ResultSet rs=d1.Mostrar();
        try
        {
            while (rs.next())
            {
                dtm.addRow(new Object []{rs.getString("rut_distribuidor"), rs.getString("nombre_empresa"), rs.getString("direccion"), rs.getInt("numero_telefono"), rs.getInt("anos_venta")});
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
        setTitle("Mostrar Distribuidores");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        DAO3 d1= new DAO3();
        DefaultTableModel dtm= new DefaultTableModel();
        tb = this.JTB;
        tb.setModel(dtm);
        
        dtm.setColumnIdentifiers(new Object[] {"RUT","Nombre","Dirección","Teléfono","Años de Servicio"});
        
        ResultSet rs=d1.Mostrar();
        try
        {
            while (rs.next())
            {
                dtm.addRow(new Object []{rs.getString("rut_distribuidor"), rs.getString("nombre_empresa"), rs.getString("direccion"), rs.getInt("numero_telefono"), rs.getInt("anos_venta")});
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

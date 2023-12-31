/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControladorCliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelos.Cliente;
import modelos.Pedido;

/**
 *
 * @author Manuela Gomez
 */
public class VentanaCliente extends javax.swing.JFrame {

    ControladorCliente controlador;
    private TableRowSorter<DefaultTableModel> sorter;

    /**
     * Creates new form VentanaBusqueda
     */
    public VentanaCliente() {
        initComponents();
        setLocationRelativeTo(this);
        controlador = new ControladorCliente();
        llenarTablaCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtClienteID = new javax.swing.JTextField();
        lblClienteID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblPedidoID1 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        btnPasar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtClienteID.setForeground(new java.awt.Color(0, 0, 0));
        txtClienteID.setText(" ");
        txtClienteID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteIDKeyReleased(evt);
            }
        });

        lblClienteID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblClienteID.setForeground(new java.awt.Color(0, 0, 0));
        lblClienteID.setText("Cliente ID:");

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCliente);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre:");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("Email:");

        btnBuscar.setBackground(new java.awt.Color(51, 51, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(51, 51, 255));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 51, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(51, 51, 255));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblPedidoID1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPedidoID1.setForeground(new java.awt.Color(0, 0, 0));
        lblPedidoID1.setText("Buscar cliente por ID:");

        btnPasar.setBackground(new java.awt.Color(51, 51, 255));
        btnPasar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPasar.setForeground(new java.awt.Color(255, 255, 255));
        btnPasar.setText("PASAR");
        btnPasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addGap(54, 54, 54)
                        .addComponent(btnPasar)
                        .addGap(81, 81, 81)
                        .addComponent(btnRegistrar)
                        .addGap(49, 49, 49)
                        .addComponent(btnActualizar)
                        .addGap(44, 44, 44)
                        .addComponent(btnEliminar)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(lblPedidoID1)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClienteID)
                            .addComponent(lblEmail)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteID, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPedidoID1)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClienteID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblClienteID)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar)
                    .addComponent(btnRegistrar)
                    .addComponent(btnPasar)
                    .addComponent(btnBuscar))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if (camposVacios()) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
            return;
        }
        int idCliente = Integer.parseInt(txtClienteID.getText().trim());
        String nombre = txtNombre.getText().trim();
        String email = txtEmail.getText();

        try {
            Cliente cliente = new Cliente(idCliente, nombre, email);
            controlador.agregarCliente(cliente);
            llenarTablaCliente();
            limpiar();
            JOptionPane.showMessageDialog(null, "Cliente registrado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el cliente");
            System.err.println(ex);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int idCliente = Integer.parseInt(txtClienteID.getText().trim());
        controlador.eliminarCliente(idCliente);
        llenarTablaCliente();
        JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente");
        limpiar();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        if (camposVacios()) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos");
            return;
        }

        int id = Integer.parseInt(txtClienteID.getText().trim());
        String nombre = txtNombre.getText().trim();
        String email = txtEmail.getText().trim();

        try {
            Cliente cliente = new Cliente(id, nombre, email);
            controlador.editarCliente(cliente);
            llenarTablaCliente();
            limpiar();
            JOptionPane.showMessageDialog(null, "Cliente editado");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "No se pudo editar el cliente");
            System.err.println(ex);
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if (txtFiltro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el id");
            return;
        }

        int id = Integer.parseInt(txtFiltro.getText().trim());

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(new Object[]{
            "ID", "Nombre", "Email"
        });


        tablaCliente.setModel(model);
        Cliente cliente = controlador.buscarCliente(id);
        if (cliente != null) {
            model.addRow(new Object[]{
                cliente.getID(),
                cliente.getNombre(),
                cliente.getEmail(),
                
            });

        } else {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado");
            llenarTablaCliente();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtClienteIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteIDKeyReleased
        // TODO add your handling code here:
    }

    private void filtrar() {
        String filterText = txtClienteID.getText().trim();

        RowFilter<Object, Object> idCliente = RowFilter.regexFilter(filterText.trim(), 0);
        RowFilter<Object, Object> nombreCliente = RowFilter.regexFilter(filterText.trim(), 1);
        RowFilter<Object, Object> email = RowFilter.regexFilter(filterText.trim(), 2);

        sorter.setRowFilter(RowFilter.orFilter(Arrays.asList(idCliente, nombreCliente, email)));
    }//GEN-LAST:event_txtClienteIDKeyReleased

    private void tablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClienteMouseClicked
        // TODO add your handling code here:
        int seleccion = tablaCliente.getSelectedRow();

        txtClienteID.setText(tablaCliente.getValueAt(seleccion, 0).toString());
        txtNombre.setText(tablaCliente.getValueAt(seleccion, 1).toString());
        txtEmail.setText(tablaCliente.getValueAt(seleccion, 2).toString());

    }//GEN-LAST:event_tablaClienteMouseClicked

    private void btnPasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasarActionPerformed
        // TODO add your handling code here:
        new VentanaPedidos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPasarActionPerformed
    private void llenarTablaCliente() {
        DefaultTableModel modelo = new DefaultTableModel();

        ArrayList<Cliente> clientes = controlador.listarClientes();
        modelo.setColumnIdentifiers(new Object[]{
            "ID", "Nombre", "Email"
        });

        tablaCliente.setModel(modelo);
        tablaCliente.setAutoCreateRowSorter(true);
        sorter = new TableRowSorter<>(modelo);
        tablaCliente.setRowSorter(sorter);

        for (Cliente cliente : clientes) {
            modelo.addRow(new Object[]{
                cliente.getID(),
                cliente.getNombre(),
                cliente.getEmail()
            });
        }

    }

    private void limpiar() {
        txtClienteID.setText("");
        txtNombre.setText("");
        txtEmail.setText("");
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPasar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClienteID;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPedidoID1;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txtClienteID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private boolean camposVacios() {
        return (txtClienteID.getText().isEmpty() || txtNombre.getText().isEmpty() || txtEmail.getText().isEmpty());
    }
}

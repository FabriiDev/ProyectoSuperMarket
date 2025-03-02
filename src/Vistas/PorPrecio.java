package Vistas;

import Entidades.*;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PorPrecio extends javax.swing.JInternalFrame {

    private TreeSet<Producto> productos;
    private DefaultTableModel tp = new DefaultTableModel();

    public PorPrecio(TreeSet<Producto> productos) {
        initComponents();
        this.setLocation(-7, -40);
        this.setBorder(null);
        this.productos = productos;
        tbFiltroPrecio.setModel(tp);
        this.productos = productos;
        tp.addColumn("Codigo");
        tp.addColumn("Nombre");
        tp.addColumn("Precio");
        tp.addColumn("Stock");
        tbFiltroPrecio.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbFiltroPrecio.getColumnModel().getColumn(1).setPreferredWidth(400);
        tbFiltroPrecio.getColumnModel().getColumn(2).setPreferredWidth(200);
        tbFiltroPrecio.getColumnModel().getColumn(3).setPreferredWidth(100);
    }
// ------------- METODO PARA LIMPIAR TABLA -----------------------

    public void limpiarTabla() {
        int filas = tp.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            tp.removeRow(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        txtMinimo = new javax.swing.JTextField();
        txtMaximo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFiltroPrecio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(780, 730));

        fondo.setBackground(new java.awt.Color(153, 50, 0));

        txtMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMinimoKeyReleased(evt);
            }
        });

        txtMaximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaximoKeyReleased(evt);
            }
        });

        tbFiltroPrecio.setBackground(new java.awt.Color(236, 234, 230));
        tbFiltroPrecio.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        tbFiltroPrecio.setForeground(new java.awt.Color(0, 102, 153));
        tbFiltroPrecio.setModel(new javax.swing.table.DefaultTableModel(
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
        tbFiltroPrecio.setGridColor(new java.awt.Color(0, 0, 0));
        tbFiltroPrecio.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tbFiltroPrecio.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbFiltroPrecio.setShowGrid(false);
        jScrollPane1.setViewportView(tbFiltroPrecio);

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filtrado por precio");

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Precio minimo");

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio Maximo");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaximoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaximoKeyReleased
        double minimo;
        double maximo;
        try {
            minimo = Double.parseDouble(txtMinimo.getText());
            maximo = Double.parseDouble(txtMaximo.getText());
        } catch (NumberFormatException e) {

            minimo = 0;
            maximo = 0;
            txtMaximo.setText("");
            txtMinimo.setText(txtMinimo.getText());
            JOptionPane.showMessageDialog(this, "El precio debe ser un valor real...");
        }

        boolean bandera = false;
        limpiarTabla();
        for (Producto p : productos) {
            if (minimo <= p.getPrecio() && maximo >= p.getPrecio()) {
                tp.addRow(new Object[]{p.getCodigo(), p.getDescripcion(), p.getPrecio(), p.getStock()});
                bandera = true;
            }
            if (!bandera) {
                limpiarTabla();
            }
        }
    }//GEN-LAST:event_txtMaximoKeyReleased

    private void txtMinimoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinimoKeyReleased
        double precio;
        if (validaReal(txtMinimo.getText())) {
            precio = Double.parseDouble(txtMinimo.getText());
        } else {

            JOptionPane.showMessageDialog(this, "El precio debe ser un valor real...");
            txtMinimo.requestFocus();
            txtMinimo.setText("");
            return;
        }
    }//GEN-LAST:event_txtMinimoKeyReleased
    private boolean validaReal(String nro) {
        Pattern patron = Pattern.compile("^\\d+(\\.\\d+)?$");
        Matcher m = patron.matcher(nro);
        return m.matches();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbFiltroPrecio;
    private javax.swing.JTextField txtMaximo;
    private javax.swing.JTextField txtMinimo;
    // End of variables declaration//GEN-END:variables
}

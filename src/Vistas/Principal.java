package Vistas;

import Entidades.*;
import java.awt.Color;
import java.util.TreeSet;

/**
 *
 * @author Fabri
 */
public class Principal extends javax.swing.JFrame {
    private TreeSet<Producto> productos = new TreeSet<>();
    
    public Principal() {
        initComponents();
        setSize(1080, 720);
        
        // SE CREAN VARIOS PRODUCTOS PARA HACER PRUEBAS
        this.setTitle("SuperTodo");
        Categoria Comestible = new Categoria(1, "Comestible");
        Categoria Limpieza = new Categoria(2, "Limpieza");
        Categoria Perfumeria = new Categoria(3, "Perfumeria");
        escritorio.repaint();
        productos.add(new Producto(1, "Aceite de Girasol 1L", 180.0, Comestible, 50));
        productos.add(new Producto(2, "Shampoo Sedal 400ml", 220.0, Perfumeria, 30));
        productos.add(new Producto(3, "Detergente Ala 500ml", 150.0, Limpieza, 40));
        productos.add(new Producto(4, "Azúcar 1kg", 100.0, Comestible, 60));
        productos.add(new Producto(5, "Desodorante Rexona 150ml", 260.0, Perfumeria, 20));
        productos.add(new Producto(6, "Lavandina Ayudín 1L", 100.0, Limpieza, 45));
        productos.add(new Producto(7, "Arroz 1kg", 110.0, Comestible, 55));
        productos.add(new Producto(8, "Crema Dental Colgate 90g", 160.0, Perfumeria, 25));
        productos.add(new Producto(9, "Limpiador en Gel Cif 500ml", 140.0, Limpieza, 35));
        productos.add(new Producto(10, "Fideos Spaghetti 500g", 80.0, Comestible, 70));
        productos.add(new Producto(11, "Perfume Adidas 100ml", 900.0, Perfumeria, 15));
        productos.add(new Producto(12, "Jabón en Barra Ala 150g", 60.0, Limpieza, 50));
        productos.add(new Producto(13, "Leche Entera 1L", 130.0, Comestible, 40));
        productos.add(new Producto(14, "Acondicionador Sedal 300ml", 200.0, Perfumeria, 30));
        productos.add(new Producto(15, "Limpiahogar Mr. Músculo 500ml", 180.0, Limpieza, 35));
        productos.add(new Producto(16, "Yogur Frutado 250g", 60.0, Comestible, 50));
        productos.add(new Producto(17, "Jabón Líquido para Manos Palmolive 250ml", 120.0, Perfumeria, 40));
        productos.add(new Producto(18, "Desinfectante Lysoform 500ml", 220.0, Limpieza, 30));
        productos.add(new Producto(19, "Pan de Molde 500g", 100.0, Comestible, 60));
        productos.add(new Producto(20, "Colonial 250g", 170.0, Perfumeria, 25));
        productos.add(new Producto(21, "Café Molido 250g", 150.0, Comestible, 45));
        productos.add(new Producto(22, "Jabón Líquido para Ropa Skip 1L", 280.0, Limpieza, 20));
        productos.add(new Producto(23, "Té Negro 25 Saquitos", 90.0, Comestible, 50));
        productos.add(new Producto(24, "Acondicionador Pantene 300ml", 220.0, Perfumeria, 30));
        productos.add(new Producto(25, "Limpiador de Baño Vim 500ml", 170.0, Limpieza, 35));
        productos.add(new Producto(26, "Agua Mineral 2L", 70.0, Comestible, 40));
        productos.add(new Producto(27, "Desodorante Nivea 150ml", 240.0, Perfumeria, 25));
        productos.add(new Producto(28, "Detergente en Polvo Cif 800g", 200.0, Limpieza, 30));
        productos.add(new Producto(29, "Lechuga Crespa", 80.0, Comestible, 55));
        productos.add(new Producto(30, "Crema para Manos Neutrogena 75g", 190.0, Perfumeria, 20));
        productos.add(new Producto(31, "Limpiavidrios Glassex 500ml", 130.0, Limpieza, 40));
        productos.add(new Producto(32, "Mermelada de Frutilla 450g", 120.0, Comestible, 35));
        productos.add(new Producto(33, "Perfume Carolina Herrera 100ml", 1500.0, Perfumeria, 15));
        productos.add(new Producto(34, "Pañuelos de Papel Kleenex 6 unidades", 180.0, Limpieza, 25));
        productos.add(new Producto(35, "Queso Cremoso 200g", 200.0, Comestible, 30));
        productos.add(new Producto(36, "Colonia Natura 100ml", 500.0, Perfumeria, 10));
        productos.add(new Producto(37, "Desengrasante Sapolio 500ml", 150.0, Limpieza, 30));
        productos.add(new Producto(38, "Tomate Perita por Kg", 100.0, Comestible, 45));
        productos.add(new Producto(39, "Gel de Ducha Dove 400ml", 280.0, Perfumeria, 20));
        productos.add(new Producto(40, "Limpia Pisos Magistral 1L", 200.0, Limpieza, 25));
        productos.add(new Producto(41, "Mermelada de Durazno 450g", 130.0, Comestible, 35));
        productos.add(new Producto(42, "Agua de Colonia Nenuco 200ml", 350.0, Perfumeria, 15));
        productos.add(new Producto(43, "Desodorante de Ambientes Glade 360ml", 220.0, Limpieza, 30));
        productos.add(new Producto(44, "Manzana Roja por Kg", 120.0, Comestible, 40));
        productos.add(new Producto(45, "Shampoo Head & Shoulders 400ml", 250.0, Perfumeria, 25));
        productos.add(new Producto(46, "Lavandina Off 1L", 80.0, Limpieza, 50));
        productos.add(new Producto(47, "Batata por Kg", 90.0, Comestible, 55));
        productos.add(new Producto(48, "Loción Corporal Nivea 400ml", 280.0, Perfumeria, 20));
        productos.add(new Producto(49, "Insecticida Raid 300ml", 180.0, Limpieza, 35));
        productos.add(new Producto(50, "Cebolla por Kg", 80.0, Comestible, 60));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jpFondoMargenIzq = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpCrearProducto = new javax.swing.JPanel();
        lblCrearProducto = new javax.swing.JLabel();
        jpBucarXNombre = new javax.swing.JPanel();
        lblBuscarXNombre = new javax.swing.JLabel();
        jpBuscarXPrecio = new javax.swing.JPanel();
        lblBscarXPrecio = new javax.swing.JLabel();
        jpBuscarXCar = new javax.swing.JPanel();
        lblBuscarXCar = new javax.swing.JLabel();
        lblFiltroBusqueda = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        escritorio = new javax.swing.JPanel();
        lblFondoMercado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpFondo.setBackground(new java.awt.Color(51, 51, 51));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFondoMargenIzq.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-supermercado-96.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 50));

        jpCrearProducto.setBackground(new java.awt.Color(255, 255, 255));
        jpCrearProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpCrearProductoMouseClicked(evt);
            }
        });

        lblCrearProducto.setBackground(new java.awt.Color(255, 255, 255));
        lblCrearProducto.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblCrearProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblCrearProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCrearProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-crear-50.png"))); // NOI18N
        lblCrearProducto.setText("Crear producto");
        lblCrearProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCrearProducto.setIconTextGap(20);
        lblCrearProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCrearProductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCrearProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCrearProductoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpCrearProductoLayout = new javax.swing.GroupLayout(jpCrearProducto);
        jpCrearProducto.setLayout(jpCrearProductoLayout);
        jpCrearProductoLayout.setHorizontalGroup(
            jpCrearProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCrearProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCrearProductoLayout.setVerticalGroup(
            jpCrearProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCrearProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpBucarXNombre.setBackground(new java.awt.Color(255, 255, 255));
        jpBucarXNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpBucarXNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBucarXNombreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBucarXNombreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBucarXNombreMouseExited(evt);
            }
        });

        lblBuscarXNombre.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblBuscarXNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscarXNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBuscarXNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-encuentra-hombre-usuario-50.png"))); // NOI18N
        lblBuscarXNombre.setText("Por Nombre");
        lblBuscarXNombre.setIconTextGap(20);

        javax.swing.GroupLayout jpBucarXNombreLayout = new javax.swing.GroupLayout(jpBucarXNombre);
        jpBucarXNombre.setLayout(jpBucarXNombreLayout);
        jpBucarXNombreLayout.setHorizontalGroup(
            jpBucarXNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBuscarXNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpBucarXNombreLayout.setVerticalGroup(
            jpBucarXNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBuscarXNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpBuscarXPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jpBuscarXPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpBuscarXPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBuscarXPrecioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBuscarXPrecioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBuscarXPrecioMouseExited(evt);
            }
        });

        lblBscarXPrecio.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblBscarXPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lblBscarXPrecio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBscarXPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-precio-50.png"))); // NOI18N
        lblBscarXPrecio.setText("Por Precio");
        lblBscarXPrecio.setIconTextGap(20);

        javax.swing.GroupLayout jpBuscarXPrecioLayout = new javax.swing.GroupLayout(jpBuscarXPrecio);
        jpBuscarXPrecio.setLayout(jpBuscarXPrecioLayout);
        jpBuscarXPrecioLayout.setHorizontalGroup(
            jpBuscarXPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBscarXPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpBuscarXPrecioLayout.setVerticalGroup(
            jpBuscarXPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBscarXPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpBuscarXCar.setBackground(new java.awt.Color(255, 255, 255));
        jpBuscarXCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpBuscarXCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBuscarXCarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBuscarXCarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBuscarXCarMouseExited(evt);
            }
        });

        lblBuscarXCar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblBuscarXCar.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscarXCar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBuscarXCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-categoría-50.png"))); // NOI18N
        lblBuscarXCar.setText("Por Categoria");
        lblBuscarXCar.setIconTextGap(20);

        javax.swing.GroupLayout jpBuscarXCarLayout = new javax.swing.GroupLayout(jpBuscarXCar);
        jpBuscarXCar.setLayout(jpBuscarXCarLayout);
        jpBuscarXCarLayout.setHorizontalGroup(
            jpBuscarXCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBuscarXCar, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jpBuscarXCarLayout.setVerticalGroup(
            jpBuscarXCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBuscarXCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblFiltroBusqueda.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblFiltroBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        lblFiltroBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFiltroBusqueda.setText("Filtar:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Montserrat Black", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡SuperTodo!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpFondoMargenIzqLayout = new javax.swing.GroupLayout(jpFondoMargenIzq);
        jpFondoMargenIzq.setLayout(jpFondoMargenIzqLayout);
        jpFondoMargenIzqLayout.setHorizontalGroup(
            jpFondoMargenIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoMargenIzqLayout.createSequentialGroup()
                .addGroup(jpFondoMargenIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpBuscarXCar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBuscarXPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpCrearProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBucarXNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFiltroBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpFondoMargenIzqLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFondoMargenIzqLayout.setVerticalGroup(
            jpFondoMargenIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoMargenIzqLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jpCrearProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFiltroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBucarXNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpBuscarXPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpBuscarXCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jpFondo.add(jpFondoMargenIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 720));

        escritorio.setBackground(new java.awt.Color(153, 50, 0));

        lblFondoMercado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/foto-super.jpg"))); // NOI18N

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondoMercado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondoMercado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpFondo.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 750, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpBucarXNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBucarXNombreMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        PorNombre btn = new PorNombre(productos);
        btn.setVisible(true);
        escritorio.add(btn);
    }//GEN-LAST:event_jpBucarXNombreMouseClicked
    //---------------------- HOVER DEL BOTON CREAR PRODUCTO ---------------------
    private void lblCrearProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearProductoMouseEntered
        jpCrearProducto.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_lblCrearProductoMouseEntered

    private void lblCrearProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearProductoMouseExited
        jpCrearProducto.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_lblCrearProductoMouseExited
//---------------------- HOVER DEL BOTON BUSCAR POR NOMBRE ---------------------
    private void jpBucarXNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBucarXNombreMouseEntered
        jpBucarXNombre.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jpBucarXNombreMouseEntered

    private void jpBucarXNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBucarXNombreMouseExited
        jpBucarXNombre.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jpBucarXNombreMouseExited
    // ---------------------------- MOUSE CLICKED BUSCAR POR PRECIO ----------------------
    private void jpBuscarXPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBuscarXPrecioMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        PorPrecio btn = new PorPrecio(productos);
        btn.setVisible(true);
        escritorio.add(btn);
    }//GEN-LAST:event_jpBuscarXPrecioMouseClicked
// ---------------------------- MOUSE CLICKED BUSCAR POR CARACTERISTICA ----------------------
    private void jpBuscarXCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBuscarXCarMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        PorCaracteristica btn = new PorCaracteristica(productos);
        btn.setVisible(true);
        escritorio.add(btn);
    }//GEN-LAST:event_jpBuscarXCarMouseClicked

// ---------------------------- MOUSE CLICKED BUSCAR POR PRECIO ----------------------
    private void jpBuscarXPrecioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBuscarXPrecioMouseEntered
        jpBuscarXPrecio.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jpBuscarXPrecioMouseEntered

    private void jpBuscarXPrecioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBuscarXPrecioMouseExited
       jpBuscarXPrecio.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jpBuscarXPrecioMouseExited
// ---------------------------- MOUSE CLICKED BUSCAR POR CATEGORIA ----------------------
    private void jpBuscarXCarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBuscarXCarMouseEntered
        jpBuscarXCar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jpBuscarXCarMouseEntered

    private void jpBuscarXCarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBuscarXCarMouseExited
        jpBuscarXCar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jpBuscarXCarMouseExited

    private void jpCrearProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCrearProductoMouseClicked
        
    }//GEN-LAST:event_jpCrearProductoMouseClicked

    private void lblCrearProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearProductoMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        escritorio.removeAll();
        escritorio.repaint();
        CrearProducto btn = new CrearProducto(productos,escritorio);
        btn.setVisible(true);
        escritorio.add(btn);
        
    }//GEN-LAST:event_lblCrearProductoMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }
        });
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpBucarXNombre;
    private javax.swing.JPanel jpBuscarXCar;
    private javax.swing.JPanel jpBuscarXPrecio;
    private javax.swing.JPanel jpCrearProducto;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JPanel jpFondoMargenIzq;
    private javax.swing.JLabel lblBscarXPrecio;
    private javax.swing.JLabel lblBuscarXCar;
    private javax.swing.JLabel lblBuscarXNombre;
    private javax.swing.JLabel lblCrearProducto;
    private javax.swing.JLabel lblFiltroBusqueda;
    private javax.swing.JLabel lblFondoMercado;
    // End of variables declaration//GEN-END:variables
}

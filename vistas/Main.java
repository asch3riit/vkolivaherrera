
package vistas;





public class Main extends javax.swing.JFrame {


    vistas.LibroRegistrar lbregistrar;
    vistas.LibroBorrar lbborrar;
    vistas.LibroModificar lbmodificar;
    vistas.LibroBuscar lbbuscar;
    vistas.LibroMostrar lbmostrar;
    vistas.AutorRegistrar auregistrar;
    vistas.AutorModificar aumodificar;
    vistas.AutorBorrar auborrar;
    vistas.AutorMostrar aumostrar;
    vistas.AutorBuscar aubuscar;
    vistas.EditorialBorrar edborrar;
    vistas.EditorialModificar edmodificar;
    vistas.EditorialBuscar edbuscar;
    vistas.EditorialRegistrar edregistrar;
    vistas.EditorialMostrar edmostrar;
    vistas.CatBorrar catborrar;
    vistas.CatBuscar catbuscar;
    vistas.CatModificar catmodificar;
    vistas.CatMostrar catmostrar;
    vistas.CatRegistrar catregistrar;
    vistas.IdiomaBorrar idborrar;
    vistas.IdiomaBuscar idbuscar;
    vistas.IdiomaModificar idmodificar;
    vistas.IdiomaMostrar idmostrar;
    vistas.IdiomaRegistrar idregistrar;
    vistas.EstadoBorrar esborrar;
    vistas.EstadoBuscar esbuscar;
    vistas.EstadoModificar esmodificar;
    vistas.EstadoMostrar esmostrar;
    vistas.EstadoRegistrar esregistrar;
    vistas.DistriBorrar disborrar;
    vistas.DistriBuscar disbuscar;
    vistas.DistriModificar dismodificar;
    vistas.DistriMostrar dismostrar;
    vistas.DistriRegistrar disregistrar;
    vistas.FacturaRegistrar facregistrar;
    vistas.FacturaMostrar facmostrar;
    vistas.FacturaBorrar facborrar;
    vistas.FacturaModificar facmodificar;
    vistas.FacturaBuscar facbuscar;
    vistas.MPBorrar mpborrar;
    vistas.MPBuscar mpbuscar;
    vistas.MPModificar mpmodificar;
    vistas.MPMostrar mpmostrar;
    vistas.MPRegistrar mpregistrar;
    vistas.CompraRegistrar cmregistrar;
    
    
    
    
    public Main() {
        initComponents();
        this.setLocationRelativeTo(this);
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        escritorio = new javax.swing.JPanel();
        MenuBar1 = new javax.swing.JMenuBar();
        mbLibro = new javax.swing.JMenu();
        mbLibro2 = new javax.swing.JMenu();
        LibroRegistrar = new javax.swing.JMenuItem();
        LibroModificar = new javax.swing.JMenuItem();
        LibroBuscar = new javax.swing.JMenuItem();
        LibroMostrar = new javax.swing.JMenuItem();
        LibroBorrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mbAutor = new javax.swing.JMenu();
        AutorRegistrar = new javax.swing.JMenuItem();
        AutorModificar = new javax.swing.JMenuItem();
        AutorMostrar = new javax.swing.JMenuItem();
        AutorBuscar = new javax.swing.JMenuItem();
        AutorBorrar = new javax.swing.JMenuItem();
        mbEditorial = new javax.swing.JMenu();
        EditorialRegistrar = new javax.swing.JMenuItem();
        EditorialModificar = new javax.swing.JMenuItem();
        EditorialMostrar = new javax.swing.JMenuItem();
        EditorialBuscar = new javax.swing.JMenuItem();
        EditorialBorrar = new javax.swing.JMenuItem();
        mbCategoria = new javax.swing.JMenu();
        CategoriaRegistrar = new javax.swing.JMenuItem();
        CategoriaModificar = new javax.swing.JMenuItem();
        CategoriaMostrar = new javax.swing.JMenuItem();
        CategoriaBuscar = new javax.swing.JMenuItem();
        CategoriaBorrar = new javax.swing.JMenuItem();
        mbIdioma = new javax.swing.JMenu();
        IdiomaRegistrar = new javax.swing.JMenuItem();
        IdiomaModificar = new javax.swing.JMenuItem();
        IdiomaBuscar = new javax.swing.JMenuItem();
        IdiomaMostrar = new javax.swing.JMenuItem();
        IdiomaBorrar = new javax.swing.JMenuItem();
        mbEstado = new javax.swing.JMenu();
        EstadoRegistrar = new javax.swing.JMenuItem();
        EstadoModificar = new javax.swing.JMenuItem();
        EstadoBuscar = new javax.swing.JMenuItem();
        EstadoMostrar = new javax.swing.JMenuItem();
        EstadoBorrar = new javax.swing.JMenuItem();
        mbDistribuidor = new javax.swing.JMenu();
        DistriRegistrar = new javax.swing.JMenuItem();
        DistriModificar = new javax.swing.JMenuItem();
        DistriMostrar = new javax.swing.JMenuItem();
        DistriBuscar = new javax.swing.JMenuItem();
        DistriBorrar = new javax.swing.JMenuItem();
        mbFactura = new javax.swing.JMenu();
        FacRegistrar = new javax.swing.JMenuItem();
        FacModificar = new javax.swing.JMenuItem();
        FacBuscar = new javax.swing.JMenuItem();
        FacBorrar = new javax.swing.JMenuItem();
        FacMostrar = new javax.swing.JMenuItem();
        mbCompra = new javax.swing.JMenu();
        miMetodoPago = new javax.swing.JMenu();
        MPRegistrar = new javax.swing.JMenuItem();
        MPModificar = new javax.swing.JMenuItem();
        MPBorar = new javax.swing.JMenuItem();
        MPMostrar = new javax.swing.JMenuItem();
        MPBuscar = new javax.swing.JMenuItem();
        CmpRegistrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1634, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mbLibro.setText("Libro");

        mbLibro2.setText("Libros");

        LibroRegistrar.setText("Registrar");
        LibroRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibroRegistrarActionPerformed(evt);
            }
        });
        mbLibro2.add(LibroRegistrar);

        LibroModificar.setText("Modificar / ISBN");
        LibroModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibroModificarActionPerformed(evt);
            }
        });
        mbLibro2.add(LibroModificar);

        LibroBuscar.setText("Buscar / ISBN");
        LibroBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibroBuscarActionPerformed(evt);
            }
        });
        mbLibro2.add(LibroBuscar);

        LibroMostrar.setText("Mostrar Todos");
        LibroMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibroMostrarActionPerformed(evt);
            }
        });
        mbLibro2.add(LibroMostrar);

        LibroBorrar.setText("Borrar");
        LibroBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibroBorrarActionPerformed(evt);
            }
        });
        mbLibro2.add(LibroBorrar);

        mbLibro.add(mbLibro2);

        jMenu2.setText("Detalles");

        mbAutor.setText("Autor");

        AutorRegistrar.setText("Registrar");
        AutorRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorRegistrarActionPerformed(evt);
            }
        });
        mbAutor.add(AutorRegistrar);

        AutorModificar.setText("Modificar");
        AutorModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorModificarActionPerformed(evt);
            }
        });
        mbAutor.add(AutorModificar);

        AutorMostrar.setText("Mostrar Todos");
        AutorMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorMostrarActionPerformed(evt);
            }
        });
        mbAutor.add(AutorMostrar);

        AutorBuscar.setText("Buscar Cod. Autor");
        AutorBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorBuscarActionPerformed(evt);
            }
        });
        mbAutor.add(AutorBuscar);

        AutorBorrar.setText("Borrar");
        AutorBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorBorrarActionPerformed(evt);
            }
        });
        mbAutor.add(AutorBorrar);

        jMenu2.add(mbAutor);

        mbEditorial.setText("Editorial");

        EditorialRegistrar.setText("Registrar");
        EditorialRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditorialRegistrarActionPerformed(evt);
            }
        });
        mbEditorial.add(EditorialRegistrar);

        EditorialModificar.setText("Modificar");
        EditorialModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditorialModificarActionPerformed(evt);
            }
        });
        mbEditorial.add(EditorialModificar);

        EditorialMostrar.setText("Mostrar Todos");
        EditorialMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditorialMostrarActionPerformed(evt);
            }
        });
        mbEditorial.add(EditorialMostrar);

        EditorialBuscar.setText("Buscar Cod. Editorial");
        EditorialBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditorialBuscarActionPerformed(evt);
            }
        });
        mbEditorial.add(EditorialBuscar);

        EditorialBorrar.setText("Borrar");
        EditorialBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditorialBorrarActionPerformed(evt);
            }
        });
        mbEditorial.add(EditorialBorrar);

        jMenu2.add(mbEditorial);

        mbCategoria.setText("Categoría");

        CategoriaRegistrar.setText("Registrar");
        CategoriaRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaRegistrarActionPerformed(evt);
            }
        });
        mbCategoria.add(CategoriaRegistrar);

        CategoriaModificar.setText("Modificar");
        CategoriaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaModificarActionPerformed(evt);
            }
        });
        mbCategoria.add(CategoriaModificar);

        CategoriaMostrar.setText("Mostrar Todas");
        CategoriaMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaMostrarActionPerformed(evt);
            }
        });
        mbCategoria.add(CategoriaMostrar);

        CategoriaBuscar.setText("Buscar Cod. Categoría");
        CategoriaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaBuscarActionPerformed(evt);
            }
        });
        mbCategoria.add(CategoriaBuscar);

        CategoriaBorrar.setText("Borrar");
        CategoriaBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaBorrarActionPerformed(evt);
            }
        });
        mbCategoria.add(CategoriaBorrar);

        jMenu2.add(mbCategoria);

        mbIdioma.setText("Idioma");

        IdiomaRegistrar.setText("Registrar");
        IdiomaRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdiomaRegistrarActionPerformed(evt);
            }
        });
        mbIdioma.add(IdiomaRegistrar);

        IdiomaModificar.setText("Modificar");
        IdiomaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdiomaModificarActionPerformed(evt);
            }
        });
        mbIdioma.add(IdiomaModificar);

        IdiomaBuscar.setText("Buscar Cod. Idioma");
        IdiomaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdiomaBuscarActionPerformed(evt);
            }
        });
        mbIdioma.add(IdiomaBuscar);

        IdiomaMostrar.setText("Mostrar Todos");
        IdiomaMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdiomaMostrarActionPerformed(evt);
            }
        });
        mbIdioma.add(IdiomaMostrar);

        IdiomaBorrar.setText("Borrar");
        IdiomaBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdiomaBorrarActionPerformed(evt);
            }
        });
        mbIdioma.add(IdiomaBorrar);

        jMenu2.add(mbIdioma);

        mbEstado.setText("Estado");

        EstadoRegistrar.setText("Registrar");
        EstadoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoRegistrarActionPerformed(evt);
            }
        });
        mbEstado.add(EstadoRegistrar);

        EstadoModificar.setText("Modificar");
        EstadoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoModificarActionPerformed(evt);
            }
        });
        mbEstado.add(EstadoModificar);

        EstadoBuscar.setText("Buscar Cod. Estado");
        EstadoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoBuscarActionPerformed(evt);
            }
        });
        mbEstado.add(EstadoBuscar);

        EstadoMostrar.setText("Mostrar Todos");
        EstadoMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoMostrarActionPerformed(evt);
            }
        });
        mbEstado.add(EstadoMostrar);

        EstadoBorrar.setText("Borrar");
        EstadoBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoBorrarActionPerformed(evt);
            }
        });
        mbEstado.add(EstadoBorrar);

        jMenu2.add(mbEstado);

        mbLibro.add(jMenu2);

        MenuBar1.add(mbLibro);

        mbDistribuidor.setText("Distribuidor");

        DistriRegistrar.setText("Registrar");
        DistriRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistriRegistrarActionPerformed(evt);
            }
        });
        mbDistribuidor.add(DistriRegistrar);

        DistriModificar.setText("Modificar");
        DistriModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistriModificarActionPerformed(evt);
            }
        });
        mbDistribuidor.add(DistriModificar);

        DistriMostrar.setText("Mostrar Todos");
        DistriMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistriMostrarActionPerformed(evt);
            }
        });
        mbDistribuidor.add(DistriMostrar);

        DistriBuscar.setText("Buscar Distribuidor");
        DistriBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistriBuscarActionPerformed(evt);
            }
        });
        mbDistribuidor.add(DistriBuscar);

        DistriBorrar.setText("Borrar");
        DistriBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistriBorrarActionPerformed(evt);
            }
        });
        mbDistribuidor.add(DistriBorrar);

        MenuBar1.add(mbDistribuidor);

        mbFactura.setText("Factura");

        FacRegistrar.setText("Registrar");
        FacRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacRegistrarActionPerformed(evt);
            }
        });
        mbFactura.add(FacRegistrar);

        FacModificar.setText("Modificar");
        FacModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacModificarActionPerformed(evt);
            }
        });
        mbFactura.add(FacModificar);

        FacBuscar.setText("Buscar");
        FacBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacBuscarActionPerformed(evt);
            }
        });
        mbFactura.add(FacBuscar);

        FacBorrar.setText("Borrar");
        FacBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacBorrarActionPerformed(evt);
            }
        });
        mbFactura.add(FacBorrar);

        FacMostrar.setText("Mostrar");
        FacMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacMostrarActionPerformed(evt);
            }
        });
        mbFactura.add(FacMostrar);

        MenuBar1.add(mbFactura);

        mbCompra.setText("Compra");

        miMetodoPago.setText("Metodo de Pago");

        MPRegistrar.setText("Registrar");
        MPRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPRegistrarActionPerformed(evt);
            }
        });
        miMetodoPago.add(MPRegistrar);

        MPModificar.setText("Modificar");
        MPModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPModificarActionPerformed(evt);
            }
        });
        miMetodoPago.add(MPModificar);

        MPBorar.setText("Borrar");
        MPBorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPBorarActionPerformed(evt);
            }
        });
        miMetodoPago.add(MPBorar);

        MPMostrar.setText("Mostrar");
        MPMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPMostrarActionPerformed(evt);
            }
        });
        miMetodoPago.add(MPMostrar);

        MPBuscar.setText("Buscar");
        MPBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPBuscarActionPerformed(evt);
            }
        });
        miMetodoPago.add(MPBuscar);

        mbCompra.add(miMetodoPago);

        CmpRegistrar.setText("Registrar Compra");
        CmpRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmpRegistrarActionPerformed(evt);
            }
        });
        mbCompra.add(CmpRegistrar);

        MenuBar1.add(mbCompra);

        setJMenuBar(MenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel1)
                .addContainerGap(298, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LibroRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibroRegistrarActionPerformed
        lbregistrar =new LibroRegistrar();
        escritorio.add(lbregistrar);
        lbregistrar.show();
    }//GEN-LAST:event_LibroRegistrarActionPerformed

    private void IdiomaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdiomaBuscarActionPerformed
        idbuscar = new IdiomaBuscar();
        escritorio.add(idbuscar);
        idbuscar.show();
    }//GEN-LAST:event_IdiomaBuscarActionPerformed

    private void LibroModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibroModificarActionPerformed
        lbmodificar = new LibroModificar();
        escritorio.add(lbmodificar);
        lbmodificar.show();
    }//GEN-LAST:event_LibroModificarActionPerformed

    private void LibroBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibroBuscarActionPerformed
        lbbuscar = new LibroBuscar();
        escritorio.add(lbbuscar);
        lbbuscar.show();
    }//GEN-LAST:event_LibroBuscarActionPerformed

    private void LibroMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibroMostrarActionPerformed
        lbmostrar = new LibroMostrar();
        escritorio.add(lbmostrar);
        lbmostrar.setVisible(true);
    }//GEN-LAST:event_LibroMostrarActionPerformed

    private void LibroBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibroBorrarActionPerformed
        lbborrar = new LibroBorrar();
        escritorio.add(lbborrar);
        lbborrar.setVisible(true);
    }//GEN-LAST:event_LibroBorrarActionPerformed

    private void AutorRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorRegistrarActionPerformed
        auregistrar = new AutorRegistrar();
        escritorio.add(auregistrar);
        auregistrar.show();
    }//GEN-LAST:event_AutorRegistrarActionPerformed

    private void AutorModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorModificarActionPerformed
        aumodificar = new AutorModificar();
        escritorio.add(aumodificar);
        aumodificar.show();
    }//GEN-LAST:event_AutorModificarActionPerformed

    private void AutorMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorMostrarActionPerformed
        aumostrar = new AutorMostrar();
        escritorio.add(aumostrar);
        aumostrar.show();
    }//GEN-LAST:event_AutorMostrarActionPerformed

    private void AutorBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorBuscarActionPerformed
        aubuscar = new AutorBuscar();
        escritorio.add(aubuscar);
        aubuscar.show();
        
    }//GEN-LAST:event_AutorBuscarActionPerformed

    private void AutorBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorBorrarActionPerformed
        auborrar = new AutorBorrar();
        escritorio.add(auborrar);
        auborrar.show();
    }//GEN-LAST:event_AutorBorrarActionPerformed

    private void EditorialRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditorialRegistrarActionPerformed
        edregistrar = new EditorialRegistrar();
        escritorio.add(edregistrar);
        edregistrar.show();
    }//GEN-LAST:event_EditorialRegistrarActionPerformed

    private void EditorialModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditorialModificarActionPerformed
        edmodificar = new EditorialModificar();
        escritorio.add(edmodificar);
        edmodificar.show();
    }//GEN-LAST:event_EditorialModificarActionPerformed

    private void EditorialMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditorialMostrarActionPerformed
        edmostrar = new EditorialMostrar();
        escritorio.add(edmostrar);
        edmostrar.show();
    }//GEN-LAST:event_EditorialMostrarActionPerformed

    private void EditorialBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditorialBuscarActionPerformed
        edbuscar = new EditorialBuscar();
        escritorio.add(edbuscar);
        edbuscar.show();
    }//GEN-LAST:event_EditorialBuscarActionPerformed

    private void EditorialBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditorialBorrarActionPerformed
        edborrar = new EditorialBorrar();
        escritorio.add(edborrar);
        edborrar.show();
    }//GEN-LAST:event_EditorialBorrarActionPerformed

    private void CategoriaRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaRegistrarActionPerformed
        catregistrar = new CatRegistrar();
        escritorio.add(catregistrar);
        catregistrar.show();
    }//GEN-LAST:event_CategoriaRegistrarActionPerformed

    private void CategoriaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaModificarActionPerformed
        catmodificar = new CatModificar();
        escritorio.add(catmodificar);
        catmodificar.show();
    }//GEN-LAST:event_CategoriaModificarActionPerformed

    private void CategoriaMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaMostrarActionPerformed
        catmostrar = new CatMostrar();
        escritorio.add(catmostrar);
        catmostrar.show();
    }//GEN-LAST:event_CategoriaMostrarActionPerformed

    private void CategoriaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaBuscarActionPerformed
        catbuscar = new CatBuscar();
        escritorio.add(catbuscar);
        catbuscar.show();        
    }//GEN-LAST:event_CategoriaBuscarActionPerformed

    private void CategoriaBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaBorrarActionPerformed
        catborrar = new CatBorrar();
        escritorio.add(catborrar);
        catborrar.show();
    }//GEN-LAST:event_CategoriaBorrarActionPerformed

    private void IdiomaRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdiomaRegistrarActionPerformed
        idregistrar = new IdiomaRegistrar();
        escritorio.add(idregistrar);
        idregistrar.show();
    }//GEN-LAST:event_IdiomaRegistrarActionPerformed

    private void IdiomaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdiomaModificarActionPerformed
        idmodificar = new IdiomaModificar();
        escritorio.add(idmodificar);
        idmodificar.show();
    }//GEN-LAST:event_IdiomaModificarActionPerformed

    private void IdiomaMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdiomaMostrarActionPerformed
        idmostrar = new IdiomaMostrar();
        escritorio.add(idmostrar);
        idmostrar.show();
    }//GEN-LAST:event_IdiomaMostrarActionPerformed

    private void IdiomaBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdiomaBorrarActionPerformed
        idborrar = new IdiomaBorrar();
        escritorio.add(idborrar);
        idborrar.show();
    }//GEN-LAST:event_IdiomaBorrarActionPerformed

    private void EstadoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoRegistrarActionPerformed
        esregistrar = new EstadoRegistrar();
        escritorio.add(esregistrar);
        esregistrar.show();
    }//GEN-LAST:event_EstadoRegistrarActionPerformed

    private void EstadoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoModificarActionPerformed
        esmodificar = new EstadoModificar();
        escritorio.add(esmodificar);
        esmodificar.show();
    }//GEN-LAST:event_EstadoModificarActionPerformed

    private void EstadoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoBuscarActionPerformed
        esbuscar = new EstadoBuscar();
        escritorio.add(esbuscar);
        esbuscar.show();
    }//GEN-LAST:event_EstadoBuscarActionPerformed

    private void EstadoMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoMostrarActionPerformed
        esmostrar = new EstadoMostrar();
        escritorio.add(esmostrar);
        esmostrar.show();
    }//GEN-LAST:event_EstadoMostrarActionPerformed

    private void EstadoBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoBorrarActionPerformed
        esborrar = new EstadoBorrar();
        escritorio.add(esborrar);
        esborrar.show();
    }//GEN-LAST:event_EstadoBorrarActionPerformed

    private void MPModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPModificarActionPerformed
        mpmodificar = new MPModificar();
        escritorio.add(mpmodificar);
        mpmodificar.show();
    }//GEN-LAST:event_MPModificarActionPerformed

    private void DistriRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistriRegistrarActionPerformed
        disregistrar = new DistriRegistrar();
        escritorio.add(disregistrar);
        disregistrar.show();
    }//GEN-LAST:event_DistriRegistrarActionPerformed

    private void DistriModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistriModificarActionPerformed
        dismodificar = new DistriModificar();
        escritorio.add(dismodificar);
        dismodificar.show();
    }//GEN-LAST:event_DistriModificarActionPerformed

    private void DistriMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistriMostrarActionPerformed
        dismostrar = new DistriMostrar();
        escritorio.add(dismostrar);
        dismostrar.show();
    }//GEN-LAST:event_DistriMostrarActionPerformed

    private void DistriBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistriBuscarActionPerformed
        disbuscar = new DistriBuscar();
        escritorio.add(disbuscar);
        disbuscar.show();
    }//GEN-LAST:event_DistriBuscarActionPerformed

    private void DistriBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistriBorrarActionPerformed
        disborrar = new DistriBorrar();
        escritorio.add(disborrar);
        disborrar.show();
    }//GEN-LAST:event_DistriBorrarActionPerformed

    private void FacRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacRegistrarActionPerformed
        facregistrar = new FacturaRegistrar();
        escritorio.add(facregistrar);
        facregistrar.show();
    }//GEN-LAST:event_FacRegistrarActionPerformed

    private void FacModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacModificarActionPerformed
        facmodificar = new FacturaModificar();
        escritorio.add(facmodificar);
        facmodificar.show();
    }//GEN-LAST:event_FacModificarActionPerformed

    private void FacBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacBuscarActionPerformed
        facbuscar = new FacturaBuscar();
        escritorio.add(facbuscar);
        facbuscar.show();
    }//GEN-LAST:event_FacBuscarActionPerformed

    private void FacBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacBorrarActionPerformed
        facborrar = new FacturaBorrar();
        escritorio.add(facborrar);
        facborrar.setVisible(true);
    }//GEN-LAST:event_FacBorrarActionPerformed

    private void MPRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPRegistrarActionPerformed
        mpregistrar = new MPRegistrar();
        escritorio.add(mpregistrar);
        mpregistrar.show();
    }//GEN-LAST:event_MPRegistrarActionPerformed

    private void MPBorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPBorarActionPerformed
        mpborrar = new MPBorrar();
        escritorio.add(mpborrar);
        mpborrar.show();
    }//GEN-LAST:event_MPBorarActionPerformed

    private void MPMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPMostrarActionPerformed
        mpmostrar = new MPMostrar();
        escritorio.add(mpmostrar);
        mpmostrar.show();
    }//GEN-LAST:event_MPMostrarActionPerformed

    private void MPBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPBuscarActionPerformed
        mpbuscar = new MPBuscar();
        escritorio.add(mpbuscar);
        mpbuscar.show();
    }//GEN-LAST:event_MPBuscarActionPerformed

    private void FacMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacMostrarActionPerformed
        facmostrar = new FacturaMostrar();
        escritorio.add(facmostrar);
        facmostrar.show();
    }//GEN-LAST:event_FacMostrarActionPerformed

    private void CmpRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmpRegistrarActionPerformed
       
        cmregistrar = new CompraRegistrar();
        escritorio.add(cmregistrar);
        cmregistrar.show();        // TODO add your handling code here:
    }//GEN-LAST:event_CmpRegistrarActionPerformed


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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AutorBorrar;
    private javax.swing.JMenuItem AutorBuscar;
    private javax.swing.JMenuItem AutorModificar;
    private javax.swing.JMenuItem AutorMostrar;
    private javax.swing.JMenuItem AutorRegistrar;
    private javax.swing.JMenuItem CategoriaBorrar;
    private javax.swing.JMenuItem CategoriaBuscar;
    private javax.swing.JMenuItem CategoriaModificar;
    private javax.swing.JMenuItem CategoriaMostrar;
    private javax.swing.JMenuItem CategoriaRegistrar;
    private javax.swing.JMenuItem CmpRegistrar;
    private javax.swing.JMenuItem DistriBorrar;
    private javax.swing.JMenuItem DistriBuscar;
    private javax.swing.JMenuItem DistriModificar;
    private javax.swing.JMenuItem DistriMostrar;
    private javax.swing.JMenuItem DistriRegistrar;
    private javax.swing.JMenuItem EditorialBorrar;
    private javax.swing.JMenuItem EditorialBuscar;
    private javax.swing.JMenuItem EditorialModificar;
    private javax.swing.JMenuItem EditorialMostrar;
    private javax.swing.JMenuItem EditorialRegistrar;
    private javax.swing.JMenuItem EstadoBorrar;
    private javax.swing.JMenuItem EstadoBuscar;
    private javax.swing.JMenuItem EstadoModificar;
    private javax.swing.JMenuItem EstadoMostrar;
    private javax.swing.JMenuItem EstadoRegistrar;
    private javax.swing.JMenuItem FacBorrar;
    private javax.swing.JMenuItem FacBuscar;
    private javax.swing.JMenuItem FacModificar;
    private javax.swing.JMenuItem FacMostrar;
    private javax.swing.JMenuItem FacRegistrar;
    private javax.swing.JMenuItem IdiomaBorrar;
    private javax.swing.JMenuItem IdiomaBuscar;
    private javax.swing.JMenuItem IdiomaModificar;
    private javax.swing.JMenuItem IdiomaMostrar;
    private javax.swing.JMenuItem IdiomaRegistrar;
    private javax.swing.JMenuItem LibroBorrar;
    private javax.swing.JMenuItem LibroBuscar;
    private javax.swing.JMenuItem LibroModificar;
    private javax.swing.JMenuItem LibroMostrar;
    private javax.swing.JMenuItem LibroRegistrar;
    private javax.swing.JMenuItem MPBorar;
    private javax.swing.JMenuItem MPBuscar;
    private javax.swing.JMenuItem MPModificar;
    private javax.swing.JMenuItem MPMostrar;
    private javax.swing.JMenuItem MPRegistrar;
    private javax.swing.JMenuBar MenuBar1;
    private javax.swing.JPanel escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu mbAutor;
    private javax.swing.JMenu mbCategoria;
    private javax.swing.JMenu mbCompra;
    private javax.swing.JMenu mbDistribuidor;
    private javax.swing.JMenu mbEditorial;
    private javax.swing.JMenu mbEstado;
    private javax.swing.JMenu mbFactura;
    private javax.swing.JMenu mbIdioma;
    private javax.swing.JMenu mbLibro;
    private javax.swing.JMenu mbLibro2;
    private javax.swing.JMenu miMetodoPago;
    // End of variables declaration//GEN-END:variables
}

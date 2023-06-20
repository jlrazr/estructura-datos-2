
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * @author Jose Luis Mora
 */
public class MainUIFrame extends javax.swing.JFrame {
    
    // Inicializa el DAO para los gimnasios
    GimnasioDAO gymDao = new GimnasioDAO();

    /**
     * Creates new form MainUIFrame
     */
    public MainUIFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_tituloPrincipal = new javax.swing.JLabel();
        jButton_salir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel_anadirProveedor = new javax.swing.JPanel();
        jLabel_nombre_proveedor = new javax.swing.JLabel();
        jTextField_nombre_proveedor = new javax.swing.JTextField();
        jButton_anadir_proveedor = new javax.swing.JButton();
        jPanel_anadir_peliculas = new javax.swing.JPanel();
        jButton_anadir_pelicula = new javax.swing.JButton();
        jLabel_nombre_pelicula = new javax.swing.JLabel();
        jTextField_nombre_pelicula = new javax.swing.JTextField();
        jLabel_categoria = new javax.swing.JLabel();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        jLabel_audiencia = new javax.swing.JLabel();
        jComboBox_audiencia = new javax.swing.JComboBox<>();
        jLabel_formato = new javax.swing.JLabel();
        jComboBox_formato = new javax.swing.JComboBox<>();
        jPanel_buscarGimnasios = new javax.swing.JPanel();
        jLabel_busqueda_nombre = new javax.swing.JLabel();
        jTextField_busqueda_nombre = new javax.swing.JTextField();
        jScrollPane_busqueda_gimnasios = new javax.swing.JScrollPane();
        jList_busqueda_nombre = new javax.swing.JList<>();
        jButton_buscar_nombre = new javax.swing.JButton();
        jPanel_busquedaPorClientes = new javax.swing.JPanel();
        jLabel_promedioMinimo = new javax.swing.JLabel();
        jTextField_promedioClientes = new javax.swing.JTextField();
        jButton_filtrarPorPromedio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_busqueda_promedio = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_tituloPrincipal.setText("Asociación Nacional de Gimnasios y Centros de Salud");

        jButton_salir.setText("Salir");
        jButton_salir.setToolTipText("");
        jButton_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_salirMouseClicked(evt);
            }
        });

        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel_anadirProveedor.setPreferredSize(new java.awt.Dimension(792, 329));

        jLabel_nombre_proveedor.setText("Nombre del proveedor");

        jButton_anadir_proveedor.setText("Añadir Proveedor");
        jButton_anadir_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_anadir_proveedorMouseClicked(evt);
            }
        });
        jButton_anadir_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_anadir_proveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_anadirProveedorLayout = new javax.swing.GroupLayout(jPanel_anadirProveedor);
        jPanel_anadirProveedor.setLayout(jPanel_anadirProveedorLayout);
        jPanel_anadirProveedorLayout.setHorizontalGroup(
            jPanel_anadirProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_anadirProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_anadirProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_nombre_proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_anadirProveedorLayout.createSequentialGroup()
                        .addGroup(jPanel_anadirProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_nombre_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_anadir_proveedor))
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_anadirProveedorLayout.setVerticalGroup(
            jPanel_anadirProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_anadirProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_nombre_proveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_nombre_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_anadir_proveedor)
                .addContainerGap(598, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Añadir Proveedor", jPanel_anadirProveedor);

        jButton_anadir_pelicula.setText("Añadir Película");
        jButton_anadir_pelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_anadir_peliculaMouseClicked(evt);
            }
        });

        jLabel_nombre_pelicula.setText("Nombre de la película");

        jLabel_categoria.setText("Categoría");

        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel_audiencia.setText("Audiencia");

        jComboBox_audiencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel_formato.setText("Formato");

        jComboBox_formato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel_anadir_peliculasLayout = new javax.swing.GroupLayout(jPanel_anadir_peliculas);
        jPanel_anadir_peliculas.setLayout(jPanel_anadir_peliculasLayout);
        jPanel_anadir_peliculasLayout.setHorizontalGroup(
            jPanel_anadir_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_anadir_peliculasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_anadir_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_anadir_peliculasLayout.createSequentialGroup()
                        .addGap(0, 299, Short.MAX_VALUE)
                        .addComponent(jButton_anadir_pelicula))
                    .addGroup(jPanel_anadir_peliculasLayout.createSequentialGroup()
                        .addGroup(jPanel_anadir_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox_audiencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_anadir_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_anadir_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_nombre_pelicula)
                                    .addComponent(jTextField_nombre_pelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                                    .addComponent(jLabel_categoria)
                                    .addComponent(jComboBox_categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel_audiencia))
                            .addComponent(jLabel_formato)
                            .addComponent(jComboBox_formato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_anadir_peliculasLayout.setVerticalGroup(
            jPanel_anadir_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_anadir_peliculasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_nombre_pelicula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_nombre_pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_categoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_audiencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_audiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_formato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_formato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
                .addComponent(jButton_anadir_pelicula)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Añadir Pelicula", jPanel_anadir_peliculas);

        jLabel_busqueda_nombre.setText("Ingrese el nombre del gimnasio");

        jList_busqueda_nombre.setModel(new DefaultListModel<String>());
        jScrollPane_busqueda_gimnasios.setViewportView(jList_busqueda_nombre);
        jList_busqueda_nombre.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evento) {
                if (!evento.getValueIsAdjusting()) {
                    String valorSeleccionado = jList_busqueda_nombre.getSelectedValue();
                    llenarCampos(valorSeleccionado);
                }
            }

            public void llenarCampos(String stringInicial) {
                if(stringInicial != null) {
                    int id;
                    String[] partes = stringInicial.split("   ");
                    for(int i = 0; i < partes.length; i++) {
                        partes[i] = partes[i].trim();
                    }

                    String[] parteId = partes[0].split(":");
                    id = Integer.parseInt(parteId[1].trim());

                    Gimnasio gimnasio = gymDao.EncuentraPorId(id);

                    jTextField_editar_id.setText(Integer.toString(gimnasio.getId()));
                    jTextField_editar_nombre.setText(gimnasio.getNombre());
                    jTextField_editar_maquinas.setText(Integer.toString(gimnasio.getNumeroMaquinas()));
                    jTextField_editar_promedio.setText(Integer.toString(gimnasio.getClientesPorMes()));
                    if (gimnasio.getIncluyeCrossfit() == true) {
                        jCheckBox_editar_crossfit.setSelected(true);
                    } else {
                        jCheckBox_editar_crossfit.setSelected(false);
                    }
                }
            }
        });

        jButton_buscar_nombre.setText("Buscar");
        jButton_buscar_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_buscar_nombreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_buscarGimnasiosLayout = new javax.swing.GroupLayout(jPanel_buscarGimnasios);
        jPanel_buscarGimnasios.setLayout(jPanel_buscarGimnasiosLayout);
        jPanel_buscarGimnasiosLayout.setHorizontalGroup(
            jPanel_buscarGimnasiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_buscarGimnasiosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_buscarGimnasiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_buscarGimnasiosLayout.createSequentialGroup()
                        .addGroup(jPanel_buscarGimnasiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_busqueda_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_busqueda_nombre))
                        .addGap(30, 30, 30)
                        .addComponent(jButton_buscar_nombre)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane_busqueda_gimnasios, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_buscarGimnasiosLayout.setVerticalGroup(
            jPanel_buscarGimnasiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_buscarGimnasiosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_busqueda_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_buscarGimnasiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_busqueda_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_buscar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane_busqueda_gimnasios, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Remover Proveedor", jPanel_buscarGimnasios);

        jLabel_promedioMinimo.setText("Ingrese el promedio mínimo para el filtro de gimnasios");

        jButton_filtrarPorPromedio.setText("Filtrar");
        jButton_filtrarPorPromedio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_filtrarPorPromedioMouseClicked(evt);
            }
        });

        jList_busqueda_promedio.setModel(new DefaultListModel<String>());
        jScrollPane1.setViewportView(jList_busqueda_promedio);

        javax.swing.GroupLayout jPanel_busquedaPorClientesLayout = new javax.swing.GroupLayout(jPanel_busquedaPorClientes);
        jPanel_busquedaPorClientes.setLayout(jPanel_busquedaPorClientesLayout);
        jPanel_busquedaPorClientesLayout.setHorizontalGroup(
            jPanel_busquedaPorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_busquedaPorClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_busquedaPorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel_busquedaPorClientesLayout.createSequentialGroup()
                        .addGroup(jPanel_busquedaPorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_promedioMinimo)
                            .addGroup(jPanel_busquedaPorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton_filtrarPorPromedio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addComponent(jTextField_promedioClientes, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 143, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_busquedaPorClientesLayout.setVerticalGroup(
            jPanel_busquedaPorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_busquedaPorClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_promedioMinimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_promedioClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_filtrarPorPromedio)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Remover Película", jPanel_busquedaPorClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_tituloPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1209, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_tituloPrincipal)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18)
                .addComponent(jButton_salir)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_salirMouseClicked
        
    }//GEN-LAST:event_jButton_salirMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton_filtrarPorPromedioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_filtrarPorPromedioMouseClicked
        ArrayList<Gimnasio> listaGimnasios = gymDao.FiltrarPorPromedio(gymDao.obtenerGimnasios(), Integer.parseInt(jTextField_promedioClientes.getText()));
        DefaultListModel<String> listModel = new DefaultListModel();

        for (Gimnasio gimnasio : listaGimnasios) {
            listModel.addElement("ID: " + gimnasio.getId() + "   |  Nombre: " + gimnasio.getNombre() + "   |  Número de máquinas: " + gimnasio.getNumeroMaquinas() + "   |  Incluye crossfit: " + gimnasio.getIncluyeCrossfit() + "   |  Promedio clientes por mes: " + gimnasio.getClientesPorMes());
        }
        jList_busqueda_promedio.setModel(listModel);
    }//GEN-LAST:event_jButton_filtrarPorPromedioMouseClicked

    private void jButton_buscar_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_buscar_nombreMouseClicked
        ArrayList<Gimnasio> listaGimnasios = gymDao.EncuentraPorNombre(jTextField_busqueda_nombre.getText().toLowerCase());
        DefaultListModel<String> listaModelo = new DefaultListModel();

        for (Gimnasio gimnasio : listaGimnasios) {
            listaModelo.addElement("ID: " + gimnasio.getId() + "   |  Nombre: " + gimnasio.getNombre() + "   |  Número de máquinas: " + gimnasio.getNumeroMaquinas() + "   |  Incluye crossfit: " + gimnasio.getIncluyeCrossfit() + "   |  Promedio clientes por mes: " + gimnasio.getClientesPorMes());
        }

        jList_busqueda_nombre.setModel(listaModelo);
    }//GEN-LAST:event_jButton_buscar_nombreMouseClicked

    private void jButton_anadir_peliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_anadir_peliculaMouseClicked
        jTable_tablaListaGimnasios.setModel(new ListaGimnasios(gymDao.obtenerGimnasios().iterator()));
    }//GEN-LAST:event_jButton_anadir_peliculaMouseClicked

    private void jButton_anadir_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_anadir_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_anadir_proveedorActionPerformed

    private void jButton_anadir_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_anadir_proveedorMouseClicked
        String nombre = jTextField_nombre_proveedor.getText();
        int maquinas = Integer.parseInt(jTextField_cantidad_maqinas.getText());
        boolean crossfit = jCheckBox_crossfit.isSelected();
        int clientes = Integer.parseInt(jTextField_cant_clientes.getText());
        int id = gymDao.gymIdsContador;

        gymDao.anadirGimnasio(id, nombre, maquinas, crossfit, clientes);
        jTable_tablaListaGimnasios.setModel(new ListaGimnasios(gymDao.obtenerGimnasios().iterator()));
    }//GEN-LAST:event_jButton_anadir_proveedorMouseClicked

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
            java.util.logging.Logger.getLogger(MainUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUIFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_anadir_pelicula;
    private javax.swing.JButton jButton_anadir_proveedor;
    private javax.swing.JButton jButton_buscar_nombre;
    private javax.swing.JButton jButton_filtrarPorPromedio;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JComboBox<String> jComboBox_audiencia;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JComboBox<String> jComboBox_formato;
    private javax.swing.JLabel jLabel_audiencia;
    private javax.swing.JLabel jLabel_busqueda_nombre;
    private javax.swing.JLabel jLabel_categoria;
    private javax.swing.JLabel jLabel_formato;
    private javax.swing.JLabel jLabel_nombre_pelicula;
    private javax.swing.JLabel jLabel_nombre_proveedor;
    private javax.swing.JLabel jLabel_promedioMinimo;
    private javax.swing.JLabel jLabel_tituloPrincipal;
    private javax.swing.JList<String> jList_busqueda_nombre;
    private javax.swing.JList<String> jList_busqueda_promedio;
    private javax.swing.JPanel jPanel_anadirProveedor;
    private javax.swing.JPanel jPanel_anadir_peliculas;
    private javax.swing.JPanel jPanel_buscarGimnasios;
    private javax.swing.JPanel jPanel_busquedaPorClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane_busqueda_gimnasios;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField_busqueda_nombre;
    private javax.swing.JTextField jTextField_nombre_pelicula;
    private javax.swing.JTextField jTextField_nombre_proveedor;
    private javax.swing.JTextField jTextField_promedioClientes;
    // End of variables declaration//GEN-END:variables
}

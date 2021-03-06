
import algoritmos.Julia6;
import algoritmos.Julia5;
import algoritmos.Julia4;
import algoritmos.Julia2;
import algoritmos.Mandelbrot;
import algoritmos.Mandelbrot2;
import algoritmos.Julia;
import algoritmos.IFractal;
import algoritmos.Julia7;
import algoritmos.Julia3;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Blackbit
 */
public class VentanaFractal extends javax.swing.JFrame {

    ArrayList<PuntoInteres> puntosInteres;
    VentanaAyuda ventanaAyuda = new VentanaAyuda();
    VentanaConfiguracion ventanaConfiguracion = new VentanaConfiguracion();
    
    /**
     * Creates new form VentanaFractal
     */
    public VentanaFractal() {
        initComponents();
        init();
    }

    public void init() {

        FileFilter imageFilter = new FileNameExtensionFilter("JPG", "jpg");
        selectorFichero.setFileFilter(imageFilter);
        selectorFichero.setAcceptAllFileFilterUsed(false);

        btnCrearPunto.setEnabled(false);
        mnuCrearPunto.setEnabled(false);
        btnBorrarPunto.setEnabled(false);
        mnuBorrarPunto.setEnabled(false);
        fractalRepositorio.setEditable(false);
        pnlRepositorio.setVisible(false);
        panelDividido.setEnabled(false);
        
        pnlFractalRep.setLayout(new GridBagLayout());
        
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/icono2.png")));

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(d.width/2-this.getWidth()/2,d.height/2-this.getHeight()/2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectorFichero = new javax.swing.JFileChooser();
        fractal2 = new Fractal();
        jCheckBox1 = new javax.swing.JCheckBox();
        lblInfo = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        cbClase = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0));
        btnRepositorio = new javax.swing.JToggleButton();
        btnCrearPunto = new javax.swing.JButton();
        btnBorrarPunto = new javax.swing.JButton();
        panelDividido = new javax.swing.JSplitPane();
        pnlRepositorio = new javax.swing.JPanel();
        scRepositorio = new javax.swing.JScrollBar();
        pnlFractalRep = new javax.swing.JPanel();
        fractalRepositorio = new Fractal();
        fractal = new Fractal();
        jMenu = new javax.swing.JMenuBar();
        mnuFichero = new javax.swing.JMenu();
        mnuNuevo = new javax.swing.JMenuItem();
        mnuSeparador1 = new javax.swing.JPopupMenu.Separator();
        mnuGuardarImagen = new javax.swing.JMenuItem();
        mnuSeparador2 = new javax.swing.JPopupMenu.Separator();
        mnuSalir = new javax.swing.JMenuItem();
        mnuEdit = new javax.swing.JMenu();
        mnuConectarBD = new javax.swing.JMenuItem();
        mnuCrearPunto = new javax.swing.JMenuItem();
        mnuBorrarPunto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuOpciones = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuAyuda = new javax.swing.JMenuItem();

        javax.swing.GroupLayout fractal2Layout = new javax.swing.GroupLayout(fractal2);
        fractal2.setLayout(fractal2Layout);
        fractal2Layout.setHorizontalGroup(
            fractal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fractal2Layout.setVerticalGroup(
            fractal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fractales");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(267, 423));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/new24.png"))); // NOI18N
        btnNuevo.setToolTipText("Inicializar fractal");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setMaximumSize(new java.awt.Dimension(31, 31));
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNuevo);

        cbClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mandelbrot", "Julia", "Julia2", "Julia3", "Julia4", "Julia5", "Julia6", "Julia7", "Mandelbrot2" }));
        cbClase.setToolTipText("Selector tipo de fractal");
        cbClase.setMaximumSize(new java.awt.Dimension(80, 32767));
        cbClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClaseActionPerformed(evt);
            }
        });
        jToolBar1.add(cbClase);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/save24.png"))); // NOI18N
        btnGuardar.setToolTipText("Exportar imagen a fichero JPG ");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);
        jToolBar1.add(filler1);

        btnRepositorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/db2.png"))); // NOI18N
        btnRepositorio.setToolTipText("Conectar a la base de datos");
        btnRepositorio.setFocusable(false);
        btnRepositorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRepositorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRepositorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepositorioActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRepositorio);

        btnCrearPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/addpicture.png"))); // NOI18N
        btnCrearPunto.setToolTipText("Añadir punto de interés en la base de datos");
        btnCrearPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPuntoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCrearPunto);

        btnBorrarPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/remove-picture.png"))); // NOI18N
        btnBorrarPunto.setToolTipText("Borrar punto de interés en la base de datos");
        btnBorrarPunto.setFocusable(false);
        btnBorrarPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorrarPunto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBorrarPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPuntoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBorrarPunto);

        panelDividido.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        pnlRepositorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlRepositorio.setMinimumSize(new java.awt.Dimension(245, 137));
        pnlRepositorio.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                pnlRepositorioComponentResized(evt);
            }
        });

        scRepositorio.setMaximum(0);
        scRepositorio.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scRepositorio.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scRepositorioAdjustmentValueChanged(evt);
            }
        });

        fractalRepositorio.setToolTipText(null);
        fractalRepositorio.setMaximumSize(new java.awt.Dimension(160, 102));
        fractalRepositorio.setName("repositorio"); // NOI18N
        fractalRepositorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fractalRepositorioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fractalRepositorioLayout = new javax.swing.GroupLayout(fractalRepositorio);
        fractalRepositorio.setLayout(fractalRepositorioLayout);
        fractalRepositorioLayout.setHorizontalGroup(
            fractalRepositorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );
        fractalRepositorioLayout.setVerticalGroup(
            fractalRepositorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlFractalRepLayout = new javax.swing.GroupLayout(pnlFractalRep);
        pnlFractalRep.setLayout(pnlFractalRepLayout);
        pnlFractalRepLayout.setHorizontalGroup(
            pnlFractalRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFractalRepLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(fractalRepositorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFractalRepLayout.setVerticalGroup(
            pnlFractalRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFractalRepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fractalRepositorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRepositorioLayout = new javax.swing.GroupLayout(pnlRepositorio);
        pnlRepositorio.setLayout(pnlRepositorioLayout);
        pnlRepositorioLayout.setHorizontalGroup(
            pnlRepositorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scRepositorio, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
            .addComponent(pnlFractalRep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlRepositorioLayout.setVerticalGroup(
            pnlRepositorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRepositorioLayout.createSequentialGroup()
                .addComponent(pnlFractalRep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scRepositorio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelDividido.setTopComponent(pnlRepositorio);

        fractal.setToolTipText(null);
        fractal.setName("fractal"); // NOI18N

        javax.swing.GroupLayout fractalLayout = new javax.swing.GroupLayout(fractal);
        fractal.setLayout(fractalLayout);
        fractalLayout.setHorizontalGroup(
            fractalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        fractalLayout.setVerticalGroup(
            fractalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );

        panelDividido.setRightComponent(fractal);

        mnuFichero.setText("Fichero");

        mnuNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnuNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/new24.png"))); // NOI18N
        mnuNuevo.setText("Nuevo");
        mnuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNuevoActionPerformed(evt);
            }
        });
        mnuFichero.add(mnuNuevo);
        mnuFichero.add(mnuSeparador1);

        mnuGuardarImagen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuGuardarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/save24.png"))); // NOI18N
        mnuGuardarImagen.setText("Guardar imagen");
        mnuGuardarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGuardarImagenActionPerformed(evt);
            }
        });
        mnuFichero.add(mnuGuardarImagen);
        mnuFichero.add(mnuSeparador2);

        mnuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuFichero.add(mnuSalir);

        jMenu.add(mnuFichero);

        mnuEdit.setText("Edit");

        mnuConectarBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/db2.png"))); // NOI18N
        mnuConectarBD.setText("Conectar a BD");
        mnuConectarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConectarBDActionPerformed(evt);
            }
        });
        mnuEdit.add(mnuConectarBD);

        mnuCrearPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/addpicture.png"))); // NOI18N
        mnuCrearPunto.setText("Añadir punto interés");
        mnuCrearPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCrearPuntoActionPerformed(evt);
            }
        });
        mnuEdit.add(mnuCrearPunto);

        mnuBorrarPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/remove-picture.png"))); // NOI18N
        mnuBorrarPunto.setText("Borrar punto interés");
        mnuBorrarPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBorrarPuntoActionPerformed(evt);
            }
        });
        mnuEdit.add(mnuBorrarPunto);
        mnuEdit.add(jSeparator1);

        mnuOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/settings.png"))); // NOI18N
        mnuOpciones.setText("Opciones");
        mnuOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOpcionesActionPerformed(evt);
            }
        });
        mnuEdit.add(mnuOpciones);

        jMenu.add(mnuEdit);

        mnuHelp.setText("Ayuda");

        mnuAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/help.png"))); // NOI18N
        mnuAyuda.setText("Ayuda");
        mnuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAyudaActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuAyuda);

        jMenu.add(mnuHelp);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDividido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDividido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarFichero() {
        try {
            int result = selectorFichero.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                BufferedImage biImagenGrabar = fractal.generaImagen(d.width, d.height);
                String ficheroAGrabar = selectorFichero.getSelectedFile().getAbsolutePath();
                String sufijo = ".jpg";

                if (!ficheroAGrabar.toLowerCase().endsWith(sufijo)) {
                    ficheroAGrabar = selectorFichero.getSelectedFile() + sufijo;
                }
                File outputfile = new File(ficheroAGrabar);
                ImageIO.write(biImagenGrabar, "jpg", outputfile);
                lblInfo.setText("Fichero " + outputfile.getName() + " guardado");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mnuGuardarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGuardarImagenActionPerformed
        guardarFichero();
    }//GEN-LAST:event_mnuGuardarImagenActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        mnuGuardarImagenActionPerformed(evt);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // Reset parámetros
        fractal.setViewX(0);
        fractal.setViewY(0);
        fractal.setZoom(1);
        fractal.setMaxIteraciones(64);
        fractal.repaint();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void mnuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNuevoActionPerformed
        btnNuevoActionPerformed(evt);
    }//GEN-LAST:event_mnuNuevoActionPerformed

    private void btnRepositorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepositorioActionPerformed
        if (btnRepositorio.isSelected()) {
            pnlRepositorio.setVisible(true);

            if (ConexionDatos.getInstance() == null) {
                JOptionPane.showMessageDialog(null, "No hay conexión con la base de datos.\r\n"
                        + "Por favor revise la configuración de acceso a la base de datos MySQL en opciones de la aplicación.\r\n"
                        + "En opciones se puede crear la base de datos si no la has creado antes.");
                btnRepositorio.setSelected(false);
                btnCrearPunto.setEnabled(false);
                mnuCrearPunto.setEnabled(false);
                btnBorrarPunto.setEnabled(false);
                mnuBorrarPunto.setEnabled(false);
                pnlRepositorio.setVisible(false);
                return;
            }

            btnCrearPunto.setEnabled(true);
            mnuCrearPunto.setEnabled(true);

            puntosInteres = (GestionPuntoInteres.devuelvePuntosInteres());
            if (puntosInteres == null || puntosInteres.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay puntos de interés");
                pnlRepositorio.setVisible(false);
                btnCrearPunto.setEnabled(true);
                mnuCrearPunto.setEnabled(true);
                btnBorrarPunto.setEnabled(false);
                mnuBorrarPunto.setEnabled(false);
                return;
            }

            panelDividido.resetToPreferredSizes();
            fractalRepositorio.setVisible(true);
            btnBorrarPunto.setEnabled(true);
            mnuBorrarPunto.setEnabled(true);
            
            scRepositorio.setEnabled(true);
            scRepositorio.setMaximum(puntosInteres.size() - 1);
            scRepositorio.setValue(0);

            fractalRepositorio.setTipoFractal(devuelveFractal(puntosInteres.get(0).getClase()));
            fractalRepositorio.setViewX(puntosInteres.get(0).getX());
            fractalRepositorio.setViewY(puntosInteres.get(0).getY());
            fractalRepositorio.setZoom(puntosInteres.get(0).getZoom());
            fractalRepositorio.setMaxIteraciones(puntosInteres.get(0).getMax_iteraciones());
            fractalRepositorio.repaint();

        } else {

            pnlRepositorio.setVisible(false);
            btnCrearPunto.setEnabled(false);
            mnuCrearPunto.setEnabled(false);
            btnBorrarPunto.setEnabled(false);
            mnuBorrarPunto.setEnabled(false);
        }
    }//GEN-LAST:event_btnRepositorioActionPerformed

    private void btnCrearPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPuntoActionPerformed
        GestionPuntoInteres.crearPuntoInteres(new PuntoInteres(0, (String) cbClase.getSelectedItem(), fractal.getViewX(), fractal.getViewY(), fractal.getZoom(), fractal.getMaxIteraciones()));
        btnRepositorioActionPerformed(evt);
    }//GEN-LAST:event_btnCrearPuntoActionPerformed

    private void fractalRepositorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fractalRepositorioMouseClicked
        cbClase.setSelectedItem(fractalRepositorio.getTipoFractal().getClass().getName());
        fractal.setTipoFractal(devuelveFractal(fractalRepositorio.getTipoFractal().getClass().getName()));
        fractal.setViewX(fractalRepositorio.getViewX());
        fractal.setViewY(fractalRepositorio.getViewY());
        fractal.setZoom(fractalRepositorio.getZoom());
        fractal.setMaxIteraciones(fractalRepositorio.getMaxIteraciones());
        fractal.repaint();
    }//GEN-LAST:event_fractalRepositorioMouseClicked

    private void scRepositorioAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scRepositorioAdjustmentValueChanged
        /*        if (evt.getValueIsAdjusting()) {
              return;
            }*/
        int n = evt.getValue();
        
        fractalRepositorio.setTipoFractal(devuelveFractal(puntosInteres.get(n).getClase()));
        fractalRepositorio.setViewX(puntosInteres.get(n).getX());
        fractalRepositorio.setViewY(puntosInteres.get(n).getY());
        fractalRepositorio.setZoom(puntosInteres.get(n).getZoom());
        fractalRepositorio.setMaxIteraciones(puntosInteres.get(n).getMax_iteraciones());
        fractalRepositorio.repaint();
    }//GEN-LAST:event_scRepositorioAdjustmentValueChanged

    private IFractal devuelveFractal(String nombre)
    {
        switch (nombre) {
            case "Mandelbrot":
                return new Mandelbrot();
            case "Mandelbrot2":
                return new Mandelbrot2();
            case "Julia":
                return new Julia();
            case "Julia2":
                return new Julia2();
            case "Julia3":
                return new Julia3();
            case "Julia4":
                return new Julia4();
            case "Julia5":
                return new Julia5();
            case "Julia6":
                return new Julia6();
            case "Julia7":
                return new Julia7();
            default:
                System.out.println("Tipo fractal no reconocido. "+nombre);
                return null;
        }
        
    }
    
    private void cbClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClaseActionPerformed

        fractal.setTipoFractal(devuelveFractal((String)cbClase.getSelectedItem()));
        fractal.setViewX(0);
        fractal.setViewY(0);
        fractal.setZoom(1);

        fractal.invalidate();
        fractal.repaint();
    }//GEN-LAST:event_cbClaseActionPerformed

    private void btnBorrarPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPuntoActionPerformed
        GestionPuntoInteres.borrarPuntoInteres(puntosInteres.get(scRepositorio.getValue()).getId());
        btnRepositorioActionPerformed(evt);
    }//GEN-LAST:event_btnBorrarPuntoActionPerformed

    private void pnlRepositorioComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlRepositorioComponentResized
//        Dimension d = pnlRepositorio.getSize();
//        fractalRepositorio.setLocation(d.width/2-fractalRepositorio.getWidth()/2,d.height/2-fractalRepositorio.getHeight()/2-scRepositorio.getHeight()/2);
        fractalRepositorio.setAlignmentY(CENTER_ALIGNMENT);
        fractalRepositorio.setAlignmentX(CENTER_ALIGNMENT);
        
        pnlRepositorio.setAlignmentX(Component.CENTER_ALIGNMENT);
        pnlRepositorio.setAlignmentY(Component.CENTER_ALIGNMENT);
        
    }//GEN-LAST:event_pnlRepositorioComponentResized

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        pnlRepositorioComponentResized(evt);        
    }//GEN-LAST:event_formComponentResized

    private void mnuConectarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConectarBDActionPerformed
        btnRepositorio.setSelected(!btnRepositorio.isSelected());
        btnRepositorioActionPerformed(evt);
    }//GEN-LAST:event_mnuConectarBDActionPerformed

    private void mnuCrearPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCrearPuntoActionPerformed
        btnCrearPuntoActionPerformed(evt);
    }//GEN-LAST:event_mnuCrearPuntoActionPerformed

    private void mnuBorrarPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBorrarPuntoActionPerformed
        btnBorrarPuntoActionPerformed(evt);
    }//GEN-LAST:event_mnuBorrarPuntoActionPerformed

    private void mnuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAyudaActionPerformed
        ventanaAyuda.setVisible(true);
    }//GEN-LAST:event_mnuAyudaActionPerformed

    private void mnuOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOpcionesActionPerformed
        ventanaConfiguracion.setVisible(true);
    }//GEN-LAST:event_mnuOpcionesActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // Salir de la aplicación
        System.exit(0); 
    }//GEN-LAST:event_mnuSalirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaFractal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFractal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFractal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFractal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFractal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarPunto;
    private javax.swing.JButton btnCrearPunto;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JToggleButton btnRepositorio;
    private javax.swing.JComboBox<String> cbClase;
    private javax.swing.Box.Filler filler1;
    private Fractal fractal;
    private Fractal fractal2;
    private Fractal fractalRepositorio;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JMenuItem mnuAyuda;
    private javax.swing.JMenuItem mnuBorrarPunto;
    private javax.swing.JMenuItem mnuConectarBD;
    private javax.swing.JMenuItem mnuCrearPunto;
    private javax.swing.JMenu mnuEdit;
    private javax.swing.JMenu mnuFichero;
    private javax.swing.JMenuItem mnuGuardarImagen;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenuItem mnuNuevo;
    private javax.swing.JMenuItem mnuOpciones;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JPopupMenu.Separator mnuSeparador1;
    private javax.swing.JPopupMenu.Separator mnuSeparador2;
    private javax.swing.JSplitPane panelDividido;
    private javax.swing.JPanel pnlFractalRep;
    private javax.swing.JPanel pnlRepositorio;
    private javax.swing.JScrollBar scRepositorio;
    private javax.swing.JFileChooser selectorFichero;
    // End of variables declaration//GEN-END:variables
}

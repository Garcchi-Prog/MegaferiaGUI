package view;

import com.formdev.flatlaf.FlatDarkLaf;
import controller.BookController;
import controller.PersonController;
import controller.PublisherController;
import controller.StandController;
import controller.utils.Response;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.Author;
import model.Book;
import model.Manager;
import model.Narrator;
import model.Person;
import model.Publisher;
import model.Stand;

public class MegaferiaFrame extends javax.swing.JFrame {

    /**
     * Creates new form MegaferiaFrame
     */
    public MegaferiaFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        OpcionesTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PrecioStandTextField = new javax.swing.JTextField();
        IDStandTextField = new javax.swing.JTextField();
        CrearStandButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IDPersonaTextField = new javax.swing.JTextField();
        NombrePersonaTextField = new javax.swing.JTextField();
        CrearAutorButton = new javax.swing.JButton();
        ApellidoPersonaTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CrearGerenteButton = new javax.swing.JButton();
        CrearNarradorButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        NITEditorialTextField = new javax.swing.JTextField();
        NombreEditorialTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DireccionEditorialTextField = new javax.swing.JTextField();
        CrearEditorialButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        GerenteEditorialComboBox = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        TituloLibroTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ISBNLibroTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        GeneroLibroComboBox = new javax.swing.JComboBox<>();
        CrearLibroButton = new javax.swing.JButton();
        AutoresLibroComboBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        LibroImpresoRadioButton = new javax.swing.JRadioButton();
        LibroDigitalRadioButton = new javax.swing.JRadioButton();
        AudioLibroRadioButton = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        FormatoLibroComboBox = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        ValorLibroTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        EditorialLibroComboBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        PaginasLibroTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        EjemplaresLibroTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        HipervinculoLibroTextField = new javax.swing.JTextField();
        DuracionLibroTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        NarradorLibroComboBox = new javax.swing.JComboBox<>();
        AgregarAutorLibroButton = new javax.swing.JButton();
        EliminarAutorLibroButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AutoresLibroTextArea = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        IDStandsComprarComboBox = new javax.swing.JComboBox<>();
        EditorialesComprarStandComboBox = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        AgEditorialComprarStandButton = new javax.swing.JButton();
        ComprarStandButton = new javax.swing.JButton();
        ElEditorialComprarStandButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EditorialStandComprarTextArea = new javax.swing.JTextArea();
        AgregarStandComprarButton = new javax.swing.JButton();
        EliminarStandComprarButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        StandComprarTextArea = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaEditorialesTable = new javax.swing.JTable();
        ConsultarEditorialButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ListaPersonasTable = new javax.swing.JTable();
        ConsultarPersonaButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ListaStandsTable = new javax.swing.JTable();
        ConsultarStandButton = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ListaLibrosTable = new javax.swing.JTable();
        ConsultarLibroButton = new javax.swing.JButton();
        LibroSeleccionarComboBox = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        AutorConsultaComboBox = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        ConsultarAutorButton = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        LibroBuscarConsultaTable = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        FormatoConsultaComboBox = new javax.swing.JComboBox<>();
        ConsultarFormatoButton = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        AutoresConMasLibrosConsultaTable = new javax.swing.JTable();
        ConsultarAutoresMasLibrosButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel1.setText("Precio");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel2.setText("ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        PrecioStandTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        PrecioStandTextField.setToolTipText("");
        PrecioStandTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioStandTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(PrecioStandTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 150, 30));

        IDStandTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        IDStandTextField.setToolTipText("");
        IDStandTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDStandTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(IDStandTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 150, 30));

        CrearStandButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        CrearStandButton.setText("Crear");
        CrearStandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearStandButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CrearStandButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 90, 40));

        OpcionesTabbedPane.addTab("Stand", jPanel2);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel4.setText("ID");

        IDPersonaTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        IDPersonaTextField.setToolTipText("");
        IDPersonaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDPersonaTextFieldActionPerformed(evt);
            }
        });

        NombrePersonaTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        NombrePersonaTextField.setToolTipText("");
        NombrePersonaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrePersonaTextFieldActionPerformed(evt);
            }
        });

        CrearAutorButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        CrearAutorButton.setText("Crear Autor");
        CrearAutorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearAutorButtonActionPerformed(evt);
            }
        });

        ApellidoPersonaTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        ApellidoPersonaTextField.setToolTipText("");
        ApellidoPersonaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoPersonaTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel5.setText("Apellido");

        CrearGerenteButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        CrearGerenteButton.setText("Crear Gerente");
        CrearGerenteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearGerenteButtonActionPerformed(evt);
            }
        });

        CrearNarradorButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        CrearNarradorButton.setText("Crear Narrador");
        CrearNarradorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearNarradorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(21, 21, 21)
                                .addComponent(ApellidoPersonaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IDPersonaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(21, 21, 21)
                                    .addComponent(NombrePersonaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(CrearAutorButton)
                        .addGap(56, 56, 56)
                        .addComponent(CrearGerenteButton)
                        .addGap(54, 54, 54)
                        .addComponent(CrearNarradorButton)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(IDPersonaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(NombrePersonaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(ApellidoPersonaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrearAutorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CrearNarradorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CrearGerenteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(231, Short.MAX_VALUE))
        );

        OpcionesTabbedPane.addTab("Persona", jPanel3);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel6.setText("NIT");

        NITEditorialTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        NITEditorialTextField.setToolTipText("");
        NITEditorialTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NITEditorialTextFieldActionPerformed(evt);
            }
        });

        NombreEditorialTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        NombreEditorialTextField.setToolTipText("");
        NombreEditorialTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreEditorialTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel7.setText("Nombre");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel8.setText("Dirección");

        DireccionEditorialTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        DireccionEditorialTextField.setToolTipText("");
        DireccionEditorialTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionEditorialTextFieldActionPerformed(evt);
            }
        });

        CrearEditorialButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        CrearEditorialButton.setText("Crear");
        CrearEditorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEditorialButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel9.setText("Gerente");

        GerenteEditorialComboBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        GerenteEditorialComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno..." }));
        GerenteEditorialComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenteEditorialComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NITEditorialTextField)
                            .addComponent(NombreEditorialTextField)
                            .addComponent(DireccionEditorialTextField)
                            .addComponent(GerenteEditorialComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(CrearEditorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(DireccionEditorialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(NITEditorialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(NombreEditorialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GerenteEditorialComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(46, 46, 46)
                .addComponent(CrearEditorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        OpcionesTabbedPane.addTab("Editorial", jPanel4);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel10.setText("Titulo");

        TituloLibroTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        TituloLibroTextField.setToolTipText("");
        TituloLibroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloLibroTextFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel11.setText("Autores");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel12.setText("ISBN");

        ISBNLibroTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        ISBNLibroTextField.setToolTipText("");
        ISBNLibroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNLibroTextFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel13.setText("Genero");

        GeneroLibroComboBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        GeneroLibroComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno...", "Fantasía urbana", "Ciencia ficción distópica", "Realismo mágico", "Romance histórico", "Thriller psicológico", "Ficción filosófica", "Aventura steampunk", "Terror gótico", "No ficción narrativa", "Ficción postapocalíptica" }));

        CrearLibroButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        CrearLibroButton.setText("Crear");
        CrearLibroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearLibroButtonActionPerformed(evt);
            }
        });

        AutoresLibroComboBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        AutoresLibroComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno..." }));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel14.setText("Tipo");

        LibroImpresoRadioButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        LibroImpresoRadioButton.setText("Impreso");
        LibroImpresoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibroImpresoRadioButtonActionPerformed(evt);
            }
        });

        LibroDigitalRadioButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        LibroDigitalRadioButton.setText("Digital");
        LibroDigitalRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibroDigitalRadioButtonActionPerformed(evt);
            }
        });

        AudioLibroRadioButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        AudioLibroRadioButton.setText("Audio Libro");
        AudioLibroRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AudioLibroRadioButtonActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel15.setText("Formato");

        FormatoLibroComboBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        FormatoLibroComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno..." }));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel16.setText("Valor");

        ValorLibroTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        ValorLibroTextField.setToolTipText("");
        ValorLibroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorLibroTextFieldActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel17.setText("Editorial");

        EditorialLibroComboBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        EditorialLibroComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno..." }));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel18.setText("Nro. Ejemplares");

        PaginasLibroTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        PaginasLibroTextField.setToolTipText("");
        PaginasLibroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaginasLibroTextFieldActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel19.setText("Nro. Paginas");

        EjemplaresLibroTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        EjemplaresLibroTextField.setToolTipText("");
        EjemplaresLibroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjemplaresLibroTextFieldActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel20.setText("Hipervinculo");

        HipervinculoLibroTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        HipervinculoLibroTextField.setToolTipText("");
        HipervinculoLibroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HipervinculoLibroTextFieldActionPerformed(evt);
            }
        });

        DuracionLibroTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        DuracionLibroTextField.setToolTipText("");
        DuracionLibroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuracionLibroTextFieldActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel21.setText("Duracion");

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel22.setText("Narrador");

        NarradorLibroComboBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        NarradorLibroComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno..." }));

        AgregarAutorLibroButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        AgregarAutorLibroButton.setText("Agregar Autor");
        AgregarAutorLibroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAutorLibroButtonActionPerformed(evt);
            }
        });

        EliminarAutorLibroButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        EliminarAutorLibroButton.setText("Eliminar Autor");
        EliminarAutorLibroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAutorLibroButtonActionPerformed(evt);
            }
        });

        AutoresLibroTextArea.setColumns(20);
        AutoresLibroTextArea.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        AutoresLibroTextArea.setRows(5);
        AutoresLibroTextArea.setEnabled(false);
        jScrollPane2.setViewportView(AutoresLibroTextArea);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(CrearLibroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PaginasLibroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EjemplaresLibroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel20)
                        .addGap(16, 16, 16)
                        .addComponent(HipervinculoLibroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NarradorLibroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DuracionLibroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(ValorLibroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(FormatoLibroComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                                    .addComponent(LibroImpresoRadioButton)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(LibroDigitalRadioButton)))
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(TituloLibroTextField)
                                                .addComponent(ISBNLibroTextField)
                                                .addComponent(GeneroLibroComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(AutoresLibroComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(AudioLibroRadioButton)
                                            .addComponent(EliminarAutorLibroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AgregarAutorLibroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EditorialLibroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(TituloLibroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(AutoresLibroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(ISBNLibroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(GeneroLibroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(AgregarAutorLibroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EliminarAutorLibroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(LibroImpresoRadioButton)
                            .addComponent(LibroDigitalRadioButton)
                            .addComponent(AudioLibroRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(FormatoLibroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(ValorLibroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(EditorialLibroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20)
                            .addComponent(HipervinculoLibroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(EjemplaresLibroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PaginasLibroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(NarradorLibroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(DuracionLibroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(CrearLibroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        OpcionesTabbedPane.addTab("Libro", jPanel5);

        IDStandsComprarComboBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        IDStandsComprarComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno..." }));

        EditorialesComprarStandComboBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        EditorialesComprarStandComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno..." }));

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel23.setText("Editoriales");

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel24.setText("ID Stands");

        AgEditorialComprarStandButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        AgEditorialComprarStandButton.setText("Agregar Editorial");
        AgEditorialComprarStandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgEditorialComprarStandButtonActionPerformed(evt);
            }
        });

        ComprarStandButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        ComprarStandButton.setText("Comprar");
        ComprarStandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarStandButtonActionPerformed(evt);
            }
        });

        ElEditorialComprarStandButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        ElEditorialComprarStandButton.setText("Eliminar Editorial");
        ElEditorialComprarStandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElEditorialComprarStandButtonActionPerformed(evt);
            }
        });

        EditorialStandComprarTextArea.setColumns(20);
        EditorialStandComprarTextArea.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        EditorialStandComprarTextArea.setRows(5);
        EditorialStandComprarTextArea.setEnabled(false);
        jScrollPane1.setViewportView(EditorialStandComprarTextArea);

        AgregarStandComprarButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        AgregarStandComprarButton.setText("Agregar Stand");
        AgregarStandComprarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarStandComprarButtonActionPerformed(evt);
            }
        });

        EliminarStandComprarButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        EliminarStandComprarButton.setText("Eliminar Stand");
        EliminarStandComprarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarStandComprarButtonActionPerformed(evt);
            }
        });

        StandComprarTextArea.setColumns(20);
        StandComprarTextArea.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        StandComprarTextArea.setRows(5);
        StandComprarTextArea.setEnabled(false);
        jScrollPane3.setViewportView(StandComprarTextArea);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(ComprarStandButton)
                        .addGap(321, 321, 321))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EditorialesComprarStandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AgEditorialComprarStandButton)
                                .addGap(18, 18, 18)
                                .addComponent(ElEditorialComprarStandButton)))
                        .addGap(189, 189, 189))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDStandsComprarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(AgregarStandComprarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EliminarStandComprarButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(IDStandsComprarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(238, 238, 238)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(EditorialesComprarStandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgregarStandComprarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EliminarStandComprarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgEditorialComprarStandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ElEditorialComprarStandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ComprarStandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        OpcionesTabbedPane.addTab("Comprar Stand", jPanel6);

        ListaEditorialesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIT", "Nombre", "Dirección", "Nombre Gerente", "Nro. Stands"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(ListaEditorialesTable);

        ConsultarEditorialButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        ConsultarEditorialButton.setText("Consultar");
        ConsultarEditorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarEditorialButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(ConsultarEditorialButton)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ConsultarEditorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        OpcionesTabbedPane.addTab("Show Editoriales", jPanel7);

        ListaPersonasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre Completo", "Tipo", "Editorial", "Nro. Libros"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(ListaPersonasTable);

        ConsultarPersonaButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        ConsultarPersonaButton.setText("Consultar");
        ConsultarPersonaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarPersonaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(ConsultarPersonaButton)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ConsultarPersonaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        OpcionesTabbedPane.addTab("Show Personas", jPanel8);

        ListaStandsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Precio", "Comprado", "Editoriales"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(ListaStandsTable);

        ConsultarStandButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        ConsultarStandButton.setText("Consultar");
        ConsultarStandButton.setToolTipText("");
        ConsultarStandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarStandButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(ConsultarStandButton)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ConsultarStandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        OpcionesTabbedPane.addTab("Show Stands", jPanel9);

        ListaLibrosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Autores", "ISBN", "Genero", "Formato", "Valor", "Editorial", "Nro. Ejem", "Nro. Pag", "URL", "Narrador", "Duración"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(ListaLibrosTable);

        ConsultarLibroButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        ConsultarLibroButton.setText("Consultar");
        ConsultarLibroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarLibroButtonActionPerformed(evt);
            }
        });

        LibroSeleccionarComboBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        LibroSeleccionarComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno...", "Libros Impresos", "Libros Digitales", "Audiolibros", "Todos los Libros" }));

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel25.setText("Libros");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(LibroSeleccionarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(ConsultarLibroButton)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LibroSeleccionarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsultarLibroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        OpcionesTabbedPane.addTab("Show Libros", jPanel10);

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel26.setText("Busqueda Libros");

        AutorConsultaComboBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        AutorConsultaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno..." }));

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel27.setText("Autor");

        ConsultarAutorButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        ConsultarAutorButton.setText("Consultar");
        ConsultarAutorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarAutorButtonActionPerformed(evt);
            }
        });

        LibroBuscarConsultaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Autores", "ISBN", "Genero", "Formato", "Valor", "Editorial", "Nro. Ejem", "Nro. Pag", "URL", "Narrador", "Duración"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(LibroBuscarConsultaTable);

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel28.setText("Formato");

        FormatoConsultaComboBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        FormatoConsultaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno...", "Pasta dura", "Pasta blanda", "EPUB", "PDF", "MOBI/AZW", "MP3", "MP4", "WAV", "WMA", "Otro" }));

        ConsultarFormatoButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        ConsultarFormatoButton.setText("Consultar");
        ConsultarFormatoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarFormatoButtonActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel29.setText("Autores con más Libros en Diferentes Editoriales");

        AutoresConMasLibrosConsultaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(AutoresConMasLibrosConsultaTable);

        ConsultarAutoresMasLibrosButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        ConsultarAutoresMasLibrosButton.setText("Consultar");
        ConsultarAutoresMasLibrosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarAutoresMasLibrosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AutorConsultaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConsultarAutorButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FormatoConsultaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConsultarFormatoButton)
                        .addGap(40, 40, 40))))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29)))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(ConsultarAutoresMasLibrosButton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(AutorConsultaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarAutorButton)
                    .addComponent(jLabel28)
                    .addComponent(FormatoConsultaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarFormatoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ConsultarAutoresMasLibrosButton)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        OpcionesTabbedPane.addTab("Consultas Adicionales", jPanel11);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OpcionesTabbedPane)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OpcionesTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrecioStandTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioStandTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioStandTextFieldActionPerformed

    private void IDStandTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDStandTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDStandTextFieldActionPerformed

    private void IDPersonaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDPersonaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDPersonaTextFieldActionPerformed

    private void NombrePersonaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombrePersonaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombrePersonaTextFieldActionPerformed

    private void ApellidoPersonaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoPersonaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoPersonaTextFieldActionPerformed

    private void NITEditorialTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NITEditorialTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NITEditorialTextFieldActionPerformed

    private void NombreEditorialTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreEditorialTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreEditorialTextFieldActionPerformed

    private void DireccionEditorialTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionEditorialTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionEditorialTextFieldActionPerformed

    private void TituloLibroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloLibroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TituloLibroTextFieldActionPerformed

    private void ISBNLibroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNLibroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISBNLibroTextFieldActionPerformed

    private void AudioLibroRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AudioLibroRadioButtonActionPerformed
        if (AudioLibroRadioButton.isSelected()) {
            LibroDigitalRadioButton.setSelected(false);
            LibroImpresoRadioButton.setSelected(false);
            PaginasLibroTextField.setEnabled(false);
            EjemplaresLibroTextField.setEnabled(false);
            HipervinculoLibroTextField.setEnabled(false);
            DuracionLibroTextField.setEnabled(true);
            NarradorLibroComboBox.setEnabled(true);

            FormatoLibroComboBox.removeAllItems();
            FormatoLibroComboBox.addItem("Seleccione uno...");
            FormatoLibroComboBox.addItem("MP3");
            FormatoLibroComboBox.addItem("MP4");
            FormatoLibroComboBox.addItem("WAV");
            FormatoLibroComboBox.addItem("WMA");
            FormatoLibroComboBox.addItem("Otro");
        }
    }//GEN-LAST:event_AudioLibroRadioButtonActionPerformed

    private void ValorLibroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorLibroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorLibroTextFieldActionPerformed

    private void PaginasLibroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaginasLibroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaginasLibroTextFieldActionPerformed

    private void EjemplaresLibroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjemplaresLibroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EjemplaresLibroTextFieldActionPerformed

    private void HipervinculoLibroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HipervinculoLibroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HipervinculoLibroTextFieldActionPerformed

    private void DuracionLibroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DuracionLibroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DuracionLibroTextFieldActionPerformed

    private void LibroImpresoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibroImpresoRadioButtonActionPerformed
        if (LibroImpresoRadioButton.isSelected()) {
            LibroDigitalRadioButton.setSelected(false);
            AudioLibroRadioButton.setSelected(false);
            PaginasLibroTextField.setEnabled(true);
            EjemplaresLibroTextField.setEnabled(true);
            HipervinculoLibroTextField.setEnabled(false);
            DuracionLibroTextField.setEnabled(false);
            NarradorLibroComboBox.setEnabled(false);

            FormatoLibroComboBox.removeAllItems();
            FormatoLibroComboBox.addItem("Seleccione uno...");
            FormatoLibroComboBox.addItem("Pasta dura");
            FormatoLibroComboBox.addItem("Pasta blanda");
        }
    }//GEN-LAST:event_LibroImpresoRadioButtonActionPerformed

    private void LibroDigitalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibroDigitalRadioButtonActionPerformed
        if (LibroDigitalRadioButton.isSelected()) {
            LibroImpresoRadioButton.setSelected(false);
            AudioLibroRadioButton.setSelected(false);
            PaginasLibroTextField.setEnabled(false);
            EjemplaresLibroTextField.setEnabled(false);
            HipervinculoLibroTextField.setEnabled(true);
            DuracionLibroTextField.setEnabled(false);
            NarradorLibroComboBox.setEnabled(false);

            FormatoLibroComboBox.removeAllItems();
            FormatoLibroComboBox.addItem("Seleccione uno...");
            FormatoLibroComboBox.addItem("EPUB");
            FormatoLibroComboBox.addItem("PDF");
            FormatoLibroComboBox.addItem("MOBI/AZW");
            FormatoLibroComboBox.addItem("Otro");
        }
    }//GEN-LAST:event_LibroDigitalRadioButtonActionPerformed

    private void CrearStandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearStandButtonActionPerformed
        String id = IDStandTextField.getText();
        String price = PrecioStandTextField.getText();

        Response response = StandController.create(id, price);

        if (response.getStatus() >= 500) {

            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            Stand nuevoStand = (Stand) response.getObject();
            IDStandsComprarComboBox.addItem(nuevoStand.getId() + " - $" + nuevoStand.getPrice());
            
            JOptionPane.showMessageDialog(this, response.getMessage(), "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);

            IDStandTextField.setText("");
            PrecioStandTextField.setText("");
        }


    }//GEN-LAST:event_CrearStandButtonActionPerformed

    private void CrearAutorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearAutorButtonActionPerformed
        String id = IDPersonaTextField.getText();
        String firstname = NombrePersonaTextField.getText();
        String lastname = ApellidoPersonaTextField.getText();

        Response response = PersonController.registerAuthor(id, firstname, lastname);

        if (response.getStatus() >= 500) {

            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {

            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            Author nuevoAutor = (Author) response.getObject();
            AutoresLibroComboBox.addItem(nuevoAutor.getId() + " - " + nuevoAutor.getFullname());

            JOptionPane.showMessageDialog(this, response.getMessage(), "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);

            IDPersonaTextField.setText("");
            NombrePersonaTextField.setText("");
            ApellidoPersonaTextField.setText("");

        }
    }//GEN-LAST:event_CrearAutorButtonActionPerformed

    private void CrearGerenteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearGerenteButtonActionPerformed
        String id = IDPersonaTextField.getText();
        String firstname = NombrePersonaTextField.getText();
        String lastname = ApellidoPersonaTextField.getText();

        Response response = PersonController.registerManager(id, firstname, lastname);

        if (response.getStatus() >= 500) {

            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {

            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            Manager nuevoGerente = (Manager) response.getObject();
            GerenteEditorialComboBox.addItem(nuevoGerente.getId() + " - " + nuevoGerente.getFullname());

            JOptionPane.showMessageDialog(this, response.getMessage(), "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);

            IDPersonaTextField.setText("");
            NombrePersonaTextField.setText("");
            ApellidoPersonaTextField.setText("");
        }

    }//GEN-LAST:event_CrearGerenteButtonActionPerformed

    private void CrearNarradorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearNarradorButtonActionPerformed
        String id = IDPersonaTextField.getText();
        String firstname = NombrePersonaTextField.getText();
        String lastname = ApellidoPersonaTextField.getText();

        Response response = PersonController.registerNarrator(id, firstname, lastname);

        if (response.getStatus() >= 500) {

            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {

            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            Narrator nuevoNarrador = (Narrator) response.getObject();
            NarradorLibroComboBox.addItem(nuevoNarrador.getId() + " - " + nuevoNarrador.getFullname());

            JOptionPane.showMessageDialog(this, response.getMessage(), "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);

            IDPersonaTextField.setText("");
            NombrePersonaTextField.setText("");
            ApellidoPersonaTextField.setText("");
        }
    }//GEN-LAST:event_CrearNarradorButtonActionPerformed

    private void CrearEditorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEditorialButtonActionPerformed
        String nit = NITEditorialTextField.getText();
        String name = NombreEditorialTextField.getText();
        String address = DireccionEditorialTextField.getText();
        String managerData = GerenteEditorialComboBox.getItemAt(GerenteEditorialComboBox.getSelectedIndex());

        Response response = PublisherController.register(nit, name, address, managerData);

        if (response.getStatus() >= 500) {

            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {

            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            Publisher nuevaEditorial = (Publisher) response.getObject();
            EditorialLibroComboBox.addItem(nuevaEditorial.getNit() + " - " + nuevaEditorial.getName());
            EditorialesComprarStandComboBox.addItem(nuevaEditorial.getNit() + " - " + nuevaEditorial.getName());
            
            JOptionPane.showMessageDialog(this, response.getMessage(), "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);

            GerenteEditorialComboBox.setSelectedIndex(0);
            NITEditorialTextField.setText("");
            NombreEditorialTextField.setText("");
            DireccionEditorialTextField.setText("");

        }

    }//GEN-LAST:event_CrearEditorialButtonActionPerformed

    private void AgregarAutorLibroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAutorLibroButtonActionPerformed
        String autorSeleccionado = AutoresLibroComboBox.getItemAt(AutoresLibroComboBox.getSelectedIndex());
        String contenidoActualTextArea = AutoresLibroTextArea.getText();

        Response response = BookController.addAuthorTo(autorSeleccionado, contenidoActualTextArea);

        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {

            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            AutoresLibroTextArea.setText(contenidoActualTextArea + "\n" + autorSeleccionado);
            
            JOptionPane.showMessageDialog(this, response.getMessage(), "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_AgregarAutorLibroButtonActionPerformed

    private void EliminarAutorLibroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAutorLibroButtonActionPerformed
        String autorEliminar = AutoresLibroComboBox.getItemAt(AutoresLibroComboBox.getSelectedIndex());
        String contenidoActualTextArea = AutoresLibroTextArea.getText();
        String nuevoContenidoTextArea = "";

        Response response = BookController.deleteFrom(autorEliminar, contenidoActualTextArea);

        if (response.getStatus() >= 500) {

            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {

            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            String[] temp = contenidoActualTextArea.split("\n");
            for (String temp1 : temp) {
                if (!temp1.trim().equals(autorEliminar.trim())) {
                    nuevoContenidoTextArea += temp1;
                }
            }
            AutoresLibroTextArea.setText(nuevoContenidoTextArea);
            JOptionPane.showMessageDialog(this, response.getMessage(), "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_EliminarAutorLibroButtonActionPerformed

    private void CrearLibroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearLibroButtonActionPerformed

        String title = TituloLibroTextField.getText();
       
        String authorsContent = AutoresLibroTextArea.getText();
        String isbn = ISBNLibroTextField.getText();
        String valueStr = ValorLibroTextField.getText();
        String pagesStr = PaginasLibroTextField.getText();
        String copiesStr = EjemplaresLibroTextField.getText();
        String hyperlink = HipervinculoLibroTextField.getText();
        String durationStr = DuracionLibroTextField.getText();
        
        String genre = GeneroLibroComboBox.getItemAt(GeneroLibroComboBox.getSelectedIndex());
        String authorData = AutoresLibroComboBox.getItemAt(AutoresLibroComboBox.getSelectedIndex());
        String format = FormatoLibroComboBox.getItemAt(FormatoLibroComboBox.getSelectedIndex());
        String publisherData = EditorialLibroComboBox.getItemAt(EditorialLibroComboBox.getSelectedIndex());
        String narratorData = NarradorLibroComboBox.getItemAt(NarradorLibroComboBox.getSelectedIndex());

        boolean isPrinted = LibroImpresoRadioButton.isSelected();
        boolean isDigital = LibroDigitalRadioButton.isSelected();
        boolean isAudiobook = AudioLibroRadioButton.isSelected();

        Response response = BookController.register(title, authorsContent, authorData, isbn, genre, format, valueStr, publisherData,
                isPrinted, pagesStr, copiesStr, isDigital, hyperlink, isAudiobook, durationStr, narratorData);

        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {

            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);

            TituloLibroTextField.setText("");
            ISBNLibroTextField.setText("");
            ValorLibroTextField.setText("");
            PaginasLibroTextField.setText("");
            EjemplaresLibroTextField.setText("");
            HipervinculoLibroTextField.setText("");
            DuracionLibroTextField.setText("");
            AutoresLibroTextArea.setText("");

            GeneroLibroComboBox.setSelectedIndex(0);
            FormatoLibroComboBox.setSelectedIndex(0);
            EditorialLibroComboBox.setSelectedIndex(0);
            NarradorLibroComboBox.setSelectedIndex(0);
            AutoresLibroComboBox.setSelectedIndex(0);
        }
    }//GEN-LAST:event_CrearLibroButtonActionPerformed

    private void AgregarStandComprarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarStandComprarButtonActionPerformed
        String standSeleccionado = IDStandsComprarComboBox.getItemAt(IDStandsComprarComboBox.getSelectedIndex());

        String contenidoActualTextArea = StandComprarTextArea.getText();

        Response response = StandController.addToBuy(standSeleccionado, contenidoActualTextArea);

        if (response.getStatus() >= 500) {

            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            StandComprarTextArea.setText(contenidoActualTextArea + "\n" + standSeleccionado);
            
            JOptionPane.showMessageDialog(this, response.getMessage(), "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
            
            IDStandsComprarComboBox.setSelectedIndex(0);

        }
    }//GEN-LAST:event_AgregarStandComprarButtonActionPerformed

    private void EliminarStandComprarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarStandComprarButtonActionPerformed
        String standAEliminar = IDStandsComprarComboBox.getItemAt(IDStandsComprarComboBox.getSelectedIndex());
        String contenidoActualTextArea = StandComprarTextArea.getText();

        Response response = StandController.deleteFromBuy(standAEliminar, contenidoActualTextArea);

        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_EliminarStandComprarButtonActionPerformed

    private void AgEditorialComprarStandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgEditorialComprarStandButtonActionPerformed
        String editorialSeleccionada = EditorialesComprarStandComboBox.getItemAt(EditorialesComprarStandComboBox.getSelectedIndex());

        String contenidoActualTextArea = EditorialStandComprarTextArea.getText();

        Response response = PublisherController.addToBuy(editorialSeleccionada, contenidoActualTextArea);

        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            EditorialStandComprarTextArea.setText(contenidoActualTextArea + "\n" + editorialSeleccionada);
            
            JOptionPane.showMessageDialog(this, response.getMessage(), "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);

            EditorialesComprarStandComboBox.setSelectedIndex(0);
        }
    }//GEN-LAST:event_AgEditorialComprarStandButtonActionPerformed

    private void ElEditorialComprarStandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElEditorialComprarStandButtonActionPerformed
        String editorialAEliminar = EditorialesComprarStandComboBox.getItemAt(EditorialesComprarStandComboBox.getSelectedIndex());
        String contenidoActualTextArea = EditorialStandComprarTextArea.getText();

        Response response = PublisherController.deleteFromBuy(editorialAEliminar, contenidoActualTextArea);

        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_ElEditorialComprarStandButtonActionPerformed

    private void ComprarStandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarStandButtonActionPerformed
        String standsContent = StandComprarTextArea.getText();
        String publishersContent = EditorialStandComprarTextArea.getText();

        Response response = StandController.buy(standsContent, publishersContent);

        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {

            JOptionPane.showMessageDialog(this, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);

            StandComprarTextArea.setText("");
            EditorialStandComprarTextArea.setText("");

        }
    }//GEN-LAST:event_ComprarStandButtonActionPerformed

    private void ConsultarEditorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarEditorialButtonActionPerformed
        ArrayList<Publisher> editoriales = PublisherController.getData();

        DefaultTableModel model = (DefaultTableModel) ListaEditorialesTable.getModel();
        model.setRowCount(0);

        for (Publisher publisher : editoriales) {
            Object[] rowData = new Object[5];
            rowData[0] = publisher.getNit();
            rowData[1] = publisher.getName();
            rowData[2] = publisher.getAddress();
            rowData[3] = publisher.getManager().getFullname();
            rowData[4] = publisher.getStandQuantity();

            model.addRow(rowData);
        }
    }//GEN-LAST:event_ConsultarEditorialButtonActionPerformed

    private void ConsultarPersonaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarPersonaButtonActionPerformed

        ArrayList<Person> dataRows = PersonController.getPersonData();

        DefaultTableModel model = (DefaultTableModel) ListaPersonasTable.getModel();
        model.setRowCount(0);

        for (Person person : dataRows) {

            Object[] rowData = new Object[5];
            rowData[0] = person.getId();
            rowData[1] = person.getFullname();
            rowData[2] = person.getRoleType();
            rowData[3] = person.getPublisherInfo();
            rowData[4] = person.getBookCount();

            model.addRow(rowData);
        }
    }//GEN-LAST:event_ConsultarPersonaButtonActionPerformed

    private void ConsultarStandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarStandButtonActionPerformed

        ArrayList<Stand> dataRows = StandController.getData();

        DefaultTableModel model = (DefaultTableModel) ListaStandsTable.getModel();
        model.setRowCount(0);

        for (Stand stand : dataRows) {

            Object[] rowData = new Object[4];
            rowData[0] = stand.getId();
            rowData[1] = stand.getPrice();
            //rowData[2] = stand.getComprado(); //
            rowData[3] = stand.getPublishers();

            model.addRow(rowData);
        }
    }//GEN-LAST:event_ConsultarStandButtonActionPerformed

    private void ConsultarLibroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarLibroButtonActionPerformed

        ArrayList<Book> dataRows = BookController.getData();

        DefaultTableModel model = (DefaultTableModel) ListaLibrosTable.getModel();
        model.setRowCount(0);

        for (Book book : dataRows) {
            Object[] rowData = new Object[12];
            
            rowData[0] = book.getTitle();
            rowData[1] = book.getAuthors();
            rowData[2] = book.getIsbn();
            rowData[3] = book.getGenre();
            rowData[4] = book.getFormat();
            rowData[5] = book.getValue();
            rowData[6] = book.getPublisher();
            //rowData[7] = book.getBookCount();
            //rowData[8] = book.getBookCount();
            //rowData[9] = book.getBookCount();
            //rowData[10] = book.getBookCount();
            //rowData[11] = book.getBookCount();

            model.addRow(rowData);
        }
    }//GEN-LAST:event_ConsultarLibroButtonActionPerformed

    private void ConsultarAutorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarAutorButtonActionPerformed

        String autorData = (String) AutorConsultaComboBox.getSelectedItem();

        ArrayList<Object[]> dataRows = BookController.getBooksByAuthor(autorData);

        DefaultTableModel model = (DefaultTableModel) LibroBuscarConsultaTable.getModel();
        model.setRowCount(0);

        for (Object[] row : dataRows) {
            model.addRow(row);
        }
    }//GEN-LAST:event_ConsultarAutorButtonActionPerformed

    private void ConsultarFormatoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarFormatoButtonActionPerformed

        String searchFormat = (String) FormatoConsultaComboBox.getSelectedItem();

        ArrayList<Object[]> dataRows = BookController.getBooksByFormat(searchFormat);

        DefaultTableModel model = (DefaultTableModel) LibroBuscarConsultaTable.getModel();
        model.setRowCount(0);

        for (Object[] row : dataRows) {
            model.addRow(row);
        }
    }//GEN-LAST:event_ConsultarFormatoButtonActionPerformed

    private void ConsultarAutoresMasLibrosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarAutoresMasLibrosButtonActionPerformed

        ArrayList<Object[]> dataRows = PersonController.getAuthorsMostBooks();

        DefaultTableModel model = (DefaultTableModel) AutoresConMasLibrosConsultaTable.getModel();
        model.setRowCount(0);

        for (Object[] row : dataRows) {
            model.addRow(row);
        }
    }//GEN-LAST:event_ConsultarAutoresMasLibrosButtonActionPerformed

    private void GerenteEditorialComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenteEditorialComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GerenteEditorialComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgEditorialComprarStandButton;
    private javax.swing.JButton AgregarAutorLibroButton;
    private javax.swing.JButton AgregarStandComprarButton;
    private javax.swing.JTextField ApellidoPersonaTextField;
    private javax.swing.JRadioButton AudioLibroRadioButton;
    private javax.swing.JComboBox<String> AutorConsultaComboBox;
    private javax.swing.JTable AutoresConMasLibrosConsultaTable;
    private javax.swing.JComboBox<String> AutoresLibroComboBox;
    private javax.swing.JTextArea AutoresLibroTextArea;
    private javax.swing.JButton ComprarStandButton;
    private javax.swing.JButton ConsultarAutorButton;
    private javax.swing.JButton ConsultarAutoresMasLibrosButton;
    private javax.swing.JButton ConsultarEditorialButton;
    private javax.swing.JButton ConsultarFormatoButton;
    private javax.swing.JButton ConsultarLibroButton;
    private javax.swing.JButton ConsultarPersonaButton;
    private javax.swing.JButton ConsultarStandButton;
    private javax.swing.JButton CrearAutorButton;
    private javax.swing.JButton CrearEditorialButton;
    private javax.swing.JButton CrearGerenteButton;
    private javax.swing.JButton CrearLibroButton;
    private javax.swing.JButton CrearNarradorButton;
    private javax.swing.JButton CrearStandButton;
    private javax.swing.JTextField DireccionEditorialTextField;
    private javax.swing.JTextField DuracionLibroTextField;
    private javax.swing.JComboBox<String> EditorialLibroComboBox;
    private javax.swing.JTextArea EditorialStandComprarTextArea;
    private javax.swing.JComboBox<String> EditorialesComprarStandComboBox;
    private javax.swing.JTextField EjemplaresLibroTextField;
    private javax.swing.JButton ElEditorialComprarStandButton;
    private javax.swing.JButton EliminarAutorLibroButton;
    private javax.swing.JButton EliminarStandComprarButton;
    private javax.swing.JComboBox<String> FormatoConsultaComboBox;
    private javax.swing.JComboBox<String> FormatoLibroComboBox;
    private javax.swing.JComboBox<String> GeneroLibroComboBox;
    private javax.swing.JComboBox<String> GerenteEditorialComboBox;
    private javax.swing.JTextField HipervinculoLibroTextField;
    private javax.swing.JTextField IDPersonaTextField;
    private javax.swing.JTextField IDStandTextField;
    private javax.swing.JComboBox<String> IDStandsComprarComboBox;
    private javax.swing.JTextField ISBNLibroTextField;
    private javax.swing.JTable LibroBuscarConsultaTable;
    private javax.swing.JRadioButton LibroDigitalRadioButton;
    private javax.swing.JRadioButton LibroImpresoRadioButton;
    private javax.swing.JComboBox<String> LibroSeleccionarComboBox;
    private javax.swing.JTable ListaEditorialesTable;
    private javax.swing.JTable ListaLibrosTable;
    private javax.swing.JTable ListaPersonasTable;
    private javax.swing.JTable ListaStandsTable;
    private javax.swing.JTextField NITEditorialTextField;
    private javax.swing.JComboBox<String> NarradorLibroComboBox;
    private javax.swing.JTextField NombreEditorialTextField;
    private javax.swing.JTextField NombrePersonaTextField;
    private javax.swing.JTabbedPane OpcionesTabbedPane;
    private javax.swing.JTextField PaginasLibroTextField;
    private javax.swing.JTextField PrecioStandTextField;
    private javax.swing.JTextArea StandComprarTextArea;
    private javax.swing.JTextField TituloLibroTextField;
    private javax.swing.JTextField ValorLibroTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}

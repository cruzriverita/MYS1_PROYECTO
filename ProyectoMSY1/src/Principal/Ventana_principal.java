package Principal;



import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logica.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rony
 */
public class Ventana_principal extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_principal
     */
     public  ImageIcon imagen;

  double factor = 1e5;
     //variables para calculos 
     double ac=0;
     double df=0;
     double vf=0;
     double tvelmax=0;
     double dvelmax=0;
     double trecorrido=0;
     static double x1,x2,x3,x4,x5,y1,y2,y3,y4,y5,v1,v2,v3,v4,v5;
     
     
     //probicional tiene que ser una lista
     Coloca_imagen nuevo;
     Coloca_imagen nuevo2;
     JLabel vista_datos;
     
     
    public Ventana_principal() {
        initComponents();
        
       /* creo el panel que se mira en el Jdialog donde se muestra el carro selecionado*/ 
       nuevo2 = new Coloca_imagen();
       nuevo2.setBounds(15,90,90,80);
       nuevo2.setVisible(true);
       jDialog1.add(nuevo2);
       
       /********** pone invisible los botones de eliminar*********/
        pone_invisible_eliminar();
    }
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        caracteristicas = new javax.swing.JLabel();
        caracteristicas1 = new javax.swing.JLabel();
        caracteristicas2 = new javax.swing.JLabel();
        caracteristicas3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        eliminar1 = new javax.swing.JButton();
        eliminar2 = new javax.swing.JButton();
        eliminar3 = new javax.swing.JButton();
        eliminar4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jDialog1.setTitle("Agregar Carro");
        jDialog1.setBackground(new java.awt.Color(255, 204, 51));
        jDialog1.setLocationByPlatform(true);
        jDialog1.setResizable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lambor veneno", "Mclaren Spider", "Volkswagen scirocco", "Ford Mustang" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Seleccionar tipo de carro ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Distancia arrecorrer");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "500", "800", "1000", "1200", "1500" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton4.setText("cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Caracteristicas");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("V_maxima");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("100 km/h en ");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("200 km/h en");

        caracteristicas.setBackground(new java.awt.Color(255, 255, 255));
        caracteristicas.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        caracteristicas.setText("Caracteristicas");

        caracteristicas1.setBackground(new java.awt.Color(255, 255, 255));
        caracteristicas1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        caracteristicas1.setText("Caracteristicas");

        caracteristicas2.setBackground(new java.awt.Color(255, 255, 255));
        caracteristicas2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        caracteristicas2.setText("Caracteristicas");

        caracteristicas3.setBackground(new java.awt.Color(255, 255, 255));
        caracteristicas3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        caracteristicas3.setText("Caracteristicas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35)
                        .addComponent(caracteristicas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(caracteristicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(14, 14, 14)
                        .addComponent(caracteristicas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(caracteristicas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(caracteristicas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(caracteristicas1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(caracteristicas2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(caracteristicas3))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setText("Tipo de carro");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addGap(10, 10, 10)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jButton4)))
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jButton5))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        jDialog2.setBackground(new java.awt.Color(255, 204, 102));
        jDialog2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jDialog2WindowClosing(evt);
            }
        });

        jTable2.setBorder(new javax.swing.border.MatteBorder(null));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Automovil", "Aceleracion ", "Distancia en alcanzar los 200km/h", "Velocidad final alcanzada", "t en alcanzar Velocidad maxima", "Distancia donde alcanza la V. Max.", "t en completar Recorrido"
            }
        ));
        jTable2.setCellSelectionEnabled(true);
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setRowHeight(20);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable2.getColumnModel().getColumn(0).setResizable(false);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(50);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTable2.getColumnModel().getColumn(3).setResizable(false);
        jTable2.getColumnModel().getColumn(4).setResizable(false);
        jTable2.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTable2.getColumnModel().getColumn(5).setResizable(false);
        jTable2.getColumnModel().getColumn(5).setPreferredWidth(120);
        jTable2.getColumnModel().getColumn(6).setResizable(false);

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador_MRU");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(943, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(943, 550));

        eliminar1.setBackground(new java.awt.Color(255, 255, 255));
        eliminar1.setForeground(new java.awt.Color(255, 255, 255));
        eliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        eliminar1.setToolTipText("eliminar carro");
        eliminar1.setBorderPainted(false);
        eliminar1.setContentAreaFilled(false);
        eliminar1.setDefaultCapable(false);
        eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar1ActionPerformed(evt);
            }
        });

        eliminar2.setBackground(new java.awt.Color(255, 255, 255));
        eliminar2.setForeground(new java.awt.Color(255, 255, 255));
        eliminar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        eliminar2.setToolTipText("eliminar carro");
        eliminar2.setBorderPainted(false);
        eliminar2.setContentAreaFilled(false);
        eliminar2.setDefaultCapable(false);
        eliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar2ActionPerformed(evt);
            }
        });

        eliminar3.setForeground(new java.awt.Color(255, 255, 255));
        eliminar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        eliminar3.setToolTipText("eliminar carro");
        eliminar3.setBorderPainted(false);
        eliminar3.setContentAreaFilled(false);
        eliminar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eliminar3.setDefaultCapable(false);
        eliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar3ActionPerformed(evt);
            }
        });

        eliminar4.setForeground(new java.awt.Color(255, 255, 255));
        eliminar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        eliminar4.setToolTipText("eliminar carro");
        eliminar4.setBorderPainted(false);
        eliminar4.setContentAreaFilled(false);
        eliminar4.setDefaultCapable(false);
        eliminar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eliminar4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(eliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(899, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(eliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(eliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(eliminar4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/star.png"))); // NOI18N
        jButton1.setToolTipText("iniciar simulacion");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/stop.png"))); // NOI18N
        jButton2.setToolTipText("detener simulacion");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas_carro.png"))); // NOI18N
        jButton3.setToolTipText("agregar carro");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        jMenuItem3.setText("Nueva simulacion");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem6.setText("Salir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Simulacion");

        jMenuItem1.setText("Agregar Carro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem4.setText("ver estadistica");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      // boton que esta en la barra de herramientas
        // esto es lo mismo que el boton del dibujo del carro
       int cantidad=Datos_estaticos.Lista_simulacion.size();  // obrengo el tamaño de la lista
       if(cantidad <=3){  // verifico si ya hay 4 elemento sino entra   
       poner_datos(0); 
       jDialog1.setVisible(true);
       jDialog1.setSize(500,350);
       jDialog1.repaint();
        }
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        
          jDialog2.setBounds(100, 100, 1200, 300);
          jDialog2.show();
          jDialog2.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Boton para nueva simulacion 
        try{
        Datos_estaticos.Lista_simulacion.clear(); //limpio la lista para que no tenga ninigun elemeto
        this.dispose();
        Ventana_principal nuevo = new Ventana_principal();
        nuevo.setVisible(true);
        nuevo.setLocationRelativeTo(null);
        }
        catch(Exception e){  
              System.out.println(e);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // Boton salir
        System.exit(100);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ///Boton para iniciar la simulacion
     for(Iterator<Nodo_simulacion> ite = Datos_estaticos.Lista_simulacion.iterator(); ite.hasNext();){ // recorro la lista de  simulacion
            ite.next().iniciar_simulacion(); //inicio la simulacion de cada nodo en la lista         
     }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar3ActionPerformed
        // elimina el carro que esta en la posision 3
        jPanel1.removeAll(); //elimina todo lso elementos del panel
        elimina_carro(2); // ingreso el de la posicion de la lista que se va a eliminar (3 por que la lista enpieza en  0)
    }//GEN-LAST:event_eliminar3ActionPerformed

    private void eliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar2ActionPerformed
        // elimina el carro que esta en la posicion 2
        jPanel1.removeAll(); //elimina todo lso elementos del panel
        elimina_carro(1); // ingreso el de la posicion de la lista que se va a eliminar (3 por que la lista enpieza en  0)
    }//GEN-LAST:event_eliminar2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //boton que esta en el Jdialog ..  agregar
      int cantidad=Datos_estaticos.Lista_simulacion.size(); //obtengo el tamaño de la lista para ver que elemnto toca colocar
       pone_visible_eliminar(cantidad);// llamo la funcion para poner visible el boton elimnar , le mando el valor del que toca
       /****************** creoo el nuevo panel que va hacer la pista *************************************/
       nuevo = new Coloca_imagen();
       nuevo.setBounds(40,40+(130*cantidad),900,85);
       nuevo.setVisible(true);
       
       /**************************************************************************************************************/
       vista_datos = new JLabel();
       vista_datos.setFont(new java.awt.Font("Tahoma", 3, 12));
       vista_datos.setText(caracteristicas.getText());
       vista_datos.setBounds(70,20+(130*cantidad),200,20);
       vista_datos.setVisible(true);
       
       // creo el nuevo elemento para la lista del simulaciones ***********/
       Nodo_simulacion uno = new Nodo_simulacion(imagen,nuevo,vista_datos,Datos_estaticos.distancia/2,Integer.valueOf(caracteristicas1.getText()),10,10); 
       nuevo.pone_imagen(uno.obten_imagen().getImage()); // agrego la imagen del carro  que fue selecionado
       Datos_estaticos.Lista_simulacion.add(uno); //agrego el nodo de la simulacion a la lista de simulaicion
       this.jPanel1.add(nuevo); // agrego el panel pista al panel principal
       this.jPanel1.add( vista_datos);
       this.jPanel1.repaint(); // repinto el panel principanl
       
       jDialog1.setVisible(false); // pongo invisible el Jdialog por que ya termino la accion de agregar
        this.calculos();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // boton que cancela la creacion de un nuevo carro
        jDialog1.setVisible(false);  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //Acion cuando se elije carro
        poner_datos(jComboBox1.getSelectedIndex());  //solo llamo la funcion cada ves que alguie elige un elemento nuevo en el comboBox de los carros
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // selecina distancia
         switch(jComboBox1.getSelectedIndex()){ // segun sea la selccion en el comboBox de distancia,seteo el valor ala variable distancia
             case 0: Datos_estaticos.distancia = 500;
                 break;
             case 1: Datos_estaticos.distancia =800;
                 break;
             case 2: Datos_estaticos.distancia = 1000;
                 break;
              case 3: Datos_estaticos.distancia = 1200;
                 break; 
             case 4: Datos_estaticos.distancia = 1500;
                break;
             default:
                 
         }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // accion para el boton agregar carro  que esta en el dibujo
       int cantidad=Datos_estaticos.Lista_simulacion.size();  // obtengo el ramaño de la lista
       if(cantidad <=3){  //verifico si ya hay 4 elementos  si hay menos entro al if
       jComboBox1.setSelectedIndex(0);
       jComboBox2.setSelectedIndex(0);
       Datos_estaticos.distancia = 500;
       poner_datos(0);   //se ponen los datos del carro lambo que va ser el que va estar por default selecionado
       jDialog1.setVisible(true);
       jDialog1.setSize(500,350);
       jDialog1.repaint();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar1ActionPerformed
        //elimina el carro en posicion 1
        jPanel1.removeAll(); //elimina todo lso elementos del panel
        elimina_carro(0);
    }//GEN-LAST:event_eliminar1ActionPerformed

    private void eliminar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar4ActionPerformed
        // elimina el carro en la posicion 4
        jPanel1.removeAll(); //elimina todo lso elementos del panel
        elimina_carro(3);  // ingreso el de la posicion de la lista que se va a eliminar (3 por que la lista enpieza en  0)
    }//GEN-LAST:event_eliminar4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // acction del boton stop
      for(Iterator<Nodo_simulacion> ite = Datos_estaticos.Lista_simulacion.iterator(); ite.hasNext();){ // recorro la lista de  simulacion
      ite.next().obten_hilo().detener_hilo(); //para la simulacion de cada nodo en la lista         
     }  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jDialog2WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog2WindowClosing
        // TODO add your handling code here:
        this.limpiarTabla(jTable2);
    
    }//GEN-LAST:event_jDialog2WindowClosing

   
    
    public void limpiarTabla(JTable tabla){
        try {
            DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
            int filas=tabla.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
    
/***************************** funcion para eliminar un carro y reposicionar los restantes *********************/
    public void elimina_carro(int  posicion){
       pone_invisible_eliminar(); //pongo todo los botones eliminar invisibles para reajustar los elementos que no son removidos
       int numero=0; // sirve para ver en que nueva  posicion van a quedar 
       Datos_estaticos.Lista_simulacion.remove(posicion); // elimino el nodo del carro que se solicito
       
     for(Iterator<Nodo_simulacion> ite = Datos_estaticos.Lista_simulacion.iterator(); ite.hasNext();){ // recorro al lista para ver cules quedan
             Nodo_simulacion cambiar = ite.next();
            nuevo = cambiar.obten_pista();     // obtengo el nodo del recorrido
            nuevo.setBounds(40,40+(130*numero),900,85); // le doy una nueva ubicacion
            vista_datos = cambiar.obten_etiq();
            vista_datos.setBounds(70,20+(130*numero),200,20);
            pone_visible_eliminar(numero); // llamo la funcion para poner el boton eleminar en modo visible
            numero+=1;  // sumo una para saver que ya dibuje uno
            jPanel1.add(vista_datos);
            jPanel1.add(nuevo); // vuelvo agregar la pisa 
     }
     
     /******** *** vuelvo a agregar todos los botones de eliminar .. ya que con removeall- se habian quitado** ***************************/
     jPanel1.add(eliminar1);
     jPanel1.add(eliminar2);
     jPanel1.add(eliminar3);
     jPanel1.add(eliminar4);
     jPanel1.repaint();
     
    }
    
    
   //********* funcion para poner  visible el boton eliminar segun sea la posicion que se este agregando *********************/
    public void pone_visible_eliminar(int cantidad){
        /// aca solo pongo visible el boton eliminar  segun sea la posiscion solisitada
        switch(cantidad){
            case 0: 
                 eliminar1.setVisible(true);
                break;
                case 1: 
                 eliminar2.setVisible(true);
                break;
                    case 2: 
                 eliminar3.setVisible(true);
                break;
                        case 3: 
                 eliminar4.setVisible(true);
                break;
        }
  
    }
    
    
    //************************** funcion para poner invisible todos los botones de eliminar.**************************************/
    public void pone_invisible_eliminar(){
        eliminar1.setVisible(false);
        eliminar2.setVisible(false);
        eliminar3.setVisible(false);
        eliminar4.setVisible(false);
    }
    
    
    //***************funcion para cambar los datos cuando elejan el las lista desplegable. ******************/
   //4 opciones diferentes
    public void poner_datos(int index){
            /*esta funcion solo setea los valores predeterminados de cada carro, segun sea el numero de peticion el cual es como estan en
           el comboBox si son setiado a las label que estan en el JDialog.*/
        switch(index){
            case 0:
                this.caracteristicas.setText(Datos_estaticos.L_nombre);
                this.caracteristicas1.setText(String.valueOf(Datos_estaticos.L_Velocidad_max));
                this.caracteristicas2.setText(String.valueOf(Datos_estaticos.L_aceleracion));
                this.caracteristicas3.setText(String.valueOf(Datos_estaticos.L_aceleracion2));
                imagen = new ImageIcon(Datos_estaticos.L_imagen);
                nuevo2.pone_imagen(imagen.getImage());
                break;
            case 1:
                this.caracteristicas.setText(Datos_estaticos.M_nombre);
                this.caracteristicas1.setText(String.valueOf(Datos_estaticos.M_Velocidad_max));
                this.caracteristicas2.setText(String.valueOf(Datos_estaticos.M_aceleracion));
                this.caracteristicas3.setText(String.valueOf(Datos_estaticos.M_aceleracion2));
                imagen = new ImageIcon(Datos_estaticos.M_imagen);
                nuevo2.pone_imagen(imagen.getImage());
                break;
            case 2:
                this.caracteristicas.setText(Datos_estaticos.Vw_nombre);
                this.caracteristicas1.setText(String.valueOf(Datos_estaticos.Vw_Velocidad_max));
                this.caracteristicas2.setText(String.valueOf(Datos_estaticos.Vw_aceleracion));
                this.caracteristicas3.setText(String.valueOf(Datos_estaticos.Vw_aceleracion2));
                imagen = new ImageIcon(Datos_estaticos.Vw_imagen);
                nuevo2.pone_imagen(imagen.getImage());
                break;
            case 3:
               this.caracteristicas.setText(Datos_estaticos.F_nombre);
                this.caracteristicas1.setText(String.valueOf(Datos_estaticos.F_Velocidad_max));
                this.caracteristicas2.setText(String.valueOf(Datos_estaticos.F_aceleracion));
                this.caracteristicas3.setText(String.valueOf(Datos_estaticos.F_aceleracion2));
                imagen = new ImageIcon(Datos_estaticos.F_imagen);
                nuevo2.pone_imagen(imagen.getImage());
                break;
            default:
                break; 
        }       
    
    
    }
    
    public void calculos (){
     //Agregar modelo a la tabla de resultados 
      DefaultTableModel modelo1=(DefaultTableModel) jTable2.getModel();
     
        
        //DECISION SOBRE QUE DATOS MOSTRAR
      
      //********************************lamborginhi************************************** 
       if (jComboBox1.getSelectedItem().equals("Lambor veneno")) {
       //CALCULOS
       //aceleracion constante
       this.ac=(200*1000)/(3600*Datos_estaticos.L_aceleracion2);
       //distancia en alcanzar 200km/h
       this.df = (ac*(Datos_estaticos.L_aceleracion2)*(Datos_estaticos.L_aceleracion2))/2;
       //velocidad final alcanzada por el auto
       this.vf= Math.sqrt(2*ac*Integer.parseInt(jComboBox2.getSelectedItem().toString()));
       
       //SE evalua si el auto alcanza su velocidad maxima, si el valor de vf es mayor al dato tecnico
       //de velocidad maxima del auto se coloca tal valor.
       // si vf > 355 km/h
       if (vf>(Datos_estaticos.L_Velocidad_max*1000/3600)){
           vf=Datos_estaticos.L_Velocidad_max*1000/3600;
       }
       
       //tiempo en que el auto alcanza su velocidad maxima
       this.tvelmax = vf/ac;
       this.dvelmax = (Datos_estaticos.L_Velocidad_max*1000/3600)*tvelmax/2;
       
       /*sino alcanza la velocidad maxima antes de terminar de recorrer toda la pista entonces 
        * el tiempo en alcanzar la velocidad maxima y la distancia en alcanzar la velocidad 
        * maxima no pueden ser calculados y por lo tanto se les asigna un cero.
        */
       if (dvelmax>Integer.parseInt(jComboBox2.getSelectedItem().toString())){
       tvelmax =0;
       dvelmax=0;
       }
       this.trecorrido = Math.sqrt((2*Integer.parseInt(jComboBox2.getSelectedItem().toString()))/ac);
       
       //redondeo de todos los calculos a 5 decimales.
       ac = Math.round(ac * factor) / factor;
       df = Math.round(df * factor) / factor;
       vf = Math.round(vf * factor) / factor;
       tvelmax = Math.round(tvelmax * factor) / factor;
       dvelmax = Math.round(dvelmax * factor) / factor;
       trecorrido = Math.round(trecorrido * factor) / factor;
       
       //se agrega la fila a la tabla
       modelo1.addRow(new Object[]{"Lamborghini",ac+" m/s^2",df+" m",vf+" m/s",tvelmax+" s",dvelmax+" m",trecorrido+" s"});
       
       
       //********************************GRAFICAR****************************************************
    
       //**************************GRAFICA DE DESPLAZAMIENTO****************************************
       //coordenadas tiempo eje x
       x1=trecorrido/5;
       x2=x1+x1;
       x3=x2+x1;
       x4=x3+x1;
       x5=x4+x1;
       
       //coordenadas desplazamiento eje y
       y1 = Integer.parseInt(jComboBox2.getSelectedItem().toString())/5;
       y2=y1+y1;
       y3=y2+y1;
       y4=y3+y1;
       y5=y4+y1;
       Graficar.graph(x1,x2,x3,x4,x5,y1,y2,y3,y4,y5,"Desplazamiento_Lamborginhi");
      
       //**************************GRAFICA DE VELOCIDAD*********************************
       //coordenadas velocidad eje y
      
       
       
       }
    
       //**********************Vokswagen*********************************//
       
       else if (jComboBox1.getSelectedItem().equals("Volkswagen scirocco")) {
       //CALCULOS
       //aceleracion constante
       this.ac=(200*1000)/(3600*Datos_estaticos.Vw_aceleracion2);
       //distancia en alcanzar 200km/h
       this.df = (ac*(Datos_estaticos.Vw_aceleracion2)*(Datos_estaticos.Vw_aceleracion2))/2;
       //velocidad final alcanzada por el auto
       this.vf= Math.sqrt(2*ac*Integer.parseInt(jComboBox2.getSelectedItem().toString()));
       
       //SE evalua si el auto alcanza su velocidad maxima, si el valor de vf es mayor al dato tecnico
       //de velocidad maxima del auto se coloca tal valor.
       // si vf > 355 km/h
       if (vf>(Datos_estaticos.Vw_Velocidad_max*1000/3600)){
           vf=Datos_estaticos.Vw_Velocidad_max*1000/3600;
       }
       
       //tiempo en que el auto alcanza su velocidad maxima
       this.tvelmax = vf/ac;
       this.dvelmax = (Datos_estaticos.Vw_Velocidad_max*1000/3600)*tvelmax/2;
       
       /*sino alcanza la velocidad maxima antes de terminar de recorrer toda la pista entonces 
        * el tiempo en alcanzar la velocidad maxima y la distancia en alcanzar la velocidad 
        * maxima no pueden ser calculados y por lo tanto se les asigna un cero.
        */
       if (dvelmax>Integer.parseInt(jComboBox2.getSelectedItem().toString())){
       tvelmax =0;
       dvelmax=0;
       }
       this.trecorrido = Math.sqrt((2*Integer.parseInt(jComboBox2.getSelectedItem().toString()))/ac);
       
       //redondeo de todos los calculos a 5 decimales.
       ac = Math.round(ac * factor) / factor;
       df = Math.round(df * factor) / factor;
       vf = Math.round(vf * factor) / factor;
       tvelmax = Math.round(tvelmax * factor) / factor;
       dvelmax = Math.round(dvelmax * factor) / factor;
       trecorrido = Math.round(trecorrido * factor) / factor;
       
       //se agrega la fila a la tabla
       modelo1.addRow(new Object[]{"Volkswagen",ac+" m/s^2",df+" m",vf+" m/s",tvelmax+" s",dvelmax+" m",trecorrido+" s"});
       }
    
       //***********************************************MCLAREN**************************************************
       
        else if (jComboBox1.getSelectedItem().equals("Mclaren Spider")) {
       //CALCULOS
       //aceleracion constante
       this.ac=(200*1000)/(3600*Datos_estaticos.M_aceleracion2);
       //distancia en alcanzar 200km/h
       this.df = (ac*(Datos_estaticos.M_aceleracion2)*(Datos_estaticos.M_aceleracion2))/2;
       //velocidad final alcanzada por el auto
       this.vf= Math.sqrt(2*ac*Integer.parseInt(jComboBox2.getSelectedItem().toString()));
       
       //SE evalua si el auto alcanza su velocidad maxima, si el valor de vf es mayor al dato tecnico
       //de velocidad maxima del auto se coloca tal valor.
       // si vf > 355 km/h
       if (vf>(Datos_estaticos.M_Velocidad_max*1000/3600)){
           vf=Datos_estaticos.M_Velocidad_max*1000/3600;
       }
       
       //tiempo en que el auto alcanza su velocidad maxima
       this.tvelmax = vf/ac;
       this.dvelmax = (Datos_estaticos.M_Velocidad_max*1000/3600)*tvelmax/2;
       
       /*sino alcanza la velocidad maxima antes de terminar de recorrer toda la pista entonces 
        * el tiempo en alcanzar la velocidad maxima y la distancia en alcanzar la velocidad 
        * maxima no pueden ser calculados y por lo tanto se les asigna un cero.
        */
       if (dvelmax>Integer.parseInt(jComboBox2.getSelectedItem().toString())){
       tvelmax =0;
       dvelmax=0;
       }
       this.trecorrido = Math.sqrt((2*Integer.parseInt(jComboBox2.getSelectedItem().toString()))/ac);
       
       //redondeo de todos los calculos a 5 decimales.
       ac = Math.round(ac * factor) / factor;
       df = Math.round(df * factor) / factor;
       vf = Math.round(vf * factor) / factor;
       tvelmax = Math.round(tvelmax * factor) / factor;
       dvelmax = Math.round(dvelmax * factor) / factor;
       trecorrido = Math.round(trecorrido * factor) / factor;
       
       //se agrega la fila a la tabla
       modelo1.addRow(new Object[]{"McLaren",ac+" m/s^2",df+" m",vf+" m/s",tvelmax+" s",dvelmax+" m",trecorrido+" s"});
       }
       
       //***********************************************FORD MUSTANG****************************************
       
         else if (jComboBox1.getSelectedItem().equals("Ford Mustang")) {
       //CALCULOS
       //aceleracion constante
       this.ac=(200*1000)/(3600*Datos_estaticos.F_aceleracion2);
       //distancia en alcanzar 200km/h
       this.df = (ac*(Datos_estaticos.F_aceleracion2)*(Datos_estaticos.F_aceleracion2))/2;
       //velocidad final alcanzada por el auto
       this.vf= Math.sqrt(2*ac*Integer.parseInt(jComboBox2.getSelectedItem().toString()));
       
       //SE evalua si el auto alcanza su velocidad maxima, si el valor de vf es mayor al dato tecnico
       //de velocidad maxima del auto se coloca tal valor.
       // si vf > 355 km/h
       if (vf>(Datos_estaticos.F_Velocidad_max*1000/3600)){
           vf=Datos_estaticos.F_Velocidad_max*1000/3600;
       }
       
       //tiempo en que el auto alcanza su velocidad maxima
       this.tvelmax = vf/ac;
       this.dvelmax = (Datos_estaticos.F_Velocidad_max*1000/3600)*tvelmax/2;
       
       /*sino alcanza la velocidad maxima antes de terminar de recorrer toda la pista entonces 
        * el tiempo en alcanzar la velocidad maxima y la distancia en alcanzar la velocidad 
        * maxima no pueden ser calculados y por lo tanto se les asigna un cero.
        */
       if (dvelmax>Integer.parseInt(jComboBox2.getSelectedItem().toString())){
       tvelmax =0;
       dvelmax=0;
       }
       this.trecorrido = Math.sqrt((2*Integer.parseInt(jComboBox2.getSelectedItem().toString()))/ac);
       
       //redondeo de todos los calculos a 5 decimales.
       ac = Math.round(ac * factor) / factor;
       df = Math.round(df * factor) / factor;
       vf = Math.round(vf * factor) / factor;
       tvelmax = Math.round(tvelmax * factor) / factor;
       dvelmax = Math.round(dvelmax * factor) / factor;
       trecorrido = Math.round(trecorrido * factor) / factor;
       
       //se agrega la fila a la tabla
       modelo1.addRow(new Object[]{"Ford",ac+" m/s^2",df+" m",vf+" m/s",tvelmax+" s",dvelmax+" m",trecorrido+" s"});
       }
    
    }
    
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
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        Ventana_principal nuevo = new Ventana_principal();
        nuevo.setVisible(true);
        nuevo.setLocationRelativeTo(null);
      
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caracteristicas;
    private javax.swing.JLabel caracteristicas1;
    private javax.swing.JLabel caracteristicas2;
    private javax.swing.JLabel caracteristicas3;
    private static javax.swing.JButton eliminar1;
    private static javax.swing.JButton eliminar2;
    private static javax.swing.JButton eliminar3;
    private static javax.swing.JButton eliminar4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

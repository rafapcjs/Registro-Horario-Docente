package Vista_Profe;

public class Vista_final extends javax.swing.JFrame {

    public Vista_final() {
        initComponents();
        this.setLocationRelativeTo(null);
           this.setTitle("Registro Horario");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Mostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        edad1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        MenuRegistro = new javax.swing.JMenuItem();
        MenuMateria = new javax.swing.JMenuItem();
        MenuInicio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 380));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setForeground(new java.awt.Color(153, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 700, 180));

        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        jPanel2.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 50));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sexo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 100, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 100, 50));

        edad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 190));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Semestre");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 100, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Horario");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 100, 50));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salon");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 100, 50));

        edad1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(edad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 310, 190));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        jMenu3.setText("Clases");

        MenuRegistro.setText("Registro");
        MenuRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistroActionPerformed(evt);
            }
        });
        jMenu3.add(MenuRegistro);

        MenuMateria.setText("Materia");
        MenuMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMateriaActionPerformed(evt);
            }
        });
        jMenu3.add(MenuMateria);

        MenuInicio.setText("Inicio");
        MenuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuInicioActionPerformed(evt);
            }
        });
        jMenu3.add(MenuInicio);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistroActionPerformed
        Vista_Registro ventanaRegistro = new Vista_Registro();
        ventanaRegistro.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuRegistroActionPerformed

    private void MenuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuInicioActionPerformed
        Vista_inicio ventanaInicio = new Vista_inicio();
        ventanaInicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuInicioActionPerformed

    private void MenuMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMateriaActionPerformed
        Vista_Materia ventanaMateria = new Vista_Materia();
        ventanaMateria.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuMateriaActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        

    }//GEN-LAST:event_MostrarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuInicio;
    private javax.swing.JMenuItem MenuMateria;
    private javax.swing.JMenuItem MenuRegistro;
    private javax.swing.JButton Mostrar;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel edad1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

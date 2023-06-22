package Vista_Profe;

import Clases.Estudiante;
import Clases.ListaEstudiantes;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vista_Materia extends javax.swing.JFrame {

    ListaEstudiantes estudiantes;
    DefaultTableModel tablaResultados;
    Estudiante instancia= new Estudiante();
    int pos;

    String fecha;
    public Vista_Materia() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registro de Materias");
        estudiantes = new ListaEstudiantes(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño del array:")));
        tablaResultados = (DefaultTableModel) Tabla_Estudiantes.getModel();
        tablaResultados.setRowCount(this.estudiantes.getTam());
        pos = 0;
    }

    public void mostrar() {
        Estudiante listado[] = estudiantes.getListDatos();
        int x = 0;
        for (int i = 0; i < pos; i++) {

            Tabla_Estudiantes.setValueAt(listado[i].getId_Materia(), x, 0);
            Tabla_Estudiantes.setValueAt(listado[i].getId_Horario(), x, 1);
            Tabla_Estudiantes.setValueAt(listado[i].getMateria(), x, 2);
            Tabla_Estudiantes.setValueAt(listado[i].getCalendario(), x, 3);
            Tabla_Estudiantes.setValueAt(listado[i].getSemestre(), x, 4);
            Tabla_Estudiantes.setValueAt(listado[i].getSalon(), x, 5);
            Tabla_Estudiantes.setValueAt(listado[i].getHora(), x, 6);
            Tabla_Estudiantes.setValueAt(listado[i].getFecha(), x, 7);

            x++;

            limpiar();

        }
    }

    public void limpiar() {
        txt_IdMateria.setText("");
        txt_IdHorario.setText("");
        cmb_Calendario.setSelectedIndex(0);
        cmb_Materia.setSelectedIndex(0);
        cmb_Semestre.setSelectedIndex(0);
        cmb_Salon.setSelectedIndex(0);
        cmb_Salon.setSelectedIndex(0);
        cmb_Hora.setSelectedIndex(0);
        Date_Fecha.setDate(null);
      

    }

    public void verificar() {

        if (cmb_Salon.getSelectedItem().toString().equals("101")) {

            cmb_Hora.removeAllItems();
            cmb_Hora.addItem("7:00 a 9:00");
            cmb_Hora.addItem("8:00 a 10:00");
            cmb_Hora.addItem("9:00 a 11:00");

        }

        if (cmb_Salon.getSelectedItem().toString().equals("102")) {

            cmb_Hora.removeAllItems();
            cmb_Hora.addItem("8:00 a 9:00");
            cmb_Hora.addItem("9:00 a 11:00");
            cmb_Hora.addItem("11:00 a 12:00");

        }
        if (cmb_Salon.getSelectedItem().toString().equals("103")) {

            cmb_Hora.removeAllItems();
            cmb_Hora.addItem("6:00 a 9:00");
            cmb_Hora.addItem("9:00 a 10:00");
            cmb_Hora.addItem("4:00 a 5:00");
        }
    }

//    public void busqueda_avanzada(int dato) {
//
//        for (int i = 0; i < estudiantes.getTam(); i++) {
//            if (dato == estudiantes.obtenerEstudiante(i).getId_Materia()) {
//                JOptionPane.showMessageDialog(null, "se encontró");
//            } else {
//                JOptionPane.showMessageDialog(null, "No se encontró");
//            }
//        }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fon = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Panel = new javax.swing.JPanel();
        txt_IdMateria = new javax.swing.JTextField();
        txt_IdHorario = new javax.swing.JTextField();
        cmb_Calendario = new javax.swing.JComboBox<>();
        cmb_Materia = new javax.swing.JComboBox<>();
        cmb_Semestre = new javax.swing.JComboBox<>();
        Guardar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Estudiantes = new javax.swing.JTable();
        txt_Buscado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmb_Salon = new javax.swing.JComboBox<>();
        Bordes2 = new javax.swing.JLabel();
        cmb_Hora = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Date_Fecha = new com.toedter.calendar.JDateChooser();
        Bordes3 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuRegistro = new javax.swing.JMenuItem();
        MenuFinal = new javax.swing.JMenuItem();
        MenuInicio = new javax.swing.JMenuItem();

        fon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/JR (3) (1).png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(153, 0, 0));
        Panel.setForeground(new java.awt.Color(231, 26, 0));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_IdMateria.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Panel.add(txt_IdMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 100, 20));

        txt_IdHorario.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Panel.add(txt_IdHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 100, 20));

        cmb_Calendario.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cmb_Calendario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "2023_1", "2023_2" }));
        Panel.add(cmb_Calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 120, -1));

        cmb_Materia.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cmb_Materia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Calculo", "Progamación", "Fisica", "Estadistica", "Base de datos" }));
        Panel.add(cmb_Materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 120, -1));

        cmb_Semestre.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cmb_Semestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Semestre 1", "Semestre 2" }));
        Panel.add(cmb_Semestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 120, -1));

        Guardar.setText("Registrar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        Panel.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        Buscar.setText("Busqueda");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        Panel.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Calendario");
        Panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 80, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id Materia");
        Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 100, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Materia");
        Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 100, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Semestre");
        Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id Horario");
        Panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 100, 50));

        Tabla_Estudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Materia", "Id Horario", "Materia", "Semestre", "Calendario", "Salon", "Hora", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(Tabla_Estudiantes);

        Panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 720, 130));
        Panel.add(txt_Buscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 90, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Horas");
        Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        cmb_Salon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "101", "102", "103" }));
        cmb_Salon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_SalonActionPerformed(evt);
            }
        });
        Panel.add(cmb_Salon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 110, -1));

        Bordes2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Datos Profesionles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        Panel.add(Bordes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 250, 110));

        cmb_Hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        Panel.add(cmb_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 120, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Salones");
        Panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));
        Panel.add(Date_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 110, -1));

        Bordes3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Datos Profesionles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        Panel.add(Bordes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 400, 300));

        jMenu1.setText("Clases");

        MenuRegistro.setText("Registro");
        MenuRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(MenuRegistro);

        MenuFinal.setText("Final");
        MenuFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFinalActionPerformed(evt);
            }
        });
        jMenu1.add(MenuFinal);

        MenuInicio.setText("Inicio");
        MenuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuInicioActionPerformed(evt);
            }
        });
        jMenu1.add(MenuInicio);

        MenuBar.add(jMenu1);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistroActionPerformed
        Vista_Registro ventanaRegistro = new Vista_Registro();
        ventanaRegistro.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuRegistroActionPerformed

    private void MenuFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFinalActionPerformed
        Vista_final ventaFinal = new Vista_final();
        ventaFinal.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuFinalActionPerformed

    private void MenuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuInicioActionPerformed
        Vista_inicio ventanaInicio = new Vista_inicio();
        ventanaInicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuInicioActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

        SimpleDateFormat date= new SimpleDateFormat("dd-MM-yyyy");
       instancia.setFecha(date.format(Date_Fecha.getDate()));
        Estudiante nuevo = new Estudiante(Integer.parseInt(txt_IdMateria.getText()), Integer.parseInt(txt_IdHorario.getText()), cmb_Materia.getSelectedItem().toString(), cmb_Semestre.getSelectedItem().toString(), cmb_Calendario.getSelectedItem().toString(), cmb_Salon.getSelectedItem().toString(), cmb_Hora.getSelectedItem().toString(),instancia.getFecha());
        estudiantes.obtenerEstudiante(pos, nuevo);

        pos++;

        if (pos >= estudiantes.getTam()) {
            Guardar.setEnabled(false);
        }

      
        
        mostrar();
        limpiar();
    }//GEN-LAST:event_GuardarActionPerformed


    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        estudiantes.busqueda_avanzada(Integer.parseInt(txt_Buscado.getText()));
    }//GEN-LAST:event_BuscarActionPerformed

    private void cmb_SalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_SalonActionPerformed
        verificar();
    }//GEN-LAST:event_cmb_SalonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bordes2;
    private javax.swing.JLabel Bordes3;
    private javax.swing.JButton Buscar;
    private com.toedter.calendar.JDateChooser Date_Fecha;
    private javax.swing.JButton Guardar;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem MenuFinal;
    private javax.swing.JMenuItem MenuInicio;
    private javax.swing.JMenuItem MenuRegistro;
    private javax.swing.JPanel Panel;
    private javax.swing.JTable Tabla_Estudiantes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_Calendario;
    private javax.swing.JComboBox<String> cmb_Hora;
    private javax.swing.JComboBox<String> cmb_Materia;
    private javax.swing.JComboBox<String> cmb_Salon;
    private javax.swing.JComboBox<String> cmb_Semestre;
    private javax.swing.JLabel fon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_Buscado;
    private javax.swing.JTextField txt_IdHorario;
    private javax.swing.JTextField txt_IdMateria;
    // End of variables declaration//GEN-END:variables
}

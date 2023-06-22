package Vista_Profe;

import Clases.Profesores;
import javax.swing.table.DefaultTableModel;
import Clases.ListaProfesores;
import javax.swing.JOptionPane;

public class Vista_Registro extends javax.swing.JFrame {

    ListaProfesores profesores;
    DefaultTableModel tablaResultados;
    int pos;

    public Vista_Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registro de profesores");
        profesores = new ListaProfesores(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño del array:")));
        tablaResultados = (DefaultTableModel) tabla_Materias.getModel();
        tablaResultados.setRowCount(profesores.getTam());
        pos = 0;
    }

    public void mostrar() {
        Profesores listado[] = profesores.getListDatos();
        int x = 0;
        for (int i = 0; i < pos; i++) {

            tabla_Materias.setValueAt(listado[i].getId(), x, 0);
            tabla_Materias.setValueAt(listado[i].getNombre(), x, 1);
            tabla_Materias.setValueAt(listado[i].getSexo(), x, 2);
            tabla_Materias.setValueAt(listado[i].getEdad(), x, 3);
            tabla_Materias.setValueAt(listado[i].getCurso(), x, 4);
            tabla_Materias.setValueAt(listado[i].getTitulo(), x, 5);
            x++;
            limpiar();
        }
    }

    public void limpiar() {
        txt_Id.setText("");
        txt_Nombre.setText("");
        spn_Edad.setValue(0);
        cmb_Sexo.setSelectedIndex(0);
        cmb_Curso.setSelectedIndex(0);
        cmb_Titulo.setSelectedIndex(0);
    }

//    public void busqueda_avanzada(int dato) {
//
//        for (int i = 0; i < profesores.getTam(); i++) {
//            if (dato == profesores.obtenerEstudiante(i).getId()) {
//                JOptionPane.showMessageDialog(null, "se encontró");
//            } else {
//                JOptionPane.showMessageDialog(null, "No se encontró");
//            }
//        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoSexo = new javax.swing.ButtonGroup();
        fon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmb_Curso = new javax.swing.JComboBox<>();
        txt_Id = new javax.swing.JTextField();
        edad = new javax.swing.JLabel();
        cmb_Sexo = new javax.swing.JComboBox<>();
        cmb_Titulo = new javax.swing.JComboBox<>();
        Buscar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Bordes2 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_Materias = new javax.swing.JTable();
        Bordes1 = new javax.swing.JLabel();
        txt_Buscado = new javax.swing.JTextField();
        spn_Edad = new javax.swing.JSpinner();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuMateria = new javax.swing.JMenuItem();
        MenuFinal = new javax.swing.JMenuItem();
        MenuInicio = new javax.swing.JMenuItem();

        fon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        fon.setForeground(new java.awt.Color(255, 255, 255));
        fon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/JR (3) (1).png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setForeground(new java.awt.Color(231, 26, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id Profesor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 100, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 50));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sexo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 100, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 100, 50));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Curso");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 100, 50));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Titulo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 100, 50));

        cmb_Curso.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmb_Curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "A1", "A2", "A3", "A4", "A5" }));
        jPanel1.add(cmb_Curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 130, 30));
        jPanel1.add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 100, 30));

        edad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 190));

        cmb_Sexo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmb_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        jPanel1.add(cmb_Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 130, 30));

        cmb_Titulo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmb_Titulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ingeniero de Sistemas", "Fisico", "Lic Ingles", "Lic Matematico", "" }));
        jPanel1.add(cmb_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 140, 30));

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        Guardar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Guardar.setText("Registrar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 120, 40));

        Bordes2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Datos Profesionles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(Bordes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 250, 110));
        jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 100, 30));
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        tabla_Materias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "sexo", "Edad", "Curso", "Título"
            }
        ));
        jScrollPane3.setViewportView(tabla_Materias);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 760, 120));

        Bordes1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Datos Profesionles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(Bordes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 310, 200));
        jPanel1.add(txt_Buscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 100, 30));

        spn_Edad.setModel(new javax.swing.SpinnerNumberModel());
        jPanel1.add(spn_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 510));

        jMenu1.setText("Clases");

        MenuMateria.setText("Materia");
        MenuMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMateriaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuMateria);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMateriaActionPerformed
        Vista_Materia ventanaMateria = new Vista_Materia();
        ventanaMateria.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuMateriaActionPerformed

    private void MenuFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFinalActionPerformed
        Vista_final ventanaFinal = new Vista_final();
        ventanaFinal.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuFinalActionPerformed

    private void MenuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuInicioActionPerformed
        Vista_inicio ventanaInicio = new Vista_inicio();
        ventanaInicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuInicioActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

        Profesores nuevo = new Profesores(Integer.parseInt(txt_Id.getText()),txt_Nombre.getText(),cmb_Sexo.getSelectedItem().toString(),Integer.parseInt(spn_Edad.getValue().toString()),cmb_Curso.getSelectedItem().toString(),cmb_Titulo.getSelectedItem().toString());

        profesores.obtenerprofesores(pos, nuevo);
        pos++;

        if (pos >= profesores.getTam()) {
            Guardar.setEnabled(false);
        }

        mostrar();
        limpiar();

    }//GEN-LAST:event_GuardarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        
   
profesores.busqueda_avanzada(Integer.parseInt(txt_Buscado.getText()));

       
    }//GEN-LAST:event_BuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bordes1;
    private javax.swing.JLabel Bordes2;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Guardar;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem MenuFinal;
    private javax.swing.JMenuItem MenuInicio;
    private javax.swing.JMenuItem MenuMateria;
    private javax.swing.ButtonGroup TipoSexo;
    private javax.swing.JComboBox<String> cmb_Curso;
    private javax.swing.JComboBox<String> cmb_Sexo;
    private javax.swing.JComboBox<String> cmb_Titulo;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel fon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spn_Edad;
    private javax.swing.JTable tabla_Materias;
    private javax.swing.JTextField txt_Buscado;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}

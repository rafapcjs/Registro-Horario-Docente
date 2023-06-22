
package Clases;

import javax.swing.JOptionPane;

public class ListaEstudiantes {
    
    Estudiante listaDatos[];
    int tam;
    
    public ListaEstudiantes(int tam) {
        generar(tam);
    }
    public Estudiante[] getListDatos() {
        return listaDatos;
    }
    public int getTam() {
        return tam;
    }
    
    public void generar(int tam) {
        if (tam <= 0) {
            generar(Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de estudiantes")));
        }
        else {
            this.tam = tam;
            listaDatos = new Estudiante[tam];
        }
    }
    
    public void obtenerEstudiante(int pos, Estudiante datos) {
        if (pos < 0 || pos >= tam) {
            JOptionPane.showMessageDialog(null, "No se puede agregar. Fuera de índice.");
        }
        else {
            listaDatos[pos] = datos;
        }
    }
    
    public Estudiante obtenerEstudiante(int pos) {
        return this.listaDatos[pos];
    }
    
    public Estudiante[] obtenerPorNota() {
        Estudiante nuevo[] = new Estudiante[tam];
        int contador = 0;
        for (int i = 0; i < tam; i++) {
         
                nuevo[contador] = this.listaDatos[i];
                contador++;
            }
        
        return nuevo;
    }
     public void busqueda_avanzada(int dato) {
         try {
             
         
             
        
        for (int i = 0; i <tam; i++) {
            if (dato == obtenerEstudiante(i).getId_Materia()) {
                JOptionPane.showMessageDialog(null, "se encontró");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró");
            }}} catch (Exception e) {
         }}}
     
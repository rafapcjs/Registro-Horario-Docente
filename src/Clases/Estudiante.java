package Clases;

public class Estudiante {
    
     
    private int id_Materia;
    private int id_Horario;
    private String Materia;
    private String Semestre;
    private String Calendario;
    private String salon;
    private String hora;
    private String fecha;

    public Estudiante() {
    }

    
    public Estudiante(int id_Materia, int id_Horario, String Materia, String Semestre, String Calendario,String salon,String hora,String fecha) {
        this.id_Materia = id_Materia;
        this.id_Horario = id_Horario;
        this.Materia = Materia;
        this.Semestre = Semestre;
         this.Calendario = Calendario;
        this.salon = salon;
         this.hora = hora;
         this.fecha=fecha;
    }

    
    public int getId_Materia() {
        return id_Materia;
    }

    public void setId_Materia(int id_Materia) {
        this.id_Materia = id_Materia;
    }

    public int getId_Horario() {
        return id_Horario;
    }

    public void setId_Horario(int id_Horario) {
        this.id_Horario = id_Horario;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    public String getCalendario() {
        return Calendario;
    }

    public void setCalendario(String Calendario) {
        this.Calendario = Calendario;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

  
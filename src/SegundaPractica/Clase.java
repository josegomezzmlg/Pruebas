package SegundaPractica;
import java.util.ArrayList;

public class Clase {
    private String codClase;
    private String profesor;
    private ArrayList<Alumnos> alumnos;

    public Clase(String codClase) {
        this.codClase = codClase;
        this.profesor = "- - - - -";
        this.alumnos = new ArrayList<>();
    }

    public String getCodClase() {
        return codClase;
    }

    public void setCodClase(String codClase) {
        this.codClase = codClase;
    }

    public String getProfesor() {
        return profesor;
    }
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void agregarAlumno(Alumnos alumno) {
        alumnos.add(alumno);
    }


}
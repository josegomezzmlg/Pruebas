package SegundaPractica;
import java.util.ArrayList;

public class Clase {
    private String codClase;
    private ArrayList<Alumnos> alumnos;

    public Clase(String codClase) {
        this.codClase = codClase;
        this.alumnos = new ArrayList<>();
    }

    public String getCodClase() {
        return codClase;
    }

    public void setCodClase(String codClase) {
        this.codClase = codClase;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }
}
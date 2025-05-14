package SegundaPractica;

public class Alumnos extends Persona{
    private String codAlumno;
    private String codClase;

    public Alumnos(String nombre, String apellido, int edad, String codAlumno, String codClase) {
        super(nombre, apellido, edad);
        this.codAlumno = codAlumno;
        this.codClase = codClase;
    }

    public String getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(String codAlumno) {
        this.codAlumno = codAlumno;
    }

    public String getCodClase() {
        return codClase;
    }

    public void setCodClase(String codClase) {
        this.codClase = codClase;
    }
}

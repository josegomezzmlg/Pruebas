package SegundaPractica;

public class Alumnos extends Persona{
    private String codAlumno;
    private String codClase;
    private double nota;

    public Alumnos(String nombre, String apellido, int edad, String codAlumno, String codClase) {
        super(nombre, apellido, edad);
        this.codAlumno = codAlumno;
        this.codClase = codClase;
        this.nota = nota;
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

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return super.toString()+" Notas= "+nota;
    }
}

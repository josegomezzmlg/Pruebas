package SegundaPractica;

public class Profesor extends Persona {
    private String codProf;
    private String codClase;


    public Profesor(String nombre, String apellido, int edad, String codProf, String codClase) {
        super(nombre, apellido, edad);
        this.codProf = codProf;
        this.codClase = codClase;

    }

    public String getCodProf() {
        return codProf;
    }

    public void setCodProf(String codProf) {
        this.codProf = codProf;
    }

    public String getCodClase() {
        return codClase;
    }
    public void setCodClase(String codClase) {
        this.codClase = codClase;
    }

}

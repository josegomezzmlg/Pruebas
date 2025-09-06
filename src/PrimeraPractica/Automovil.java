package PrimeraPractica;

public abstract class Automovil {
    protected int ruedas;
    protected String marca;
    protected String motor;

    public Automovil(int ruedas, String marca, String motor) {
        this.ruedas = ruedas;
        this.marca = marca;
        this.motor = motor;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

}

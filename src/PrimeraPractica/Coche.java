public class Coche extends Automovil implements PoderVolar {
    private String modelo;
    private int puertas;

    public Coche(int ruedas, String marca, String motor, String modelo, int puertas) {
        super(ruedas, marca, motor);
        this.modelo = modelo;
        this.puertas = puertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public void volar() {
        System.out.println("Para que el "+marca+" "+modelo+" salga volando tiene q meter 4º y activar las luces de emergencia");

    }
}


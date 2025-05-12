import java.io.Serializable;

public class Humano extends Mamifero implements PoderVolar{
    private int numPiernas;
    private int numBrazos;
    private String nombre;

    public Humano(boolean viviparo, boolean heterotrofo, boolean tienenPelo,String nombre) {
        super(viviparo, heterotrofo, tienenPelo);
        this.numPiernas = 2;
        this.numBrazos = 2;
        this.nombre = nombre;
    }

    public int getNumPiernas() {
        return numPiernas;
    }

    public void setNumPiernas(int numPiernas) {
        this.numPiernas = numPiernas;
    }

    public int getNumBrazos() {
        return numBrazos;
    }

    public void setNumBrazos(int numBrazos) {
        this.numBrazos = numBrazos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre+" da un gran salto juntando las piernas...");
        System.out.println("y entonces "+nombre+" levanta el brazo y sale VOLANDO !!!");

    }

    public String andar(boolean usaPiernas) {
        if (usaPiernas) {
            System.out.println(nombre + " está andando de manera normal.");
            return "Andando";
        } else {
            System.out.println(nombre + " no puede andar sin piernas.");
            return "No puede andar";
        }
    }

    public String andar(boolean usaPiernas, boolean usaBrazos) {
        if (usaPiernas && usaBrazos) {
            System.out.println(nombre + " está andando a cuatro patas.");
            return "Andando a cuatro patas";
        } else if (usaPiernas) {
            return andar(true);
        } else {
            System.out.println(nombre + " no puede andar.");
            return "No puede andar";
        }
    }


}

package PrimeraPractica;

public abstract class  Mamifero {

    protected boolean viviparo;
    protected boolean heterotrofo;
    protected boolean tienenPelo;

    public Mamifero(boolean viviparo, boolean heterotrofo, boolean tienenPelo) {
        this.viviparo = viviparo;
        this.heterotrofo = heterotrofo;
        this.tienenPelo = tienenPelo;
    }

    public boolean isViviparo() {
        return viviparo;
    }

    public void setViviparo(boolean viviparo) {
        this.viviparo = viviparo;
    }

    public boolean isHeterotrofo() {
        return heterotrofo;
    }

    public void setHeterotrofo(boolean heterotrofo) {
        this.heterotrofo = heterotrofo;
    }

    public boolean isTienenPelo() {
        return tienenPelo;
    }

    public void setTienenPelo(boolean tienenPelo) {
        this.tienenPelo = tienenPelo;
    }
}

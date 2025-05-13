
public class Main {
    public static void main(String[] args) {
        System.out.println("PARA QUE EL HUMANO VUELE -------");
        Humano humano1 = new Humano(true,true,true,"Jose");
        humano1.volar();
        System.out.println("- - - - - - - - - - -- - - - - - - - - - ");
        System.out.println("PARA QUE EL COCHE ---- -------");
        Coche coche1 = new Coche(4,"Seat","V8","Leon",5);
        coche1.volar();
        humano1.andar(false);
        humano1.andar(true,false);

        }
    }

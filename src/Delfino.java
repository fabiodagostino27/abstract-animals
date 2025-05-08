public class Delfino extends Animale implements INuotante {

    @Override
    protected void verso() {
        System.out.println("Non so come scriverlo!");
    }

    @Override
    protected void mangia() {
        System.out.println("Pesce");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }

}

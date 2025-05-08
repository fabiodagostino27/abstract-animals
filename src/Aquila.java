public class Aquila extends Animale implements IVolante {

    @Override
    protected void verso() {
        System.out.println("Kee kee kee kee!");
    }

    @Override
    protected void mangia() {
        System.out.println("Carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }

}

public class Passerotto extends Animale implements IVolante {

    @Override
    protected void verso() {
        System.out.println("Cip cip!");
    }

    @Override
    protected void mangia() {
        System.out.println("Briciole di pane");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }

}

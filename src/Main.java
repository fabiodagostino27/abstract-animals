public class Main {

    public static void faiVolare(IVolante animale) {
        animale.vola();
    }

    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }

    public static void main(String[] args) {

        INuotante winter = new Delfino();
        IVolante aquilaFascista = new Aquila();
        
        Main.faiNuotare(winter);
        Main.faiVolare(aquilaFascista);
    }
}

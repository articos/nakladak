package nakladak;

public class Main {

    public static void main(String[] args) {

        Nakladak nakladak = new Nakladak();

        nakladak.naloz(10000);
        nakladak.naloz(500);
        nakladak.vyloz(300);
        nakladak.vyloz(1000);

        nakladak.kolikNakladu();


    }
}

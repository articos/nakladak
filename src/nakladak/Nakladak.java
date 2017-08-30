package nakladak;

public class Nakladak {

    public int momentalniNaklad = 0;
    public int maxNosnost = 3000;



    public void naloz(int naklad) {

        if ( (momentalniNaklad + naklad) > maxNosnost ) {
            System.out.println("nelze nalozit");
        }
        else {
            momentalniNaklad += naklad;
        }
    }

    public void vyloz(int naklad) {

        if ( (momentalniNaklad - naklad) < 0 ) {

        }
        else {
            momentalniNaklad -= naklad;
        }
    }

    public void kolikNakladu() {

        System.out.println(momentalniNaklad);
    }

}

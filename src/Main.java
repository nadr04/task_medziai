import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Azuolas azuolas = new Azuolas();
        Berzas berzas1 = new Berzas();
        Berzas berzas2 = new Berzas();
        Egle egle = new Egle();
        Pusis pusis = new Pusis();
        Kadagys kadagys = new Kadagys();


        List<Medis> ivairusMedziai = new ArrayList<>();
        ivairusMedziai.add(berzas1);
        ivairusMedziai.add(azuolas);
        ivairusMedziai.add(kadagys);
        ivairusMedziai.add(egle);
        ivairusMedziai.add(pusis);

        List<Spygliuotis> spygliuociai = new ArrayList<>();
        spygliuociai.add(kadagys);
        spygliuociai.add(egle);
        spygliuociai.add(pusis);

        List<Berzas> berzai = new ArrayList<>();
        berzai.add(berzas1);
        berzai.add(berzas2);


        Miskas.ivairusMiskas(ivairusMedziai);
        System.out.println();
        Miskas.spygliuociuMiskas(spygliuociai);
        System.out.println();
        Miskas.berzuMiskas(berzai);
        System.out.println();
    }
}


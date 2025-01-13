import java.util.List;

public class Miskas {

    public static void ivairusMiskas(List<? extends Medis> medziai) {
        System.out.println("Ivairus miskas:");
        for (Medis medis : medziai) {
            medis.turi();
        }
    }

    public static void spygliuociuMiskas(List<? extends Spygliuotis> spygliuociai) {
        System.out.println("Spygliuociu miskas:");
        for (Spygliuotis medis : spygliuociai) {
            medis.turi();
        }
    }

    public static void berzuMiskas(List<Berzas> berzai) {
        System.out.println("Berzu miskas:");
        for (Berzas berzas : berzai) {
            berzas.turi();
        }
    }
}

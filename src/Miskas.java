import java.util.List;

public class Miskas {

    public static void ivairusMiskas(List<? extends Medis> medziai) {
        System.out.println("Ivairus miskas:");
        for (Medis medis : medziai) {
            medis.turi();
        }
    }

    public static void spygliuociuMiskas(List<? extends Medis> spygliuociai) {
        System.out.println("Spygliuociu miskas:");
        for (Medis medis : spygliuociai) {
            medis.turi();
        }
    }

    public static void berzuMiskas(List<Medis> berzai) {
        System.out.println("Berzu miskas:");
        for (Medis berzas : berzai) {
            berzas.turi();
        }
    }
}

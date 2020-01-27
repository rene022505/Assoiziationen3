public class mainClass {

    public static void main(String[] args) {
        Klasse k = new Klasse("TGIE1", "Wille");
        k.neuerSchueler(new Schueler(1, "Nico", "Niebisch", 18));
        k.neuerSchueler(new Schueler(2, "Rene", "Gottschalk", 17));
        k.neuerSchueler(new Schueler(3, "Tim", "Keicher", 18));

        System.out.println(k.getSchuelerNachIndex(2).getName());
        System.out.println(k.getKlassenlehrer());
        System.out.println(k.ermittleAltersdurchschnitt());
        k.entferneSchueler(1);
        for (int i = 2; i < 4; i++) {
            System.out.println(k.getSchuelerNachIndex(i).getName());
        }
        System.out.println(k.getName());
        k.waehleKlassensprecher(3);
        k.getSchueler(3);
    }

}

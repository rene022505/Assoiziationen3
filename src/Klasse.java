import java.util.ArrayList;

class Klasse {

    private String name, klassenlehrer;
    private ArrayList<Schueler> schuelerListe = new ArrayList<>();
    private int index = 1;
    private boolean hatKlassensprecher;

    Klasse(String pName, String pKlassenlehrer) {
        this.name = pName;
        this.klassenlehrer = pKlassenlehrer;
    }

    String getName() {
        return name;
    }

    String getKlassenlehrer() {
        return klassenlehrer;
    }

    void neuerSchueler(Schueler neuerSchueler) {
        schuelerListe.add(neuerSchueler);
        neuerSchueler.index = this.index++;
    }

    void entferneSchueler(int nr) {
        for (Schueler s : schuelerListe) {
            if (s.getSchuelerNr() == nr) {
                schuelerListe.remove(s);
                break;
            }
        }
    }

    Schueler getSchueler(int nr) {
        for (Schueler s : schuelerListe) {
            if (s.getSchuelerNr() == nr) {
                return s;
            }
        }
        return null;
    }

    Schueler getSchuelerNachIndex(int i) {
        if (i > 0) {
            for (Schueler s : schuelerListe) {
                if (s.index == i) {
                    return s;
                }
            }
        }
        return null;
    }

    void waehleKlassensprecher(int nr) {
        if (!hatKlassensprecher) {
            for (Schueler s : schuelerListe) {
                if (s.schuelerNr == nr) {
                    s.klassensprecher = true;
                    hatKlassensprecher = true;
                    break;
                }
            }
        }
    }

    double ermittleAltersdurchschnitt() {
        double gesammtAlter = 0;
        for (Schueler s : schuelerListe) {
            gesammtAlter += s.getAlter();
        }
        return gesammtAlter / schuelerListe.size();
    }

}

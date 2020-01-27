class Schueler {

    private String name, vorname;
    private int alter;
    int index, schuelerNr;
    boolean klassensprecher;

    Schueler(int nr, String pVorname, String pName, int pAlter) {
        this.name = pName;
        this.vorname = pVorname;
        this.schuelerNr = nr;
        this.alter = pAlter;
        this.klassensprecher = false;
    }

    String getName() {
        return this.name + ", " + this.vorname;
    }

    int getSchuelerNr() {
        return schuelerNr;
    }

    int getAlter() {
        return alter;
    }
}

package cz.czechitas.ukol7.controller;

public enum Barva {
    Zelena ("Zelená"),
    Zluta ("Žlutá"),
    Oranzova ("Oranžová"),
    Cervena ("Červená"),
    Ruzova ("Růžová"),
    Fialova ("Fialová"),
    Modra ("Modrá"),
    Cerna ("Černá"),
    Bila ("Bílá"),
    ;

    private final String text;

    Barva (String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

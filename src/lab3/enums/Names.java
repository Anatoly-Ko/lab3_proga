package lab3.enums;


public enum Names {
    Crab("Crabs"),
    Sproot("Sproots"),
    Jul("Julio"),
    M("Mig");
    private String NAME;

    Names(String str){
        NAME = str;
    }

    public String getNAME() {
        return NAME;
    }
}
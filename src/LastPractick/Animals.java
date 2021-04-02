package LastPractick;

public enum Animals {
    CAT("Kowka"), FROG("Jaba"), DOG("Sobaka");

    private String translate;

    Animals() {}

    Animals(String translate) {
        this.translate = translate;
    }

    public String getTranslate(){
        return translate;
    }
}

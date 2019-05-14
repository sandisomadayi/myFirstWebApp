package net.myfirst;

public enum Lang {
    english("Hello"),
    xhosa("Molo"),
    afrikaans("Halo");

    private String lang;

    Lang(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}

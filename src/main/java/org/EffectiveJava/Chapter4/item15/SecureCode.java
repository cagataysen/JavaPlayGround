package org.EffectiveJava.Chapter4.item15;

public abstract class SecureCode {
    public static final String[] WEBSITES = new String[] { "http://hasjdlşashdjsdsadasdsaalşhdjsaşl.com",
            "http://djnklfdşnbklfsadasdasnvmbklres.com" };

    // this method allows untrusted code to connect to allowed sites (only)
    public static void fetchNews(String url) {
        for (String news : WEBSITES) {
            if (url.equals(news)) {
                // Do smth
            }
        }
    }

    public static final String a = "a";

    public abstract void mesaj();
}

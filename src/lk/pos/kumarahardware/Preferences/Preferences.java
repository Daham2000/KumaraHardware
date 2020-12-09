package lk.pos.kumarahardware.Preferences;

public class Preferences {

    private static Preferences preferences;
    private String Username="admin";
    private String Password="root";

    public Preferences() {
    }

    public static Preferences getInstance(){
        if (preferences==null){preferences=new Preferences();}return preferences;
    }

    public String getUsername(){
        return Username;
    }

    public String getPassword(){
        return Password;
    }
}

package entities;

import java.util.Scanner;

public class TikTok {
    private int id;
    public static int autoID;
    private String name;
    private String email;

    public TikTok(int id, String name) {
        this.id = ++autoID;
        this.name = name;
    }

    public TikTok(int id, String name, String email) {
        this.id = ++autoID;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public static int getAutoID() {
        return autoID;
    }

    @Override
    public String toString() {
        return "TikTok{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

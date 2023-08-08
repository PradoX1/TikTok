package entities;

public class Idols extends TikTok {

    private int followers;
    private String group;


    public Idols(int id, String name, String email,int followers,String group) {
        super(id, name, email);
        this.followers = followers;
        this.group= group;
    }

    @Override
    public String toString() {
        return "Idols{" +"id=" + getAutoID() +
                ", name='" + getName()+ '\'' +
                ", email='" + getEmail() + '\'' +
                ", followers=" + followers +
                ", group='" + group + '\'' +
                '}';
    }
}

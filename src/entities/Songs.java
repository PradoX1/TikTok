package entities;

public class Songs extends TikTok {
    private String singer;


    public Songs(int id, String name, String singer) {
        super(id, name);
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Songs{" +"id=" + getAutoID() +
                ", name='" + getName()+ '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}

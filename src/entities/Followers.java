package entities;

public class Followers extends TikTok{

    private int numberOfLike;

    public Followers(int id, String name, String email,int numberOfLike) {
        super(id, name, email);
        this.numberOfLike= numberOfLike;
    }

    @Override
    public String toString() {
        return "Followers{" +"id=" + getAutoID() +
                ", name='" + getName()+ '\'' +
                ", email='" + getEmail() + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}

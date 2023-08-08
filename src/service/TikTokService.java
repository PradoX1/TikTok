package service;

import com.sun.security.jgss.GSSUtil;
import entities.Followers;
import entities.Idols;
import entities.Songs;
import entities.TikTok;

import java.util.ArrayList;
import java.util.Scanner;

public class TikTokService {
    Scanner scanner = new Scanner(System.in);

    public Idols setIdols() {
            System.out.println("Mời bạn nhập tên Idols: ");
            String nameI = scanner.nextLine();
            System.out.println("Mời bạn nhập email của Idol: ");
            String emailI = scanner.nextLine();
            System.out.println("Mời bạn nhập số followers của Idol: ");
            int followers = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập nhóm của Idol: ");
            String group = scanner.nextLine();
        return new Idols(TikTok.getAutoID(), nameI, emailI, followers, group);
    }
    public Followers setFollower(){
        System.out.println("Mời bạn nhập số người theo dõi muốn nhập: ");
        int nF = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên Follower: ");
        String nameF =  scanner.nextLine();
        System.out.println("Mời bạn nhập email của Follower: ");
        String emailF = scanner.nextLine();
        System.out.println("Mời bạn nhập số like: ");
        int numberOfLike = Integer.parseInt(scanner.nextLine());
        return new Followers(TikTok.getAutoID(),nameF,emailF,numberOfLike);
    }
    public Songs setSongs(){
        System.out.println("Mời bạn nhập số bài hát muốn nhập: ");
        int nS = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên bài hát: ");
        String nameSong =  scanner.nextLine();
        System.out.println("Mời bạn nhập tên ca sĩ: ");
        String nameSinger =  scanner.nextLine();
        return new Songs(TikTok.getAutoID(),nameSong,nameSinger);
    }
}

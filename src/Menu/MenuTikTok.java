package Menu;

import entities.Followers;
import entities.Idols;
import entities.Songs;
import service.TikTokService;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MenuTikTok {
    TikTokService tikTokService =new TikTokService();
    public void setMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean yn=true;
        ArrayList<Idols> idolsArrayList = new ArrayList<>();
        ArrayList<Followers> followersArrayList= new ArrayList<>();
        ArrayList<Songs> songsArrayList = new ArrayList<>();
 do {
     System.out.println("Chào mừng đến với TikTok!!! ");
     System.out.println("Mời bạn nhập số Idol muốn nhập: ");
     int nI = Integer.parseInt(scanner.nextLine());
     for (int i = 0; i < nI; i++) {
         Idols idols = tikTokService.setIdols();
         idolsArrayList.add(idols);
         for (int j = 0; j < idolsArrayList.size(); j++) {
             System.out.println("Danh sách Idols: "+idolsArrayList.get(i));
         }
     }
     System.out.println("Mời bạn nhập số Followers muốn nhập: ");
     int nF = Integer.parseInt(scanner.nextLine());
     for (int i = 0; i < nF; i++) {
         Followers followers = tikTokService.setFollower();
         followersArrayList.add(followers);
         for (int j = 0; j < followersArrayList.size(); j++) {
             System.out.println("Danh sách Fllowers: "+idolsArrayList.get(j));
         }
     }

     System.out.println("Mời bạn nhập số Songs muốn nhập: ");
     int nS = Integer.parseInt(scanner.nextLine());
     for (int i = 0; i < nS; i++) {
         Songs songs = tikTokService.setSongs();
         songsArrayList.add(songs);
         for (int j = 0; j < songsArrayList.size(); j++) {
             System.out.println("Danh sách Songs: "+idolsArrayList.get(j));
         }
     }
     System.out.println("Bạn có muốn tiếp tục không Y/N: ");
     String choice = scanner.nextLine().toLowerCase(Locale.ROOT);
     switch (choice){
         case "y":
             yn= true;
             break;
         case "n":
             yn= false;
             break;
         default:
             System.out.println("Error");
     }
 }while (yn);
        System.out.println("Cảm ơn và hẹn gặp lại!");
    }
}

package facade;

import composite.SourceTest;

/**
 * @author wangzx
 * @create 2021-09-7:08
 */
public class DVDPlayer {

    //使用单例模式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("dvd on");

    }

    public void off(){
        System.out.println("dvd off");
    }

    public  void play(){
        System.out.println("dvd start playing");
    }

    public void pause(){
        System.out.println("dvd pause ...");
    }
}

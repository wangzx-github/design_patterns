package facade;

/**
 * @author wangzx
 * @create 2021-09-7:19
 */
public class TheaterLight {

    private static TheaterLight instance;

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("ThreaterLight on");
    }

    public void off(){
        System.out.println("ThreaterLight off");
    }

    public void down(){
        System.out.println("ThreaterLight down");
    }
}

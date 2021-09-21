package facade;

/**
 * @author wangzx
 * @create 2021-09-7:17
 */
public class Stereo {

    private static Stereo instance;

    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Stereo on");
    }

    public void off(){
        System.out.println("Stereo off");
    }

    public void up(){
        System.out.println("Stereo up");
    }




}

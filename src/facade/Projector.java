package facade;

/**
 * @author wangzx
 * @create 2021-09-7:14
 */
public class Projector {

    private static Projector instance;

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("projector on");
    }

    public void off(){
        System.out.println("projector off");
    }

}

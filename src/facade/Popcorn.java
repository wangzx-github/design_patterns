package facade;

/**
 * @author wangzx
 * @create 2021-09-7:12
 */
public class Popcorn {

    private static Popcorn instance;

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("popcorn on");
    }

    public void off(){
        System.out.println("popcorn off");
    }

    public void pop(){
        System.out.println("popcorn is poping");
    }


}

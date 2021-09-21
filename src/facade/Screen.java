package facade;

/**
 * @author wangzx
 * @create 2021-09-7:15
 */
public class Screen {

    private static Screen instance;

    public static Screen getInstance(){
        return instance;
    }



    public void up(){
        System.out.println("Screen up");
    }

    public void down(){
        System.out.println("Screen down");
    }

    public void focus(){
        System.out.println("Screen focus");
    }
}

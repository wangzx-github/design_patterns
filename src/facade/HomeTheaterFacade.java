package facade;

/**
 * @author wangzx
 * @create 2021-09-7:22
 */
public class HomeTheaterFacade {
    //定义子系统的对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.up();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.down();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        popcorn.off();
        theaterLight.on();
        screen.up();
        projector.off();
        stereo.on();
        dvdPlayer.on();
        theaterLight.off();
    }

    public static void main(String[] args) {
        //统一的调用
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();;
        homeTheaterFacade.play();
        homeTheaterFacade.end();
    }

}

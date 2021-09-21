package flyweight;

/**
 * @author wangzx
 * @create 2021-09-7:17
 */
public class ConcreteWebsite extends Website{

    private String type = "";//网站发布的形式(内部状态)   User类是外部状态



    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {

        System.out.println("网站的发布形式为:"+type+"|使用者为:"+user.getName());
    }
}

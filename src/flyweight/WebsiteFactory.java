package flyweight;

import java.util.HashMap;

/**
 * 网站工厂类，根据需求返回网站
 * @author wangzx
 * @create 2021-09-7:20
 */

public class WebsiteFactory {
    //集合，池
    private HashMap<String,ConcreteWebsite> pool = new HashMap<>();

    //根据网站的类型，发布一个网站，如果没有就创建一个网站，放入到池中
    public Website getWebsiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebsite(type));
        }

        return (Website)pool.get(type);
    }

    public int getWebsiteCount(){
        return pool.size();
    }
}

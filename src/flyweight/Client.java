package flyweight;

/**
 * @author wangzx
 * @create 2021-09-7:26
 */
public class Client {
    public static void main(String[] args) {

        WebsiteFactory websiteFactory = new WebsiteFactory();
        Website website = websiteFactory.getWebsiteCategory("新闻");
        website.use();
        Website website1 = websiteFactory.getWebsiteCategory("博客");
        Website website2 = websiteFactory.getWebsiteCategory("博客");
        Website website3 = websiteFactory.getWebsiteCategory("博客");
        Website website4 = websiteFactory.getWebsiteCategory("博客");
        website1.use();

        System.out.println(websiteFactory.getWebsiteCount());

    }
}

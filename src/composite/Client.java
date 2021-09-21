package composite;

/**
 * @author wangzx
 * @create 2021-09-10:34
 */
public class Client {
    public static void main(String[] args) {
        //从大到小
        OrganizationComponent university = new University("清华大学","中国顶级大学");
        OrganizationComponent computerCollege = new College("计算机学院","计算机学院");
        OrganizationComponent infoEngineerCollege = new College("信息学院","信息学院");

        computerCollege.add(new Department("软件工程","软件工程不错"));
        computerCollege.add(new Department("网络工程","网络工程不错"));
        computerCollege.add(new Department("计算机科学与技术","计算机科学与技术不错"));

        infoEngineerCollege.add(new Department("通信工程","通信工程不好学"));
        infoEngineerCollege.add(new Department("信息工程","信息工程不好学"));

        university.add(computerCollege);
        university.add(infoEngineerCollege);

        computerCollege.print();
    }
}

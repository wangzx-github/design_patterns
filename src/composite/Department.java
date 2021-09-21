package composite;

/**
 * @author wangzx
 * @create 2021-09-10:31
 */
public class Department extends OrganizationComponent {



    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println("*****************"+getName()+"*************************");
    }

}

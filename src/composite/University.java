package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzx
 * @create 2021-09-10:13
 */
public class University extends OrganizationComponent{

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    protected void print() {
        //输出university包含的学院
        System.out.println("*****************"+getName()+"*************************");
        for(OrganizationComponent organizationComponent : organizationComponents){
            organizationComponent.print();
        }
    }

}

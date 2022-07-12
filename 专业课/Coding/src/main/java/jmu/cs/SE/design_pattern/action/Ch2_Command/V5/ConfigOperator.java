package jmu.cs.SE.design_pattern.action.Ch2_Command.V5;

import java.io.Serializable;

public class ConfigOperator implements Serializable {

    public void insert(String args) {
        System.out.println("增加新结点：" + args);
    }

    public void modify(String args) {
        System.out.println("修改结点：" + args);
    }

    public void delete(String args) {
        System.out.println("删除结点：" + args);
    }

}

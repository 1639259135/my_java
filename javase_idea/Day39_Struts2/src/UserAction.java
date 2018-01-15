import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

    /**
     * 对于User的操作,肯定存在增删改查,或者其它的操作方式
     * 那么我们就可以给UserAction写出对应的方法
     * 返回值可以我们自己定
     * 在struts.xml中的result标签中
     * 可以找到对应的结果就可以了
     *
     */

    public String add(){
        return "add";
    }

    public String delete(){
        return "delete";
    }

    public String alter(){
        return "alter";
    }

    public String query(){
        return "query";
    }




}

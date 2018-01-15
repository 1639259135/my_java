import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{

    public String hello(){
        return "success";
    }


    /**
     * 如果在struts配置文件中action标签没有指定method属性,
     *      即没有指定该action到底都要执行Action类中的哪一个方法
     *      则就会调用Action类中默认的execute方法,
     *      这个方法回调用super.execute方法
     *      该方法会返回一个success值,也可以执行到result标签
     *
     */
    @Override
    public String execute() throws Exception {
        return super.execute();
    }


}

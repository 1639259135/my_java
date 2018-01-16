package demo;

import com.opensymphony.xwork2.ActionSupport;

public class GlobalResultAction extends ActionSupport {

    public String show(){

        return "show";
    }

    public String toGlobal(){
        System.out.println("请求转发到:global包");
        return SUCCESS;
    }
}

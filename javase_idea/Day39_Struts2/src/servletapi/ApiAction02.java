package servletapi;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

public class ApiAction02 extends ActionSupport implements ServletRequestAware{
    /**
     * 实现XXXAware接口的方式,获得ServletApi
     */
    private HttpServletRequest request;

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }

    public String api02(){
        //要在这里使用request,声明一个成员变量

        return SUCCESS;
    }



}

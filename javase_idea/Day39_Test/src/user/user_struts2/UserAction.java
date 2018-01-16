package user.user_struts2;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import user.domain.User;
import user.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;

public class UserAction extends ActionSupport implements ServletRequestAware {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private UserService userService = new UserService();

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }

    public String register(){

        User user = new User();

        Map<String, String[]> parameterMap = request.getParameterMap();
        try {
            BeanUtils.populate(user,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        String uid = UUID.randomUUID().toString().replace("-", "");
        String uuid = UUID.randomUUID().toString().replace("-", "") + uid;
        user.setCode(uuid);
        user.setUid(uid);
        user.setState(0);

        userService.insertUser(user);

        return SUCCESS;
    }


    public String login() {

        User user = new User();
        Map<String, String[]> parameterMap = request.getParameterMap();

        try {
            BeanUtils.populate(user, parameterMap);

            System.out.println(user.toString());
            User u = userService.queryByUsername(user.getUsername());

            System.out.println(u.toString());
            if (user.getPassword().equals(u.getPassword())){

                return SUCCESS;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return ERROR;
    }
}

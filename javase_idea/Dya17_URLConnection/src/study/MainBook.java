package study;

import net.sf.json.JSONArray;
import net.sf.json.JSONNull;
import net.sf.json.JSONObject;
import netscape.javascript.JSObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import static javafx.scene.input.KeyCode.U;

public class MainBook {
    public static void main(String[] args) throws IOException {

        //统一资源定位符,
        //就是一个网址,(绝对定位)
        URL url = new URL("https://api.douban.com/v2/book/1220562 \n");

        //url对象用openConnection()打开连接,获得URLConnection类对象;
        URLConnection uc = url.openConnection();

        //获得网络连接中的流
        //然后从流中获得数据
        InputStream is = uc.getInputStream();

        byte[] buff = new byte[1024 * 1024];

        int len = is.read(buff);

        String result = new String(buff,0,len);

        System.out.println(result);



        //把json这个字符串,
        // 转换为我们java中的实体类的对象
        //现在可以通过JsonFormat插件
        //帮助我们直接生成实体类

        //还需要一个工具,帮助我们把字符串转换为
        //对应实体类的对象

        //json中:
        //[] 就是一个数组       JSONArray
        //{} 就是一个对象

        JSONObject jsObject = JSONObject.fromObject(result);

        Book book = (Book) JSONObject.toBean(jsObject,Book.class);

        System.out.println("id = " + book.getId());

    }
}

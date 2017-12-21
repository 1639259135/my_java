package study;

import net.sf.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class MainWeather {
    public static void main(String[] args) throws IOException {

        //统一资源定位符,
        //就是一个网址,(绝对定位)
        URL url = new URL("http://api.k780.com/?app=weather.today&weaid=1&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json");

        //url对象用openConnection()打开连接,获得URLConnection类对象;
        URLConnection uc = url.openConnection();

        //获得网络连接中的流
        //然后从流中获得数据
        InputStream is = uc.getInputStream();

        byte[] buff = new byte[1024 * 1024 * 1024];

        int len = is.read(buff);

        String s = new String(buff,0,len);

        System.out.println(s);






        JSONObject jsObject = JSONObject.fromObject(s);/* 把json这个字符串,
            转换为我们java中的实体类的对象
            现在可以通过JsonFormat插件
            帮助我们直接生成实体类

            还需要一个工具,帮助我们把字符串转换为
            对应实体类的对象

            json中:
            [] 就是一个数组       JSONArray
            {} 就是一个对象       JSONObject
            */

        Weather weather = (Weather) JSONObject.toBean(jsObject,Weather.class);  //帮助我们把字符串转换为对应实体类的对象

        System.out.println("天气: " + weather.getResult());//拿到最终转换结果

    }
}

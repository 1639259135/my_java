package javase_practice.dao;

import javase_practice.bean.Weather;
import net.sf.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class GetWeather {


    public  void getWeather(String city) throws IOException {

        URL url = new URL("http://api.map.baidu.com/telematics/v3/weather?location=" + city + "&output=json&ak=6tYzTvGZSOpYB5Oc2YGGOKt8");

        URLConnection uc = url.openConnection();
        InputStream is = uc.getInputStream();

        byte[] buff = new byte[1024 * 1024];
        int len = is.read(buff);
        String reuslt = new String(buff,0,len);

        JSONObject jsObject = JSONObject.fromObject(reuslt);
        Weather weather = (Weather) JSONObject.toBean(jsObject,Weather.class);
        System.out.println(weather.getResults());
    }
}


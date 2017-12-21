package javase_practice.dao;

import javase_practice.bean.Location;
import net.sf.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class GetLocation {

    public void getLocation(String num) throws IOException {
        URL url = new URL("http://api.k780.com/?app=phone.get&phone=" + num + "&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json");
        URLConnection uc = url.openConnection();

        InputStream is = uc.getInputStream();
        byte[] buff = new byte[1024 * 1024];
        int len = is.read(buff);
        String result = new String(buff,0,len);

        JSONObject jsonObject = JSONObject.fromObject(result);
        Location location = (Location) jsonObject.toBean(jsonObject,Location.class);
        System.out.println(location.getResult());

    }
}

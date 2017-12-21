package javase_practice;

import javase_practice.bean.GameGrade;
import javase_practice.bean.Weather;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Grade {

    public void send() throws IOException {
        URL url = new URL("http://192.168.20.221:8080/day16/insert?username=" + "" + "&score=" + "");
        URLConnection uc = url.openConnection();
        OutputStream os = uc.getOutputStream();

        byte[] buff = new byte[1024 * 1024];

        JSONArray jsonArray = JSONArray.fromObject(buff);




    }
}

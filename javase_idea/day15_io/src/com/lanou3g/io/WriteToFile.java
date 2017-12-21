package com.lanou3g.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/ti.txt");

        fw.write("将军角弓不得控,都户铁衣冷难着");

        fw.close();

    }
}

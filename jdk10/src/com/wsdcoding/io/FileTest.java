package com.wsdcoding.io;

import java.io.File;

/**
 * @Description: 磁盘操作
 * @Authror wsdcoding
 */
public class FileTest {



    public static void main(String[] args) {
        String DIR = "C:\\Users\\15593\\Desktop\\mk简历";
        File file = new File(DIR);
        File[] files = file.listFiles();
        for (File file1:files){
            if (!file1.isDirectory())
                System.out.println(file1);
        }
    }
}

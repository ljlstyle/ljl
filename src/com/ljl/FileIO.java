package com.ljl;

import java.io.File;

public class FileIO {
    public static void main(String[] args) {
        File file = new File("E://FileTest");
        for (String s: file.list()) {
            System.out.println(s);
        }



    }
}

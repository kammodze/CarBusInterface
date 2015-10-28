package com.theksmith.android.helpers;

import android.os.Environment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public final class IOUtils {

    public static void saveToFile(String filename, String text) {
        File fex = Environment.getExternalStorageDirectory();
        fex = new File(fex, filename);
        FileOutputStream fos = null;
        try {
            boolean append = true;
            fos = new FileOutputStream(fex, append);
        } catch (FileNotFoundException ex) {

        }
        PrintWriter pw = new PrintWriter(fos);
        pw.print(text);
        pw.close();
    }

}

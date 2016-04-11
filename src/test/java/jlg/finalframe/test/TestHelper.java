/*
* Created by dan-geabunea on 4/11/2016.
* This code is the property of JLG Consulting. Please
* check the license terms for this product to see under what
* conditions you can use or modify this source code.
*/
package jlg.finalframe.test;

import java.io.File;
import java.io.InputStream;

class TestHelper {
    public static File getFileFromResource(String fileName){
        String path = TestHelper.class.getClassLoader().getResource(fileName).getPath();
        File file = new File(path);

        return file;
    }

    public static InputStream getFileInputStreamFromResource(String fileName){
        InputStream fis = TestHelper.class.getClassLoader().getResourceAsStream(fileName);
        return fis;
    }
}

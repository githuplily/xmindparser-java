package org.lily.xmindparser;

import org.apache.commons.compress.archivers.ArchiveException;
import org.dom4j.DocumentException;


import java.io.IOException;

/**
 * Example
 *  测试例子
 * 2020/4/28 13:12
 */
public class Example {

    public static void main(String[] args) throws DocumentException, ArchiveException, IOException {
       // String fileNae = "doc/XmindZen解析.xmind";
//        String fileName = "doc/Xmind8解析.xmind";
        String fileName = "doc/test_case.xmind";
        String res = XmindParser.parseJson(fileName);
        System.out.println(res);

        Object root = XmindParser.parseObject(fileName);
        System.out.println(root);



    }


}

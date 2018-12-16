package com.master.zul;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String p = "<p> paragraph </p>";
        System.out.println(StringEscapeUtils.escapeHtml4(p));
    }


}

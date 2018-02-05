package com.github.learning.common.test;


import com.github.learning.common.util.RsaKeyHelper;
import com.github.learning.common.util.jwt.JWTHelper;

public class Test {

    public static void main(String[] args) throws Exception {
        UserInfo info=new UserInfo("admin","管理员","1","123456");
        JWTHelper helper=new JWTHelper();
        String token = helper.generateToken(info, "D:\\workspaces\\IntelliJIDEA\\ag-parent\\ag-auth\\src\\main\\resources\\pri.key", 3600);
        System.out.println(">>>>>>>>>>>"+token);
        helper.parserToken(token,"D:\\workspaces\\IntelliJIDEA\\ag-parent\\ag-auth\\src\\main\\resources\\pub.key");


        RsaKeyHelper rsaKeyHelper=new RsaKeyHelper();
        rsaKeyHelper.generateKey("D:/key/pub.key","D:/key/pri.key","123456");
    }
}

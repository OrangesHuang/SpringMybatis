package com.avcdata.filter;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Druid的Servlet
 * @author qinhaoran
 * @author huangcheng
 * @since 2017年01月20日10:03:52
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/druid/*",
initParams={
        @WebInitParam(name="loginUsername",value="root"),// 用户名
        @WebInitParam(name="loginPassword",value="123456"),// 密码
        @WebInitParam(name="resetEnable",value="false")// 禁用HTML页面上的“Reset All”功能
})
public class DruidStatViewServlet extends StatViewServlet {
    /*
    * 访问的url为: [ip]:[port]/druid/index.html
    * */
}

/*
 * $RCSfile: TreeMenuTemplate.java,v $
 * $Revision: 1.1 $
 *
 * JSP generated by JspCompiler-1.0.0
 */
package com.skin.finder.admin.servlet.template;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * <p>Title: TreeMenuTemplate</p>
 * <p>Description: </p>
 * @author JspKit
 * @version 1.0
 */
public class TreeMenuTemplate extends com.skin.finder.web.servlet.JspServlet {
    private static final long serialVersionUID = 1L;
    private static final TreeMenuTemplate instance = new TreeMenuTemplate();


    /**
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    public static void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        instance.service(request, response);
    }

    /**
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html; charset=utf-8");
        OutputStream out = response.getOutputStream();

        out.write(_jsp_string_1, 0, _jsp_string_1.length);
        out.write(_jsp_string_2, 0, _jsp_string_2.length);
        out.write(_jsp_string_3, 0, _jsp_string_3.length);
        out.write(_jsp_string_4, 0, _jsp_string_4.length);
        out.write(_jsp_string_5, 0, _jsp_string_5.length);
        out.write(_jsp_string_6, 0, _jsp_string_6.length);
        out.write(_jsp_string_7, 0, _jsp_string_7.length);
        out.write(_jsp_string_8, 0, _jsp_string_8.length);
        out.write(_jsp_string_9, 0, _jsp_string_9.length);
        out.write(_jsp_string_10, 0, _jsp_string_10.length);
        out.write(_jsp_string_11, 0, _jsp_string_11.length);
        out.write(_jsp_string_12, 0, _jsp_string_12.length);
        out.write(_jsp_string_13, 0, _jsp_string_13.length);
        out.write(_jsp_string_14, 0, _jsp_string_14.length);
        out.write(_jsp_string_15, 0, _jsp_string_15.length);
        out.write(_jsp_string_16, 0, _jsp_string_16.length);
        out.write(_jsp_string_17, 0, _jsp_string_17.length);
        out.write(_jsp_string_18, 0, _jsp_string_18.length);
        out.write(_jsp_string_19, 0, _jsp_string_19.length);
        out.write(_jsp_string_20, 0, _jsp_string_20.length);
        out.write(_jsp_string_21, 0, _jsp_string_21.length);
        out.write(_jsp_string_22, 0, _jsp_string_22.length);
        out.write(_jsp_string_23, 0, _jsp_string_23.length);
        out.write(_jsp_string_24, 0, _jsp_string_24.length);
        out.write(_jsp_string_25, 0, _jsp_string_25.length);
        out.write(_jsp_string_26, 0, _jsp_string_26.length);
        out.write(_jsp_string_27, 0, _jsp_string_27.length);
        this.write(out, request.getAttribute("contextPath"));
        out.write(_jsp_string_29, 0, _jsp_string_29.length);
        out.write(_jsp_string_30, 0, _jsp_string_30.length);
        out.write(_jsp_string_31, 0, _jsp_string_31.length);

        out.flush();
    }

    protected static final byte[] _jsp_string_1 = b("<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
    protected static final byte[] _jsp_string_2 = b("<meta http-equiv=\"Pragma\" content=\"no-cache\"/>\r\n<meta http-equiv=\"Cache-Control\" content=\"no-cache\"/>\r\n");
    protected static final byte[] _jsp_string_3 = b("<meta http-equiv=\"Expires\" content=\"0\"/>\r\n<title>Finder - Powered by Finder</title>\r\n");
    protected static final byte[] _jsp_string_4 = b("<link rel=\"shortcut icon\" href=\"?action=res&path=/finder/images/favicon.png\"/>\r\n");
    protected static final byte[] _jsp_string_5 = b("<link rel=\"stylesheet\" type=\"text/css\" href=\"?action=res&path=/admin/css/form.css\"/>\r\n");
    protected static final byte[] _jsp_string_6 = b("<link rel=\"stylesheet\" type=\"text/css\" href=\"?action=res&path=/admin/css/tree.css\"/>\r\n");
    protected static final byte[] _jsp_string_7 = b("<script type=\"text/javascript\" src=\"?action=res&path=/htree/htree.js\"></script>\r\n");
    protected static final byte[] _jsp_string_8 = b("<script type=\"text/javascript\" src=\"?action=res&path=/htree/htree.util.js\"></script>\r\n");
    protected static final byte[] _jsp_string_9 = b("<script type=\"text/javascript\" src=\"?action=res&path=/finder/jquery-1.7.2.min.js\"></script>\r\n");
    protected static final byte[] _jsp_string_10 = b("<script type=\"text/javascript\">\r\n//<![CDATA[\r\nHTree.mode = \"menu\";\r\nHTree.click = function(src) {\r\n");
    protected static final byte[] _jsp_string_11 = b("    var url = src.getAttribute(\"data\");\r\n\r\n    if(url == null || url.length < 1) {\r\n");
    protected static final byte[] _jsp_string_12 = b("        return;\r\n    }\r\n\r\n    if(url == \"javascript:void(0);\") {\r\n        return;\r\n");
    protected static final byte[] _jsp_string_13 = b("    }\r\n\r\n    try {\r\n        var doc = window.parent.window.document;\r\n        var iframe = doc.getElementById(\"mainFrame\");\r\n");
    protected static final byte[] _jsp_string_14 = b("\r\n        if(iframe != null) {\r\n            iframe.src = url;\r\n        }\r\n        else {\r\n");
    protected static final byte[] _jsp_string_15 = b("            alert(\"系统错误，请稍后再试！\");\r\n        }\r\n    }\r\n    catch(e) {\r\n        if(typeof(window.console) != \"undefined\") {\r\n");
    protected static final byte[] _jsp_string_16 = b("            window.console.error(e.name + \": \" + e.message);\r\n        }\r\n        alert(\"系统错误，请稍后再试！\");\r\n");
    protected static final byte[] _jsp_string_17 = b("    }\r\n};\r\n\r\nfunction buildTree(id, xmlUrl, rootUrl){\r\n    HTree.config.stylePath = window.location.pathname + \"?action=res&path=/htree/menu/\";\r\n");
    protected static final byte[] _jsp_string_18 = b("\r\n    var e = document.getElementById(id);\r\n\r\n    if(e == null) {\r\n        return;\r\n");
    protected static final byte[] _jsp_string_19 = b("    }\r\n\r\n    var tree = new HTree.TreeNode({text: \"管理控制台\", href: rootUrl, xmlSrc: xmlUrl});\r\n");
    protected static final byte[] _jsp_string_20 = b("\r\n    tree.load(function() {\r\n        this.render(document.getElementById(id));\r\n");
    protected static final byte[] _jsp_string_21 = b("    });\r\n}\r\n\r\njQuery(function() {\r\n    var resize = function() {\r\n        var e = document.getElementById(\"htree\");\r\n");
    protected static final byte[] _jsp_string_22 = b("\r\n        if(e != null) {\r\n            var parent = e.parentNode;\r\n            var offset = parseInt(parent.getAttribute(\"offset-top\"));\r\n");
    protected static final byte[] _jsp_string_23 = b("\r\n            if(isNaN(offset)) {\r\n                offset = 0;\r\n            }\r\n\r\n");
    protected static final byte[] _jsp_string_24 = b("            var height = document.documentElement.clientHeight - offset;\r\n            parent.style.height = height + \"px\";\r\n");
    protected static final byte[] _jsp_string_25 = b("        }\r\n    };\r\n    jQuery(window).load(resize);\r\n    jQuery(window).resize(resize);\r\n");
    protected static final byte[] _jsp_string_26 = b("});\r\n\r\njQuery(function() {\r\n    var requestURI = window.location.pathname;\r\n    buildTree(\"htree\", requestURI + \"?action=admin.menu.xml&r=\" + new Date().getTime(), requestURI + \"?action=finder.blank\");\r\n");
    protected static final byte[] _jsp_string_27 = b("});\r\n//]]>\r\n</script>\r\n</head>\r\n<body contextPath=\"");
    protected static final byte[] _jsp_string_29 = b("\">\r\n<div class=\"left-nav\">\r\n    <div class=\"menu-body\" style=\"padding-left: 8px; overflow-x: auto; overflow-y: scroll;\">\r\n");
    protected static final byte[] _jsp_string_30 = b("        <div id=\"htree\" class=\"htree\" style=\"margin-top: 10px; white-space: nowrap;\"></div>\r\n");
    protected static final byte[] _jsp_string_31 = b("    </div>\r\n</div>\r\n</body>\r\n</html>\r\n");

}
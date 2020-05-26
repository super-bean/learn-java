package com.learn.tomcat.servlet;

import com.learn.tomcat.http.Request;
import com.learn.tomcat.http.Response;
import com.learn.tomcat.http.Servlet;

public class SecondServlet extends Servlet {
    @Override
    public void doGet(Request request, Response response) throws Exception {
        doPost(request,response);
    }

    @Override
    public void doPost(Request request, Response response) throws Exception {
        response.write("This is Second Serlvet");
    }
}

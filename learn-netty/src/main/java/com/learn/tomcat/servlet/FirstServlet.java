package com.learn.tomcat.servlet;

import com.learn.tomcat.http.Request;
import com.learn.tomcat.http.Response;
import com.learn.tomcat.http.Servlet;

public class FirstServlet  extends Servlet{
    @Override
    public void doGet(Request request, Response response) throws Exception {
        this.doPost(request, response);
    }

    @Override
    public void doPost(Request request, Response response) throws Exception {
        response.write("This is First Serlvet");
    }
}

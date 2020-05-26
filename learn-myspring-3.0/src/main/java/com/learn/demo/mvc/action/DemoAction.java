package com.learn.demo.mvc.action;

import com.learn.demo.service.impl.IDemoService;
import com.learn.framework.annotation.Autowired;
import com.learn.framework.annotation.Controller;
import com.learn.framework.annotation.RequestMapping;
import com.learn.framework.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/demo")
public class DemoAction {

    @Autowired
    private IDemoService demoService;

    @RequestMapping("/query")
    public void query(HttpServletRequest req, HttpServletResponse resp,
                      @RequestParam("name") String name){
//		String result = demoService.get(name);
        String result = "My name is " + name;
        try {
            resp.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/add")
    public void add(HttpServletRequest req, HttpServletResponse resp,
                    @RequestParam("a") Integer a, @RequestParam("b") Integer b){
        try {
            resp.getWriter().write(a + "+" + b + "=" + (a + b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/sub")
    public void add(HttpServletRequest req, HttpServletResponse resp,
                    @RequestParam("a") Double a, @RequestParam("b") Double b){
        try {
            resp.getWriter().write(a + "-" + b + "=" + (a - b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/remove")
    public String  remove(@RequestParam("id") Integer id){
        return "" + id;
    }

}

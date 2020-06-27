package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.*;
public class FirstServlet implements Servlet{
 // life cycle method :
    ServletConfig conf;

    /**
     *
     * @param conf
     */
    @Override
    public void init(ServletConfig conf)
{
    this.conf = conf;
    System.out.println("Creating an object ---------->");
}
    @Override
    public void service(ServletRequest req, ServletResponse resp)throws ServletException, IOException
    {
        System.out.println("Servicing ---------->");
        // set the conatain type of response
        resp.setContentType("text/html");
        PrintWriter resp;
        resp = resp.getWriter();
        out.println("<h1> This is my output from servlet method : </h1>");
    }
    @Override
    public void destroy()
    {
        System.out.println("Going to destroy servelet object ---------->");
    }
    
    // non life cycle mathod 

    /**
     *
     * @return
     */
    @Override
    public ServletConfig getServletConfig()
    {
        return this.conf;
    }
    @Override
    public String getServletInfo()
    {
      return "this servlet is creted by Aman Bhardwaj";  
    }
}

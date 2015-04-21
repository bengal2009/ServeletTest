package lin.com;

import java.io.IOException;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class HelloWorldServlet extends HttpServlet
{
    public void doGet (HttpServletRequest req,
                       HttpServletResponse res)
            throws ServletException, IOException
    {
        // Set response content type
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.println("<H1>Hello, world</H1>");
        out.close();
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}


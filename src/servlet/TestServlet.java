package servlet;

import java.io.*;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


import javax.servlet.annotation.*;

@WebServlet(name = "testServlet", urlPatterns = "/test-servlet")
public class TestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int x = Integer.parseInt(request.getParameter("x"));
        int y = Integer.parseInt(request.getParameter("y"));
        int res = x + y;
        request.setAttribute("res", res);

        try {
            String resourceName = request.getServletContext().getRealPath("/txt/a.txt");
            int code = new FileInputStream(resourceName).read();
            request.setAttribute("code", code);
        } catch (IOException e) {
            e.printStackTrace();
        }

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}

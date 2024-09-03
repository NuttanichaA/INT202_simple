package sit.int202.simple;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet") //ถ้าเราจะเรียก servlet ตัวนี้ ต้องใช้ /hello-servlet แต่ชื่อข้างหน้าจะเป็นไปตามรูปแบบของ url
public class HelloServlet extends HttpServlet {
    private String message;

                //เป็นเหมือน container ของ servlet
    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h3>This is my first servlet</h3>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
package sit.int202.simple;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

    @WebServlet(name = "myInfoServlet", value = "/my-info") //ถ้าเราจะเรียก servlet ตัวนี้ ต้องใช้ /hello-servlet แต่ชื่อข้างหน้าจะเป็นไปตามรูปแบบของ url
    public class MyInfoServlet extends HttpServlet {

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html");

            // Hello
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>id: 66130500029</h1>");
            out.println("<h1>name: Nuttanicha</h1>");
            out.println("<h1>GPAX: 3.xx</h1>");
            out.println("<a href=\"../simple_war_exploded/\">back</a>");
            out.println("<br>");
            out.println("</body></html>");
        }

        public void destroy() {
        }
    }


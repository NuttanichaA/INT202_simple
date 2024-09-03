package sit.int202.simple;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "subject-info", value = "/test-parameter") //ถ้าเราจะเรียก servlet ตัวนี้ ต้องใช้ /hello-servlet แต่ชื่อข้างหน้าจะเป็นไปตามรูปแบบของ url
public class TestParameterServelet extends HttpServlet {        //ส่วน name ไม่ได้มีความหมายเป็นอะไรก็ได้

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password"); //ใน login-form ที่เราบอกว่า name สำคัญมันเอามาใช้ตรงนี้แหละ ต้องพิมให้ถูกนะ

        Map<String, String[]> parameterMap = request.getParameterMap();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>User name: " + username +"</p>");
        out.println("<p>password:" + password +"</p>");
        out.println("-----Map------");
        out.println("<p>User name: " + parameterMap.get("username")[0] +"</p>");
        out.println("<p>password:" + parameterMap.get("password")[0] +"</p>");
        out.println("<a href=\"../simple_war_exploded/\">back</a>");
        out.println("<br>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}


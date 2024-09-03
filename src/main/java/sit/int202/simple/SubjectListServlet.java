package sit.int202.simple;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sit.int202.simple.entities.Subject;
import sit.int202.simple.repositories.SubjectRepository;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "SubjectListServlet", value = "/subject-list")
public class SubjectListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        List<Subject> subjects = new SubjectRepository().findAll(); //controller ไปเรียก Model ให้ทำงาน
        //เมื่อได้ data มาแล้ว เอา obj ของ subject set ลงไปใน request
        // ถ้าเราอยากจะส่งอย่างอื่นไปด้วยก็ set attribute เพิ่มได้
        request.setAttribute("subjects",subjects);
        //เมื่อทำงานเสร็จแล้ว ก็จะ forward ไปหา Jsp
        request.getRequestDispatcher("/subject_listing.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
    }
}

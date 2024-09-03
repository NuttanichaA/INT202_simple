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

@WebServlet(name = "subject-info", value = "/find-subject")
public class FindSubjectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
    ServletException, IOException {
        String sID = request.getParameter("sID");
        request.setAttribute("sID", sID);
        SubjectRepository subjectRepository = new SubjectRepository();
        Subject subject = subjectRepository.findById(sID);
        request.setAttribute("subject",subject);
        request.getRequestDispatcher("/subject_info.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
    ServletException, IOException {

    }
    }

package sit.int202.simple;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sit.int202.simple.entities.Subject;
import sit.int202.simple.repositories.SubjectRepository;

import java.io.IOException;

@WebServlet(name = "subject-info", value = "/subject-info")
public class SubjectInfoServlet extends HttpServlet {
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
        String subjectID = request.getParameter("subjectID");
        request.setAttribute("subjectID", subjectID);
        SubjectRepository subjectRepository = new SubjectRepository();
        Subject subject = subjectRepository.findById(subjectID);
        request.setAttribute("subject",subject);
        request.getRequestDispatcher("/subject_info.jsp").forward(request,response);
    }
    }

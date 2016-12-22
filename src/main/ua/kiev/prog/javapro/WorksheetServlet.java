package main.ua.kiev.prog.javapro;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by admin on 22.12.2016.
 */
public class WorksheetServlet extends HttpServlet implements Maps {

    private static int PETS_COUNT;
    private static int CITIZEN_COUNT;

    protected void doPost(final HttpServletRequest request, HttpServletResponse response) throws IOException {
        String firstName = request.getParameter("first name");
        String lastName = request.getParameter("last name");
        String age = request.getParameter("age");
        String pet = request.getParameter("pet");
        String city = request.getParameter("city");

        if (!"".equals(firstName) && !"".equals(lastName)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("first_name", firstName);
            session.setAttribute("last_name", lastName);
            session.setAttribute("age", age);
            if ("yes".equals(pet)) PETS_COUNT++;
            session.setAttribute("pets_count", PETS_COUNT);
            if ("yes".equals(city)) CITIZEN_COUNT++;
            session.setAttribute("citizen_count", CITIZEN_COUNT);
        }
        response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String b = request.getParameter("b");
        HttpSession session = request.getSession(false);
        if ("goBack".equals(b) && (session != null))
            session.removeAttribute("first_name");
        session.removeAttribute("last_name");
        response.sendRedirect("index.jsp");
    }
}

package iducs.jsp.b.jyjbblog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "post", value = "/blogs/post.do")
public class BlogController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8"); //request 객체를 utf-8형태로 변환한다.
        String inputName = request.getParameter("name");
        request.setAttribute("name", inputName); // 객체를 받아옴.
        request.getRequestDispatcher("view.jsp").forward(request, response);
    }
}

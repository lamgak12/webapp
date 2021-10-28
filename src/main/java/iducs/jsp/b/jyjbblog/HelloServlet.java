package iducs.jsp.b.jyjbblog;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/blogs/message") // <<-- 호스트(로컬호스트) 애플리케이션(Gradle___iducs_jsp_b___JYJ_b_blog_1_0_SNAPSHOT_wa) 다음 위치를 나타낸다.
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //doGet 메소드에 request 객체와 response 객체는 서블릿 객체를 생성하는 과정에서 생성되고, request에 요청이 저장됨
        response.setContentType("text/html");
        //현재request 객체에 저장된 name 파라미터의 값을 가져옴
        String inputName = request.getParameter("name");
        //String inputName1 = request.getAttribute("name"); 못받아옴 why? =>찾아봐
        //현재 request 객체에 name이란 속성이름 - inputName 이란 속성값을 설정
        request.setAttribute("name", inputName); // 객체를 받아옴
        //view.sjp로 포워드 : request와 response 객체를 전달함
        //view.jsp는 현재 경로 기준이다.
        //forward인 경우 URL이 변하지 않는다.
        request.getRequestDispatcher("view.jsp").forward(request, response);

        /*
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + " " +request.getParameter("name") +" ! </h1>"); //파라미터를 받아옴(문자열)
        out.println("</body></html>");
         */
    }
    public void destroy() {
    }
}
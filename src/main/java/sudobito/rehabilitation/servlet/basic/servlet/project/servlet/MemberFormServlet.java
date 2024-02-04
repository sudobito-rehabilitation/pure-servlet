package sudobito.rehabilitation.servlet.basic.servlet.project.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

// 회원 등록을 위한 form 화면을 제공
@WebServlet(name = "memberFormServlet", urlPatterns = "/servlet/members/newform")
public class MemberFormServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse
            response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter writer = response.getWriter();

        writer.write(
                """
                        <!DOCTYPE html>
                        <html>
                        <head>
                         <meta charset="UTF-8">
                         <title>Title</title>
                        </head>
                        <body>
                        <form action="/servlet/members/save" method="post">
                         username: <input type="text" name="username" />
                         age: <input type="text" name="age" />
                         <button type="submit">전송</button>
                        </form>
                        </body>
                        </html>
                        """);
    }
}

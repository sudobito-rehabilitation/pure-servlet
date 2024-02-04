package sudobito.rehabilitation.servlet.basic.servlet.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "responseHtmlServlet", urlPatterns = "/response-html")
public class ResponseHtmlServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // html 을 반환하기 위한 응답 헤더 값 세팅
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter writer = response.getWriter();
        // 대충 htlml 코드 한줄한줄 적긱
//        writer.println("<html>");
//        writer.println("<body>");
//        writer.println(" <div>안녕?</div>");
//        writer.println("</body>");
//        writer.println("</html>");
    }
}

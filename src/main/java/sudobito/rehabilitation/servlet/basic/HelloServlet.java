package sudobito.rehabilitation.servlet.basic;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// @WebServlet 서블릿 애노테이션
// name : servlet 이름
// urlPatterns : Url 매핑
@WebServlet(name = "sudobitoServlet", urlPatterns = "/sudobito")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) {

    }
}

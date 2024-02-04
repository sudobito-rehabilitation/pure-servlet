package sudobito.rehabilitation.servlet.basic.servlet.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // status
        response.setStatus(HttpServletResponse.SC_OK);

        // response headers
        response.setHeader("Content-Type", "text/plain;charset=utf-8");
        // 혹은
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        // content-length 는 자동 생성됨

        response.setHeader("X-request-id", "test");
        response.setHeader("Cache-Control", "no cache, no-store, must-revalidate");
        // 저렇게 값 많이 넣으면 어떻게 되는거지..?
        System.out.println(response.getHeader("Cache-Control"));

        // cookie 관련 설정
        Cookie cookie = new Cookie("bestCookie", "cookieIsLie");
        cookie.setMaxAge(600); // 단위 :s
        response.addCookie(cookie);

        // redirect 시 사용
//        response.sendRedirect("/my/temp");
    }
}

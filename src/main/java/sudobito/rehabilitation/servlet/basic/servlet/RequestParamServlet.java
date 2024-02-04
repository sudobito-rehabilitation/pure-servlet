package sudobito.rehabilitation.servlet.basic.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Arrays;

// 요청 : http://localhost:8080/request-param?username=hello&age=20
// Post 여도, content-type: application/x-www-form-urlencoded 일 경우에는, 파라미터와 동일하게 처리
@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) {
        // 전체 param 조회
        request
                .getParameterNames() // Enumeration<String> parameterNames
                .asIterator()
                .forEachRemaining(
                        name -> System.out.println(name + "=" + request.getParameter(name))
                );

        // 단일 param 조회
        String username = request.getParameter("username");
        System.out.println(username);

        String age = request.getParameter("age");
        System.out.println(age);

        // 이름이 같은 param 이 여러개 있을 경우
        // 중복 케이스에 request.getParameter 사용 시 getParameterValues() 의 맨 처음 값 반환
        // http://localhost:8080/request-param?username=hello&username=kim&age=20
        String[] usernames = request.getParameterValues("username");
        Arrays.stream(usernames).forEach(
                System.out::println
        );
    }
}

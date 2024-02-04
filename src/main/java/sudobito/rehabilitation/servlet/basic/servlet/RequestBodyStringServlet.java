package sudobito.rehabilitation.servlet.basic.servlet;

import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "requestBody-String-Servlet", urlPatterns = "/request-body-String")
public class RequestBodyStringServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // HTTP 메시지 바디의 데이터를 <InputStream>을 사용해서 직접 읽을 수 있다
        // StreamUtils : 바이트 코드를 String 으로 변환
        ServletInputStream inputStream = request.getInputStream();
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);


    }
}

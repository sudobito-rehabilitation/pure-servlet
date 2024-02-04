package sudobito.rehabilitation.servlet.basic.servlet.post_or_etc;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StreamUtils;
import sudobito.rehabilitation.servlet.basic.servlet.post_or_etc.model.BasicData;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "requestBodyJsonServlet", urlPatterns = "/request-body-json")
public class RequestBodyJsonServlet extends HttpServlet {
    // JSON 결과를 파싱해서 사용할 수 있는 자바 객체로 변환
    // Spring MVC 에서 기본적으로 제공하는 Jackson 라이브러리 내부에 존재
    private final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletInputStream inputStream = request.getInputStream();
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

        BasicData basicData = objectMapper.readValue(messageBody, BasicData.class);
        System.out.println(basicData);

    }
}

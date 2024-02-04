package sudobito.rehabilitation.servlet.basic.servlet.response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sudobito.rehabilitation.servlet.basic.servlet.request.post_or_etc.model.BasicData;

import java.io.IOException;

@WebServlet(name = "responseJsonServlet", urlPatterns = "/response-json")
public class ResponseJsonServlet extends HttpServlet {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Content-Type", "application/json");
        // application/json 은 스펙상 utf-8 형식을 사용하도록 정의,
        // 따라서, 아래 설정은 별로 의미가 없는 코드
        response.setCharacterEncoding("utf-8");

        BasicData basicData = new BasicData();

        String result = objectMapper.writeValueAsString(basicData);

        response.getWriter().write(result);
    }
}

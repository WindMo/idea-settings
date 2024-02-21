#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.ServletException;
#parse("File Header.java")

@javax.servlet.annotation.WebServlet(name = "${Entity_Name}",  urlPatterns="/${Entity_Name}")

public class ${Class_Name} extends HttpServlet {

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        this.doPost(request,response);
    }
}

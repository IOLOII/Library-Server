package fun.extract.libraryController;

import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import fun.extract.libraryService.UserService;

@Controller
//@RequestMapping("/login")
public class LoginController {
	@Autowired
	private UserService userService;	
//	@RequestMapping(value = "/in" , method=RequestMethod.POST)
//	@RequestMapping(value = "/in" )
	@RequestMapping("/login")
    public void checkUserInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	String username = request.getParameter("username");
    	int user_id = Integer.parseInt(username.trim());
        String user_password = request.getParameter("password");
//        String url = "http://" + request.getServerName() //服务器地址  
//                + ":"   
//                + request.getServerPort()           //端口号  
//                + request.getContextPath()      //项目名称  
//                + request.getServletPath()      //请求页面或其他地址  
//            + "?" + (request.getQueryString()); //参数 
//        System.out.println(url);
//        System.out.println(user_id);
//        System.out.println(user_password);
//        userService.checkUserBF(user_id, user_password);
       userService.checkUserBF(user_id, user_password);
//       userService.test();
       String str = String.valueOf(userService.loginStatus().get("BF"));
//       System.out.println(str);
//       PrintWriter printWriter = new PrintWriter("f://zichun.txt");
//       printWriter.write(str);
//       printWriter.close();       
       ServletOutputStream out = response.getOutputStream();
       OutputStreamWriter outWrite = new OutputStreamWriter(out ,"UTF-8");
       outWrite.write("用户："+user_id+"\n"+str);
       outWrite.flush();
       outWrite.close();
    }
}

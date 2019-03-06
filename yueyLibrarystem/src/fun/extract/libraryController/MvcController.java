package fun.extract.libraryController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fun.extract.libraryService.UserServiceImpl;

@Controller
@RequestMapping("/Mvc")
public class MvcController {
  private UserServiceImpl userService;
	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	} 


	@RequestMapping("/testByParam")
    public void getParamByReq(HttpServletRequest request, HttpServletResponse response) {
    	String username = request.getParameter("username");
//    	int user_id = Integer.parseInt(request.getParameter("username"));
    	int user_id = Integer.parseInt(username.trim());
//        int username = request.Integer.parseInt(request.getParameter("username"));
        String user_password = request.getParameter("password");
        String Url = request.getRequestURI();
        System.out.println(Url);
        System.out.println(user_id);
        System.out.println(user_password);
//        userService.setUser_id();
        userService.checkUserBF(user_id, user_password);
    }  
}

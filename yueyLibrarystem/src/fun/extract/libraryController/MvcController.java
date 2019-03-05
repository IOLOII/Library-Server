package fun.extract.libraryController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Mvc")
public class MvcController {

    @RequestMapping("/hellomvc")
    public String hello(){        
        return "hellomvc";
    }
}

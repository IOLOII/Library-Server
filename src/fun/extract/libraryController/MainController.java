package fun.extract.libraryController;

import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import fun.extract.libraryService.efile.FileService;
import fun.extract.libraryUtils.catchHtml.CatchHtml;

@Controller
//@RequestMapping("/y")
public class MainController {
//	private static Logger logger =LoggerFactory.getLogger(MainController.class);
	@RequestMapping("/catchHtml")
	public void testCatch(HttpServletRequest request, HttpServletResponse response)  throws IOException {
		// TODO Auto-generated method stub
//		ServletOutputStream out = response.getOutputStream();
//	    OutputStreamWriter outWrite = new OutputStreamWriter(out ,"UTF-8");
//		CatchHtml rt = new CatchHtml();
//		尚未实现将数据推送给客户端
		CatchHtml.catchHtml("https://cas.gzpyp.edu.cn","/tsg/zxgg/list_02.shtml");
	}
	
	@RequestMapping("/read")
	public String readPdf(){
//		return "index";
//		/yueyLibrarystem/html/index.html
//		return "/index";
//		/yueyLibrarystem/html//index.html
		return "readPdf";
	}
	
	@RequestMapping("/test")
	public ModelAndView testStaticSrc() {
		// TODO Auto-generated method stub
//		return "/testStaticSrc";
		return  new ModelAndView(new RedirectView("http://localhost:8099/test/016.pdf"));
//		http://localhost:8080/yueyLibrarystem/testStaticSource.action
	}
	@Autowired
	private FileService fileService;
	@RequestMapping("/testfile")
	public void testfile() throws Exception{
		fileService.getFileLink(1);
//		 test.testWsdlConnection("http://localhost:8080/test/imgtest.jpg");
	}
}

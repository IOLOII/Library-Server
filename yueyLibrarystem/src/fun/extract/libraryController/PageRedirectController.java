package fun.extract.libraryController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/page")
public class PageRedirectController {
	@RequestMapping("/koolearn")
	public ModelAndView pageRedirect(){
		return  new ModelAndView(new RedirectView("https://librarywap.koolearn.com/encryptedLogin/9fcf58a3105277a7"));
	}
	
	@RequestMapping("/wchineseall")
//	@Override
//	新语听书
	public ModelAndView pageRedirect1(){
		return  new ModelAndView(new RedirectView("http://gzpypu.w.chineseall.cn"));
	}
	
	@RequestMapping("/vipexam")
//	考试学习资源库
	public ModelAndView pageRedirect2(){
		return  new ModelAndView(new RedirectView("http://wx.vipexam.org/index.html"));
	}
		
	@RequestMapping("/weixinqq")
//	QQ阅读
	public ModelAndView pageRedirect3(){
		return  new ModelAndView(new RedirectView("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx54a70169c6558b8f&redirect_uri=http%3A%2F%2Fwww.readse.com%2Fservice%2Fwechat.user.auth.action&response_type=code&scope=snsapi_base&state=eyJib29raWQiOiIiLCJjb3JwQ29kZSI6InFrX2d6Znl6eWpzeHkiLCJnb1R5cGUiOjAsInNpbXBsZUF1dGgiOnRydWV9&connect_redirect=1#wechat_redirect"));
	}
	
	@RequestMapping("/bookan")
//	博看微书屋
	public ModelAndView pageRedirect4(){
		return  new ModelAndView(new RedirectView("http://wk.bookan.com.cn/index.php?op=Authentication.redirect&id=2166"));
	}
	
	@RequestMapping("/casgzpyp")
//	信息视窗
	public ModelAndView pageRedirect5(){
		return  new ModelAndView(new RedirectView("http://cas.gzpyp.edu.cn/tsg/xxfwsc/2018-04/02/content_4dcc3c0ec95a4c168595893623210f59.shtml"));
	}
	
	@RequestMapping("/183read")
//	中邮期刊
	public ModelAndView pageRedirect6(){
		return  new ModelAndView(new RedirectView("http://open.183read.cc/magazine/pyptsg.html"));
	}
	
	@RequestMapping("/readerstar")
//	信息视窗
	public ModelAndView pageRedirect7(){
		return  new ModelAndView(new RedirectView("https://gzpyp.readerstar.com/"));
	}
}

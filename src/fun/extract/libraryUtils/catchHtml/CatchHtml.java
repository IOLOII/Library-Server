package fun.extract.libraryUtils.catchHtml; 

import java.io.IOException; 

import org.jsoup.Jsoup; 
import org.jsoup.nodes.Document; 
import org.jsoup.nodes.Element; 

import org.jsoup.select.Elements; 

public class CatchHtml {
	public static void catchHtml(String headUrl,String endUrl)throws IOException {
			//File input = new File("./index.html");
			Document doc = null; 
//			String headUrl = "https://cas.gzpyp.edu.cn";
//			String endUrl = "/tsg/zxgg/list_02.shtml"; 
					//Document doc = Jsoup.connect("http://jsoup.org").get();
			try {
				//doc = Jsoup.parse(input, "UTF-8", "https://cas.gzpyp.edu.cn/tsg/zxgg/list_02.shtml");
				doc = Jsoup.connect(headUrl + endUrl).get(); 
				//url:	 https://cas.gzpyp.edu.cn/tsg/zxgg/2018-11/23/content_e5a3d755dc0e4768853538679e24b00c.shtml
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
			}
//			Elements divs1 = 
					doc.select("div.TopBox").remove(); 
//			Elements divs2 = 
					doc.select("div.Position").remove(); 
//			Elements divs3 =
					doc.select("div.pagediv").remove(); 	
			
			Elements links = doc.select("a[href]").attr("target", "_parent"); 	
			Elements linkspans = doc.select("span"); 
			String linkHref = null; 
            String linkText = null; 
            for (Element link:links) {			
				linkHref = link.attr("href"); 
				linkText = link.text(); 			
				System.out.println(linkText + "：\n" + headUrl + linkHref + "\n"); 
					}
		  	for (Element linkspan:linkspans) {
				String linkspanv = linkspan.text(); 
				System.out.println(linkspanv); 
			}
	}
}
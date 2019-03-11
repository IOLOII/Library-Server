package fun.extract.libraryUtils.catchHtml;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class LinkHref {
	 public String getLinkHref() {
		 Element doc = null;
			Elements links = doc.select("a[href]").attr("target", "_parent"); 
			for (Element link : links) {
		    String linkHref = link.attr("href");
		   // String linkText = link.text();
		    System.out.println(linkHref);
		    return linkHref;
		}
			return null;
	 }		 
}

package peter.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import java.net.URL;
import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

/**
 * <p>Title: XMLServlet</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Me, Myself and I</p>
 * <p>Description: </p>
 * A simple servlet for loading XML and displaying it.
 * It is meant to provide a comparison between JSP
 * and servlets to show it's impact on performance.
 * @author Peter Lin
 * @version 0.1
 */
public class XMLServlet extends HttpServlet {

	/**
	 * Constructor for XMLServlet.
	 */
	public XMLServlet() {
		super();
	}

	/**
	 * doGet simply calls do service. We don't care
	 * about request method. Get and Post are both fine.
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws IOException, ServletException {
			doService(req,resp);
		}

	/**
	 * doPost simply calls do service. We don't care
	 * about request method. Get and Post are both fine.
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws IOException, ServletException {
			doService(req,resp);
		}

	/**
	 * We use doService, since it will work for both
	 * post and get. In some cases it may be desirable
	 * to use doGet or doPost. For more information on
	 * when to use each, refer to other books.
	 */
	public void doService(HttpServletRequest req, HttpServletResponse resp)
		throws IOException, ServletException {

		// first we set the content type.
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String filename = new String();
        // look at the request params to see which one the
        // person chose. this also makes it easier to 
        // benchmark with JMeter, since we can pass a
        // different dataset.
        if (req.getParameter("addrbook") != null) {
        	filename = req.getParameter("addrbook");
        } else {
        	filename = "http://localhost:8080/addrbook/data/simple_100.xml";
        }
        String xmlFile = new String();
        if (req.getParameter("style") != null) {
        	xmlFile = req.getParameter("style");
        } else {
        	xmlFile = "http://localhost:8080/addrbook/data/simple_data.xsl";	
        }
        out.write("<html>");
        out.write("<body>");
        this.transform(out,filename,xmlFile);
        out.write("</body>");
        out.write("</html>");
        out.close();
	}
	
	/**
	 * transform the xml using xsl
	 * @param PrintWriter out
	 * 
	 */
	public void transform(PrintWriter out, String source, String stylesheet) {
		try {
			TransformerFactory tfac = TransformerFactory.newInstance();
			Source ssource = this.getStreamSource(source);
			Result result = this.getResult(out);
			Transformer trans = tfac.newTransformer(getStreamSource(stylesheet));
			trans.transform(ssource,result);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	
	}

	/**
	 * Made a method incase we want to have an application
	 * cache. If that were the case, this method would change
	 * and call the necessary methods to get cached data/
	 * objects.
	 * @param String source
	 * @return StreamSource
	 */
	public StreamSource getStreamSource(String source) {
		return new StreamSource(source);
	}

	/**
	 * Made a method incase we want to have an application
	 * cache. If that were the case, this method would change
	 * and call the necessary methods to get cached data/
	 * objects.
	 * @param PrintWriter writer
	 * @return StreamResult result
	 */
	public StreamResult getResult(PrintWriter writer) {
		return new StreamResult(writer);
	}		
}

package org.openjfx;

public class HelloServlet extends jakarta.servlet.http.HttpServlet {
	@Override
	protected void doGet(jakarta.servlet.http.HttpServletRequest req, jakarta.servlet.http.HttpServletResponse resp)
			throws jakarta.servlet.ServletException, java.io.IOException {

		resp.setContentType("text/html");
		jakarta.servlet.ServletOutputStream out = resp.getOutputStream();
		out.write("oh hello there ".getBytes());
		out.println(java.time.LocalDateTime.now().toString());
		out.println("FromMain: " + getServletContext().getAttribute("fromMain"));
		out.flush();
		out.close();
	}
}

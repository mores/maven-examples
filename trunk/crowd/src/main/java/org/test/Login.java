package org.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.atlassian.crowd.integration.http.CrowdHttpAuthenticator;
import com.atlassian.crowd.integration.http.filter.CrowdSecurityFilter;
import com.atlassian.crowd.model.user.User;

public class Login extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(Login.class);

    private CrowdHttpAuthenticator crowdHttpAuthenticator;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	logger.debug("doGet");
	ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
	crowdHttpAuthenticator = (CrowdHttpAuthenticator)applicationContext.getBean("crowdHttpAuthenticator");
	try {
		Boolean authenticated = crowdHttpAuthenticator.isAuthenticated(req, resp);
		if( authenticated )
		{
			getServletContext().getRequestDispatcher("/secure/").forward(req, resp);
			return;
		}
	} catch (Exception e) {
		logger.error(e.getMessage(), e);
	}
	getServletContext().getRequestDispatcher("/form.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	logger.debug("doPost");
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        crowdHttpAuthenticator = (CrowdHttpAuthenticator)applicationContext.getBean("crowdHttpAuthenticator");
	User user = null;
        String username = req.getParameter("username");
        String password = req.getParameter("password");

	try {
                user = crowdHttpAuthenticator.authenticate(req, resp, username, password);
		logger.info( "Name: " + user.getName() );
		getServletContext().getRequestDispatcher("/secure/").forward(req, resp);
	} catch (Exception e) {
                logger.error(e.getMessage(), e);
		getServletContext().getRequestDispatcher("/form.html").forward(req, resp);
	}
    }

}

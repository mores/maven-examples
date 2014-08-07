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

public class Logout extends HttpServlet
{
    private static final Logger logger = LoggerFactory.getLogger(Logout.class);

    private CrowdHttpAuthenticator crowdHttpAuthenticator;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        crowdHttpAuthenticator = (CrowdHttpAuthenticator)applicationContext.getBean("crowdHttpAuthenticator");
        try {
            crowdHttpAuthenticator.logout(req, resp);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        HttpSession session = req.getSession(false);
        session.invalidate();
        resp.sendRedirect("/crowd-example/");
    }
}

package main.java.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import main.java.facade.ourFacade;
import main.java.facade.implement.ourFacadeImpl;

/**
 * Spolocny predok servletov pre aplikaciu
 */
public class servlet extends HttpServlet {
 	protected void dispatch(String s, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(s).forward(req, resp);
    }

    /**
     * Vytovori fasadu
     * @return fasada na pristup k biznis vrstve
     */
    protected ourFacade getFacade() {
        return new ourFacadeImpl();
    }
}
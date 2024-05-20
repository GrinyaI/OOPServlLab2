package com.example.oopservllab2;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "RedirectServlet", urlPatterns = {"/books", "/feedback", "/contacts", "/aboutus"})
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = request.getServletPath();
        String targetPage = path.substring(1) + ".html";

        response.setStatus(response.SC_ACCEPTED);
        response.setHeader("Location", targetPage);
        response.sendRedirect(targetPage);
    }
}
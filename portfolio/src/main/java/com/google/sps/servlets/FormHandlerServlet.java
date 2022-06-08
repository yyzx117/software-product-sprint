package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String textValue = request.getParameter("text-input");
    boolean phone = Boolean.parseBoolean(request.getParameter("phone"));
    boolean email = Boolean.parseBoolean(request.getParameter("email"));

    // Write the value to the response so the user can see it.
    response.getWriter().println("Thanks for your submission!");

    if (phone) {
        System.out.println("Your Phone number: " + textValue);
        response.getWriter().println("Your Phone number: " + textValue);
    }
    if (email) {
        System.out.println("Your email address: " + textValue);
        response.getWriter().println("Your email address: " + textValue);
    }

  }
}

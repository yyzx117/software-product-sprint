package com.google.sps.servlets;

import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/date")
public class Data extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;");
        /*Date date = new Date();
        TimeZone EST = TimeZone.getTimeZone("GMT-5");
        response.getWriter().println("The current date is " + date);*/
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        response.getWriter().println("The current date in EST is " + df.format(date));
    }
}

package com.google.sps.servlets;
import com.google.gson.Gson;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.ArrayList;

@WebServlet("/server-stats")
public class ServerStats extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Calculate server stats
        String str1 = "California: San Francisco";
        String str2 = "California: San Jose";
        String str3 = "Florida: Miami";
        String str4 = "Florida: Orlando";
        String str5 = "Georgia: Atlanta";
        String str6= "Nevada: Las Vegas";
        List<String> arr = new ArrayList<>();
        arr.add(str1);
        arr.add(str2);
        arr.add(str3);
        arr.add(str4);
        arr.add(str5);
        arr.add(str6);

        // Convert the server stats to JSON
        Gson gson = new Gson();
        String json = gson.toJson(arr);

        // Send the JSON as the response
        response.setContentType("application/json;");
        response.getWriter().println(json);
    }
}

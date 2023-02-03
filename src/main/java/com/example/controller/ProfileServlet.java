package com.example.controller;

import com.example.util.Go;
import com.example.util.Jsp;
import com.example.util.Key;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;



@WebServlet(name = "ProfileServlet", value = Go.PROFILE)
public class ProfileServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Jsp.forward(request,response, "profile");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

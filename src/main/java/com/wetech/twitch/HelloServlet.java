//package com.wetech.twitch;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wetech.twitch.entity.response.Game;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

//@WebServlet(name = "helloServlet", value = "/game")
//public class HelloServlet extends HttpServlet {
//    private String message;
//
//    public void init() {
//        message = "Hello World!";
//    }
//
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("application/json");
//        ObjectMapper mapper = new ObjectMapper();
//        Game.Builder builder = new Game.Builder();
//        builder.setName("World of Warcraft");
//        builder.setDeveloper("Blizzard Entertainment");
//        builder.setReleaseTime("Feb 11, 2005");
//        builder.setWebsite("https://www.worldofwarcraft.com");
//        builder.setPrice(49.99);
//
//
//        Game game = builder.build();
//        response.getWriter().print(mapper.writeValueAsString(game));
//
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        // Read game information from request body
////        JSONObject jsonRequest = new JSONObject(IOUtils.toString(request.getReader()));
////        String name = jsonRequest.getString("name");
////        String developer = jsonRequest.getString("developer");
////        String releaseTime = jsonRequest.getString("release_time");
////        String website = jsonRequest.getString("website");
////        float price = jsonRequest.getFloat("price");
//        // Print game information to IDE console
//        ObjectMapper objectMapper = new ObjectMapper();
//        Game game = objectMapper.readValue(request.getReader(), Game.class);
//        System.out.println("Name is: " + game.getName());
//        System.out.println("Developer is: " + game.getDeveloper());
//        System.out.println("Release time is: " + game.getReleaseTime());
//
//        response.setContentType("application/json");
//        JSONObject jsonResponse = new JSONObject();
//        jsonResponse.put("status", "ok");
//        response.getWriter().print(jsonResponse);
//    }
//
//    public void destroy() {
//    }
//}
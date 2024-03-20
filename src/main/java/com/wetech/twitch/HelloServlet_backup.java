//package com.laioffer.jupiter;
//
//import java.io.*;
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;
//
//import javax.servlet.ServletException;
//
//import org.json.JSONObject;
//import org.apache.commons.io.IOUtils;
//
//
////import com.laioffer.jupiter.entity.response.Game;  //why这个没用呢？
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@WebServlet(name = "helloServlet", value = "/game") //这个是请求forward给谁 //名字只能唯一
//public class HelloServlet extends HttpServlet {
//    private String message;
//
//    public void init() {
//        message = "Hello Test!";
//    } // 这个是请求返回的样子
////version 1
//    //@Override //这里在重写，不过这个override可以不需要
////    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
////        response.setContentType("text/html");
////
////        // Hello
//////        PrintWriter out = response.getWriter();
////
////        //新加的
////        String gamename = request.getParameter("gamename");
////        response.getWriter().print("Game is: " + gamename);
////
//////        out.println("<html><body>");
//////        out.println("<h1>" + message + "</h1>");
//////        out.println("</body></html>");
////    }
//
//    //version2
////    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
////        //ServletException, 这个没有throw
////        response.setContentType("application/json");
////        JSONObject game = new JSONObject();
////        game.put("name", "World of Warcraft");
////        game.put("developer", "Blizzard Entertainment");
////        game.put("release_time", "Feb 11, 2005");
////        game.put("website", "https://www.worldofwarcraft.com");
////        game.put("price", 49.99);
////
////        // Write game information to response body
////        response.getWriter().print(game);
////
////    }
////version3
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        // Read game information from request body
//        JSONObject jsonRequest = new JSONObject(IOUtils.toString(request.getReader()));
//        String name = jsonRequest.getString("name");
//        String developer = jsonRequest.getString("developer");
//        String releaseTime = jsonRequest.getString("release_time");
//        String website = jsonRequest.getString("website");
//        float price = jsonRequest.getFloat("price");
//        // Print game information to IDE console
//        System.out.println("Name is: " + name);
//        System.out.println("Developer is: " + developer);
//        System.out.println("Release time is: " + releaseTime);
//        System.out.println("Website is: " + website);
//        System.out.println("Price is: " + price);
//        // Return status = ok as response body to the client
//        response.setContentType("application/json");
//        JSONObject jsonResponse = new JSONObject();
//        jsonResponse.put("status", "ok");
//        response.getWriter().print(jsonResponse);
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
//    }
//
//    public void destroy() {
//    }
//}
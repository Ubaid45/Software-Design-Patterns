package com.practice.behaviroal.patterns.chainOfResponsibility;

public class WebServer {
    private Handler handler;

    //Passing First Handler
    public WebServer(Handler handler){
        this.handler = handler;
    }

    public void handle(HttpRequest request){
        handler.handle(request);
    }
}


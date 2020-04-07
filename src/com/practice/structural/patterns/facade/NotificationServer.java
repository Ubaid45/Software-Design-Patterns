package com.practice.structural.patterns.facade;

public class NotificationServer {
    // connect -> Connection
    // authentication (appID, key) -> AuthToken
    // send (authToken, message, target)
    // disconnect -> Disconnect

    public Connection connect(String ipAddress){
        return new Connection();
    }

    public AuthToken authenticate(String appID, String key){
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target){
        System.out.println( "On target: "+ target +", Message : "+message.getContent());
    }
}

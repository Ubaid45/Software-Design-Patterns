package com.practice.behaviroal.patterns.chainOfResponsibility;



public abstract class Handler {
    private Handler next;

    public Handler(Handler next){
        this.next = next;
    }

    public void handle(HttpRequest request){
        // if doHandle = true, it means we are done processing, so stop it. Continue in case of false
        if (doHandle(request))
            return;

        // if not last element, fetch next
        if (next != null)
            next.handle(request);

    }
    public abstract boolean doHandle(HttpRequest request);
}

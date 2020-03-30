package com.practice.behaviroal.patterns.memento.Exercise;

import java.util.ArrayList;
import java.util.List;

public class DocumentProcessorHistory {
    private ArrayList<DocumentState> state = new ArrayList<>();

    public void push(DocumentState data){
        state.add(data);
    }

    public DocumentState pop(){
        var lastElement = state.size()-1;
        var lastState = state.get(lastElement);
        state.remove(lastState);
        return lastState;
    }
}

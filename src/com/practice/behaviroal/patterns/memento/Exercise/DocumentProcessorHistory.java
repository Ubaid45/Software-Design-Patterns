package com.practice.behaviroal.patterns.memento.Exercise;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class DocumentProcessorHistory {
    private Deque<DocumentState> mementos = new ArrayDeque<>();

    public void push(DocumentState memento) {
        mementos.push(memento);
    }

    public DocumentState pop() {
        return mementos.pop();
    }
}

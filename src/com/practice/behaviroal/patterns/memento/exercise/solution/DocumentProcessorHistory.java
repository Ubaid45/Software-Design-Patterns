package com.practice.behaviroal.patterns.memento.exercise.solution;

import java.util.ArrayDeque;
import java.util.Deque;

public class DocumentProcessorHistory {
    private Deque<DocumentState> mementos = new ArrayDeque<>();

    public void push(DocumentState memento) {
        mementos.push(memento);
    }

    public DocumentState pop() {
        return mementos.pop();
    }
}

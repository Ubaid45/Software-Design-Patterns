package com.practice.behaviroal.patterns;

import com.practice.behaviroal.patterns.memento.Editor;
import com.practice.behaviroal.patterns.memento.History;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}

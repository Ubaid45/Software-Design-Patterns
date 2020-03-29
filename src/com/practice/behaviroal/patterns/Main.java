package com.practice.behaviroal.patterns;

import com.practice.behaviroal.patterns.iterator.BrowseHistory;
import com.practice.behaviroal.patterns.iterator.Iterator;
import com.practice.behaviroal.patterns.memento.Editor;
import com.practice.behaviroal.patterns.memento.History;
import com.practice.behaviroal.patterns.state.BrushTool;
import com.practice.behaviroal.patterns.state.Canvas;
import com.practice.behaviroal.patterns.state.EraserTool;
import com.practice.behaviroal.patterns.state.SelectionTool;
import com.practice.behaviroal.patterns.strategy.BlackAndWhiteFilter;
import com.practice.behaviroal.patterns.strategy.ImageStorage;
import com.practice.behaviroal.patterns.strategy.JpegCompressor;
import com.practice.behaviroal.patterns.strategy.PngCompressor;
import com.practice.behaviroal.patterns.template.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {
        //region Memento Pattern
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
        //endregion

        //region State Pattern
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();

        //endregion

        //region Iterator Pattern
        var browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");

        Iterator iterator = browseHistory.createIterator();
        while (iterator.hasNext()){
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }

        //endregion

        //region Strategy Pattern
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("b", new PngCompressor(), new BlackAndWhiteFilter());

        //endregion

        //region Template Pattern
        var task = new TransferMoneyTask();
        task.execute();

        //endregion
    }
}

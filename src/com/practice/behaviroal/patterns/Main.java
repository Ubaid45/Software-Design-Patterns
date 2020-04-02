package com.practice.behaviroal.patterns;

import com.practice.behaviroal.patterns.chainOfResponsibility.*;
import com.practice.behaviroal.patterns.chainOfResponsibility.Compressor;
import com.practice.behaviroal.patterns.iterator.BrowseHistory;
import com.practice.behaviroal.patterns.iterator.Iterator;
import com.practice.behaviroal.patterns.memento.Editor;
import com.practice.behaviroal.patterns.memento.Exercise.Document;
import com.practice.behaviroal.patterns.memento.Exercise.DocumentProcessorHistory;
import com.practice.behaviroal.patterns.memento.Exercise.DocumentState;
import com.practice.behaviroal.patterns.memento.History;
import com.practice.behaviroal.patterns.observer.Chart;
import com.practice.behaviroal.patterns.observer.DataSource;
import com.practice.behaviroal.patterns.observer.SpreadSheet;
import com.practice.behaviroal.patterns.state.BrushTool;
import com.practice.behaviroal.patterns.state.Canvas;
import com.practice.behaviroal.patterns.state.EraserTool;
import com.practice.behaviroal.patterns.state.Exercise.Bicycle;
import com.practice.behaviroal.patterns.state.Exercise.Context;
import com.practice.behaviroal.patterns.state.Exercise.Driving;
import com.practice.behaviroal.patterns.state.Exercise.Walking;
import com.practice.behaviroal.patterns.state.SelectionTool;
import com.practice.behaviroal.patterns.strategy.*;
import com.practice.behaviroal.patterns.template.TransferMoneyTask;
import com.practice.behaviroal.patterns.visitor.AnchorNode;
import com.practice.behaviroal.patterns.visitor.HeadingNode;
import com.practice.behaviroal.patterns.visitor.HtmlDocument;
import com.practice.behaviroal.patterns.visitor.PlainTextOperation;

public class Main {

    public static void main(String[] args) {

        //region Behavioral Patterns

        //region Memento Pattern
        System.out.println("-------------- Memento Pattern Started --------------");
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

        //region Exercise Memento Pattern
        System.out.println("-------------- Memento Pattern (Exercise) Started --------------");
        var documentProcessorHistory = new DocumentProcessorHistory();
        var document = new Document();

        document.setContent("Hello");
        document.setFontName("Arial");
        document.setFontSize(12);
        documentProcessorHistory.push(document.createState());
        document.setContent("Hello2");
        document.setFontName("Roman");
        document.setFontSize(10);
        documentProcessorHistory.push(document.createState());
        document.setFontSize(13);
        documentProcessorHistory.push(document.createState());


        document.restoreState(documentProcessorHistory.pop());
        System.out.println(document);
        document.restoreState(documentProcessorHistory.pop());
        System.out.println(document);
        document.restoreState(documentProcessorHistory.pop());
        System.out.println(document);
        //endregion
        //endregion

        //region State Pattern
        System.out.println("-------------- State Pattern Started --------------");
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

        //region State (Exercise) Pattern
        System.out.println("-------------- State Pattern (Exercise) Started --------------");
        var context = new Context();
        context.setTravelType(new Driving());
        context.CalculateETA();
        context.CalculateDirection();

        context.setTravelType(new Bicycle());
        context.CalculateDirection();
        context.CalculateETA();

        context.setTravelType(new Walking());
        context.CalculateETA();
        context.CalculateDirection();
        //endregion
        //endregion

        //region Iterator Pattern
        System.out.println("-------------- Iterator Pattern Started --------------");
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
        System.out.println("-------------- Strategy Pattern Started --------------");
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("b", new PngCompressor(), new BlackAndWhiteFilter());

        //endregion

        //region Template Pattern
        System.out.println("-------------- Template Pattern Started --------------");
        var task = new TransferMoneyTask();
        task.execute();

        //endregion

        //region Observer Pattern
        System.out.println("-------------- Observer Pattern Started --------------");
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);

        //endregion

        //region Visitor Pattern
        System.out.println("-------------- Visitor Pattern Started --------------");
        var htmlDocument = new HtmlDocument();
        htmlDocument.add(new HeadingNode());
        htmlDocument.add(new AnchorNode());
        htmlDocument.execute(new PlainTextOperation());
        //endregion

        //region Chain of Responsibility Pattern
        System.out.println("-------------- Chain of Responsibility Pattern Started --------------");

        // Build a processing pipeline in order Authenticator -> //Logger -> Compressor -> Encryptor
        var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
        //var logger = new Logger(compressor);
        var authenticator = new Authenticator(compressor);

        var webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "1234"));

        //endregion

        //region Mediator Pattern
        System.out.println("-------------- Mediator Pattern Started --------------");


        //endregion

        //region Command Pattern
        System.out.println("-------------- Command Pattern Started --------------");


        //endregion

        //endregion

        //region Structural Patterns

        //region Composite Pattern
        System.out.println("-------------- Composite Pattern Started --------------");


        //endregion

        //region Facade Pattern
        System.out.println("-------------- Facade Pattern Started --------------");


        //endregion

        //region Flyweight Pattern
        System.out.println("-------------- Flyweight Pattern Started --------------");


        //endregion

        //region Bridge Pattern
        System.out.println("-------------- Bridge Pattern Started --------------");


        //endregion

        //region Proxy Pattern
        System.out.println("-------------- Proxy Pattern Started --------------");


        //endregion

        //endregion
    }
}

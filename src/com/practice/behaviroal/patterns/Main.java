package com.practice.behaviroal.patterns;

import com.practice.behaviroal.patterns.chainOfResponsibility.*;
import com.practice.behaviroal.patterns.chainOfResponsibility.Compressor;
import com.practice.behaviroal.patterns.chainOfResponsibility.exercise.solution.DataReaderFactory;
import com.practice.behaviroal.patterns.command.*;
import com.practice.behaviroal.patterns.command.editor.BoldCommand;
import com.practice.behaviroal.patterns.command.editor.UndoCommand;
import com.practice.behaviroal.patterns.command.exercise.solution.SetContrastCommand;
import com.practice.behaviroal.patterns.command.exercise.solution.SetTextCommand;
import com.practice.behaviroal.patterns.command.exercise.solution.VideoEditor;
import com.practice.behaviroal.patterns.command.fx.Button;
import com.practice.behaviroal.patterns.iterator.BrowseHistory;
import com.practice.behaviroal.patterns.iterator.Iterator;
import com.practice.behaviroal.patterns.iterator.exercise.solution.Product;
import com.practice.behaviroal.patterns.iterator.exercise.solution.ProductCollection;
import com.practice.behaviroal.patterns.mediator.exercise.solution.SignUpDialogBox;
import com.practice.behaviroal.patterns.mediator.normalWay.ArticlesDialogBox;
import com.practice.behaviroal.patterns.memento.Editor;
import com.practice.behaviroal.patterns.memento.exercise.solution.Document;
import com.practice.behaviroal.patterns.memento.exercise.solution.DocumentProcessorHistory;
import com.practice.behaviroal.patterns.memento.History;
import com.practice.behaviroal.patterns.observer.Chart;
import com.practice.behaviroal.patterns.observer.DataSource;
import com.practice.behaviroal.patterns.observer.SpreadSheet;
import com.practice.behaviroal.patterns.observer.exercise.solution.StatusBar;
import com.practice.behaviroal.patterns.observer.exercise.solution.Stock;
import com.practice.behaviroal.patterns.observer.exercise.solution.StockListView;
import com.practice.behaviroal.patterns.state.BrushTool;
import com.practice.behaviroal.patterns.state.Canvas;
import com.practice.behaviroal.patterns.state.EraserTool;
import com.practice.behaviroal.patterns.state.exercise.solution.Bicycle;
import com.practice.behaviroal.patterns.state.exercise.solution.Context;
import com.practice.behaviroal.patterns.state.exercise.solution.Driving;
import com.practice.behaviroal.patterns.state.exercise.solution.Walking;
import com.practice.behaviroal.patterns.state.SelectionTool;
import com.practice.behaviroal.patterns.strategy.*;
import com.practice.behaviroal.patterns.strategy.exercise.solution.ChatClient;
import com.practice.behaviroal.patterns.strategy.exercise.solution.DES;
import com.practice.behaviroal.patterns.template.TransferMoneyTask;
import com.practice.behaviroal.patterns.template.exercise.solution.ChatWindow;
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

        //region Memento Pattern (Exercise)
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

        //region State Pattern (Exercise)
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

        //region Iterator Pattern (Exercise)
        System.out.println("-------------- Iterator Pattern (Exercise) Started --------------");
        var collection = new ProductCollection();
        collection.add(new Product(1, "a"));
        collection.add(new Product(2, "b"));
        collection.add(new Product(3, "c"));

        var productIterator = collection.createIterator();
        while (productIterator.hasNext()) {
            System.out.println(productIterator.current());
            productIterator.next();
        }
        //endregion
        //endregion

        //region Strategy Pattern
        System.out.println("-------------- Strategy Pattern Started --------------");
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("b", new PngCompressor(), new BlackAndWhiteFilter());

        //region Strategy Pattern (Exercise)
        System.out.println("-------------- Strategy Pattern (Exercise) Started --------------");
        var client = new ChatClient(new DES());
        client.send("Hello World");
        //endregion
        //endregion

        //region Template Pattern
        System.out.println("-------------- Template Pattern Started --------------");
        var task = new TransferMoneyTask();
        task.execute();

        //region Template Pattern (Exercise)
        System.out.println("-------------- Template Pattern (Exercise) Started --------------");
        var window = new ChatWindow();
        window.close();

        //endregion
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

        //region Observer Pattern (Exercise)
        System.out.println("-------------- Observer Pattern Started (Exercise) --------------");
        var statusBar = new StatusBar();
        var stockListView = new StockListView();

        var stock1 = new Stock("stock1", 10);
        var stock2 = new Stock("stock2", 20);
        var stock3 = new Stock("stock3", 30);

        // The status bar shows the popular stocks
        statusBar.addStock(stock1);
        statusBar.addStock(stock2);

        // The stock view list shows all stocks
        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        stockListView.addStock(stock3);

        // Causes both statusBar and stockListView to get refreshed
        stock2.setPrice(21);

        // Causes only the stockListView to get refreshed. (statusBar
        // is not watching this stock.)
        stock3.setPrice(9);
        //endregion
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

        //region Chain of Responsibility (Exercise) Pattern

        var reader = DataReaderFactory.getDataReaderChain();
        reader.read("data.xls");
        reader.read("data.qbw");
        reader.read("data.numbers");

        //endregion
        //endregion

        //region Mediator Pattern
        System.out.println("-------------- Mediator Pattern Started --------------");
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();

        //region Mediator Pattern (Exercise)
        System.out.println("-------------- Mediator Pattern (Exercise) Started --------------");
        var signUpDialogBox = new SignUpDialogBox();
        signUpDialogBox.simulateUserInteraction();

        //endregion
        //endregion

        //region Command Pattern
        System.out.println("-------------- Command Pattern Started --------------");
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();

        System.out.println("Print recorded sequence");
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
        composite.execute();

        var editorHistory = new com.practice.behaviroal.patterns.command.editor.History();
        var editorDocument = new com.practice.behaviroal.patterns.command.editor.HtmlDocument();
        editorDocument.setContent("Hello World");

        var boldCommand = new BoldCommand(editorDocument, editorHistory);
        boldCommand.execute();
        System.out.println("Execute Command: "+editorDocument.getContent());
        //boldCommand.unexecute();
        //System.out.println("Unexecute Command: "+editorDocument.getContent());
        var undoCommand = new UndoCommand(editorHistory);
        undoCommand.execute();
        System.out.println("After undo Command: "+editorDocument.getContent());

        //region Command Pattern (Exercise)
        System.out.println("-------------- Command Pattern (Exercise) Started --------------");

        var videoEditor = new VideoEditor();
        var commandHistory = new com.practice.behaviroal.patterns.command.exercise.solution.History();

        var setTextCommand = new SetTextCommand("Video Title", videoEditor, commandHistory);
        setTextCommand.execute();
        System.out.println("TEXT: " + videoEditor);

        var setContrast = new SetContrastCommand(1, videoEditor, commandHistory);
        setContrast.execute();
        System.out.println("CONTRAST: " + videoEditor);

        var undoCommandVideoEditor = new com.practice.behaviroal.patterns.command.exercise.solution.UndoCommand(commandHistory);
        undoCommandVideoEditor.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommandVideoEditor.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommandVideoEditor.execute();
        System.out.println("UNDO: " + videoEditor);
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

package com.practice;

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
import com.practice.behaviroal.patterns.visitor.exercise.solution.NoiseReductionFilter;
import com.practice.behaviroal.patterns.visitor.exercise.solution.NormalizeFilter;
import com.practice.behaviroal.patterns.visitor.exercise.solution.ReverbFilter;
import com.practice.behaviroal.patterns.visitor.exercise.solution.WavFile;
import com.practice.structural.patterns.adapter.CaramelFilter;
import com.practice.structural.patterns.adapter.Image;
import com.practice.structural.patterns.adapter.ImageView;
import com.practice.structural.patterns.adapter.exercise.EmailClient;
import com.practice.structural.patterns.adapter.exercise.solution.GmailAdapter;
import com.practice.structural.patterns.adapter.thirdPartyFilters.Caramel;
import com.practice.structural.patterns.composite.Circle;
import com.practice.structural.patterns.composite.Group;
import com.practice.structural.patterns.composite.Shape;
import com.practice.structural.patterns.composite.Square;
import com.practice.structural.patterns.composite.exercise.HumanResource;
import com.practice.structural.patterns.composite.exercise.Team;
import com.practice.structural.patterns.composite.exercise.Truck;
import com.practice.structural.patterns.facade.Connection;
import com.practice.structural.patterns.facade.Message;
import com.practice.structural.patterns.facade.NotificationServer;
import com.practice.structural.patterns.facade.NotificationService;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        //region Behavioral Patterns

        System.out.println(ANSI_RED + "\n******** BEHAVIORAL PATTERNS ******\n"+ ANSI_RESET);

        //region Memento Pattern
        System.out.println("\n-------------- Memento Pattern Started --------------");
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
        System.out.println("\n-------------- Memento Pattern (Exercise) Started --------------");
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
        System.out.println("\n-------------- State Pattern Started --------------");
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
        System.out.println("\n-------------- State Pattern (Exercise) Started --------------");
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
        System.out.println("\n-------------- Iterator Pattern Started --------------");
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
        System.out.println("\n-------------- Iterator Pattern (Exercise) Started --------------");
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
        System.out.println("\n-------------- Strategy Pattern Started --------------");
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("b", new PngCompressor(), new BlackAndWhiteFilter());

        //region Strategy Pattern (Exercise)
        System.out.println("\n-------------- Strategy Pattern (Exercise) Started --------------");
        var client = new ChatClient(new DES());
        client.send("Hello World");
        //endregion
        //endregion

        //region Template Pattern
        System.out.println("\n-------------- Template Pattern Started --------------");
        var task = new TransferMoneyTask();
        task.execute();

        //region Template Pattern (Exercise)
        System.out.println("\n-------------- Template Pattern (Exercise) Started --------------");
        var window = new ChatWindow();
        window.close();

        //endregion
        //endregion

        //region Observer Pattern
        System.out.println("\n-------------- Observer Pattern Started --------------");
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);

        //region Observer Pattern (Exercise)
        System.out.println("\n-------------- Observer Pattern Started (Exercise) --------------");
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
        System.out.println("\n-------------- Visitor Pattern Started --------------");
        var htmlDocument = new HtmlDocument();
        htmlDocument.add(new HeadingNode());
        htmlDocument.add(new AnchorNode());
        htmlDocument.execute(new PlainTextOperation());

        //region Visitor Pattern (Exercise)
        System.out.println("\n-------------- Visitor Pattern (Exercise) Started --------------");
        var wavFile = WavFile.read("myfile.wav");
        wavFile.applyFilter(new NoiseReductionFilter());
        wavFile.applyFilter(new ReverbFilter());
        wavFile.applyFilter(new NormalizeFilter());
        //endregion
        //endregion

        //region Chain of Responsibility Pattern
        System.out.println("\n-------------- Chain of Responsibility Pattern Started --------------");

        // Build a processing pipeline in order Authenticator -> //Logger -> Compressor -> Encryptor
        var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
        //var logger = new Logger(compressor);
        var authenticator = new Authenticator(compressor);

        var webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "1234"));

        //region Chain of Responsibility (Exercise) Pattern
        System.out.println("\n-------------- Chain of Responsibility Pattern (Exercise) Started --------------");

        var reader = DataReaderFactory.getDataReaderChain();
        reader.read("data.xls");
        reader.read("data.qbw");
        reader.read("data.numbers");

        //endregion
        //endregion

        //region Mediator Pattern
        System.out.println("\n-------------- Mediator Pattern Started --------------");
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();

        //region Mediator Pattern (Exercise)
        System.out.println("\n-------------- Mediator Pattern (Exercise) Started --------------");
        var signUpDialogBox = new SignUpDialogBox();
        signUpDialogBox.simulateUserInteraction();

        //endregion
        //endregion

        //region Command Pattern
        System.out.println("\n-------------- Command Pattern Started --------------");
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
        System.out.println("\n-------------- Command Pattern (Exercise) Started --------------");

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
        //endregion

        //region Structural Patterns

        System.out.println(ANSI_RED + "\n******** STRUCTURAL PATTERNS ******\n"+ ANSI_RESET);

        //region Composite Pattern
        System.out.println("-------------- Composite Pattern Started --------------");

        var group1 = new Group();
        group1.add(new Square()); // square
        group1.add(new Square()); // square

        var group2 = new Group();
        group2.add(new Circle()); // square
        group2.add(new Circle()); // square

        var group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();
        group.move();

        //region Composite (Exercise) Pattern
        System.out.println("\n-------------- Composite Pattern (Exercise) Started --------------");

        var subTeam1 = new Team();
        subTeam1.add(new Truck());
        subTeam1.add(new HumanResource());
        subTeam1.add(new HumanResource());

        var subTeam2 = new Team();
        subTeam2.add(new Truck());
        subTeam2.add(new HumanResource());
        subTeam2.add(new HumanResource());

        var team = new Team();
        team.add(subTeam1);
        team.add(subTeam2);

        team.deploy();
        //endregion

        //endregion

        //region Adapter Pattern
        System.out.println("\n-------------- Adapter Pattern Started --------------");

        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));

        //region Adapter (Exercise) Pattern
        System.out.println("\n-------------- Adapter Pattern (Exercise) Started --------------");
        var emailClient = new EmailClient();
        emailClient.addProvider(new GmailAdapter());
        emailClient.downloadEmails();
        //endregion
        //endregion

        //region Decorator Pattern
        System.out.println("\n-------------- Decorator Pattern Started --------------");

        //region Decorator (Exercise) Pattern
        System.out.println("\n-------------- Decorator Pattern (Exercise) Started --------------");

        //endregion
        //endregion

        //region Facade Pattern
        System.out.println("\n-------------- Facade Pattern Started --------------");

        var notificationService = new NotificationService();
        notificationService.Send("Hello World", "Android");

        //region Facade (Exercise) Pattern
        System.out.println("\n-------------- Facade Pattern (Exercise) Started --------------");

        //endregion
        //endregion

        //region Flyweight Pattern
        System.out.println("\n-------------- Flyweight Pattern Started --------------");

        //region Flyweight (Exercise) Pattern
        System.out.println("\n-------------- Flyweight Pattern (Exercise) Started --------------");

        //endregion

        //endregion

        //region Bridge Pattern
        System.out.println("\n-------------- Bridge Pattern Started --------------");

        //region Bridge (Exercise) Pattern
        System.out.println("\n-------------- Bridge Pattern (Exercise) Started --------------");

        //endregion
        //endregion

        //region Proxy Pattern
        System.out.println("\n-------------- Proxy Pattern Started --------------");

        //region Proxy (Exercise) Pattern
        System.out.println("\n-------------- Proxy Pattern (Exercise) Started --------------");

        //endregion

        //endregion

        //endregion
    }
}

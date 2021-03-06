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
import com.practice.behaviroal.patterns.memento.History;
import com.practice.behaviroal.patterns.memento.exercise.solution.Document;
import com.practice.behaviroal.patterns.memento.exercise.solution.DocumentProcessorHistory;
import com.practice.behaviroal.patterns.observer.Chart;
import com.practice.behaviroal.patterns.observer.DataSource;
import com.practice.behaviroal.patterns.observer.SpreadSheet;
import com.practice.behaviroal.patterns.observer.exercise.solution.StatusBar;
import com.practice.behaviroal.patterns.observer.exercise.solution.Stock;
import com.practice.behaviroal.patterns.observer.exercise.solution.StockListView;
import com.practice.behaviroal.patterns.state.BrushTool;
import com.practice.behaviroal.patterns.state.Canvas;
import com.practice.behaviroal.patterns.state.EraserTool;
import com.practice.behaviroal.patterns.state.SelectionTool;
import com.practice.behaviroal.patterns.state.exercise.solution.Bicycle;
import com.practice.behaviroal.patterns.state.exercise.solution.Context;
import com.practice.behaviroal.patterns.state.exercise.solution.Driving;
import com.practice.behaviroal.patterns.state.exercise.solution.Walking;
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
import com.practice.creational.patterns.abstract_factory.CardType;
import com.practice.creational.patterns.abstract_factory.CreditCard;
import com.practice.creational.patterns.abstract_factory.CreditCardFactory;
import com.practice.creational.patterns.factory.dressing.BasicDressing;
import com.practice.creational.patterns.factory.dressing.DressingType;
import com.practice.creational.patterns.factory.dressing.DressingFactory;
import com.practice.creational.patterns.factory.website.Website;
import com.practice.creational.patterns.factory.website.WebsiteFactory;
import com.practice.creational.patterns.factory.website.WebsiteType;
import com.practice.creational.patterns.prototype.Movie;
import com.practice.creational.patterns.prototype.PrototypeEverydayDemo;
import com.practice.creational.patterns.prototype.Registry;
import com.practice.creational.patterns.prototype.Statements;
import com.practice.creational.patterns.singleton.DbSingleton;
import com.practice.structural.patterns.adapter.employee.Employee;
import com.practice.structural.patterns.adapter.employee.EmployeeClient;
import com.practice.structural.patterns.adapter.filters.CaramelFilter;
import com.practice.structural.patterns.adapter.filters.Image;
import com.practice.structural.patterns.adapter.filters.ImageView;
import com.practice.structural.patterns.adapter.exercise.EmailClient;
import com.practice.structural.patterns.adapter.exercise.solution.GmailAdapter;
import com.practice.structural.patterns.adapter.filters.thirdPartyFilters.Caramel;
import com.practice.structural.patterns.bridge.AdvancedRemoteControl;
import com.practice.structural.patterns.bridge.RemoteControl;
import com.practice.structural.patterns.bridge.SamsungTV;
import com.practice.structural.patterns.bridge.SonyTV;
import com.practice.structural.patterns.composite.Circle;
import com.practice.structural.patterns.composite.Group;
import com.practice.structural.patterns.composite.Square;
import com.practice.structural.patterns.composite.exercise.HumanResource;
import com.practice.structural.patterns.composite.exercise.Team;
import com.practice.structural.patterns.composite.exercise.Truck;
import com.practice.structural.patterns.decorator.sandwich.DressingDecorator;
import com.practice.structural.patterns.decorator.sandwich.MeatDecorator;
import com.practice.structural.patterns.decorator.sandwich.SimpleSandwich;
import com.practice.structural.patterns.decorator.streams.CloudStream;
import com.practice.structural.patterns.decorator.streams.CompressedCloudStream;
import com.practice.structural.patterns.decorator.streams.EncryptedCloudStream;
import com.practice.structural.patterns.decorator.streams.Stream;
import com.practice.structural.patterns.facade.NotificationService;
import com.practice.structural.patterns.facade.exercise.solution.TwitterAPI;
import com.practice.structural.patterns.flyweight.PointIconFactory;
import com.practice.structural.patterns.flyweight.PointService;
import com.practice.structural.patterns.flyweight.exercise.solution.CellContextFactory;
import com.practice.structural.patterns.proxy.Library;
import com.practice.structural.patterns.proxy.LoggingEbookProxy;
import com.practice.structural.patterns.proxy.exercise.solution.DbContext;
import com.practice.creational.patterns.builder.LunchOrder;
import com.practice.creational.patterns.singleton.DbSingletonDemo;

import java.sql.Connection;
import java.util.Calendar;
import java.util.List;

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

    public static void storeCreditCard(Stream stream){
        stream.write("1234-1234-1234-134");
    }
    public static void main(String[] args) {

        //region Creational Patterns

        System.out.println(ANSI_RED + "\n******** CREATIONAL PATTERNS ******\n"+ ANSI_RESET);

        //region Singleton Pattern
        System.out.println(ANSI_GREEN + "-------------- Singleton Pattern Started --------------"+ ANSI_RESET);

        DbSingleton instance = DbSingleton.getInstance();
        DbSingletonDemo facadeSingleton = new DbSingletonDemo();

        long timeBefore = 0;
        long timeAfter = 0;

        timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println("Creating instance first time takes: " + (timeAfter - timeBefore) + " seconds");

        facadeSingleton.CreateTable(conn);

        timeBefore = System.currentTimeMillis();
        timeAfter = System.currentTimeMillis();

        System.out.println("Creating/Getting instance next time takes: " + (timeAfter - timeBefore) + " seconds");


        facadeSingleton.SelectTable(conn);

        timeBefore = System.currentTimeMillis();
        timeAfter = System.currentTimeMillis();

        System.out.println("Creating/Getting instance next time takes: " + (timeAfter - timeBefore) + " seconds");

        //endregion

        //region Builder Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Builder Pattern Started --------------"+ ANSI_RESET);
        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Wheat").condiments("Ketchup").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

        //endregion

        //region Prototype Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Prototype Pattern Started --------------"+ ANSI_RESET);

        // Shallow copy  -> Both copies reference to same memory location
        System.out.println(ANSI_YELLOW + "Shallow copy without prototype pattern"+ ANSI_RESET);
        PrototypeEverydayDemo prototypeEverydayDemo = new PrototypeEverydayDemo();
        Statements firstStatement = prototypeEverydayDemo.Demo();
        System.out.println(firstStatement.getSql()+ ", " +firstStatement.getParameters() + ", " +firstStatement.getRecord());

        Statements secondStatement = firstStatement.clone();
        System.out.println(secondStatement.getSql()+ ", " +secondStatement.getParameters() + ", " +secondStatement.getRecord());

        // Deep copy  -> Both copies reference to their own separate memory location
        System.out.println(ANSI_YELLOW + "Deep copy with prototype pattern"+ ANSI_RESET);
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem(Movie.class.getSimpleName());
        movie.setTitle("Creational Patterns in Java");
        movie.setRuntime("5 hours");

        System.out.println(movie + ", " + movie.getRuntime() + "," + movie.getTitle());

        Movie anotherMovie = (Movie) registry.createItem(Movie.class.getSimpleName());
        anotherMovie.setTitle("Gang of Four");
        System.out.println(anotherMovie + ", " + anotherMovie.getRuntime() + "," + anotherMovie.getTitle());

        //endregion

        //region Factory Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Factory Pattern Started --------------"+ ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Calender factory"+ ANSI_RESET);
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

        System.out.println(ANSI_YELLOW + "Our own website factory"+ ANSI_RESET);

        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(site.getPages());

        System.out.println(ANSI_YELLOW + "Our own Dressing factory"+ ANSI_RESET);

        BasicDressing dressing = new DressingFactory();
        System.out.println(ANSI_PURPLE +"Combo dressing: "+ ANSI_RESET);
        dressing.createDressing(DressingType.Combo);

        System.out.println(ANSI_PURPLE +"Formal dressing: "+ ANSI_RESET);
        dressing.createDressing(DressingType.Formal);

        System.out.println(ANSI_PURPLE +"Casual dressing: "+ ANSI_RESET);
        dressing.createDressing(DressingType.Casual);

        //endregion

        //region Abstract Factory Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Abstract Factory Pattern Started --------------"+ ANSI_RESET);

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);

        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);

        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(card2.getClass());

        //endregion

        //endregion

        //region Behavioral Patterns

        System.out.println(ANSI_RED + "\n******** BEHAVIORAL PATTERNS ******\n"+ ANSI_RESET);

        //region Memento Pattern
        System.out.println(ANSI_GREEN + "-------------- Memento Pattern Started --------------"+ ANSI_RESET);
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
        System.out.println(ANSI_GREEN + "\n-------------- Memento Pattern (Exercise) Started --------------"+ ANSI_RESET);
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
        System.out.println(ANSI_GREEN + "\n-------------- State Pattern Started --------------"+ ANSI_RESET);
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
        System.out.println(ANSI_GREEN + "\n-------------- State Pattern (Exercise) Started --------------"+ ANSI_RESET);
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
        System.out.println(ANSI_GREEN + "\n-------------- Iterator Pattern Started --------------"+ ANSI_RESET);
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
        System.out.println(ANSI_GREEN + "\n-------------- Iterator Pattern (Exercise) Started --------------"+ ANSI_RESET);
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
        System.out.println(ANSI_GREEN + "\n-------------- Strategy Pattern Started --------------"+ ANSI_RESET);
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("b", new PngCompressor(), new BlackAndWhiteFilter());

        //region Strategy Pattern (Exercise)
        System.out.println(ANSI_GREEN + "\n-------------- Strategy Pattern (Exercise) Started --------------"+ ANSI_RESET);
        var client = new ChatClient(new DES());
        client.send("Hello World");
        //endregion
        //endregion

        //region Template Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Template Pattern Started --------------"+ ANSI_RESET);
        var task = new TransferMoneyTask();
        task.execute();

        //region Template Pattern (Exercise)
        System.out.println(ANSI_GREEN + "\n-------------- Template Pattern (Exercise) Started --------------"+ ANSI_RESET);
        var window = new ChatWindow();
        window.close();

        //endregion
        //endregion

        //region Observer Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Observer Pattern Started --------------"+ ANSI_RESET);
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);

        //region Observer Pattern (Exercise)
        System.out.println(ANSI_GREEN + "\n-------------- Observer Pattern Started (Exercise) --------------"+ ANSI_RESET);
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
        System.out.println(ANSI_GREEN + "\n-------------- Visitor Pattern Started --------------"+ ANSI_RESET);
        var htmlDocument = new HtmlDocument();
        htmlDocument.add(new HeadingNode());
        htmlDocument.add(new AnchorNode());
        htmlDocument.execute(new PlainTextOperation());

        //region Visitor Pattern (Exercise)
        System.out.println(ANSI_GREEN + "\n-------------- Visitor Pattern (Exercise) Started --------------"+ ANSI_RESET);
        var wavFile = WavFile.read("myfile.wav");
        wavFile.applyFilter(new NoiseReductionFilter());
        wavFile.applyFilter(new ReverbFilter());
        wavFile.applyFilter(new NormalizeFilter());
        //endregion
        //endregion

        //region Chain of Responsibility Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Chain of Responsibility Pattern Started --------------"+ ANSI_RESET);

        // Build a processing pipeline in order Authenticator -> //Logger -> Compressor -> Encryptor
        var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
        //var logger = new Logger(compressor);
        var authenticator = new Authenticator(compressor);

        var webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "1234"));

        //region Chain of Responsibility (Exercise) Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Chain of Responsibility Pattern (Exercise) Started --------------"+ ANSI_RESET);

        var reader = DataReaderFactory.getDataReaderChain();
        reader.read("data.xls");
        reader.read("data.qbw");
        reader.read("data.numbers");

        //endregion
        //endregion

        //region Mediator Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Mediator Pattern Started --------------"+ ANSI_RESET);
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();

        //region Mediator Pattern (Exercise)
        System.out.println(ANSI_GREEN + "\n-------------- Mediator Pattern (Exercise) Started --------------"+ ANSI_RESET);
        var signUpDialogBox = new SignUpDialogBox();
        signUpDialogBox.simulateUserInteraction();

        //endregion
        //endregion

        //region Command Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Command Pattern Started --------------"+ ANSI_RESET);
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
        System.out.println(ANSI_GREEN + "\n-------------- Command Pattern (Exercise) Started --------------"+ ANSI_RESET);

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
        System.out.println(ANSI_GREEN + "-------------- Composite Pattern Started --------------"+ ANSI_RESET);

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
        System.out.println(ANSI_GREEN + "\n-------------- Composite Pattern (Exercise) Started --------------"+ ANSI_RESET);

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
        System.out.println(ANSI_GREEN + "\n-------------- Adapter Pattern Started --------------"+ ANSI_RESET);

        System.out.println(ANSI_YELLOW + "\n-------------- Adapter Pattern (Mosh) --------------"+ ANSI_RESET);

        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));

        System.out.println(ANSI_YELLOW + "\n-------------- Adapter Pattern (Bryan) --------------"+ ANSI_RESET);

        EmployeeClient employeeClient = new EmployeeClient();

        List<Employee> employees = employeeClient.getEmployeeList();

        System.out.println(employees);

        //region Adapter (Exercise) Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Adapter Pattern (Exercise) Started --------------"+ ANSI_RESET);
        var emailClient = new EmailClient();
        emailClient.addProvider(new GmailAdapter());
        emailClient.downloadEmails();
        //endregion
        //endregion

        //region Decorator Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Decorator Pattern Started --------------"+ ANSI_RESET);

        System.out.println(ANSI_YELLOW + "\n-------------- Decorator Pattern (Mosh) --------------"+ ANSI_RESET);

        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));

        System.out.println(ANSI_YELLOW + "\n-------------- Decorator Pattern (Bryan) --------------"+ ANSI_RESET);

        var sandwich = new MeatDecorator(new DressingDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());

        //region Decorator (Exercise) Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Decorator Pattern (Exercise) Started --------------"+ ANSI_RESET);
        var codeEditor = new com.practice.structural.patterns.decorator.exercise.solution.Editor();
        codeEditor.openProject("...");
        //endregion

        //endregion

        //renaming, variable extraction, method extration, move variable, move method, change signature variable and methid.

        //region Facade Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Facade Pattern Started --------------"+ ANSI_RESET);

        var notificationService = new NotificationService();
        notificationService.Send("Hello World", "Android");

        //region Facade (Exercise) Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Facade Pattern (Exercise) Started --------------"+ ANSI_RESET);

        var twitterAPI = new TwitterAPI("appKey", "secret");
        var tweets = twitterAPI.getRecentTweets();
        //endregion
        //endregion

        //region Flyweight Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Flyweight Pattern Started --------------"+ ANSI_RESET);

        var pointService = new PointService(new PointIconFactory());
        for(var point : pointService.getPoints())
            point.draw();

        //region Flyweight (Exercise) Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Flyweight Pattern (Exercise) Started --------------"+ ANSI_RESET);

        var contextFactory = new CellContextFactory();
        var sheet = new com.practice.structural.patterns.flyweight.exercise.solution.SpreadSheet(contextFactory);
        sheet.setContent(0, 0, "Hello");
        sheet.setContent(1, 0, "World");
        sheet.setFontFamily(0, 0, "Arial");
        sheet.render();

        //endregion

        //endregion

        //region Bridge Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Bridge Pattern Started --------------"+ ANSI_RESET);

        var remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();
        var advancedRemoteControl = new AdvancedRemoteControl(new SonyTV());
        advancedRemoteControl.setChannels(5);

        var advancedSamsungRemoteControl = new AdvancedRemoteControl(new SamsungTV());
        advancedSamsungRemoteControl.setChannels(5);
        //endregion

        //region Proxy Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Proxy Pattern Started --------------"+ ANSI_RESET);

        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName : fileNames)
            library.add(new LoggingEbookProxy(fileName));

        library.openEbook("a");
        library.openEbook("b");

        //region Proxy (Exercise) Pattern
        System.out.println(ANSI_GREEN + "\n-------------- Proxy Pattern (Exercise) Started --------------"+ ANSI_RESET);

        //endregion

        var dbContext = new DbContext();
        var product = dbContext.getProduct(1);
        product.setName("Updated Name");
        dbContext.saveChanges();

        product.setName("Another name");
        dbContext.saveChanges();

        //endregion

        //endregion
    }
}

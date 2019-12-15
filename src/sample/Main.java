package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;


public class Main extends Application {

    // Array for storing settings in
    private String[] arraySettings = new String[4];
    private final int WEATHER = 0;
    private final int CALENDAR = 1;
    private final int RSS = 2;
    private final int SPOTIFY = 3;
    private final String WEATHER_DEFAULT = "Stony Brook, NY";
    private final String CALENDAR_DEFAULT = "calendarKey";
    private final String RSS_DEFAULT = "https://daringfireball.net/feeds/main";
    private final String SPOTIFY_DEFAULT = "spotifyKey";
    private final static String[] burner = new String[0];

    // Controls for the main screen
    private VBox root = new VBox();

    // Horizontal rows for each level
    private HBox level0 = new HBox();
    private HBox level1 = new HBox();
    private HBox level2 = new HBox();
    private HBox level3 = new HBox();
    // Scroll bars for each level
    private ScrollPane scroll1 = new ScrollPane();
    private ScrollPane scroll2 = new ScrollPane();
    private ScrollPane scroll3 = new ScrollPane();
    private ScrollPane scrollTasks = new ScrollPane();
    private ScrollPane scrollRSS = new ScrollPane();

    // Panes for major features
    private Text time = new Text();
    private Text day = new Text();
    private Text date = new Text();
    private HBox settings = new HBox();
    private HBox weather = new HBox();
    private VBox calendar  = new VBox();
    private HBox tasks = new HBox();
    // News nodes
    private VBox news0 = new VBox();
    private VBox news1 = new VBox();
    private VBox news2 = new VBox();
    private VBox news3 = new VBox();
    private VBox news4 = new VBox();
    private VBox news5 = new VBox();
    private VBox news6 = new VBox();
    private VBox news7 = new VBox();
    private VBox news8 = new VBox();
    private VBox news9 = new VBox();
    private Label newsArticle0 = new Label();
    private Label newsArticle1 = new Label();
    private Label newsArticle2 = new Label();
    private Label newsArticle3 = new Label();
    private Label newsArticle4 = new Label();
    private Label newsArticle5 = new Label();
    private Label newsArticle6 = new Label();
    private Label newsArticle7 = new Label();
    private Label newsArticle8 = new Label();
    private Label newsArticle9 = new Label();
    private Button newsLink0 = new Button();
    private Button newsLink1 = new Button();
    private Button newsLink2 = new Button();
    private Button newsLink3 = new Button();
    private Button newsLink4 = new Button();
    private Button newsLink5 = new Button();
    private Button newsLink6 = new Button();
    private Button newsLink7 = new Button();
    private Button newsLink8 = new Button();
    private Button newsLink9 = new Button();
    private static ArrayList<VBox> newsVBoxes = new ArrayList<>();
    private static ArrayList<Label> newsLabels = new ArrayList<>();
    private static ArrayList<Button> newsButtons = new ArrayList<>();

    private VBox rss = new VBox();

    // Spotify
    private HBox spotify = new HBox();
    private VBox spotifyA = new VBox();
    private VBox spotImagesA = new VBox();
    private VBox spotifyB = new VBox();
    private VBox spotImagesB = new VBox();

    // Settings panes
    private Button settingsButton = new Button("Settings...");
    private Button refreshButton = new Button("Refresh");
    private HBox settingsBox = new HBox();
    private VBox settingsNames = new VBox();
    private VBox settingsFields = new VBox();
    private Stage secondaryStage = new Stage();
    private Label weatherSettingLabel = new Label("Set weather location: ");
    private Label calendarSettingLabel = new Label("Set calendar key: ");
    private Label rssSettingLabel = new Label("Add rss feed: ");
    private Label spotifySettingLabel = new Label("Set Spotify account: ");
    private TextField weatherSettingField = new TextField();
    private TextField calendarSettingField = new TextField();
    private TextField rssSettingField = new TextField();
    private TextField spotifySettingField = new TextField();
    private Label settingsSpacer = new Label("");
    private Button confirmSettings = new Button("Confirm settings");

    // Weather panes
    private VBox weatherPicHiLo = new VBox();
    private VBox weatherForecast = new VBox();
    private Label location = new Label();
    // Planner panes
    private VBox tasksList = new VBox();
    private VBox tasksChecks = new VBox();
    private HashMap<CheckBox, Label> tasksMap = new HashMap<>();

    private Button addNewTask = new Button("Add new");
    private javafx.scene.control.TextField taskName =  new TextField();
    private javafx.scene.control.TextField taskPriority = new javafx.scene.control.TextField();
    private Text taskNameLabel = new Text("Task name: ");
    private Label taskPriorityLabel = new Label("Task priority: ");
    private Button confirmAddTask = new Button("Add task");
    private VBox taskLabels = new VBox();
    private VBox taskTextFields = new VBox();
    private HBox taskWindow = new HBox();
    private Stage newTaskStage = new Stage();

    private Border blackBorder = new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(3), new BorderWidths(3, 3, 3, 3)));
    private Insets inset10 = new Insets(10, 10, 10, 10);
    private Insets inset15 = new Insets(15, 15, 15, 15);


    @Override
    public void start(Stage primaryStage) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date date1 = new Date();
        String currentDay = LocalDate.now().getDayOfWeek().name();
        String currentDate = formatter.format(date1);
        currentDay = (currentDay.charAt(0) + "") + (currentDay.substring(1).toLowerCase());
        day.setText(currentDay + " ");
        date.setText(currentDate + " ");
        time.setFont(Font.font(30));
        day.setFont(Font.font(30));
        date.setFont(Font.font(30));

        initialize();
        addNodesToOtherNodes();
        setBorders();
        setPadding();
        setAlignment();
        setSpacing();
        setSizesOfNodes();
        getInit();
        setSettingsNull();
        boolean emptyFile = emptySettingsFile();
        //System.out.println(emptyFile);

        // Listener for window size to add scroll bar and resize all nodes
        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
                System.out.println("Width: " + newSceneWidth);
                double windowWidth = newSceneWidth.doubleValue();
                if(windowWidth <= 1260.0) {
                    windowWidth -= 81;
                    weather.setMinWidth(windowWidth/3);
                    calendar.setMinWidth(windowWidth/3);
                    scrollTasks.setMinWidth(windowWidth/3);
                    windowWidth += 30;
                    rss.setMinWidth(windowWidth/2);
                    spotify.setMinWidth(windowWidth/2);
                }
                if(windowWidth > 1260.0) {
                    weather.setMinWidth(390);
                    calendar.setMinWidth(390);
                    scrollTasks.setMinWidth(390);
                    rss.setMinWidth(590);
                    spotify.setMinWidth(700);
                }
            }
        });

        settingsFeature();
        newsFeature();
        weatherFeature();
        calendarFeature();
        tasksFeature();
        rssFeature();
        spotifyFeature();

        // Final steps
        primaryStage.setMinHeight(900);
        primaryStage.setMinWidth(1000);
        primaryStage.setTitle("Dashboard");
        Scene scene = new Scene(root, 1500, 900);
        primaryStage.setScene(scene);
        newTaskStage.setTitle("Add new task");
        Scene scene1 = new Scene(taskWindow, 500, 500);
        newTaskStage.setScene(scene1);
        Scene scene2 = new Scene(settingsBox, 400, 500);
        secondaryStage.setScene(scene2);
        primaryStage.show();
        if(emptyFile) secondaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    private void addNodesToOtherNodes() {
        // Adding panes to other panes (i.e. setting up the interface)
        scroll1.setContent(level1);
        scroll2.setContent(level2);
        scroll3.setContent(level3);
        scrollTasks.setContent(tasks);
        scrollRSS.setContent(rss);
        root.getChildren().addAll(settings, level0, level1, scroll2, level3);
        level0.getChildren().addAll(day, date, time);
        settings.getChildren().addAll(settingsButton, refreshButton);
        level1.getChildren().addAll(weather, calendar, scrollTasks);
        // News
        setUpNewsNodes();
        spotify.getChildren().addAll(spotImagesB, spotifyB, spotImagesA, spotifyA);
        level3.getChildren().addAll(scrollRSS, spotify);
        weather.getChildren().addAll(weatherPicHiLo, weatherForecast);
        tasks.getChildren().addAll(tasksChecks, tasksList);

        taskTextFields.getChildren().addAll(taskName, taskPriority);
        taskLabels.getChildren().addAll(taskNameLabel, taskPriorityLabel, confirmAddTask);
        taskWindow.getChildren().addAll(taskLabels, taskTextFields);

        settingsNames.getChildren().addAll(weatherSettingLabel, calendarSettingLabel, rssSettingLabel, spotifySettingLabel);
        settingsFields.getChildren().addAll(weatherSettingField, calendarSettingField, rssSettingField, spotifySettingField, settingsSpacer, confirmSettings);
        settingsBox.getChildren().addAll(settingsNames, settingsFields);
    }
    private void setUpNewsNodes() {
        newsVBoxes.add(news0);
        newsVBoxes.add(news1);
        newsVBoxes.add(news2);
        newsVBoxes.add(news3);
        newsVBoxes.add(news4);
        newsVBoxes.add(news5);
        newsVBoxes.add(news6);
        newsVBoxes.add(news7);
        newsVBoxes.add(news8);
        newsVBoxes.add(news9);
        newsLabels.add(newsArticle0);
        newsLabels.add(newsArticle1);
        newsLabels.add(newsArticle2);
        newsLabels.add(newsArticle3);
        newsLabels.add(newsArticle4);
        newsLabels.add(newsArticle5);
        newsLabels.add(newsArticle6);
        newsLabels.add(newsArticle7);
        newsLabels.add(newsArticle8);
        newsLabels.add(newsArticle9);
        newsButtons.add(newsLink0);
        newsButtons.add(newsLink1);
        newsButtons.add(newsLink2);
        newsButtons.add(newsLink3);
        newsButtons.add(newsLink4);
        newsButtons.add(newsLink5);
        newsButtons.add(newsLink6);
        newsButtons.add(newsLink7);
        newsButtons.add(newsLink8);
        newsButtons.add(newsLink9);
    }
    private void setPadding() {
        // Setting Padding for each pane
        Insets inset40 = new Insets(10, 30, 30, 30);
        root.setPadding(inset15);
        level1.setPadding(inset10);
        level2.setPadding(inset10);
        level3.setPadding(inset10);
        weather.setPadding(inset10);
        calendar.setPadding(inset10);
        tasks.setPadding(inset10);
        rss.setPadding(inset10);
        //scrollRSS.setPadding(new Insets(3, 3, 3, 3));
        spotifyA.setPadding(inset10);
        spotImagesA.setPadding(inset40);
        spotifyB.setPadding(inset10);
        spotImagesB.setPadding(inset40);

        settingsBox.setPadding(inset10);
        settingsNames.setPadding(inset10);
        settingsFields.setPadding(inset10);
    }
    private void setAlignment() {
        // Setting alignment for each pane
        root.setAlignment(Pos.CENTER);
        level1.setAlignment(Pos.CENTER);
        level2.setAlignment(Pos.CENTER);
        level3.setAlignment(Pos.CENTER);
        settingsBox.setAlignment(Pos.CENTER);
        level0.setAlignment(Pos.CENTER);
        spotify.setAlignment(Pos.CENTER);
    }
    private void setSpacing() {
        // Setting spacing for each pane
        settings.setSpacing(30);
        settingsNames.setSpacing(12);
        weatherForecast.setSpacing(10);
        weather.setSpacing(10);
        level1.setSpacing(30);
        level2.setSpacing(30);
        level3.setSpacing(30);
        taskLabels.setSpacing(10);
        rss.setSpacing(10);
        spotifyA.setSpacing(4);
        spotifyB.setSpacing(4);
    }
    private void setSizesOfNodes() {
        // Setting min and max sizes of things
        settings.setMaxWidth(1226);
        weather.setMinWidth(390);
        calendar.setMinWidth(390);
        scrollTasks.setMinWidth(390);
        rss.setMinWidth(590);
        spotify.setMinWidth(700);
        level2.setMinHeight(250);
        level1.setMaxHeight(350);
        level2.setMaxHeight(150);
        level3.setMaxHeight(350);
        scroll2.setFitToWidth(true);
        scroll2.setFitToHeight(false);
        scrollTasks.setFitToHeight(true);
        scrollTasks.setFitToWidth(true);
        scrollTasks.setMaxHeight(250);
        scroll2.setPrefViewportHeight(200);
        scroll2.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scroll2.setPannable(true);
    }
    private void getInit() {
        // Getting initial information
        String[] burner = new String[0];
        GetWeather.main(burner);
        GetCalendar.main(burner);
        GetPlanner.main(burner);
        GetNYTimesArticles.main(burner);
        GetRSS.main(burner);
        GetSpotify.main(burner);
        //location.setText(arraySettings[WEATHER]);

    }
    private boolean emptySettingsFile() {
        boolean emptyFile = false;
        File file = new File("src/sample/firstOpen.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            if(!scanner.hasNext()) emptyFile = true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(emptyFile) {
            try {
                PrintWriter printWriter = new PrintWriter(file);
                printWriter.println("false");
                printWriter.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return emptyFile;
    }
    private void setSettingsNull() {
        File file = new File("src/sample/settings.txt");
        try {
            Scanner scanner = new Scanner(file);
            int i = 0;
            while(scanner.hasNextLine()) {
                arraySettings[i] = scanner.nextLine();
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            arraySettings[WEATHER] = WEATHER_DEFAULT;
            arraySettings[CALENDAR] = CALENDAR_DEFAULT;
            arraySettings[RSS] = RSS_DEFAULT;
            arraySettings[SPOTIFY] = SPOTIFY_DEFAULT;
        }
        fromArrayToClass(arraySettings);
    }
    private void setBorders() {
        // Setting borders for each pane
        Border blueBorder = new Border(new BorderStroke
                (Color.BLUE, BorderStrokeStyle.SOLID,
                        new CornerRadii(10),
                        new BorderWidths(3, 3, 3, 3)));
        Border redBorder = new Border(new BorderStroke
                (Color.RED, BorderStrokeStyle.SOLID,
                        new CornerRadii(10),
                        new BorderWidths(3, 3, 3, 3)));
        Border orangeBorder = new Border(new BorderStroke
                (Color.ORANGE, BorderStrokeStyle.SOLID,
                        new CornerRadii(10),
                        new BorderWidths(3, 3, 3, 3)));
        Border grayBorder = new Border(new BorderStroke
                (Color.GRAY, BorderStrokeStyle.SOLID,
                        new CornerRadii(10),
                        new BorderWidths(3, 3, 3, 3)));
        Border greenBorder = new Border(new BorderStroke
                (Color.GREEN, BorderStrokeStyle.SOLID,
                        new CornerRadii(10),
                        new BorderWidths(3, 3, 3, 3)));

        // Setting background of each pane
        root.setStyle("-fx-background-color: #f0f0f0;");
        weather.setStyle("-fx-background-color: lightblue; " +
                "-fx-background-radius: 10 10 10 10");
        calendar.setStyle("-fx-background-color: #ff8282;" +
                "-fx-background-radius: 10 10 10 10");
        tasks.setStyle("-fx-background-color: #ffb882;" +
                "-fx-background-radius: 10 10 10 10");
        scrollTasks.setStyle("-fx-background-color: #ffb882;" +
                "-fx-background-radius: 10 10 10 10");
        rss.setStyle("-fx-background-color: lightgray;" +
                "-fx-background-radius: 10 10 10 10");
        scrollRSS.setStyle("-fx-background-color: lightgray;" +
                "-fx-background-radius: 10 10 10 10");
        spotify.setStyle("-fx-background-color: lightgreen;" +
                "-fx-background-radius: 10 10 10 10");

        weather.setBorder(blueBorder);
        calendar.setBorder(redBorder);
        tasks.setBorder(orangeBorder);
        scrollRSS.setBorder(grayBorder);
        spotify.setBorder(greenBorder);
    }
    private void settingsFeature() {
        settingsButton.setOnAction(event -> {
            secondaryStage.show();
        });
        confirmSettings.setOnAction(event -> {
            String w = weatherSettingField.getText();
            String c = calendarSettingField.getText();
            String r = rssSettingField.getText();
            String s = spotifySettingField.getText();
//            if(w.equals("")) w = arraySettings[WEATHER];
//            if(c.equals("")) c = arraySettings[CALENDAR];
//            if(r.equals("")) r = arraySettings[RSS];
//            if(s.equals("")) s = arraySettings[SPOTIFY];
            updateSettingsFile(w, c, r, s);
            if(!r.equals("")) {
                GetRSS.feeds.add(r);
                GetRSS.writeToFile();
            }
            secondaryStage.close();
            if(!w.equals("")) {
                GetWeather.main(burner);
                weatherFeature();
                location.setText(w);
            }
            if(!c.equals("")) {
                GetCalendar.main(burner);
                calendarFeature();
            }
            if(!r.equals("")) {
                GetRSS.main(burner);
                rssFeature();
            }
            if(!s.equals("")) {
                GetSpotify.main(burner);
                spotifyFeature();
            }
        });
        refreshButton.setOnAction(event -> {
            GetWeather.main(burner);
            GetCalendar.main(burner);
            GetRSS.main(burner);
            GetSpotify.main(burner);
            calendar.getChildren().clear();
            spotifyA.getChildren().clear();
            spotifyB.getChildren().clear();
            spotImagesA.getChildren().clear();
            spotImagesB.getChildren().clear();
            weatherFeature();
            calendarFeature();
            rssFeature();
            spotifyFeature();
        });
    }
    private void updateSettingsFile(String weather, String cal, String rss, String spot) {
        File file = new File("src/sample/settings.txt");
        if(!weather.equals("")) arraySettings[WEATHER] = weather;
        if(!cal.equals("")) arraySettings[CALENDAR] = cal;
        if(!rss.equals("")) arraySettings[RSS] = rss;
        if(!spot.equals("")) arraySettings[SPOTIFY] = spot;
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (int i = 0; i < arraySettings.length; i++) {
                System.out.println(arraySettings[i]);
                printWriter.println(arraySettings[i]);
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        fromArrayToClass(arraySettings);
    }
    private void fromArrayToClass(String[] arraySettings) {
        GetCalendar.calendarKey = arraySettings[CALENDAR];
        GetRSS.rssKey = arraySettings[RSS];
        GetWeather.weatherKey = arraySettings[WEATHER];
        GetSpotify.spotifyKey = arraySettings[SPOTIFY];
    }
    private void weatherFeature() {
        weatherPicHiLo.getChildren().clear();
        weatherForecast.getChildren().clear();
        // Adding weather info to panes
        String weatherKey = GetWeather.weatherKeyNormal;
        location = new Label(weatherKey);
        location.setStyle("-fx-font-weight: bold");
        location.setPadding(new Insets(5, 5, 5, 5));
        location.setWrapText(true);
        Label hiLo = new Label(GetWeather.finalLabel);
        hiLo.setWrapText(true);
        weatherPicHiLo.getChildren().addAll(location, hiLo);
        //System.out.println("Icon: " + GetWeather.currentIcon);
        Image image = new Image("Assets/" + GetWeather.currentIcon + ".png");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        weatherPicHiLo.getChildren().add(imageView);
        for (String s : GetWeather.weatherInfo) {
            Label label = new Label(s);
            label.setPadding(new Insets(2));
            label.setWrapText(true);
            weatherForecast.getChildren().add(label);
        }
        weather.setOnMouseClicked(event -> {
            String place = GetWeather.weatherKey;
            place = place.replace(" ", "+");
            String link = "http://www.google.com/search?q=weather+" + place;
            try {
                URI uri = new URI(link);
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    private void calendarFeature() {
        // Adding calendar info to panes
        for (String s : GetCalendar.calendarEvents) {
            Label label = new Label(s);
            label.setPadding(new Insets(10, 10, 10, 10));
            label.setWrapText(true);
            label.setOnMouseClicked(event -> {
                int n = calendar.getChildren().indexOf(label);
                String link = GetCalendar.calendarLinks.get(n);
                System.out.println(link);
                try {
                    URI uri = new URI(link);
                    Desktop desktop = Desktop.getDesktop();
                    desktop.browse(uri);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            calendar.getChildren().add(label);
        }
    }
    private void tasksFeature() {
        // Adding Planner info to panes
        tasksChecks.getChildren().add(0, addNewTask);
        Label blankLabel = new Label("Task Name");
        blankLabel.setPadding(inset10);
        blankLabel.setAlignment(Pos.CENTER);
        blankLabel.setStyle("-fx-underline: true;");
        tasksList.getChildren().add(0, blankLabel);

        Iterator taskIterator = GetPlanner.tasksList.iterator();
        while(taskIterator.hasNext()) {
            Task t = GetPlanner.tasksList.poll();
            String s = t.getName() + " (" + t.getPriority() + ")";
            Label label = new Label(s);
            label.setPadding(inset10);
            label.setAlignment(Pos.CENTER);
            CheckBox checkbox = new CheckBox();
            checkbox.setPadding(inset10);
            checkbox.setAlignment(Pos.CENTER);
            tasksChecks.getChildren().add(checkbox);
            tasksList.getChildren().add(label);
            tasksMap.put(checkbox, label);
            checkbox.setOnAction(event -> {
                Label selectedTask = tasksMap.get(checkbox);
                tasksChecks.getChildren().remove(checkbox);
                tasksList.getChildren().remove(selectedTask);
                String text = selectedTask.getText();
                Task current = GetPlanner.tasksArrayList.get(0);
                for (int i = 0; i < GetPlanner.tasksArrayList.size() ; i++) {
                    current = GetPlanner.tasksArrayList.get(i);
                    if(current.equals(new Task(text.substring(0, text.length()-4), Integer.parseInt(text.substring(text.length()-2, text.length()-1))))) break;
                }
                GetPlanner.tasksArrayList.remove(current);
                GetPlanner.tasksList.remove(current);
                //redrawTasks();

            });
        }

        addNewTask.setOnAction(event -> {
            newTaskStage.show();
        });
        confirmAddTask.setOnAction(event -> {
            String taskNameString = taskName.getText();
            int taskPriorityInt = Integer.parseInt(taskPriority.getText());
            Task newTask = new Task(taskNameString, taskPriorityInt);
            System.out.println(newTask.toString());
            GetPlanner.tasksArrayList.add(newTask);
            GetPlanner.tasksList.addAll(GetPlanner.tasksArrayList);
            newTaskStage.close();
            redrawTasks();
        });
    }
    private void newsFeature() {
        // Adding NYTimes articles to panes
        int counter = 0;
        for (String s : GetNYTimesArticles.titlesList) {
            VBox vBox = newsVBoxes.get(counter);
            Label label = newsLabels.get(counter);
            Button button = newsButtons.get(counter);
            // Label setting
            label.setText(s);
            label.setWrapText(true);
            label.setMaxSize(110, 160);
            label.setBorder(blackBorder);
            label.setPadding(inset10);
            label.setStyle("-fx-background-color: white;" +
                    "-fx-background-radius: 10 10 10 10");
            label.setMinHeight(160);
            label.setMinWidth(110);
            // Button settings
            button.setMinSize(110, 30);
            button.setMaxSize(110, 30);
            button.setText("Open article");
            // VBox settings
            vBox.getChildren().addAll(label, button);
            //vBox.getChildren().addAll(label);
            level2.getChildren().add(vBox);
            counter++;
        }
        // Handlers for news pane
        setUpNewsNodes();
        newsLink0.setOnAction(event -> {
            String link = GetNYTimesArticles.linksList.get(0);
            try {
                URI uri = new URI(link);
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        newsLink1.setOnAction(event -> {
            String link = GetNYTimesArticles.linksList.get(1);
            try {
                URI uri = new URI(link);
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        newsLink2.setOnAction(event -> {
            String link = GetNYTimesArticles.linksList.get(2);
            try {
                URI uri = new URI(link);
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        newsLink3.setOnAction(event -> {
            String link = GetNYTimesArticles.linksList.get(3);
            try {
                URI uri = new URI(link);
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        newsLink4.setOnAction(event -> {
            String link = GetNYTimesArticles.linksList.get(4);
            try {
                URI uri = new URI(link);
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        newsLink5.setOnAction(event -> {
            String link = GetNYTimesArticles.linksList.get(5);
            try {
                URI uri = new URI(link);
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        newsLink6.setOnAction(event -> {
            String link = GetNYTimesArticles.linksList.get(6);
            try {
                URI uri = new URI(link);
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        newsLink7.setOnAction(event -> {
            String link = GetNYTimesArticles.linksList.get(7);
            try {
                URI uri = new URI(link);
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        newsLink8.setOnAction(event -> {
            String link = GetNYTimesArticles.linksList.get(8);
            try {
                URI uri = new URI(link);
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        newsLink9.setOnAction(event -> {
            String link = GetNYTimesArticles.linksList.get(9);
            try {
                URI uri = new URI(link);
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    private void rssFeature() {
        rss.getChildren().clear();
        System.out.println(rss.getChildren().toString());
        // Adding RSS info to panes
        int size = GetRSS.titlesList.size();
        System.out.println("TitlesList size: " + size);
        for (int i = 0; i < size; i++) {
            String s = GetRSS.titlesList.get(i);
            String[] split = s.split("by");
            //System.out.println(Arrays.toString(split));
            Text label = new Text(split[0]);
            Text author = new Text("by" + split[1]);
            label.setStyle("-fx-underline: true;");
            TextFlow stuff = new TextFlow(label, author);
            rss.getChildren().add(stuff);
            label.setOnMouseClicked(event -> {
                String title = s;
                System.out.println(title);
                String link = GetRSS.articlesMap.get(title);
                System.out.println(link);
                try {
                    URI uri = new URI(link);
                    Desktop desktop = Desktop.getDesktop();
                    desktop.browse(uri);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                stuff.setStyle("-fx-text-fill: white;");
            });
        }
        System.out.println("RSS Feature: " + rss.getChildren().toString());
        System.out.println("Size: " + rss.getChildren().size());
    }
    private void spotifyFeature() {
        // Adding Spotify info to panes
        int counter = -1;
        for (String s : GetSpotify.playlistList) {
            counter++;
            Label label = new Label(s);
            label.setStyle("-fx-underline: true;");
            label.setPadding(new Insets(10, 10, 10, 10));
            label.setOnMouseClicked(event -> {
                int n = GetSpotify.playlistList.indexOf(label.getText());
                String link = GetSpotify.linksList.get(n);
                System.out.println(link);
                try {
                    URI uri = new URI(link);
                    Desktop desktop = Desktop.getDesktop();
                    desktop.browse(uri);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            if (counter < 7) {
                spotifyB.getChildren().add(label);
                WebView webView = new WebView();
                webView.getEngine().load(GetSpotify.imagesList.get(counter));
                webView.setMinSize(40, 40);
                webView.setMaxSize(40, 40);
                webView.setStyle("-fx-background-color: lightgreen;" +
                        "-fx-background-radius: 10 10 10 10");
                spotImagesB.getChildren().add(webView);
            } else {
                spotifyA.getChildren().add(label);
                WebView webView = new WebView();
                webView.getEngine().load(GetSpotify.imagesList.get(counter));
                webView.setMinSize(40, 40);
                webView.setMaxSize(40, 40);
                webView.setStyle("-fx-background-color: lightgreen;" +
                        "-fx-background-radius: 10 10 10 10");
                spotImagesA.getChildren().add(webView);
            }
        }
    }
    private void redrawTasks() {
        tasksChecks.getChildren().remove(1, tasksList.getChildren().size());
        tasksList.getChildren().remove(1, tasksList.getChildren().size());

        Iterator taskIterator = GetPlanner.tasksList.iterator();
        while(taskIterator.hasNext()) {
            Task t = GetPlanner.tasksList.poll();
            String s = t.getName() + " (" + t.getPriority() + ")";
            Label label = new Label(s);
            label.setPadding(inset10);
            label.setAlignment(Pos.CENTER);
            CheckBox checkbox = new CheckBox();
            checkbox.setPadding(inset10);
            tasksChecks.getChildren().add(checkbox);
            tasksList.getChildren().add(label);
            tasksMap.put(checkbox, label);
            checkbox.setOnAction(event -> {
                Label selectedTask = tasksMap.get(checkbox);
                tasksChecks.getChildren().remove(checkbox);
                tasksList.getChildren().remove(selectedTask);
                String text = selectedTask.getText();
                System.out.println("Task name: " + text);
                Task current = GetPlanner.tasksArrayList.get(0);
                for (int i = 0; i < GetPlanner.tasksArrayList.size() ; i++) {
                    System.out.println(i);
                    current = GetPlanner.tasksArrayList.get(i);
                    if(current.equals(new Task(text.substring(0, text.length()-4), Integer.parseInt(text.substring(text.length()-2, text.length()-1))))) break;
                }
                GetPlanner.tasksArrayList.remove(current);
                GetPlanner.tasksList.remove(current);
                System.out.println(GetPlanner.tasksArrayList.toString());
                System.out.println(GetPlanner.tasksList.toString());
                GetPlanner.updateFile();
            });
        }
        System.out.println("Tasks List: " + tasksList.getChildren().toString());
        GetPlanner.updateFile();
    }
    public void initialize() {
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            LocalTime currentTime = LocalTime.now();
            time.setText(currentTime.getHour() + ":" + currentTime.getMinute());
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }
}

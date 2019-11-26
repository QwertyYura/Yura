package com.itmo.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * Created by xmitya on 04.12.16.
 */
public class Mvc2 {
    public static void main(String[] args) {
        DataModel dataModel = new DataModel();
        ErrorModel errorModel = new ErrorModel();
        WelcomeModel welcomeModel = new WelcomeModel();

        Controller controller = new Controller(dataModel, errorModel, welcomeModel);

        View simpleView = new SimpleView("SimpleView");
//        View politeView = new PoliteView("PoliteView");

        dataModel.registerViews(simpleView);
        errorModel.registerViews(simpleView);
        welcomeModel.registerViews(simpleView);

//        dataModel.registerViews(politeView);
//        errorModel.registerViews(politeView);
//        welcomeModel.registerViews(politeView);


        Scanner scanner = new Scanner(System.in);

        controller.appStarted();

        while (true) {
            String val = scanner.nextLine().trim();

            controller.process(val);
        }

    }

    public static class AbstractModel {
        private final List<View> views = new ArrayList<>();

        public void registerViews(View... views) {
            this.views.addAll(Arrays.asList(views));
        }

        public void updateViews() {
            for (View view : views)
                view.render(this);
        }
    }

    public static class DataModel extends AbstractModel {
        private String userName;
        private int age;

        public int getAge() {
            return age;
        }

        public void setUserAge(int age) {
            this.age = age;

            updateViews();
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;

            updateViews();
        }
    }

    public static class ErrorModel extends AbstractModel {
        private Exception ex;
        private String message;

        public void setError(Exception ex, String message) {
            this.ex = ex;
            this.message = message;

            updateViews();
        }

        public Exception getException() {
            return ex;
        }

        public String getMessage() {
            return message;
        }
    }

    public static class WelcomeModel extends AbstractModel {
        private boolean started;

        public void welcome() {
            updateViews();

            started = true;
        }

        public boolean isStarted() {
            return started;
        }
    }

    interface View {
        void render(AbstractModel model);
    }

    public static abstract class AbstractView implements View {
        protected final String name;

        protected AbstractView(String name) {
            this.name = name;
        }

        @Override
        public void render(AbstractModel model) {
            if (model instanceof DataModel)
                render((DataModel)model);
            else if (model instanceof ErrorModel)
                render((ErrorModel)model);
            else if (model instanceof WelcomeModel)
                render((WelcomeModel)model);
        }

        protected abstract void render(DataModel dataModel);
        protected abstract void render(ErrorModel errorModel);
        protected abstract void render(WelcomeModel welcomeModel);
    }

    public static class SimpleView extends AbstractView {
        public SimpleView(String name) {
            super(name);
        }

        public void render(DataModel dataModel) {
            System.out.println("(" + name + ") User name: " + dataModel.getUserName() + ", age: " + dataModel.getAge());
        }

        @Override
        protected void render(ErrorModel errorModel) {
            String msg = errorModel.getMessage();
            Exception ex = errorModel.getException();

            System.err.println("(" + name + ") Error: " + msg + (ex != null ? " " + ex.getMessage() : ""));
        }

        @Override
        protected void render(WelcomeModel welcomeModel) {
            if (!welcomeModel.isStarted())
                System.out.println("Hello!");

            System.out.print("> ");
        }
    }

    public static class PoliteView extends AbstractView {
        public PoliteView(String name) {
            super(name);
        }

        @Override
        public void render(DataModel dataModel) {
            String userName = dataModel.getUserName();
            int age = dataModel.getAge();
            String displayName = userName == null || "".equals(userName) ? "Anonymous" : userName;
            String displayAge = age > 0 ? age + " years old" : "unknown age";

            System.out.printf("(%s) Mr.%s %s\n", name, displayName, displayAge);
        }

        @Override
        protected void render(ErrorModel errorModel) {
            String msg = errorModel.getMessage();
            Exception ex = errorModel.getException();

            System.err.println("(" + name + ") Sir, there some error occured. Don't worry and please recheck your input");
            System.err.println("(" + name + ") " + msg + " " + (ex != null ? ex.getMessage() : ""));
        }

        @Override
        protected void render(WelcomeModel welcomeModel) {
            if (!welcomeModel.isStarted())
                System.out.println("Greetings, sir!");

            System.out.print("Your command: > ");
        }
    }

    public static class Controller {
        private static final String SET_NAME_CMD = "name";
        private static final String SET_AGE_CMD = "age";
        private static final String EXIT_CMD = "exit";

        private final DataModel dataModel;
        private final ErrorModel errorModel;
        private final WelcomeModel welcomeModel;

        public Controller(DataModel dataModel, ErrorModel errorModel, WelcomeModel welcomeModel) {
            this.dataModel = dataModel;
            this.errorModel = errorModel;
            this.welcomeModel = welcomeModel;
        }

        public void appStarted() {
            welcomeModel.welcome();
        }

        public void process(String request) {
            try {
                if (request.startsWith(SET_NAME_CMD))
                    dataModel.setUserName(extractValue(request, SET_NAME_CMD));
                else if (request.startsWith(SET_AGE_CMD))
                    dataModel.setUserAge(Integer.parseInt(extractValue(request, SET_AGE_CMD)));
                else if (EXIT_CMD.equals(request)) {
                    System.exit(0);
                } else {
                    errorModel.setError(null, "Unsupported command " + request + "\n" + getCommands());
                }
            }
            catch (RuntimeException e) {
                errorModel.setError(e, "Error processing: " + request);
            }

            welcomeModel.welcome();
        }

        private static String getCommands() {
            StringBuilder sb = new StringBuilder("Available commands: \n");

            sb.append(SET_NAME_CMD + " - sets user name\n");
            sb.append(SET_AGE_CMD + " - sets user age name\n");
            sb.append(EXIT_CMD + " - exit program\n");

            return sb.toString();
        }

        private static String extractValue(String str, String command) {
            return str.substring(command.length()).trim();
        }
    }
}

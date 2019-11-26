package com.itmo.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xmitya on 04.12.16.
 */
public class Mvc {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);

        View view = new View("SimpleView");

        model.registerViews(view);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine().trim();

            controller.processRequest(line);
        }
    }

    public static class Model {
        private final List<View> views = new ArrayList<>();

        private String userName;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;

            updateViews();
        }

        public void registerViews(View... views) {
            this.views.addAll(Arrays.asList(views));
        }

        public void updateViews() {
            for (View view : views)
                view.render(this);
        }
    }

    public static class View {
        private final String name;

        public View(String name) {
            this.name = name;
        }

        public void render(Model model) {
            System.out.println("(" + name + ") User name: " + model.getUserName());
        }
    }

    public static class Controller {
        private static final String SET_NAME_CMD = "name";

        private final Model model;

        public Controller(Model model) {
            this.model = model;
        }

        public void processRequest(String request) {
            if (request.startsWith(SET_NAME_CMD))
                model.setUserName(extractValue(request, SET_NAME_CMD));
        }

        private static String extractValue(String str, String command) {
            return str.substring(command.length()).trim();
        }
    }
}

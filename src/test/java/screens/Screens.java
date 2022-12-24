package screens;

import screens.androidScreen.*;

public class Screens {
    public Screens() {

    }

    private ApiDemosScreen apiDemosScreen;
    private MainScreen mainScreen;
    private PreferenceScreen preferenceScreen;
    private PreferenceDependencyScreen preferenceDependencyScreen;
    private SwitchScreen switchScreen;

    private ViewsScreen viewsScreen;
    private DragDropScreens dragDropScreens;

    public ApiDemosScreen apiDemosScreen() {
        if (apiDemosScreen == null) {
            apiDemosScreen = new ApiDemosScreen();
        }
        return apiDemosScreen;

    }

    public MainScreen mainScreen() {
        if (mainScreen == null) {
            mainScreen = new MainScreen();
        }
        return mainScreen;

    }

     public PreferenceScreen preferenceScreen() {
        if (preferenceScreen == null) {
            preferenceScreen = new PreferenceScreen();
        }
        return preferenceScreen;

    }

     public PreferenceDependencyScreen preferenceDependencyScreen() {
        if (preferenceDependencyScreen == null) {
            preferenceDependencyScreen = new PreferenceDependencyScreen();
        }
        return preferenceDependencyScreen;

    }

public SwitchScreen switchScreen() {
        if (switchScreen == null) {
            switchScreen = new SwitchScreen();
        }
        return switchScreen;

    }

    public ViewsScreen viewsScreen() {
        if (viewsScreen == null) {
            viewsScreen = new ViewsScreen();
        }
        return viewsScreen;

    }

public DragDropScreens dragDropScreens() {
        if (dragDropScreens == null) {
            dragDropScreens = new DragDropScreens();
        }
        return dragDropScreens;

    }



}

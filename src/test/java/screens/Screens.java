package screens;

import screens.androidScreen.ApiDemosScreen;
import screens.androidScreen.MainScreen;
import screens.androidScreen.PreferenceDependencyScreen;
import screens.androidScreen.PreferenceScreen;

public class Screens {
    public Screens() {

    }

    private ApiDemosScreen apiDemosScreen;
    private MainScreen mainScreen;
    private PreferenceScreen preferenceScreen;
    private PreferenceDependencyScreen preferenceDependencyScreen;

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



}

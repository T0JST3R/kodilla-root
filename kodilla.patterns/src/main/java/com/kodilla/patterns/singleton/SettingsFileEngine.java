package com.kodilla.patterns.singleton;

public class SettingsFileEngine {
    private String filename = " ";
    private static SettingsFileEngine settingsFileEngineInstance = null;

    private SettingsFileEngine() {
    }

    public static SettingsFileEngine getInstance() {
        if (settingsFileEngineInstance == null) {
            synchronized (SettingsFileEngine.class) {
                if (settingsFileEngineInstance == null) {
                    settingsFileEngineInstance = new SettingsFileEngine();
                }
            }
        }
        return settingsFileEngineInstance;
    }

    public String getFilename() {
        return filename;
    }

    public void open(final String filename) {
        this.filename = filename;
        System.out.println("Opening the settings file");
    }

    public void close(final String filename) {
        this.filename = filename;
        System.out.println("Closing the settings file");
    }

    public boolean loadSettings() {
        System.out.println("Loading the settings file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving the settings file");
        return true;
    }
}

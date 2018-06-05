package singleton;

import com.kodilla.patterns.singleton.SettingsFileEngine;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsFileEngineTestSuite {

    @BeforeClass
    public static void openSettingsFile() {
        SettingsFileEngine.getInstance().open("myapp.settings");}

    @AfterClass
    public static void closeSettingsFile() {
        SettingsFileEngine.getInstance().close(SettingsFileEngine.getInstance().getFilename());
    }

    @Test
    public void testGetFileName() {
        String fileName = SettingsFileEngine.getInstance().getFilename();
        System.out.println("opened " + fileName);
        Assert.assertEquals("myapp.settings", fileName);
    }

    @Test
    public void testLoadSettings() {
        boolean result = SettingsFileEngine.getInstance().loadSettings();
        Assert.assertEquals(true , result);
    }

    public void testSaveSettings(){

        boolean result = SettingsFileEngine.getInstance().saveSettings();

        Assert.assertEquals(true , result);
    }
}

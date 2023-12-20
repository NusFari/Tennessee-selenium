package testng_maven;

import org.testng.annotations.Test;
import utilities.CsvConnector;
import utilities.DateUtilities;

public class TestNgMavenExampleTest {
    @Test
    public void run() {
        String[] date = DateUtilities.returnNextMonth();
        String month=date[0];
        String year=date[1];
        System.out.println(month);
        System.out.println(year);

    }
}

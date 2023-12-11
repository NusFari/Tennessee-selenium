package testng_maven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utilities.DateUtilities;
import utilities.ReadConfigFiles;

public class TestNgMavenExampleTest{
   @Test
   public void run() {
      String[] date = DateUtilities.returnNextMonth();
      String month=date[0];
      String year=date[1];
      System.out.println(month);
      System.out.println(year);

   }
}



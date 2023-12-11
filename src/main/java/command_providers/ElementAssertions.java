package command_providers;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ElementAssertions {
    public WebDriver driver;
    private By locator;

    public ElementAssertions(WebDriver driver,By locator){
        this.driver=driver;
        this.locator=locator;
    }
    public void elementIsDisplayed()throws Exception{
        Error error=null;

        boolean displayed= driver.findElement(locator).isDisplayed();
        if(!displayed){
            throw new Exception("Element is not displayed for the locator"+locator);
        }

    }


}

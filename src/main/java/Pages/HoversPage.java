package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By figureBoxes = By.className("figure");
    private By figureCaption = By.className("figcaption");

    public HoversPage (WebDriver driver){
        this.driver=driver;
    }
    /**
     * method hover over figure of 3
     * @param index 1-based
     */

    //interview ==> hovering by action class
    //lazem a5er call fel action class tb2a perform de eli btnfz kol el calls
    public FigureCaption hoverFigure(int index){
        Actions actions = new Actions(driver);
        WebElement figure = driver.findElements(figureBoxes).get(index-1);//-1 3lshan hya zero based
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(figureCaption));
    }
//h3ml innerclass 3lshan a7ot methods related bel class el kbir da

    public class FigureCaption{
        private WebElement caption;
        private By name = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement caption){
            this.caption=caption;
        }

        //1.method bt check enaha displayed
        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }
        //2.method bt get el name(gwa el caption el wa7d name wa7d)
        public String getName(){
            return caption.findElement(name).getText();
        }
        //3.method get el text bta3 el link
        public String getLinkText(){
            return caption.findElement(link).getText();
        }
        //4.method btget el link nafso
        public String getLinkURL(){
            return caption.findElement(link).getAttribute("href");
        }
    }
}

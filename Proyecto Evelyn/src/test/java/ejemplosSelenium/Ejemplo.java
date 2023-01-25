package ejemplosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo {

    public static void main(String[] args) throws InterruptedException {
        String rutaDriver = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", rutaDriver);


        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com/");

        driver.manage().window().maximize();

        JavascriptExecutor js;

        Thread.sleep(2000);

        //Accion completar input

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Spotify");


        //Accion buscar

        driver.findElement(By.xpath("//input[@name='q']")).submit();

        //Se crea elemento web del resultado de la busqueda

        By elementoBuscado = By.xpath("//h3[contains(text(),'Spotify Premium')]");

        WebElement resultadoBusqueda = driver.findElement(elementoBuscado);

        //Accion click

        resultadoBusqueda.click();

    }
}

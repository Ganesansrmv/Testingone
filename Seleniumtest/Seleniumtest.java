/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumtest;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author ai
 */
public class Seleniumtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.americanselfstorageok.com/201-w-memorial-rd-oklahoma-city-ok-73114");
        System.out.println("Page source: " + driver.getPageSource());
        driver.close();

    }

}

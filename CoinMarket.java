from selenium import webdriver

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.junit.Assert;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class CoinMarketCapSteps {
	    WebDriver driver;
	    String pageContent;
	    
	    //@Given("^I am on the CoinMarketCap website$")
	    public void i_am_on_the_coinmarketcap_website() {
	        driver = new FirefoxDriver();
	        driver.get("https://coinmarketcap.com");
	    }

	    //@When("^I show rows by 20$")
	    public void i_show_rows_by_20() {
	        WebElement elem = driver.findElement(By.xpath("//select[@class='cmc-select']/option[@value='20']"));
	        elem.click();
	    }

	    //@When("^I capture all page contents$")
	    public void i_capture_all_page_contents() {
	        pageContent = driver.getPageSource();
	    }

	    //@When("^I filter by Algorithm - PoW$")
	    public void i_filter_by_algorithm_pow() {
	        WebElement elem = driver.findElement(By.xpath("//div[@class='cmc-search']/input[@placeholder='Search coins']"));
	        elem.sendKeys("PoW");
	        elem = driver.findElement(By.xpath("//div[@class='cmc-search']/button[@class='cmc-search__submit']"));
	        elem.click();
	    }

	    //@When("^I follow by Add Filter$")
	    public void i_follow_by_add_filter() {
	        WebElement elem = driver.findElement(By.xpath("//button[@class='cmc-button cmc-button--secondary cmc-button--block cmc-button--small']"));
	        elem.click();
	    }

	    //@When("^I toggle Mineable$")
	    public void i_toggle_mineable() {
	        WebElement elem = driver.findElement(By.xpath("//div[@class='cmc-search-filter__checkbox-label' and contains(text(), 'Mineable')]"));
	        elem.click();
	    }

	    //@When("^I select All Cryptocurrencies$")
	    public void i_select_all_cryptocurrencies() {
	        WebElement elem = driver.findElement(By.xpath("//select[@class='cmc-select cmc-search-filter__select']/option[contains(text(), 'All Cryptocurrencies')]"));
	        elem.click();
	    }

	    //@When("^I select Coins$")
	    public void i_select_coins() {
	        WebElement elem = driver.findElement(By.xpath("//div[@class='cmc-search-filter__checkbox-label' and contains(text(), 'Coins')]"));
	        elem.click();
	    }

	    //@When("^I select price and set minimum value to 100 and maximum to 10,000$")
	    public void i_select_price_and_set_minimum_value() {
	        WebElement elem = driver.findElement(By.xpath("//input[@name='price_filter_min']"));
	        elem.sendKeys("100");
	        elem = driver.findElement(By.xpath("//input[@name='price_filter_max']"));
	        elem.sendKeys("10000");
	    }

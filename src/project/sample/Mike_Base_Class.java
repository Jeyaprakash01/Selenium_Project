package project.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mike_Base_Class {
	public static WebDriver driver;
	
	@FindBy(xpath ="//a[@title='Women']")
	private WebElement Women;
	
	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
    private WebElement Tshirt;
    
    @FindBy(xpath="//div[@class='product-container']")
    
    private WebElement Image;
    
    @FindBy(xpath="//span[text()='Add to cart']")
    
    private WebElement cart;
    
    @FindBy(linkText ="Proceed to checkout")
    
    private WebElement checkout;
    
    @FindBy(linkText="Proceed to checkout")
    
    private WebElement checkout2;
    
    @FindBy(id="email_create")
    
    private WebElement Email;

    @FindBy(id ="SubmitCreate")
    private WebElement createaccount;
    
    @FindBy(id="id_gender1")
    
    private WebElement Title;
    
    @FindBy(id="customer_firstname")
    
    private WebElement firstname;
    
    @FindBy(id ="customer_lastname")
    
    private WebElement lastname;
    
    @FindBy(id="passwd")
    
    private WebElement password;
    
    @FindBy(id="days")
    
    private WebElement day;
    
    @FindBy(name="months")
    
    private WebElement month;
    
    @FindBy(id="years")
    
    private WebElement years;
    
    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    
    private WebElement company;
    
    @FindBy(id="address1")
    
    private WebElement Address1;
    
    @FindBy(id="address2")
    
    private WebElement Address2;
    
    @FindBy(id="city")
    
    private WebElement city;
    
    @FindBy(id="id_state")
    
    private WebElement state;
    
    @FindBy(id="postcode")
    
    private WebElement postcode;
    
    @FindBy(id="id_country")
    
    private WebElement country;
    
    @FindBy(id="other")
    
    private WebElement additionalinfo;
    
    @FindBy(id="phone")
    
    private WebElement homephone;
    
    @FindBy(id="phone_mobile")
    
    private WebElement Mobile;
    
    @FindBy(id="alias")
    
    private WebElement Alias;
    
    @FindBy(id="submitAccount")
    
    private WebElement register;
    
    @FindBy(xpath ="//button[@name='processAddress']")
    
    private WebElement proceed;
    
    @FindBy(name="cgv")
    
    private WebElement Term;
    
    @FindBy(name="processCarrier")
    
    private WebElement proceedtocheckout;
    
    @FindBy(xpath ="//a[@class='bankwire']")
    
    private WebElement paybywire;
    
    @FindBy(xpath ="(//button[@type='submit'])[2]")
    
    private WebElement confirm;
    
    @FindBy(xpath= "//a[text()='Gmail']")
    
    private WebElement Gmail;
    
    
	public WebElement getGmail() {
		return Gmail;
	}

	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getTerm() {
		return Term;
	}
	
	
	public WebElement getPaybywire() {
		return paybywire;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Mike_Base_Class.driver = driver;
	}

	public WebElement getRegister() {
		return register;
	}

	public void setRegister(WebElement register) {
		this.register = register;
	}

	public void setWomen(WebElement women) {
		Women = women;
	}

	public void setTshirt(WebElement tshirt) {
		Tshirt = tshirt;
	}

	public void setImage(WebElement image) {
		Image = image;
	}

	public void setTitle(WebElement title) {
		Title = title;
	}

	public WebElement getCompany() {
		return company;
	}

	public void setCompany(WebElement company) {
		this.company = company;
	}

	public WebElement getAddress1() {
		return Address1;
	}

	public void setAddress1(WebElement address1) {
		Address1 = address1;
	}

	public WebElement getAddress2() {
		return Address2;
	}

	public void setAddress2(WebElement address2) {
		Address2 = address2;
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(WebElement city) {
		this.city = city;
	}

	public WebElement getState() {
		return state;
	}

	public void setState(WebElement state) {
		this.state = state;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public void setPostcode(WebElement postcode) {
		this.postcode = postcode;
	}

	public WebElement getCountry() {
		return country;
	}

	public void setCountry(WebElement country) {
		this.country = country;
	}

	public WebElement getAdditionalinfo() {
		return additionalinfo;
	}

	public void setAdditionalinfo(WebElement additionalinfo) {
		this.additionalinfo = additionalinfo;
	}

	public WebElement getHomephone() {
		return homephone;
	}

	public void setHomephone(WebElement homephone) {
		this.homephone = homephone;
	}

	public WebElement getMobile() {
		return Mobile;
	}

	public void setMobile(WebElement mobile) {
		Mobile = mobile;
	}

	public WebElement getAlias() {
		return Alias;
	}

	public void setAlias(WebElement alias) {
		Alias = alias;
	}

	public void setCart(WebElement cart) {
		this.cart = cart;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getDay() {
		return day;
	}

	public void setDay(WebElement day) {
		this.day = day;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYears() {
		return years;
	}

	public void setYears(WebElement years) {
		this.years = years;
	}

	public WebElement getTitle() {
		return Title;
	}

	public WebElement getCreateaccount() {
		return createaccount;
	}

	public void setCreateaccount(WebElement createaccount) {
		this.createaccount = createaccount;
	}

	public WebElement getEmail() {
		return Email;
	}

	public void setEmail(WebElement email) {
		Email = email;
	}

	public WebElement getCheckout2() {
		return checkout2;
	}

	public void setCheckout2(WebElement checkout2) {
		this.checkout2 = checkout2;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}

	public Mike_Base_Class(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getWomen() {
		return Women;
	}

	public WebElement getTshirt() {
		return Tshirt;
	}

	public WebElement getImage() {
		return Image;
	}

	public WebElement getCart() {
		return cart;
	}

}

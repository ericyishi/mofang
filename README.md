## 介绍

 * 利用PO模型思想来运用selenium实现自动化功能
 
 
## 实现目标

 * 实现一个自动化登录的测试用例
 * 以磨坊网为例（http://www.doyouhike.net/ ）【现在找个不要手机号注册的网站真不容易啊-_-||】
 
 
## 业务流程

 * 登录业务
![Image text](https://raw.githubusercontent.com/ericyishi/img-folder/master/mofang01_flow.png)
                         <p>图1 登录流程</P>


## 构建思想

 * 使用PO模型
 
 ![Image text](https://raw.githubusercontent.com/ericyishi/img-folder/master/mofang02_PO.png)
                         <P>图2 可以发现流程就是去操作不同页面的的元素</P>

 ![Image text](https://raw.githubusercontent.com/ericyishi/img-folder/master/mofang03_structure.png)
                         <P>图3 将业务、元素、数据三者分离后的项目结构</p>
        
        
## 测试用例

 * 最后测试用例也独立出来了
 ```Java
public class LoginTest extends CaseBase {
	public DriverBase driver;
	public HomePageBiz homePageBiz;
	public LoginPageBiz loginPageBiz;

	@BeforeClass
	public void beforeClass() {
		this.driver = InitDriver("firefox");
		driver.getUrl("http://www.doyouhike.net/");
		driver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		homePageBiz = new HomePageBiz(driver);
		loginPageBiz = new LoginPageBiz(driver);
	}

	@Test
	@Parameters({"username","password"})
	public void test(String username,String password) {
		homePageBiz.clickLoginButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		loginPageBiz.login(username, password);
		
		if(homePageBiz.isLoginSuccess(username)){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
	}
	
	@AfterClass
	public void afterClass() {
		driver.stop();
	}

}
 ```
 
  ![Image text](https://raw.githubusercontent.com/ericyishi/img-folder/master/Mofang04_testngResult.png)
                        <P>图4 使用testng运行结果</p>
 
 
 ## 总结
 
  1. 虽然登录业务很简单，但还是用了分层的思想,使用PO模型(Page Object）通过对界面元素的封装减少冗余代码，同时在后期维护中，若元素定位发生变化，只需要调整页面元素封装的代码，提高测试用例的可维护性。 业务逻辑和页面元素分离，再分离测试数据，就形成了一个不错的结构。但如果不是大系统，感觉线性写测试脚本应付一般的回归测试也是可以的。
  
  2. 本例用selenium2 可以直接驱动firefox（也和firefox版本有关，太高是启动不了的），若用selenium3 就需要单独下载firefox的驱动了。
                        
                         
              
                         
                         
                         

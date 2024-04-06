package SeleniumDay15_DesiredCapabilties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilityDemo {

	public static void main(String[] args) {
		
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
		capabilities.setBrowserName("Chrome");
		
		capabilities.setPlatform(Platform.WIN10);
		
		capabilities.setVersion("109");
		
		capabilities.setCapability("Selenium version", "3.141.59");
		
		capabilities.setCapability("timezone", "IST");
		
		System.out.println(capabilities.getBrowserName());
		
		System.out.println(capabilities.getPlatform());
		
		System.out.println(capabilities.getVersion());
		
		System.out.println(capabilities.getCapability("Selenium version"));
		
		System.out.println(capabilities.getCapability("timezone"));

	}

}

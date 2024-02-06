package MyPackage;

import org.testng.annotations.Test;

public class Electronics {
	
	@Test(groups={"General"})
	public void am_ecom_au_Mel_HomeAppliances() {
		System.out.println("homeAppliances");
	}
	@Test(groups={"General"})
	public void Mobiles() {
		System.out.println("Mobiles");
		
	}
	@Test(groups={"Technical"})
	public void Computers() {
		System.out.println("Computers");
	}
	@Test(groups= {"games"})
	public void Gadgets() {
		System.out.println("Gadgets");
	}

}

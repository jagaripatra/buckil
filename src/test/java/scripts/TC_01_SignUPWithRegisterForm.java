package scripts;

import core.Base;
import pages.HomePageBuckil;
import pages.Register;

public class TC_01_SignUPWithRegisterForm extends Base {

	public static void main(String[] args) {
             getDriver();
		
         HomePageBuckil homePage = new HomePageBuckil(driver);
          
             
		// Call Registration Component
		Register reg = homePage.clickRegister();
		
		reg.fillRegisterForm();
		reg.clickRegister();
		
		// Call Email validation component
		
		// call AdminLogin component
		
		// call approval componet
		//ApproveCustomer approveCustomer = new ApproveCustomer(driver);
		
		
		// call login component
		// call loginValidation component

		
		// call delete customer component
	}

}

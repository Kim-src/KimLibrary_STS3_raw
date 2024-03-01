package com.github.KimLibrary_STS3;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
    public String Home() {
        return "redirect:/index";
    }
	
    @RequestMapping(value = "/index")
    public String showIndexPage() {
        return "index";
    }
    
    @RequestMapping("/CustomerRegistration")
    public String showCustomerRegistrationPage() {
    	return "CustomerRegistration";
	}
    
    @RequestMapping("/CustomerList")
    public String showCustomerListPage() {
    	return "CustomerList";
	}
    
    @RequestMapping("/CustomerInfoEdit")
    public String showCustomerInfoEditPage() {
    	return "CustomerInfoEdit";
	}
    
    @RequestMapping("/RentalHistory")
    public String showRentalHistorytPage() {
    	return "RentalHistory";
	}
    
    @RequestMapping("/RentalCost")
    public String showRentalCostPage() {
    	return "RentalCost";
	}
        
}
package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.RequestDto.CustomerDto;
import com.example.demo.ResponseDto.CustomerDetailsResponse;
import com.example.demo.Service.APIConsumer;
import com.example.demo.Service.CustomerServiceManager;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServiceManager CustomerService;
	
	@Autowired
	private APIConsumer apiConsumer;
	
	@PostMapping("/getCustomerInfo")
	public CustomerDetailsResponse getCustomerDetails(@RequestBody CustomerDto customerDetails) {
		
		return CustomerService.getCustomerInfo(customerDetails);
	}
	
	@PostMapping("/getCustomerInfoFromAPICall")
	public CustomerDetailsResponse getCustomerDetailsFromAPICall(@RequestBody CustomerDto customerDetails) {
		
		return apiConsumer.getCustomerInfoCall(customerDetails);
	}

}

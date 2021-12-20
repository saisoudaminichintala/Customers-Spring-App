package com.example.demo.Service;

import java.util.Objects;

import org.springframework.stereotype.Service;

import com.example.demo.RequestDto.CustomerDto;
import com.example.demo.ResponseDto.CustomerDetailsResponse;


@Service
public class CustomerServiceManager {

	public CustomerDetailsResponse getCustomerInfo(CustomerDto customerDetails) {
		CustomerDetailsResponse customerInfo = null;

		if (Objects.nonNull(customerDetails)) {
			customerInfo = new CustomerDetailsResponse();
			if (org.apache.commons.lang3.StringUtils.isNotBlank(customerDetails.getFirstName())
					|| org.apache.commons.lang3.StringUtils.isNotBlank(customerDetails.getLastName())) {

				StringBuilder fullName = new StringBuilder("");
				fullName.append(customerDetails.getFirstName());
				fullName.append(" "+customerDetails.getLastName());
				customerInfo.setFullName(fullName.toString());
			}

			if (org.apache.commons.lang3.StringUtils.isNotBlank(customerDetails.getEmail())) {
				customerInfo.setEmail(customerDetails.getEmail());
			}

			if (org.apache.commons.lang3.StringUtils.isNotBlank(customerDetails.getPhoneNumber())) {
				customerInfo.setPhoneNumber(customerDetails.getPhoneNumber());
			}

			if (Objects.nonNull(customerDetails.getAge()) && customerDetails.getAge() > 0) {
				if (customerDetails.getAge() >= 18 && customerDetails.getAge() <= 30) {
					customerInfo.setEligiblityStatus("Entry Level");
				} else if (customerDetails.getAge() >= 31 && customerDetails.getAge() <= 60) {
					customerInfo.setEligiblityStatus("Mid Level");
				} else if (customerDetails.getAge() >= 61 && customerDetails.getAge() <= 100) {
					customerInfo.setEligiblityStatus("Senior Level");
				}
				
				customerInfo.setAge(customerDetails.getAge());
			}
			
			customerInfo.setCustomerId(1);
			

		}
		return customerInfo;

	}

}

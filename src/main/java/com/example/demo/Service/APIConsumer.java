package com.example.demo.Service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.RequestDto.CustomerDto;
import com.example.demo.ResponseDto.CustomerDetailsResponse;
import com.google.gson.Gson;


@Service
public class APIConsumer {
	
	
	public CustomerDetailsResponse getCustomerInfoCall(CustomerDto customerDetails) {
		String URI = "http://localhost:8080/getCustomerInfo";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		RequestEntity<CustomerDto> request = RequestEntity
			     .post(URI)
			     .accept(MediaType.APPLICATION_JSON)
			     .body(customerDetails);
			 ResponseEntity<CustomerDetailsResponse> response = 
					 new RestTemplate().exchange(URI, HttpMethod.POST, request, CustomerDetailsResponse.class);
					 
			 
		return response.getBody();
		
		
	
		
	}

}

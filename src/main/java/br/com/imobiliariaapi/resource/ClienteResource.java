package br.com.imobiliariaapi.resource;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.imobiliariaapi.model.Customer;

@RequestMapping("/Customers")
@RestController
public class ClienteResource {

	private RestTemplate template;

	@GetMapping
	public ResponseEntity<List<Customer>> getApi() {
		String api = "https://smarts-totem.s3-sa-east-1.amazonaws.com/code-challenge/customers.json";
		template = new RestTemplate();

		ResponseEntity<List<Customer>> customers = template.exchange(api, HttpMethod.GET, null, new ParameterizedTypeReference<List<Customer>>() {
		 
		}); 
		 
		return customers;
	}
}

package com.cakehonolulu.researchers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cakehonolulu.researchers.dto.Provider;
import com.cakehonolulu.researchers.service.ProviderSvcImpl;

@RestController
@RequestMapping("/api")
public class ProviderController {

	@Autowired
	ProviderSvcImpl providerServiceImpl;
	
	@GetMapping("/providers")
	public List<Provider> getAllProviders() {
		return providerServiceImpl.listAllProviders();
	}
	
	@PostMapping("/providers")
	public Provider saveProvider(@RequestBody Provider pr) {
		return providerServiceImpl.saveProvider(pr);
	}
	
	@GetMapping("/providers/{id}")
	public Provider getProviderById(@PathVariable(name="id") Long id) {
		return providerServiceImpl.providerById(id);
	}
	
	@PutMapping("/providers/{id}")
	public Provider updateProvider(@PathVariable(name="id") Long id, @RequestBody Provider pr) {
		Provider selectedProvider;
		Provider updatedProvider;
		
		selectedProvider = providerServiceImpl.providerById(id);
		
		selectedProvider.setName(pr.getName());
		selectedProvider.setSupplies(pr.getSupplies());
		
		updatedProvider = providerServiceImpl.saveProvider(selectedProvider);
		
		return updatedProvider;
	}
	
	@DeleteMapping("/providers/{id}")
	public void deleteProvider(@PathVariable(name="id") Long id) {
		providerServiceImpl.deleteProvider(id);
	}
}

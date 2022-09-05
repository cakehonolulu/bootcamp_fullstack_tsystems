package com.cakehonolulu.researchers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakehonolulu.researchers.dao.ProviderDAO;
import com.cakehonolulu.researchers.dto.Provider;

@Service
public class ProviderSvcImpl implements ProviderService{

	@Autowired
	ProviderDAO iProviderDAO;

	@Override
	public List<Provider> listAllProviders() {
		
		return iProviderDAO.findAll();
	}

	@Override
	public Provider saveProvider(Provider pr) {

		return iProviderDAO.save(pr);
	}

	@Override
	public Provider providerById(Long id) {
		
		return iProviderDAO.findById(id).get();
	}

	@Override
	public Provider updateProvider(Provider pr) {
		
		return iProviderDAO.save(pr);
	}

	@Override
	public void deleteProvider(Long id) {
		iProviderDAO.deleteById(id);
	}
}

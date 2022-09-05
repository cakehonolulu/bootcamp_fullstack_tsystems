package com.cakehonolulu.researchers.service;

import java.util.List;

import com.cakehonolulu.researchers.dto.Provider;

public interface ProviderService {
	/**
	 * Lists all the Provider
	 * @return
	 */
	public List<Provider> listAllProviders();
	
	/**
	 * Saves a Provider
	 * @param pr
	 * @return
	 */
	public Provider saveProvider(Provider pr);
	
	/**
	 * Gets the Provider by ID
	 * @param id
	 * @return
	 */
	public Provider providerById(Long id);
	
	/**
	 * Updates the Provider
	 * @param pr
	 * @return
	 */
	public Provider updateProvider(Provider pr);
	
	/**
	 * Deletes the Provider
	 * @param id
	 */
	public void deleteProvider(Long id);
}

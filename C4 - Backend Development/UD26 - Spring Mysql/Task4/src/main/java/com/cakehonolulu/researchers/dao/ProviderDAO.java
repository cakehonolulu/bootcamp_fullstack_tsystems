package com.cakehonolulu.researchers.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakehonolulu.researchers.dto.Provider;

public interface ProviderDAO extends JpaRepository<Provider, Long>{

}

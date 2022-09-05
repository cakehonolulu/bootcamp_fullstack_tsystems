package com.springer.piez_prov.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springer.piez_prov.dao.ProveedorDAO;
import com.springer.piez_prov.dto.Proveedor;

public class ProveedorSvcImpl implements ProveedorService {

	@Autowired
	ProveedorDAO supplierSvc;
	
	@Override
	public Proveedor findById(Long supplierId) {
		return supplierSvc.findById(supplierId).get();
	}

	@Override
	public List<Proveedor> listSuppliers() {
		return supplierSvc.findAll();
	}

	@Override
	public Proveedor saveSupplier(Proveedor supplier) {
		return supplierSvc.save(supplier);
	}

	@Override
	public void deleteSupplier(Long supplierId) {
		supplierSvc.deleteById(supplierId);
	}

	@Override
	public Proveedor editSupplier(Proveedor supplier) {
		return supplierSvc.save(supplier);
	}

}

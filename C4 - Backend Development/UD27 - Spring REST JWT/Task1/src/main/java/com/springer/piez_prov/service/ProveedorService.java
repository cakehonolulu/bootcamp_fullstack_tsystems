package com.springer.piez_prov.service;

import java.util.List;

import com.springer.piez_prov.dto.Proveedor;

public interface ProveedorService {

	public Proveedor findById(Long supplierId);
	
	public List<Proveedor> listSuppliers();
	
	public Proveedor saveSupplier(Proveedor supplier);
	
	public void deleteSupplier(Long supplierId);

	public Proveedor editSupplier(Proveedor supplier);
}

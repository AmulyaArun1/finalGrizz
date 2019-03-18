package com.cts.grizzly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.grizzly.bean.Vendor;
import com.cts.grizzly.dao.ProductDAO;
@Service("vendorService")
public class VendorServiceImpl implements VendorService {

	@Autowired
	private ProductDAO productDAO;
	
	public List<Vendor> filterVendor(String query) {
		
		return null;
	}

}

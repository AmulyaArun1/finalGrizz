package com.cts.grizzly.service;

import java.util.List;

import com.cts.grizzly.bean.Product;
import com.cts.grizzly.bean.Vendor;

public interface VendorService {
	public List<Vendor> filterVendor(String query);
}

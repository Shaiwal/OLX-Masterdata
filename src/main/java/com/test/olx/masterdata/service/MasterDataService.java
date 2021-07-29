package com.test.olx.masterdata.service;

import java.util.List;

import com.test.olx.masterdata.model.AdvertisementStatus;
import com.test.olx.masterdata.model.Category;

public interface MasterDataService {
	
	public List<Category> getAllAdvertiseCategoriesSer();
	
	public List<AdvertisementStatus> getAllAdvertiseStatusSer();

}

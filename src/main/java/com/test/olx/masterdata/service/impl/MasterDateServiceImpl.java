package com.test.olx.masterdata.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.olx.masterdata.entity.AdvertisementStatusEntity;
import com.test.olx.masterdata.entity.CategoryEntity;
import com.test.olx.masterdata.model.AdvertisementStatus;
import com.test.olx.masterdata.model.Category;
import com.test.olx.masterdata.repository.AdvertisementStatusRepository;
import com.test.olx.masterdata.repository.CategoryRepository;
import com.test.olx.masterdata.service.MasterDataService;

@Service
public class MasterDateServiceImpl implements MasterDataService{
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	AdvertisementStatusRepository advertisementStatusRepository;

	@Override
	public List<Category> getAllAdvertiseCategoriesSer() {
		List<CategoryEntity> categoryEntitiesList = categoryRepository.findAll();
		List<Category> categoriesList = new ArrayList<>();
		categoryEntitiesList.forEach((categoryEntity)->categoriesList.add(new Category(categoryEntity.getId(), categoryEntity.getName())));
		return categoriesList;
	}

	@Override
	public List<AdvertisementStatus> getAllAdvertiseStatusSer() {
		List<AdvertisementStatusEntity> advertisementStatusEntitiesList = advertisementStatusRepository.findAll();
		List<AdvertisementStatus> advertisementStatusList = new ArrayList<>();
		advertisementStatusEntitiesList.forEach((advertisementStatusEntity)->advertisementStatusList.add(new AdvertisementStatus(advertisementStatusEntity.getId(), advertisementStatusEntity.getStatus())));
		return advertisementStatusList;
	}

}

package com.test.olx.masterdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.olx.masterdata.model.AdvertisementStatus;
import com.test.olx.masterdata.model.Category;
import com.test.olx.masterdata.service.MasterDataService;

import io.swagger.annotations.ApiOperation;

@RestController
public class MasterDataController {
	
	@Autowired
	MasterDataService masterDataService;
	
	@RequestMapping(path = "/advertise/category", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value = "Returns master list of Advertisement Categories", notes = "API to Return master list of Advertisement Categories")
	public ResponseEntity<List<Category>> getAllAdvertiseCategories(){
		return new ResponseEntity<List<Category>>(this.masterDataService.getAllAdvertiseCategoriesSer(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/advertise/status", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value = "Returns master list of Advertisement Statuses", notes = "API to Return master list of Advertisement Statuses")
	public ResponseEntity<List<AdvertisementStatus>> getAllAdvertiseStatus(){
		return new ResponseEntity<List<AdvertisementStatus>>(this.masterDataService.getAllAdvertiseStatusSer(), HttpStatus.OK);
	}

}

package com.test.olx.masterdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.olx.masterdata.entity.AdvertisementStatusEntity;

@Repository
public interface AdvertisementStatusRepository extends JpaRepository <AdvertisementStatusEntity, Integer> {

}
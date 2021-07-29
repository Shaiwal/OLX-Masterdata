package com.test.olx.masterdata.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@ApiModel(value="Advertise Status Model", description = "Advertise Status Model")
public class AdvertisementStatus {
	@ApiModelProperty(value = "Id", dataType = "String")
	private int id;
	@ApiModelProperty(value = "Status of Advertisement", dataType = "String")
	private String Status;
}

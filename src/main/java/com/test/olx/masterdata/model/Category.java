package com.test.olx.masterdata.model;

import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@ApiModel(value="Advertise Category Model", description = "Advertise Category Model")
public class Category {
	@ApiModelProperty(value = "Id", dataType = "String")
	private int id;
	@ApiModelProperty(value = "name of category", dataType = "String")
	private String name;
}

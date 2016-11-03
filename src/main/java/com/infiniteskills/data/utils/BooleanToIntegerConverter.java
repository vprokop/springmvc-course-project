package com.infiniteskills.data.utils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class BooleanToIntegerConverter 
	implements AttributeConverter<Boolean, Integer>{

	@Override
	public Integer convertToDatabaseColumn(Boolean val) {
		return val == true ? 1 : 0;
	}

	@Override
	public Boolean convertToEntityAttribute(Integer val) {
		return (val == 0) ? false : true;
	}

}

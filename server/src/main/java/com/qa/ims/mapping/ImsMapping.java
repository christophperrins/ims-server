package com.qa.ims.mapping;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

public class ImsMapping {

	private ModelMapper modelMapper;

	public ImsMapping(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}
	
	public <S, T> T map(S source, Class<T> destinationType) {
		return modelMapper.map(source, destinationType);
	}
	
	public <S, T> List<T> mapList(List<S> sourceList, Class<T> destinationType) {
		return sourceList.stream().map(sourceItem -> map(sourceItem, destinationType)).collect(Collectors.toList());
	}
}

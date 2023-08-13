package com.springboot.springrest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.springrest.entities.Load;

@Service
public interface LoadServices {
	public List<Load> getLoad();
	public Load getLoad(long shipperId);
	public Load addLoad(Load load);
	public Load updateLoad(Load load);
	public void deleteLoad(long parseLong);
}

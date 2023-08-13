package com.springboot.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springrest.dao.LoadDao;
import com.springboot.springrest.entities.Load;

@Service
public class ServicesImpl implements LoadServices {
	
	
	
	
public ServicesImpl() {
		super();
	}

@Autowired
private LoadDao loadDao;

@Override
public List<Load> getLoad()
{
	return loadDao.findAll();
}

@Override
public Load getLoad(long shipperId)
{
	return loadDao.getOne(shipperId);
	
}

@Override
public Load addLoad(Load load)
{
	loadDao.save(load);
	return load;
}

public Load updateLoad(Load load)
{
	loadDao.save(load);
	return load;
}

@Override
public void deleteLoad(long parseLong)
{
	Load entity =loadDao.getOne(parseLong);
	loadDao.delete(entity);
}


}

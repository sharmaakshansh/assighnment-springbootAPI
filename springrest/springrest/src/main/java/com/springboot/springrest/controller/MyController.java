package com.springboot.springrest.controller;
import com.springboot.springrest.services.LoadServices;

import com.springboot.springrest.entities.Load;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyController {
	

	private  LoadServices loadservice;

    @Autowired
    public MyController(LoadServices loadservice) {
        this.loadservice = loadservice;
    }
	
	@GetMapping("/load")
	public List<Load> getLoad()
	{
		return this.loadservice.getLoad();
	}
	
	@GetMapping("/load/{shipperId}")
	public Load getLoad(@PathVariable String shipperId)
	{
		return this.loadservice.getLoad(Long.parseLong(shipperId));
	}
	
	@PostMapping("/load")
	public Load addLoad(@RequestBody Load load)
	{
		return this.loadservice.addLoad(load);
	}
	
	@PutMapping("/load")
	public Load updateLoad(@RequestBody Load load)
		{
			return this.loadservice.updateLoad(load);
		}
	
	@DeleteMapping("/load/{shipperId}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String shipperId)
	{
		try {
			this.loadservice.deleteLoad(Long.parseLong(shipperId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}

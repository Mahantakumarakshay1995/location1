package com.psalocation_web_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psalocation_web_app.entity.Location;
import com.psalocation_web_app.reposetries.LocationReposetry;

@Service
public class LocationServiceIMP implements LocationService {
	
	@Autowired LocationReposetry locrepo;

	@Override
	public void saveLocation(Location w) {
		locrepo.save(w);
	}

	

	

}

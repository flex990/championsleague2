package com.uefa.championsleague2.service;

import java.util.List;

import com.uefa.championsleague2.data.model.Squadra;

public interface SquadraService {

	public Squadra getById(String id);
	
	public List<Squadra> getAll();
	
	public Squadra save(Squadra squadra);
	
	public Boolean deleteById(Squadra id) throws Exception;
	
	public Boolean deleteAll();
	
}

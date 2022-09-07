package com.uefa.championsleague2.service;

import java.util.List;

import com.uefa.championsleague2.data.model.Partita;

public interface PartitaService {
	
	public Partita getById(String id);
	
	public List<Partita> getAll();
	
	public Partita save(Partita partita);
	
	public Boolean deleteById(String id) throws Exception;
	
	public Boolean deleteAll();

}

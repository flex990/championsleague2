package com.uefa.championsleague2.service;

import java.util.List;

import com.uefa.championsleague2.data.model.Giocatore;

public interface GiocatoreService {
	
	public Giocatore getById(String id);
	
	public List<Giocatore> getAll();
	
	public Giocatore save(Giocatore giocatore);
	
	public Boolean deleteById(String id) throws Exception;
	
	public Boolean deleteAll();

}

package com.uefa.championsleague2.service;

import java.util.List;

import com.uefa.championsleague2.data.model.Risultato;

public interface RisultatoService {

	public Risultato getById(String id);
	
	public List<Risultato> getAll();
	
	public Risultato save(Risultato risultato);
	
	public Boolean deleteById(String id) throws Exception;
	
	public Boolean deleteAll();
	
	public int nrGolByIdGiocatore(String idGiocatore);
	
}

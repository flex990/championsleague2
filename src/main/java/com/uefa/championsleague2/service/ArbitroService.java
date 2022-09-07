package com.uefa.championsleague2.service;

import java.util.List;

import com.uefa.championsleague2.data.model.Arbitro;

public interface ArbitroService {
	
	public Arbitro getById(String id);
	
	public List<Arbitro> getAll();
	
	public Arbitro save(Arbitro arbitro);
	
	public Boolean deleteById(String id) throws Exception;
	
	public Boolean deleteAll();

}

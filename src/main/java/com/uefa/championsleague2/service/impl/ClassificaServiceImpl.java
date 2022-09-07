package com.uefa.championsleague2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.uefa.championsleague2.data.dto.ClassificaCannonieri;
import com.uefa.championsleague2.data.model.Giocatore;
import com.uefa.championsleague2.service.ClassificaService;
import com.uefa.championsleague2.service.GiocatoreService;
import com.uefa.championsleague2.service.RisultatoService;

@Service
public class ClassificaServiceImpl implements ClassificaService {
	
	private final GiocatoreService giocatoreService;
	private final RisultatoService risultatoService;
	
	public ClassificaServiceImpl(GiocatoreService giocatoreService, RisultatoService risultatoService) {
		this.giocatoreService = giocatoreService;
		this.risultatoService = risultatoService;
	}
	
	@Override
	public List<ClassificaCannonieri> getClassificaCannonieri() {
		
		List<ClassificaCannonieri> response = new ArrayList<>();
		List<Giocatore> giocatori = giocatoreService.getAll();
		
		giocatori.forEach(giocatore -> {
			ClassificaCannonieri entry = ClassificaCannonieri.builder()
											.giocatore(giocatore)
											.numeroGol(risultatoService.nrGolByIdGiocatore(giocatore.getId()))
											.build();
			response.add(entry);
		});
		
		return response;
	}

}

package com.uefa.championsleague2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.uefa.championsleague2.data.model.Risultato;
import com.uefa.championsleague2.repository.RisultatoRepository;
import com.uefa.championsleague2.service.RisultatoService;

@Service
public class RisultatoServiceImpl implements RisultatoService {
	
	private final RisultatoRepository risultatoRepository;
	
	public RisultatoServiceImpl(RisultatoRepository risultatoRepository) {
		this.risultatoRepository = risultatoRepository;
	}

	@Override
	public Risultato getById(String id) {
		Optional<Risultato> risultato = risultatoRepository.findById(id);
		if (risultato.isPresent()) {
			return risultato.get();
		}
		return null;
	}

	@Override
	public List<Risultato> getAll() {
		return risultatoRepository.findAll();
	}

	@Override
	public Risultato save(Risultato risultato) {
		
		Risultato risultatoToSave = Risultato.builder()
									.partita(risultato.getPartita())
									.giocatore(risultato.getGiocatore())
									.minuto(risultato.getMinuto())
									.build();
		
		if (risultato.getId() != null) {
			risultatoToSave.setId(risultato.getId());
		}
		
		return risultatoRepository.save(risultatoToSave);
	}

	@Override
	public Boolean deleteById(String id) throws Exception {
		
		if (getById(id) == null) {
			throw new Exception();
		}
		
		risultatoRepository.deleteById(id);
		return Boolean.TRUE;
	}

	@Override
	public Boolean deleteAll() {
		risultatoRepository.deleteAll();
		return Boolean.TRUE;
	}
	
	@Override
	public int nrGolByIdGiocatore(String idGiocatore) {
		return risultatoRepository.countByIdGiocatore(idGiocatore);
	}

}

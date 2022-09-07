package com.uefa.championsleague2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uefa.championsleague2.data.model.Risultato;

@Repository
public interface RisultatoRepository extends JpaRepository<Risultato, String> {
	
	//@Query("SELECT COUNT(r) FROM Risultato r WHERE r.idGiocatore=?1")
	int countByIdGiocatore(String idGiocatore);

}

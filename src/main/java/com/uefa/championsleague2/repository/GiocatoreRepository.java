package com.uefa.championsleague2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uefa.championsleague2.data.model.Giocatore;

@Repository
public interface GiocatoreRepository extends JpaRepository<Giocatore, String> {

}

package com.uefa.championsleague2.data.dto;

import com.uefa.championsleague2.data.model.Giocatore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClassificaCannonieri {
	
	private Giocatore giocatore;
	private int numeroGol;

}

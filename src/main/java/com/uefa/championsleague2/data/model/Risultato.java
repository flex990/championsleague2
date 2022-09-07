package com.uefa.championsleague2.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Risultato {
	
	@Id
	@Column
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_partita")
	@JsonBackReference(value = "id_partita")
	private Partita partita;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_giocatore")
	@JsonBackReference(value = "id_giocatore")
	private Giocatore giocatore;
	
	@Column
	private int minuto;

}

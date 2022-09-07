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
public class Giocatore {
	
	@Id
	@Column
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;

	@Column
	private String nome;
	
	@Column
	private String cognome;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_squadra")
	@JsonBackReference(value = "id_squadra")
	private Squadra squadra;

}

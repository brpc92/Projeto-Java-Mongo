package br.com.word.pokemon.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.ToString;
@Getter
@ToString
@Document(collection = "combat")
public class CombatEntity {
	
	private String First_pokemon;
	private String Second_pokemon;
	private String winner;


}

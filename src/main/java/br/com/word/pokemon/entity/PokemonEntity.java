package br.com.word.pokemon.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.ToString;
@Getter
@ToString
@Document(collection = "pokemon")
public class PokemonEntity {
	@Id
	String id;
	List<String> types;
	String name;
	Boolean legendary;
	Integer hp;
	Integer attack;
	Integer defense;
	Integer speed;
	Integer generation;
	
}

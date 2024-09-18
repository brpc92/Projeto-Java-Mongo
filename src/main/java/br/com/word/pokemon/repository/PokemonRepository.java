package br.com.word.pokemon.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.word.pokemon.entity.PokemonEntity;

public interface PokemonRepository extends MongoRepository<PokemonEntity, String> {

	List<PokemonEntity> findAll();

	PokemonEntity findById(int i);

	
	List<PokemonEntity> findByName(String name);


}

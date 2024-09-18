package br.com.word.pokemon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.word.pokemon.dto.BattleResultDto;
import br.com.word.pokemon.entity.PokemonEntity;
import br.com.word.pokemon.repository.PokemonRepository;
import br.com.word.pokemon.repository.PokemonbattleRepository;

@Service
public class PokemonService {

	@Autowired
	private PokemonRepository pokemonRepository;
	
	@Autowired
	private PokemonbattleRepository pokemonbattleRepository;

	public List<PokemonEntity> recuperarTodosPokemons() {
		return pokemonRepository.findAll();
	}

	public PokemonEntity recuperaPorId(Integer id) {
		return pokemonRepository.findById(id);
	}

	public List<PokemonEntity> recuperaPorName(String name) {
		return pokemonRepository.findByName(name);
	}

	public List<BattleResultDto> findWinner() {
		return pokemonbattleRepository.findWinner();
	}
}

package br.com.word.pokemon.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.word.pokemon.dto.BattleResultDto;
import br.com.word.pokemon.entity.PokemonEntity;
import br.com.word.pokemon.service.PokemonService;

@RequestMapping("word/pokemon")
@RestController
public class pokemonResourceLeitura {
	
	@Autowired
	private PokemonService pokemonService;
	
	@GetMapping("/findall")
	public List<PokemonEntity> pokemonFindAll() {
		return pokemonService.recuperarTodosPokemons();
	}
	
	@GetMapping("/findbyid")
	public PokemonEntity pokemonFindById(@RequestParam Integer id) {
		return pokemonService.recuperaPorId(id);
	}
	
	@GetMapping("/findbyname")
	public List<PokemonEntity> pokemonFindByName(@RequestParam String name) {
		return pokemonService.recuperaPorName(name);
	}
	
	@GetMapping("/battle")
	public List<BattleResultDto> pokemonFindWinner() {
		return pokemonService.findWinner();
	}

}

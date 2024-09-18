package br.com.word.pokemon.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.word.pokemon.dto.BattleResultDto;
import br.com.word.pokemon.entity.CombatEntity;

public interface PokemonbattleRepository extends MongoRepository<CombatEntity, String> {


	  @Aggregation(pipeline = {
		        "{ '$lookup': { 'from': 'pokemon', 'localField': 'First_pokemon', 'foreignField': '_id', 'as': 'pokemon1_arr' } }",
		        "{ '$lookup': { 'from': 'pokemon', 'localField': 'Second_pokemon', 'foreignField': '_id', 'as': 'pokemon2_arr' } }",
		        "{ '$project': { '_id': 0, 'Winner': 1, 'pokemon1': { '$arrayElemAt': ['$pokemon1_arr', 0] }, 'pokemon2': { '$arrayElemAt': ['$pokemon2_arr', 0] } } }",
		        "{ '$project': { 'first_pokemon': '$pokemon1.name', 'second_pokemon': '$pokemon2.name', 'winner': { '$cond': { 'if': { '$eq': ['$Winner', '$pokemon1._id'] }, 'then': '$pokemon1.name', 'else': '$pokemon2.name' } } } }"
		    })
	List<BattleResultDto> findWinner();


}

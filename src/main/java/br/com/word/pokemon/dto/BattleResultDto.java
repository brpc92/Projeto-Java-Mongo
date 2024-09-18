package br.com.word.pokemon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@ToString
public class BattleResultDto {
	
    private String first_pokemon;
    private String second_pokemon;
    private String winner;

}

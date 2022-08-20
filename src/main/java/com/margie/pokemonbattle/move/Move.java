package com.margie.pokemonbattle.move;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Move {

    @Id
    private int key;

    private String name;
    //TODO: Implement type, category, and effect enums.
//    private Type type;
//    private Category category;
    private Integer power;
    private Integer accuracy;
    private Integer pp;
//    private Effect effect;
    private Integer probability;

}

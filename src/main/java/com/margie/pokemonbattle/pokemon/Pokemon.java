package com.margie.pokemonbattle.pokemon;

import com.margie.pokemonbattle.move.Move;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Pokemon {

    @Id
    private int key;
    private String name;
    private Double health;
    private Double attack;
    private Double defense;
    private Double spAtk;
    private Double spDef;
    private Double speed;

    //TODO::Add enumerator for types.
//    private Type type;
    @OneToMany
    private Move[] moveSet = new Move[4];

    @OneToMany
    private List<Move> learnableMoveSet = new ArrayList<>();

}

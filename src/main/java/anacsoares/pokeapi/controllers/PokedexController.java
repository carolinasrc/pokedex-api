package anacsoares.pokeapi.controllers;

import anacsoares.pokeapi.entities.Pokedex;
import anacsoares.pokeapi.services.PokedexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pokedex", method = RequestMethod.GET, produces = "application/json")
public class PokedexController {

    @Autowired
    private PokedexService pokedexService;

    @GetMapping
    public Pokedex getPokedexInfos() {

        return pokedexService.getPokedex();
    }
}























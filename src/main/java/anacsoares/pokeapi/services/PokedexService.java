package anacsoares.pokeapi.services;

import anacsoares.pokeapi.entities.Pokedex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokedexService {

    @Autowired
    private RestTemplate restTemplate;

    public Pokedex getPokedex() {

        return restTemplate.getForObject(
                "https://pokeapi.co/api/v2/pokemon?offset=10&limit=10", Pokedex.class);
    }

}

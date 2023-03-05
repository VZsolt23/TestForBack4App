package dev.thegamecity.fantasywarriors.player;

import dev.thegamecity.fantasywarriors.model.Player;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> allPLayers() {
        return playerRepository.findAll();
    }

    public Optional<Player> singlePlayer(ObjectId id) {
        return playerRepository.findById(id);
    }

    public Player createPlayer(Player player) {
        return playerRepository.insert(player);
    }
}

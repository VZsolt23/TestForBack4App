package dev.thegamecity.fantasywarriors.player;

import dev.thegamecity.fantasywarriors.model.Player;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/players")
@CrossOrigin("http://localhost:3000")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping
    public ResponseEntity<List<Player>> getAllPlayers() {
        return new ResponseEntity<List<Player>>(playerService.allPLayers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Player>> getMovie(@PathVariable ObjectId id) {
        return new ResponseEntity<Optional<Player>>(playerService.singlePlayer(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Player> createPlayer(@RequestBody Player player) {
        Player savedPlayer = playerService.createPlayer(player);
        return ResponseEntity.ok(savedPlayer);
    }
}

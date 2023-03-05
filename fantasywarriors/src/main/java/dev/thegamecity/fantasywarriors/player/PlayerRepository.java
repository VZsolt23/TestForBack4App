package dev.thegamecity.fantasywarriors.player;

import dev.thegamecity.fantasywarriors.model.Player;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends MongoRepository<Player, ObjectId> {
}

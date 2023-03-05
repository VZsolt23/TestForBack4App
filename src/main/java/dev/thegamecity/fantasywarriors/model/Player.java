package dev.thegamecity.fantasywarriors.model;

import dev.thegamecity.fantasywarriors.CharacterClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "players")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    @Id
    private ObjectId id;

    private CharacterClass characterClass;

    private float speed;

    private float damage;

    private float armor;

    private float health;

    @DBRef
    private User user;
}

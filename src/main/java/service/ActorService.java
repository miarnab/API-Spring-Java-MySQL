package service;

import entity.Actor;
import java.util.List;

public interface ActorService {
    Actor saveActor(Actor actor);

    List<Actor> fetchActorList();

    Actor updateActor(Actor actor, Long actorId);

    void deleteActorById(Long ActorId);
}

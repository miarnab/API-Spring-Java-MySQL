package service;

import entity.Actor;
import repository.ActorRepository;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ActorServiceImpl implements ActorService{

    @Autowired
    private ActorRepository actorRepository;

    // Save operation
    @Override
    public Actor saveActor(Actor actor)
    {
        return actorRepository.save(actor);
    }


    @Override
    public List<Actor> fetchActorList()
    {
        return (List<Actor>)actorRepository.findAll();
    }

    @Override
    public Actor updateDepartment(Actor actor, Long actorId)
    {
        Actor actorDB = actorRepository.findById(actorId).get();

        if (Objects.nonNull(actor.getActorFirstName())
                && !"".equalsIgnoreCase(
                actor.getActorFirstName())) {
            actorDB.setDepartmentName(actor.getDepartmentName());
        }

        if (Objects.nonNull(
                department.getDepartmentAddress())
                && !"".equalsIgnoreCase(
                department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(
                    department.getDepartmentAddress());
        }

        if (Objects.nonNull(department.getDepartmentCode())
                && !"".equalsIgnoreCase(
                department.getDepartmentCode())) {
            depDB.setDepartmentCode(
                    department.getDepartmentCode());
        }

        return departmentRepository.save(depDB);
    }

    // Delete operation
    @Override
    public void deleteDepartmentById(Long departmentId)
    {
        departmentRepository.deleteById(departmentId);
    }
}
}

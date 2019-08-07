package az.idrak.vacancy.common.repository;

import az.idrak.vacancy.common.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  PositionRepository  extends JpaRepository<Position,Long> {
    List<Position> findByName(String  name);

}

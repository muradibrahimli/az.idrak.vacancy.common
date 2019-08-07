package az.idrak.vacancy.common.repository;

import az.idrak.vacancy.common.entity.ApplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ApplyRepository extends JpaRepository<ApplyEntity,Long> {
}

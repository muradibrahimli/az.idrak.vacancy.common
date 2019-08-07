package az.idrak.vacancy.common.repository;

import az.idrak.vacancy.common.entity.VacancyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  VacancyRepository extends JpaRepository<VacancyEntity,Long> {


}

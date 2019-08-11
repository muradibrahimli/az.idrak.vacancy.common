package az.idrak.vacancy.common.repository;

import az.idrak.vacancy.common.entity.VacancyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface VacancyRepository extends JpaRepository<VacancyEntity, Long> {

    @Query("select v from VacancyEntity v where :today between startDate  and endDate")
    List<VacancyEntity> findActiveVacancies(@Param("today") LocalDate localDate);
}

package root.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.Optional;

import root.entitys.AlarmStateEntity;

public interface AlarmStateEntityRepository extends JpaRepository<AlarmStateEntity, Long>
{
    @Query("Select first 1 * from States where dateStamp <= :date ordered by dateStamp")
    Optional<AlarmStateEntity> getLastState(@Param("date") Date date);
}

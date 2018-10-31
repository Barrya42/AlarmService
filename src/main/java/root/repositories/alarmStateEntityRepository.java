package root.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import root.entitys.alarmStateEntity;

public interface alarmStateEntityRepository extends JpaRepository<alarmStateEntity, Long>
{
}

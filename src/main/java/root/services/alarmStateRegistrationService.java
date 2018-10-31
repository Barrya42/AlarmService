package root.services;

import java.util.Optional;

import root.entitys.alarmStateEntity;

public interface alarmStateRegistrationService
{
    Optional<alarmStateEntity> registerAlarmState(alarmStateEntity newAlarmState);
}

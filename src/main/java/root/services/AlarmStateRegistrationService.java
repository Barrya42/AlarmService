package root.services;

import java.util.Optional;

import root.entitys.AlarmStateEntity;

public interface AlarmStateRegistrationService
{
    Optional<AlarmStateEntity> registerAlarmState(AlarmStateEntity newAlarmState);
    Optional<AlarmStateEntity> getLastRecord(String phone);
}

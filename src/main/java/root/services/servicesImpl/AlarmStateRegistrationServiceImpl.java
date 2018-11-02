package root.services.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

import root.entitys.AlarmStateEntity;
import root.repositories.AlarmStateEntityRepository;
import root.services.AlarmStateRegistrationService;

@Service
public class AlarmStateRegistrationServiceImpl implements AlarmStateRegistrationService
{

    @Autowired

    AlarmStateEntityRepository alarmStateEntityRepository;

    @Override
    @Transactional
    public Optional<AlarmStateEntity> registerAlarmState(AlarmStateEntity newAlarmState)
    {
        AlarmStateEntity savedAlarmState = alarmStateEntityRepository.save(newAlarmState);
        return Optional.of(savedAlarmState);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<AlarmStateEntity> getLastRecord(String phone)
    {
        Optional<AlarmStateEntity> alarmStateEntity= alarmStateEntityRepository.getLastState(Date.valueOf(LocalDate.now()));
        return alarmStateEntity;
    }
}

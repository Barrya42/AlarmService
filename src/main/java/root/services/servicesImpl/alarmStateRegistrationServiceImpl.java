package root.services.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import root.entitys.alarmStateEntity;
import root.repositories.alarmStateEntityRepository;
import root.services.alarmStateRegistrationService;

@Service
public class alarmStateRegistrationServiceImpl implements alarmStateRegistrationService
{
    @Autowired
    alarmStateEntityRepository alarmStateEntityRepository;

    @Override
    public Optional<alarmStateEntity> registerAlarmState(alarmStateEntity newAlarmState)
    {

        Optional<alarmStateEntity> savedAlarmState = Optional.of(alarmStateEntityRepository.save(newAlarmState));
        return savedAlarmState;
    }
}

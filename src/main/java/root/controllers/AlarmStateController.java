package root.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import root.Tools.PhoneTools;
import root.entitys.AlarmStateEntity;
import root.services.AlarmStateRegistrationService;

@RestController
@RequestMapping(path = "/alarmState")
public class AlarmStateController
{
    @Autowired
    AlarmStateRegistrationService alarmStateRegistrationService;

    @PostMapping()
    public ResponseEntity registerState(@RequestBody AlarmStateEntity alarmStateEntity)
    {
        Optional<AlarmStateEntity> newAlarmStateEntity = alarmStateRegistrationService.registerAlarmState(alarmStateEntity);
        if (newAlarmStateEntity.isPresent())
        {
            return new ResponseEntity<>(alarmStateEntity,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "/{phone}")
    public AlarmStateEntity getLastRedcord(@PathVariable("phone") String phone)
    {
        Optional<AlarmStateEntity> alarmStateEntity = alarmStateRegistrationService.getLastRecord(phone);

        return alarmStateEntity.orElse(new AlarmStateEntity());
    }
}

package integrationTests.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.time.LocalDate;

import integrationTests.Config;
import root.Main;
import root.controllers.AlarmStateController;
import root.entitys.AlarmStateEntity;
import root.repositories.AlarmStateEntityRepository;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE,classes = Main.class)
public class AlarmStateEntityControllerTest extends org.junit.Assert
{
    @Autowired
    AlarmStateEntityRepository alarmStateEntityRepository;
    @Autowired
    AlarmStateController alarmStateController;

    @Test
    public void CreateAlarmStateEntity_AlarmStateEntitySaved()
    {
        AlarmStateEntity alarmStateEntity = new AlarmStateEntity();
        Date curDate = Date.valueOf(LocalDate.now());
        alarmStateEntity.setDateStamp(curDate);
        alarmStateEntity.setDevicePhone("79112321324");
        alarmStateEntity.setMoveSensor1(true);
        alarmStateEntity.setMoveSensor2(false);
        alarmStateEntity.setTemperatureSensor(15.3f);

        AlarmStateEntity alarmStateEntitySaved = (AlarmStateEntity) alarmStateController.registerState(alarmStateEntity)
                .getBody();
        assertEquals(alarmStateEntity,alarmStateEntitySaved);
    }
}

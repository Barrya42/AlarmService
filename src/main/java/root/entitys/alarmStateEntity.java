package root.entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "States")
public class alarmStateEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean moveSendor1;
    private boolean moveSencor2;
    private float temperatureSensor;

    public long getId()
    {
        return id;
    }

    public boolean isMoveSendor1()
    {
        return moveSendor1;
    }

    public boolean isMoveSencor2()
    {
        return moveSencor2;
    }

    public float getTemperatureSensor()
    {
        return temperatureSensor;
    }

    public String getDevicePhone()
    {
        return devicePhone;
    }

    private String devicePhone;

    public alarmStateEntity()
    {
    }
}

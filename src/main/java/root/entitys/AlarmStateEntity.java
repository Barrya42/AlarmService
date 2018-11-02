package root.entitys;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "States")
public class AlarmStateEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private boolean moveSensor1;
    @Column(nullable = false)
    private boolean moveSensor2;
    @Column(nullable = false)
    private float temperatureSensor = 0;
    @Column(nullable = false)
    private Date dateStamp;

    public long getId()
    {
        return id;
    }

    public boolean getMoveSensor1()
    {
        return moveSensor1;
    }

    public boolean getMoveSensor2()
    {
        return moveSensor2;
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

    public Date getDateStamp()
    {
        return dateStamp;
    }

    public void setMoveSensor1(boolean moveSensor1)
    {
        this.moveSensor1 = moveSensor1;
    }

    public void setMoveSensor2(boolean moveSensor2)
    {
        this.moveSensor2 = moveSensor2;
    }

    public void setTemperatureSensor(float temperatureSensor)
    {
        this.temperatureSensor = temperatureSensor;
    }

    public void setDateStamp(Date dateStamp)
    {
        this.dateStamp = dateStamp;
    }

    public void setDevicePhone(String devicePhone)
    {
        this.devicePhone = devicePhone;
    }


    public AlarmStateEntity()
    {
    }

    @Override
    public boolean equals(Object obj)
    {
        if(!(obj instanceof AlarmStateEntity))
            return false;
        AlarmStateEntity eqObj = (AlarmStateEntity) obj;
        boolean res = super.equals(obj);
        if (res)
        {
            return true;
        }

        return this.getId() == eqObj.getId()
                && this.getDateStamp() == eqObj.getDateStamp()
                && this.getDevicePhone() == eqObj.getDevicePhone()
                && this.getTemperatureSensor() == eqObj.getTemperatureSensor()
                && this.getMoveSensor1() == eqObj.getMoveSensor1()
                && this.getMoveSensor2() == eqObj.getMoveSensor2();
    }
}

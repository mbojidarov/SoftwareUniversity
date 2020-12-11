package p06_TirePressureMonitoringSystem;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class AlarmTest {

    // 1. pressure under min_value -> Alarm ON (true)

    @Test
    public void testAlarmONWithLowValue(){

        Sensor sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(16.9);

        Alarm alarm = new Alarm(sensor);
        alarm.check();
        assertTrue(alarm.getAlarmOn());

    }

    // 2. pressure above max_value -> Alarm ON (true)

    @Test
    public void testAlarmONWithHigherPressure(){

        Sensor sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(21.1);

        Alarm alarm = new Alarm(sensor);
        alarm.check();
        assertTrue(alarm.getAlarmOn());
    }


    // 3. normal pressure = 17-21 psi  -> Alarm OFF (false)

    @Test
    public void testAlarmOFFforNormalPressure(){

        Sensor sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(20.5);

        Alarm alarm = new Alarm(sensor);
        alarm.check();
        assertFalse(alarm.getAlarmOn());
    }
}
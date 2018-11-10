/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worktime;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author adasiko
 */
public class WorkDay {

    public WorkDay(Calendar date) {
        time1=new GregorianCalendar();
        time1.setTime(date.getTime());
        time1.set(Calendar.HOUR_OF_DAY, 0);
        time1.set(Calendar.MINUTE, 0);
        time1.set(Calendar.SECOND, 0);
        time1.set(Calendar.MILLISECOND, 0);
        time2=new GregorianCalendar();
        time2.setTime(time1.getTime());
    }
    
    public double getWorkingHours() {
        long miliseconds=time2.getTimeInMillis()-time1.getTimeInMillis();
        int seconds=(int) (miliseconds/1000);
        double hours=seconds/3600.0;
        return hours;
    }
    
    public boolean hasTimes() {
        return !(isTimeNull(time1) || isTimeNull(time2));
    }
    
    public void putTime(Calendar time) {
        if(!hasTimes()) {
            time1.setTime(time.getTime());
            time2.setTime(time.getTime());
        } else if (time.before(time1)) {
            time1.setTime(time.getTime());
        } else if (time.after(time2)) {
            time2.setTime(time.getTime());
        }
    }
    
    private boolean isTimeNull(Calendar c) {
        return c.get(Calendar.HOUR_OF_DAY)==0 &&
                c.get(Calendar.MINUTE)==0 &&
                c.get(Calendar.SECOND)==0;
    }
            
    private Calendar time1;
    private Calendar time2; 
}

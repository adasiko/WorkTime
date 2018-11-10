/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worktime;

import java.util.*;

/**
 *
 * @author adasiko
 */
public class WorkMonth {

    public WorkMonth(Calendar date) {
        Calendar dt=new GregorianCalendar();
        dt.setTime(date.getTime());
        dt.set(Calendar.DAY_OF_MONTH, 1);
        dt.set(Calendar.HOUR_OF_DAY, 0);
        dt.set(Calendar.MINUTE, 0);
        dt.set(Calendar.SECOND, 0);
        dt.set(Calendar.MILLISECOND, 0);
        int len=date.getActualMaximum(Calendar.DAY_OF_MONTH);
        daylist = new ArrayList<>(len);
        for(int i=1; i<=len; i++) {
            dt.add(Calendar.DAY_OF_MONTH, 1);
            daylist.add(new WorkDay(dt));
        }
    }
    
    public void putTime(Calendar time) {
        int i=time.get(Calendar.DAY_OF_MONTH)-1;
        daylist.get(i).putTime(time);
    }
    
    protected List<WorkDay> daylist;
}



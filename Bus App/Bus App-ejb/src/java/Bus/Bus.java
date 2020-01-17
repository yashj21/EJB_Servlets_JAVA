
package Bus;

import javax.ejb.Stateless;
import java.util.*;

/**
 *
 * @author Yash
 */
@Stateless
public class Bus implements BusLocal {
Vector name=new Vector(100);
    Vector doj=new Vector(100);
    Vector flight=new Vector(100);
    Vector classes=new Vector(100);
    public void book(String name1,String doj1,String flight1,String classes1)
    {
        name.add(name1);
        doj.add(doj1);
        flight.add(flight1);
        classes.add(classes1);
     }
    public void cancel(String name1)
    {
        int i=0;
        i=name.indexOf(name1);
        name.remove(i);
        doj.remove(i);
        flight.remove(i);
        classes.remove(i);
    }
    public int available()
    {
        return (name.capacity()-name.size());
    }
    public Vector showname()
    {
      
       return name;
    }
    public Vector showdoj()
    {
       return doj;
    }
    public Vector showflight()
    {
   
       return flight;
      
    }
    public Vector showclasses()
    {
       return classes;
    }
}

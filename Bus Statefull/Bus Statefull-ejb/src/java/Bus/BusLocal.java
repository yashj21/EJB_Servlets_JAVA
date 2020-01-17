
package Bus;
import java.util.*;
import javax.ejb.Local;

/**
 *
 * @author Yash
 */
@Local
public interface BusLocal {
    void book(String name1,String doj1,String flight1,String classes1);
    
    void cancel(String name1);
   
    int available();
   
    Vector showname();
   
    Vector showdoj();
   
    Vector showflight();
    
    Vector showclasses();

    
}

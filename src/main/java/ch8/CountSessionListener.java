package ch8;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class CountSessionListener
 *
 */
@WebListener
public class CountSessionListener implements HttpSessionAttributeListener {

    int sessionCount;
	/**
     * Default constructor. 
     */
    public CountSessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
         sessionCount++;
         System.out.println("���� �����ڴ� " + sessionCount + " �� �Դϴ�.");
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	sessionCount--;
    	System.out.println("���� �����ڴ� " + sessionCount + " �� �Դϴ�.");
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    }
	
}

package OCPExam.chapter5;

import java.time.*;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class DateAndTimeAndBundle {
    public static void printProperties(Locale locale){
        ResourceBundle rb = ResourceBundle.getBundle("OCPExam.chapter5.Zoo", locale);
       /*
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));
        */
        Properties props = new Properties();
      //  rb.keySet().stream().forEach(k -> props.put(k -> rb.getString(k)));
    }
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(ZonedDateTime.now());

        // working with period

        // working with duration

        // working with instants

        Instant now = Instant.now();
        // try {
        //     TimeUnit.MINUTES.sleep(5);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        Instant later = Instant.now();
        Duration duration = Duration.between(now, later);
        System.out.println(duration.toMillis());

        // Day light saving time
        // we need to add time and March and November

        // Adding Internatioalization and Localization
        
        /*
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        */
        // creating a property file
      
        Locale us = new Locale("en","US");          
        Locale france = new Locale("fr","FR");

        printProperties(us);
        System.out.println();
        printProperties(france);  
        
      //  ResourceBundle b = ResourceBundle.getBundle("OCPExam.chapter5.Zoo"); 

        // Hadling variables inside resources  bundles

        // Formatiing date and time

        
    }
    
}

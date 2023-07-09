package OOPs;

// Documentation for POJO
/*
 *> A plain old Java object (whose acronym is POJO) is a class that generally only has instance fields.
 *
 *> It usually has few, if any methods other than getters and setters.

 *> Many database frameworks use POJO's to read data from, or to write data to, databases, files or streams.

 * 
 */


public class J00_POJO {
    
}

// replaacement of class 🤖🤖🤖🤖🤖🤖
record hello(){ 

}


// Exploring Java Bean vs POJO vs Spring Bean
/*
 * . Java Bean: Classes adhering to 3 constraints:
        > 1: Have public default (no argument) constructors
        > 2: Allow access to their properties using getter and setter methods
        > 3: lmplementjava.io.Serializable
 *
 * . POJO: Plain Old Java Object
        > No coxnstraints
        > Any Java Object is a POJO!
 * 
 * . Spring Bean: Any Java object that is managed by Spring
        > Spring uses IOC Container (Bean Factory or Application Context) to manage these objects
 * 
 */

 /*
  * When user send the request to the server via HTTP protocol to get the particular information
then the client request reach to the server and server find the object related to the request. The
data available in the form of Object at server is called POJO.

 *
 * 
  */
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
    public static void main(String[] args) {
       Employee obj = new Employee("POJO_BOY", 101, "CSE");
       System.out.println(obj.toString());
       System.out.println(obj);
    }
}

// 🤖🤖🤖🤖🤖🤖
// the class 'Employee' is a normal Java class. However, it is also a POJO because it meets the following criteria:
/*
> It is a simple Java object. It does not extend any other class or implement any interfaces.
> It has fields. It has three fields: name, id, and department.
> It has getters and setters. It has getters and setters for all of its fields.
 */
// The term "POJO" is used to distinguish these simple Java objects from other types of Java objects
class Employee {

    private String name;
    private int id;
    private String department;

    public Employee() {
    }

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

//     @Override  // Note - 1
    public String toString(){
       return "Employee{"+ "ID: "+id+", name: "+name+", department: "+department+"}";
    }
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

  */

// Note -1 : Annotation
/*
 * Annotations are a type of metadata.
 * Metadata is a way of formally describing additional information about our code.
 * Annotations are more structured, and have more meaning, than comments.
 * This is because they can be used by the compiler, or other types of pre-processing functions, to get information about the code.
 * Metadata doesn't effect how the code runs, so this code will still run, with or without the annotation.

 */
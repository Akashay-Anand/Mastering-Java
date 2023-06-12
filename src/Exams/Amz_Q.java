package Exams;

/*

As an intern at Amazon, you have been assigned a task to implement the sign-in pages in the Amazon Dummy Website. There are three signin pages, each with its own API ' Register, Login, Logout '

Notes:

Initialy, there are no users registered
If a user is already logged in and makes a login request, the new request is unsuccessful, The original login remains active
Each log is an API request and is in one of the three allowed formats
The order of execution of each requests is the same as order of the input.
The username and passwords are case-sensitive.
STDIN
5
register david david123
register adam 1Adam1
login david david123
login adam 1adam1
logout david

Sample Output
Registered Successfully
Registered Successfully
Logged In Successfully
Login Unsuccessful
Logged Out Successfully

 */

import java.util.*;

public class Amz_Q {

    static HashMap<String, String>  data = new HashMap<String,String>();
    static ArrayList<String> al = new ArrayList<String>();
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        // al.
        String str = "" , ID="", PASS="";
        while(n>0){
            str = inp.next();
            ID = inp.next();
            PASS = inp.next();
            
            // System.out.println(str);
            if(str =="register") System.out.println(RegisterUser(ID,PASS)); 
            else if(str =="login") System.out.println(LoginUser(ID,PASS)); 
            else if(str =="logout") System.out.println(LogoutUser(ID,PASS)); 
            n--;
        }
        
        inp.close();
    }

    public static String RegisterUser(String ID, String PASS){

        if( data.containsKey(ID) ) return "Username already exists";
        else data.put(ID, PASS);

        return "Registered Successfully";
    }
    public static String LoginUser(String ID, String PASS){

        if(data.containsKey(ID)){
            if(!al.contains(ID)) {
                al.add(ID);
                return "Logged In Successfully";
            }
        }
        return "Login Unsuccessful";
    }
    public static String LogoutUser(String ID, String PASS){

        if(al.contains(ID)){
            al.remove(ID);
            return "Logged Out Successfully";
        }

        return "Logout Unsuccessful";
    }
    
}

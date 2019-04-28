
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eprenzl
 */
public class Validations {
    private String lineEnd;
    
    public Validations() { 
        this.lineEnd = "\n";  
    }
    public Validations(String lineEnd) {
        this.lineEnd = lineEnd;
    }
    //checks to see if certain value is empty or not
    public String isPresent(String value, String name) {
        String msg = "";
        if (value.isEmpty()) {
            msg = name + "" + lineEnd;
        }
        return msg;
    }
    //method that sorts array indexes and compares values for reccuring indexes
    public String findDuplicates(int[] inputArray, String name) {  
        String msg = "";
        int previous = -1;//initialize at -1 just so it is set to some number
        
        Arrays.sort(inputArray);//sort array any instances come up "back to back"
        //loop through inputed array
        for (int e : inputArray){
        // check to see if one element equals the previous, p
            if (e == previous){
                msg = name + "" + lineEnd;
            }
        previous = e;
        }
        return msg;
    }
    //check to see if String array has empty values
    public String isPopulated(String[] strArray, String name){
        String msg = "";
        for(String string : strArray){
            if (string.isEmpty()){
                msg = name + "" + lineEnd;
            }
        } return msg;
    }
    //check to see if an int array has values that are at index 0,
    //which would still equal the option 'choose a position'
    public String isPopulated(int[] intArray, String name){
        String msg = "";
        for(int index : intArray){
            if(index == 0){
                msg = name + "" + lineEnd;
            }
        } return msg;
    }
}

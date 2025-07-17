import java.util.Scanner ;

class v17_logical_Operator {
    public static void main(String[] args) {
        // Logical Operator : && (AND) , || (OR) ,! (NOT)
        //Logocal operator && (AND)
boolean a=true ;
boolean b= false;
if(a && b ){
    System.out.println("Y");
}
else{
    System.out.println("N");
}
// logical Operator  || (OR)
boolean c=true ;
boolean d= false;
if(c || d ){
    System.out.println("Y");
}
else{
    System.out.println("N");
}
// logical Operator  ! (NOT)
boolean e=true ;
boolean f= false;
System.out.print("For Logical NOT : ");
System.out.println(!e);
System.out.print("For Logical NOT : ");
System.out.println(!f);
    }
}
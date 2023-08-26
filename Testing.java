class Testing{
  static void add(int a,int b){
     int c=a+b;
     System.out.println(c);
  }
 static int mup(int a,int b,int c){
     return a*b*c;
   }
 static String greet(String name){
     return "Welcome"+name;
}
 static String greet1(String name){
     String x="Welcome"+name;
     return x;
}
 static boolean validAgeForMarriage(int age){
     if(age<21){
     return false;
}
     else{
     return true;
   }
}
 static void checkNumberIsOddOrEven(int number){
     if(number<0){
     System.out.println("Negative Integer");
}
     else if(number%2==0){
     System.out.println("Number is Even");
 }   
     else{
     System.out.println("Number is Odd");
}
}
  public static void main(String[] args) {
     add(10,20);
     System.out.println(mup(10,20,30));
     System.out.println(greet("Nitish Kumar"));
     System.out.println(greet1("Vikash Yadav"));
     System.out.println(validAgeForMarriage(24));
     checkNumberIsOddOrEven(-23636);
  }
}
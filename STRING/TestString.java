class TestString{


    public static void main(String[] args) {
        String name = "NITIN6 ";

        String name2="";

        for( int i =name.length()-1 ; i>= 0 ; i--){
            name2 = name2 + name.charAt(i); 
        }
       if(name.equals(name2)){
        System.out.println("Pallindrom");
       }else{
        System.out.println("Not ");
       }
    }
}
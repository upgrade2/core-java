package logic;

class ReverseString{

    static String original ="abcd";
    static String reversed="";

    public static void main(String[] args) {
        try {
            for(int i=original.length()-1;i>=0;i--){
                reversed+=original.charAt(i);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        

        System.out.println("reversed::"+reversed);
    }

}
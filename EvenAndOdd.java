class EvenAndOdd {
    public static void main(String[] args) {
        int s[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<=8;i++){
            if(i%2==0){
                System.out.println("Even numbers are: "+s[i]);
            }
            else{
                System.out.println("Odd numbers are: "+s[i]);
            }
        }
    }
}
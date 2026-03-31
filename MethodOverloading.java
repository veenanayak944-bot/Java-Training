package Addition;
class MethodOverloading {
    void add(int a, int b){
	    int sum=a+b;
	    System.out.println("The sum is: "+sum);
	}
	void add(int a, float b){
		float sum=a+b;
		System.out.println("The sum is: "+sum);
	}
	void add(double a,int b){
		double sum=a+b;
		System.out.println("The sum is: "+sum);
	}
    public static void main(String[] args) 
    {
       MethodOverloading mo = new  MethodOverloading();
       mo.add(2,3);
       mo.add(2,3.1f);
       mo.add(2.5,3);
    }
}
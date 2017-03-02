public class ECC_13_RoundedSum {
    public static void main(String[] args) {
        int a = 20;
        int b = 30; 
        int c = 40;
        System.out.println(sumOfRoundedValues(a, b, c));
    }

    public static int sumOfRoundedValues(int n1, int n2, int n3) {
    	int r;
    	 if(int a<=0 && int b<=0 && int c<=0){
        	return -1;
        }
        else{
        	r=a%10;
        	if(r<5)
        int a=a/10;
        a=a*10;
        else
        	a=(a+1)*10;
        int b=b/10;
        b=b*10;
        int c=c/10;
        c=c*10;
        return a+b+c;
        }
    }
}


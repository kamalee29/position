 public static void main(String[] args) {
        // TODO code application logic here
        int i,n1,fact1=1;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        for(i=1;i<=n1;i++)
        {
            fact1=fact1*i;
        }
        System.out.println("the factorial of a given number is"+fact1);
    }
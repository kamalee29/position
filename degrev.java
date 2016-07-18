
  public static void main(String[] args) {
        int n,i,num;
        int[] rev=new int[10];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int n1=n;
        for(i=0;i<n;i++)
        while(n1!=0)
        {
            num=n1%10;
            rev[i]=rev[i]*10+num;
            n1=n1/10;
            System.out.println(""+rev[i]);
        rev[i]=0;
        }
        
    }
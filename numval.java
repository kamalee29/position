
   public static void main(String[] args) {
          
          int i,j,n,a1=0,a2=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        n=sc.nextInt();
                int a[]=new int[n];
                for(i=0;i<n;i++)
        {a[i]=sc.nextInt();
            //System.out.print(""+a[i]);
        }

         for(i=0;i<n-1;i++) {
             for(j=i+1;j<n;j++)
             {
             a1=a[i]-a[j];
             a2=a[i]+a[j];
         
               if(a1==0||a2==0)
               {
                  
                 System.out.println("the values are"+a[i]+"and"+a[j]);
           }
    }
}
}
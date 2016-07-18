
  public static void main(String[] args) {
        int i,j;
        System.out.println("enter the array size");
    Scanner sc=new Scanner(System.in);
       int b=sc.nextInt();
    int[] a=new int[b];
        System.out.println("enter array element");
    for(i=0;i<b;i++)
        {a[i]=sc.nextInt();
            //System.out.print(""+a[i]);
        }
        
      
    for(i=0;i<b-1;i++)
     {
         for(j=i+1;j<b;j++){
             if(a[i]==a[j]){
                 a[j]='\0';}
             
         }
         
     }
  

    for(i=0;i<b;i++)
        { if(a[i]!='\0')
            System.out.print(""+a[i]);}
        
}
 public static void main(String[] args) {
        System.out.println("");
       // postion p=new postion();
        int x,y,z,i,flag=0;
        
     Scanner sc=new Scanner(System.in);
             System.out.print("enter the first element in array ");
             x=sc.nextInt();
             System.out.println("enter how many terms u want");
             y=sc.nextInt();
             int[] m=new int[y];
             System.out.println("enter the increasing value");
             z=sc.nextInt();
             System.out.print(" "+x);
             for(i=1;i<y;i++)
             {
                 m[i]=x+z;
                 System.out.print(" "+m[i]);
                 x=m[i];
                 

    }for(i=0;i<b;i++)
             {
                 if(m[i]==i)
                 System.out.print("the value"+m[i]+"istrue");
                 flag=1;
                     
                 

    }if(flag==0)
            System.out.println("false");
              
    
}

  public static void main(String[] args) {
        String s1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter thebString to be reversed");
        s1=sc.nextLine();
     String str=new StringBuffer(s1).reverse().toString();
        System.out.println("the reversable String is "+str);
    }


  public static void main(String[] args) {
        String str1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter thebString to be reversed");
        str1=sc.nextLine();
     String str2=new StringBuffer(str1).reverse().toString();
        System.out.println("the reversable String is "+str2);
    }
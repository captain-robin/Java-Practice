class Exception34{
    public static void main(String[] args){
        int balance=5000;
        int withdrawAmount=6000;
        try{
            if(balance < withdrawAmount)
            throw new ArithmeticException("Insufficient balance");
            balance=balance-withdrawAmount;
            System.out.println("Transaction Successfully completed");   
            }
        catch(ArithmeticException e){
        System.out.println("Exception: "+e.getMessage());
    }
    System.out.println(" program continue..");
  }
}
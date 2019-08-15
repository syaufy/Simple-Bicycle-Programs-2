


    class Account {
        
        private String ownerName;
        private Double balance;
       


        public Account (){
        ownerName = "Unassigned";
        balance = 0.0;
}

        public void add(double amt) {
            balance = balance + amt;
        }

        public void deduct(double amt)  {
            balance = balance - amt;
        }
        
        public double getCurrentBalance(){
            return balance;
        }
        
        public String getownerName(){
            return ownerName;
        }
        
        public void setInitialBalance(double bal)   {
            balance = bal;
        }
        
        public void setownerName(String name){
            ownerName = name;
        }
}
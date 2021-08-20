package com.example.basicbankingapp.Data;

public class Transaction {
    private String fromUser;
    private String ToUser;
    private int amountTransfered;
    private int status;

    public Transaction(String fromUser,String toUser, int amountTransfered, int status) {
        this.fromUser = fromUser;
        ToUser=toUser;
        this.amountTransfered=amountTransfered;
        this.status=status;
    }
    public String getFromUser(){return fromUser;}
    public void setFromUser(String fromUser){this.fromUser=fromUser;}
    public String getToUser(){return ToUser;}
    public void setToUser(String toUser){ToUser=toUser;}
    public int getAmountTransfered(){return amountTransfered;}
    public void setAmountTransfered(int amountTransfered){
        this.amountTransfered = amountTransfered;
    }
    public int getStatus(){return status;}
    public void setStatus(int status){this.status=status;}

}

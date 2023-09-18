/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author david
 */
public class CheckingAccount {
    
  public String name;
  public int balance;
  public String id;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    name= inputName;
    balance= inputBalance;
    id= inputId;
  }

  public int getBalance() {
    return balance;
  }
  public void setBalance(int newBalance) {
    balance= newBalance;
  }
  
}
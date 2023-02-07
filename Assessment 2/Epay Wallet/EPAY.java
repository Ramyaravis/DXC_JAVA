package Wallet_Java;

public class EPAY {
	
	    public static void processPaymentByWallet(Wallet user, double billAmount) {
	        boolean paymentSuccess = user.makePayment(billAmount);
	        if (paymentSuccess) {
	            System.out.println("Congrats " +user.getUsername() + "Payment of "+ billAmount +" processed successfully");
	            System.out.println("Email: " + user.getEmail());
	        }
	        
	         else {
	                System.out.println("Sorry "+user.getUsername() +"you dont have enough  balance to make payment");
	            }
	                       System.out.println("Your wallet balance: " + user.getWalletBalance());
	                       
	                      
	       
	            if (user instanceof KYCUser) {
	                KYCUser kycUser = (KYCUser) user;
	                System.out.println("You have" + kycUser.getRewardPoints()+"Ponits!");
	            }
	            
	           
	        } 
	         }
class Tester {
    public static void main(String[] args) {
        Wallet user = new Wallet(101, "Jack", "jack@dxc.com", 1000);
        KYCUser kycuser = new KYCUser(201, "Jill", "jill@dxc.com", 3000);
        
        EPAY.processPaymentByWallet(user, 700);
        EPAY.processPaymentByWallet(kycuser, 1500);
        EPAY.processPaymentByWallet(kycuser, 800);
        EPAY.processPaymentByWallet(kycuser, 1200);
    }
}



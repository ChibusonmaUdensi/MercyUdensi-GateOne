import java.util.Scanner;
 public class CreditCard{
  Scanner input = new Scanner(System.in);

   public String cardType(String cardNum){
    String type = "";

if(cardNum.charAt(0) == '4'){
   type = "Visa Card";
}else if(cardNum.charAt(0) == '5'){
   type ="Master Card";

}else if(cardNUm.charAt(0) == '3' && cardNum.charAt(1) == '7'){
   type = "American Express cards";

}else if(cardNum.charAt(0) == '6'){
   type = "Discover cards";

}else  type = "Invalid";
   return type;
}

public int AddNumber1(String cardNumber){
int result = 0;
for(int count = cardNumber.length() - 1 ; count >= 0; count--){
var cardValue = Integer.parseInt(String.valueOf(cardNumber.charAt(count))) * 2;
if (count % 2 == 0 && cardValue < 10){
result += cardValue;
}
}
return result;
}

public int AddNumber2(String cardNumber){ 
int result = 0;
for(int counter = cardNumber.length() - 1 ; counter >= 0; counter--){
var cardValue = Integer.parseInt(String.valueOf(cardNumber.charAt(count))) * 2;
if (counter % 2 == 0 && cardValue >= 10){
	String  cardValue2 = String.valueOf(cardValue);
	for(int count = 0; count < cardValue2.length(); count++){
	var cardValuee = Integer.parseInt(String.valueOf(cardValue2.charAt(count1)));
	result += cardValuee;}
}
}
return result;
}

public int AddNumber3(String cardNumber){
int result = 0;
for(int countt = cardNumber.length() -1; countt >= 0; countt--){
if (countt % 2 != 0){
var cardValue = Integer.parseInt(String.valueOf(cardNumber.charAt(count)));
result += cardValue;
}
}
return result;
}

 

public static void main(String[] args){
CreditCardvalidator = new CreditCard();
System.out.print(validator.cardType("5399831690403"));

 
}
}
from datetime import datetime
import array as arr

customers_name = input("What is the customer's name?: " '\n')

all_product = []
all_prices = []
all_quantity = []


product = input("What did the user buy?: " '\n')
all_product.append(product)

quantity = int(input("How many pieces?: " '\n'))
all_quantity.append(quantity)

price = int(input("How much per unit?: " '\n'))
all_prices.append(price)

add = input("Add more items?: " '\n')

while (add == 'yes'):
	product = input("What did the user buy?: " '\n')
	all_product.append(product)

	quantity = int(input("How many pieces?: " '\n'))
	all_quantity.append(quantity)

	price = int(input("How much per unit?: " '\n'))
	all_prices.append(price)

	
	add = input("Add more items?: " '\n')

	if add == 'no':
		break

cashier_name = input("What is your name?: " '\n')

discount_given = int(input("How much discount will he get?: " '\n'))


print('SEMICOLON STORES')
print('MAIN BRANCH')
print('LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.')
print('TEL: 07048840550')
now = datetime.now()
print("Date:", now)
print("Cashier: ", cashier_name)
print("Customer Name: ", customers_name)

print('==============================================================')

print("    ", "ITEM",  "        ",  "QUANTITY",  "        ",  "PRICE", "        " 
, "TOTAL" )

print("--------------------------------------------------------------")


sum_total = 0
discount = 0
VAT_amount = 0
bill_total = 0

for index in range(len(all_product)):
    print(f"      {all_product[index]:10s}        {all_quantity[index]:10d}     {all_prices[index]:10.2f}   {all_prices[index] * all_quantity[index]:10.2f}")
    
 
sum_total += all_prices[index]   * all_quantity[index]
discount = sum_total * discount_given / 100
VAT_amount = sum_total * (17.50 / 100)
bill_total = sum_total - discount + VAT_amount


print("------------------------------------------------------------")
print("               ",      "                ",    "SubTotal: ",       "     ",            sum_total)
print("               ",      "                ",    "Discount: ",             "      ",        discount)
print("               ",      "                ",    "VAT @ 17.50: ",     "   ",       VAT_amount)
   
  
print('==============================================================')

print("               ",      "                ",    "Bill Total: ",     "     ",          bill_total)

print('==============================================================')

print("                    ",     " THIS IS NOT A RECEIPT KINDLY PAY  ",           bill_total)

print('==============================================================')

amount = int(input("How much did the customer give to you?: " '\n'))


print('SEMICOLON STORES')
print('MAIN BRANCH')
print('LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.')
print('TEL: 07048840550')
now = datetime.now()
print("Date:", now)
print("Cashier: ", cashier_name)
print("Customer Name: ", customers_name)

print('==============================================================')

print("    ", "ITEM",  "        ",  "QUANTITY",  "        ",  "PRICE", "        " 
, "TOTAL" )

print("--------------------------------------------------------------")


balance =  amount - bill_total

print("------------------------------------------------------------")
print("               ",      "                ",    "SubTotal: ",       "     ",            sum_total)
print("               ",      "                ",    "Discount: ",             "      ",        discount)
print("               ",      "                ",    "VAT @ 17.50: ",     "   ",       VAT_amount)
   
  
print('==============================================================')

print("               ",      "                ",    "Bill Total: ",     "     ",          bill_total)
print("               ",      "                ",    "Amount Paid: ",     "     ",          amount)
print("               ",      "                ",    "Balance: ",     "     ",          balance)

print('==============================================================')

print("         ", 'THANKS FOR YOUR PATRONAGE',    "         ")

print('==============================================================')
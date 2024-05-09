import random;

correct = 0
incorrect = 0
for count in range(10):

	number = random.random()
	number2 = random.random()

	problem = number * number2
	solution = input("What is" + str(number) + "*" + str(number2) + "?")
	if (solution == number * number2) :
		correct+=1
		print("correct")
	else:
		incorrect+=1
		print("incorrect")

print("You have" + str(correct) + "correct scores");
print("You have" + str(incorrect) + "incorrect scores");
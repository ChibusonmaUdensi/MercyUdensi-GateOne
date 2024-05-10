total = 0
for count in range(10):
	score = int(input("Enter score: "))
	if score % 2 == 0 :
		total +=score
print("the sum of even numbers is:", total)

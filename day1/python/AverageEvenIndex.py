total = 0
counter = 0
for count in range(10):
	score = int(input("Enter score: "))
	if score % 2 == 0 :
		total +=score
		counter += 1
average = total / counter
print("the average of even numbers is:", average)

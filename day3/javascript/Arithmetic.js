const prompt = require('prompt-sync')();



let correct = 0
let incorrect = 0


for (let i = 1; i <= 10; i++) {
	let x = Math.floor(Math.random()*10) ;
	let y = Math.floor(Math.random()*10) ;

	var z = x * y
	 
	const answer = prompt(`What is ${x} * ${y}?`)
	if (answer == x * y){
		correct++
		console.log("correct")
	}

	else {
		incorrect++
		console.log("incorrect")
	}


}

console.log("you have" + correct + "correct" + "answers")
	console.log("you have" + incorrect + "incorrect" + "answers")




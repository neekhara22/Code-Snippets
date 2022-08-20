// .............Store random number.............

// let target = 69;
// let numberOfGuess =0;
// let random =Math.floor(Math.random() * 100)+ 1;  // random no. b/w 0 to 100
// let start = 1;
// let end=100;
// function getRndInteger(min, max) {
//     return Math.floor(Math.random() * (max - min + 1) ) + min;
//   }

// while(random != target){
//     if(random>target){
//         numberOfGuess++;
//         end=random;
//         random = getRndInteger(start, end);
//     }else if(random<target){
//         numberOfGuess++;
//         start = random;
//         random = getRndInteger(start,end)
//     }   
// }
// let score= 100 -numberOfGuess;
// console.log(score)



// .............Store random number by user.............

let target = 69;
let numberOfGuess =0;
let random = Math.floor(Math.random() * 100)+1;  // random no. b/w 0 to 100
console.log(random);
let start = 1;
let end=100;
while(random != target){
    if(random>target){
        end=random;
        random = prompt(`The guessed number is greater than the correct number. Please put the number between ${start} and ${end}.`);
        numberOfGuess++;             
    }else if(random<target){
        start = random;
        random = prompt(`The guessed number is less than the correct number. Please put the number between ${start} and ${end}.`);
        numberOfGuess++;       
    } 
}
let score= 100 -numberOfGuess;
console.log(`Congratulations!! you entered a correct number and your score is ${score}`)

//1) Sum of the first 10 numbers
//Write a loop that sums up the first 10 numbers (1 through 10).

let sum1 = 0;
for (let i = 0; i <= 10; i++) {
    sum1 += i;
}
console.log("Summe1: " + sum1)


//2) Sum of every third number between 1 and 30
//Write a loop that sums every third number between 1 and 30.

let sum2 = 0;
for (let i = 1; i <= 30; i += 3) {
    sum2 += i;
}
console.log("Summe2: " + sum2);


//3) Print the even numbers between 1 and 20
//Write a loop that prints all the even numbers from 1 to 20.

let sum3 = 0;
for (let i = 1; i <= 20; i += 2) {
    sum3 += i;
}
console.log("Summe3: " + sum3);



//4) Print the odd numbers between 1 and 20
//Write a loop that prints all the odd numbers from 1 to 20.

let sum4 = 0;
for (let i = 1; i <= 20; i++) {
    if (i % 3) {
        sum4 += i;
    }
}
console.log("Summde4: " + sum4);


//5) Count down from 10 to 1
//Write a loop that counts down from 10 to 1 and prints each number.

let sum5 = 0;
for (let i = 10; i >= 1; i--) {
    console.log(i);
}


//6) Sum of squares from 1 to 5
//Write a loop that calculates the sum of squares of the first 5 numbers (1^2 + 2^2 + ... + 5^2).

let sum6 = 0;
for (let i = 1; i <= 5; i++) {
    sum6 = i * i;
}
console.log("Summe 6: " + sum6);



//• Sum of the numbers from 1 to 100
//Write a loop that sums all the numbers from 1 to 100.

let sum7 = 0;
for (i = 0; i <= 100; i++) {
    sum7 += i;
}
console.log("Summe 7= " + sum7);


//• Find the product of the first 5 numbers
//Write a loop that calculates the product of the first 5 numbers (1 * 2 * 3 * 4 * 5).

let sum8 = 1;
for (i = 1; i <= 5; i++) {
    sum8 = sum8 * i;
}
console.log("Summe 8= " + sum8);



//• Print the multiplication table of 3
//Write a loop that prints the multiplication table for the number 3 (3 * 1, 3 * 2, ..., 3 * 10).

let sum9 = 0;
let a = 0;
for (let i = 1; i <= 10; i++) {
    a = i * 3;
    sum9 = sum9 + a;
}
console.log("Summe 9= " + sum9);


//• Print the reverse of a string
//Write a loop that prints a string in reverse. For example, reverse "hello" to "olleh".

let reversed = "hello";
for (let i = str.length - 1; i >= 0; i--) {
    reversed += str[i];
}
console.log("Reversed string:", reversed);


//• Find the largest number in an array
//Write a loop that finds and prints the largest number in an array of numbers.




//• Sum the digits of a number
//Write a loop that sums all the digits of a given number (e.g., for 123, the sum is 1 + 2 + 3 = 6).




//• Count the number of vowels in a string
//Write a loop that counts how many vowels (a, e, i, o, u) are in a given string.




//• Print the Fibonacci sequence up to the 10th term
//Write a loop that prints the first 10 numbers of the Fibonacci sequence.




//• Check if a number is prime
//Write a loop that checks if a given number is prime (i.e., greater than 1 and divisible only by 1 and itself).

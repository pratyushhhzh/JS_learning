// CHAPTER 1

const city = "Bhubaneswar";
const name = "Pratyush Sahoo";
let age = 18;

console.log(name);
console.log(city);
console.log(age);




console.log(x);
var x = 19; // undefined .. because of hoisting !!

const a = 10;
// a=20; // error

//console.log(y);
//let y = 19; // reference error .. because of hoisting !!


const person = {name: "pratyush"};
person.name="Ashutosh";
console.log(person);
console.log(person.name);

// CHAPTER 2

// CHECKING TYPES OF DATA TYPES: //".typeof"
console.log(typeof true);
console.log(typeof "ASHUTOSH");

//Comparision
console.log(5 == "5");
console.log(5 === "5"); // checks value + type(===)

// Practice Questions (Value Check)
console.log(null + 1); // 1
console.log("5" + 3); // 53
console.log("5" - 3); // 2
console.log(true + false); // 1

console.log(typeof []); // "object"
console.log(typeof null); // "object"
console.log(typeof 123n); // "String"❌  "bigint"✅

console.log(Boolean(0)); // false
console.log(Boolean("0")); // true
console.log(Boolean([])); // true
console.log(Boolean(undefined)); // false 

//CHAPTER 3


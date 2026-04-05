# 📚 JavaScript — Complete Notes (Scratch to Pro Level)

> **Author:** Your Name  
> **Purpose:** Complete JavaScript reference from beginner to advanced  
> **Last Updated:** 2025  

---

## 📖 Table of Contents

1. [Introduction to JavaScript](#1-introduction-to-javascript)
2. [Variables & Data Types](#2-variables--data-types)
3. [Operators](#3-operators)
4. [Control Flow](#4-control-flow)
5. [Functions](#5-functions)
6. [Arrays](#6-arrays)
7. [Objects](#7-objects)
8. [String Methods](#8-string-methods)
9. [Array Methods (Deep Dive)](#9-array-methods-deep-dive)
10. [Destructuring & Spread/Rest](#10-destructuring--spreadrest)
11. [DOM Manipulation](#11-dom-manipulation)
12. [Events](#12-events)
13. [Error Handling](#13-error-handling)
14. [Asynchronous JavaScript](#14-asynchronous-javascript)
15. [Promises & Async/Await](#15-promises--asyncawait)
16. [ES6+ Modern Features](#16-es6-modern-features)
17. [Object-Oriented Programming (OOP)](#17-object-oriented-programming-oop)
18. [Prototypes & Inheritance](#18-prototypes--inheritance)
19. [Closures & Scope](#19-closures--scope)
20. [Higher-Order Functions & Functional Programming](#20-higher-order-functions--functional-programming)
21. [Modules (ES Modules & CommonJS)](#21-modules-es-modules--commonjs)
22. [Regular Expressions](#22-regular-expressions)
23. [Web APIs (Fetch, Storage, etc.)](#23-web-apis)
24. [JavaScript Engine & Runtime](#24-javascript-engine--runtime)
25. [Design Patterns](#25-design-patterns)
26. [Performance Optimization](#26-performance-optimization)
27. [Testing in JavaScript](#27-testing-in-javascript)
28. [TypeScript Basics (for JS Devs)](#28-typescript-basics)
29. [Node.js Essentials](#29-nodejs-essentials)
30. [Pro Tips & Best Practices](#30-pro-tips--best-practices)

---

## 1. Introduction to JavaScript

### What is JavaScript?
- JavaScript is a **lightweight, interpreted, multi-paradigm** programming language.
- Runs in browsers (client-side) and on servers via **Node.js** (server-side).
- The only language natively understood by web browsers.
- Supports **OOP**, **functional**, and **event-driven** programming styles.

### How to Run JavaScript

```html
<!-- Inside HTML file -->
<script>
  console.log("Hello, World!");
</script>

<!-- External file -->
<script src="app.js"></script>
<script type="module" src="app.js"></script> <!-- ES Modules -->
```

```bash
# In terminal with Node.js
node app.js
```

### Developer Console
```javascript
console.log("Basic output");
console.warn("Warning message");
console.error("Error message");
console.table([{ name: "Alice", age: 25 }]);
console.time("timer");
console.timeEnd("timer"); // logs elapsed time
console.group("Group");
console.groupEnd();
```

---

## 2. Variables & Data Types

### Variable Declarations

```javascript
// var — old way, function-scoped, hoisted (avoid in modern JS)
var name = "Alice";

// let — block-scoped, can be reassigned
let age = 25;
age = 26; // OK

// const — block-scoped, cannot be reassigned (not truly immutable)
const PI = 3.14159;
// PI = 3; // ❌ TypeError

const person = { name: "Alice" };
person.name = "Bob"; // ✅ OK — object properties can change
```

### Primitive Data Types (7 types)

```javascript
// 1. Number
let integer = 42;
let float = 3.14;
let negative = -100;
let infinity = Infinity;
let notANumber = NaN;
console.log(typeof 42);         // "number"
console.log(Number.isNaN(NaN)); // true
console.log(Number.isFinite(Infinity)); // false

// 2. String
let single = 'Hello';
let double = "World";
let template = `Hello, ${name}!`; // Template literal
let multiLine = `Line 1
Line 2`;

// 3. Boolean
let isTrue = true;
let isFalse = false;
console.log(typeof true); // "boolean"

// 4. Undefined — variable declared but not assigned
let x;
console.log(x); // undefined
console.log(typeof x); // "undefined"

// 5. Null — intentional absence of value
let empty = null;
console.log(typeof null); // "object" ← famous JS bug!

// 6. Symbol — unique identifier (ES6)
let sym1 = Symbol("id");
let sym2 = Symbol("id");
console.log(sym1 === sym2); // false — always unique

// 7. BigInt — integers beyond Number.MAX_SAFE_INTEGER (ES2020)
let bigNumber = 9007199254740991n;
let anotherBig = BigInt("12345678901234567890");
```

### Reference Types (Objects)

```javascript
// Object
let obj = { key: "value" };

// Array
let arr = [1, 2, 3];

// Function
let fn = function() {};

// All have typeof "object" (except function → "function")
console.log(typeof obj);  // "object"
console.log(typeof arr);  // "object"
console.log(typeof fn);   // "function"

// Check if array
Array.isArray(arr); // true
```

### Type Coercion (Auto Type Conversion)

```javascript
// Implicit coercion
console.log("5" + 3);    // "53" — number becomes string
console.log("5" - 3);    // 2    — string becomes number
console.log(true + 1);   // 2    — true = 1
console.log(false + 1);  // 1    — false = 0
console.log(null + 1);   // 1    — null = 0
console.log(undefined + 1); // NaN

// Explicit conversion
Number("42");       // 42
Number("");         // 0
Number(null);       // 0
Number(undefined);  // NaN
Number(true);       // 1
parseInt("42px");   // 42 — stops at non-numeric
parseFloat("3.14"); // 3.14
String(42);         // "42"
Boolean(0);         // false
Boolean("");        // false
Boolean(null);      // false
Boolean(undefined); // false
Boolean(NaN);       // false
Boolean("hello");   // true
Boolean([]);        // true ← important!
Boolean({});        // true ← important!
```

### Truthy & Falsy Values

```javascript
// FALSY values (convert to false):
false, 0, -0, 0n, "", '', ``, null, undefined, NaN

// TRUTHY values (everything else):
true, 1, "0", "false", [], {}, function(){}, -1, Infinity
```

---

## 3. Operators

### Arithmetic Operators

```javascript
let a = 10, b = 3;
console.log(a + b);  // 13  addition
console.log(a - b);  // 7   subtraction
console.log(a * b);  // 30  multiplication
console.log(a / b);  // 3.333...  division
console.log(a % b);  // 1   modulo (remainder)
console.log(a ** b); // 1000  exponentiation (ES7)
console.log(++a);    // 11  pre-increment (modifies a)
console.log(a++);    // 11  post-increment (returns old, then modifies)
console.log(--b);    // 2   pre-decrement
```

### Comparison Operators

```javascript
// == Loose equality (with type coercion)
console.log(5 == "5");   // true ← coerces string to number
console.log(null == undefined); // true

// === Strict equality (no coercion) — ALWAYS PREFER THIS
console.log(5 === "5");  // false
console.log(5 === 5);    // true

// != and !==
console.log(5 != "5");   // false
console.log(5 !== "5");  // true

// Relational
console.log(5 > 3);   // true
console.log(5 >= 5);  // true
console.log(3 < 5);   // true
console.log(3 <= 2);  // false
```

### Logical Operators

```javascript
// && (AND) — returns first falsy or last value
console.log(true && false);  // false
console.log(1 && 2);         // 2 (last truthy)
console.log(0 && "hello");   // 0 (first falsy)

// || (OR) — returns first truthy or last value
console.log(false || true);  // true
console.log(0 || "default"); // "default"
console.log("hi" || "bye");  // "hi" (first truthy)

// ! (NOT)
console.log(!true);  // false
console.log(!0);     // true
console.log(!!0);    // false (double negation = Boolean conversion)

// ?? Nullish Coalescing (ES2020) — only null/undefined
console.log(null ?? "default");      // "default"
console.log(undefined ?? "default"); // "default"
console.log(0 ?? "default");         // 0 ← 0 is NOT null/undefined
console.log("" ?? "default");        // "" ← "" is NOT null/undefined

// Optional Chaining ?. (ES2020)
const user = { profile: { name: "Alice" } };
console.log(user?.profile?.name);   // "Alice"
console.log(user?.address?.city);   // undefined (no error!)
console.log(user?.getName?.());     // undefined (safe method call)
```

### Assignment Operators

```javascript
let n = 10;
n += 5;   // n = n + 5  → 15
n -= 3;   // n = n - 3  → 12
n *= 2;   // n = n * 2  → 24
n /= 4;   // n = n / 4  → 6
n %= 4;   // n = n % 4  → 2
n **= 3;  // n = n ** 3 → 8
n &&= 5;  // n = n && 5 → 5 (Logical AND assignment)
n ||= 10; // n = n || 10 → 5 (n is truthy, stays 5)
n ??= 20; // n = n ?? 20 → 5 (n is not null/undefined)
```

### Bitwise Operators

```javascript
// Rarely used in everyday code but good to know
5 & 3   // 1  (AND)
5 | 3   // 7  (OR)
5 ^ 3   // 6  (XOR)
~5      // -6 (NOT)
5 << 1  // 10 (left shift — multiply by 2)
5 >> 1  // 2  (right shift — divide by 2)
5 >>> 1 // 2  (unsigned right shift)
```

### Ternary Operator

```javascript
let age = 20;
let status = age >= 18 ? "Adult" : "Minor";
console.log(status); // "Adult"

// Nested (use sparingly — hurts readability)
let grade = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : "F";
```

### typeof & instanceof

```javascript
typeof 42;          // "number"
typeof "hello";     // "string"
typeof true;        // "boolean"
typeof undefined;   // "undefined"
typeof null;        // "object" ← bug
typeof {};          // "object"
typeof [];          // "object"
typeof function(){}; // "function"
typeof Symbol();    // "symbol"
typeof 42n;         // "bigint"

// instanceof — checks prototype chain
[] instanceof Array;   // true
{} instanceof Object;  // true
function(){} instanceof Function; // true
```

---

## 4. Control Flow

### if / else if / else

```javascript
let score = 85;

if (score >= 90) {
  console.log("A");
} else if (score >= 80) {
  console.log("B");
} else if (score >= 70) {
  console.log("C");
} else {
  console.log("F");
}
```

### switch

```javascript
let day = "Monday";

switch (day) {
  case "Monday":
  case "Tuesday":
  case "Wednesday":
  case "Thursday":
  case "Friday":
    console.log("Weekday");
    break;
  case "Saturday":
  case "Sunday":
    console.log("Weekend");
    break;
  default:
    console.log("Invalid day");
}
```

### Loops

```javascript
// for loop
for (let i = 0; i < 5; i++) {
  console.log(i); // 0, 1, 2, 3, 4
}

// while loop
let count = 0;
while (count < 3) {
  console.log(count);
  count++;
}

// do...while — runs at least once
let num = 0;
do {
  console.log(num);
  num++;
} while (num < 3);

// for...of — iterate over iterables (arrays, strings, maps, sets)
const fruits = ["apple", "banana", "cherry"];
for (const fruit of fruits) {
  console.log(fruit);
}

// for...in — iterate over object keys (also works on arrays, but avoid)
const person = { name: "Alice", age: 25 };
for (const key in person) {
  console.log(`${key}: ${person[key]}`);
}

// forEach
fruits.forEach((fruit, index) => {
  console.log(`${index}: ${fruit}`);
});
```

### Loop Control

```javascript
// break — exit the loop
for (let i = 0; i < 10; i++) {
  if (i === 5) break;
  console.log(i); // 0, 1, 2, 3, 4
}

// continue — skip current iteration
for (let i = 0; i < 5; i++) {
  if (i === 2) continue;
  console.log(i); // 0, 1, 3, 4
}

// Labeled loops (rarely used)
outer: for (let i = 0; i < 3; i++) {
  for (let j = 0; j < 3; j++) {
    if (j === 1) break outer; // breaks outer loop
    console.log(i, j);
  }
}
```

---

## 5. Functions

### Function Declaration

```javascript
function greet(name) {
  return `Hello, ${name}!`;
}
console.log(greet("Alice")); // "Hello, Alice!"

// Function declarations are HOISTED (can be called before definition)
sayHi(); // Works!
function sayHi() {
  console.log("Hi!");
}
```

### Function Expression

```javascript
const greet = function(name) {
  return `Hello, ${name}!`;
};

// NOT hoisted — must be defined before calling
// greet(); // ❌ ReferenceError
const greet = function(name) { ... };
```

### Arrow Functions (ES6)

```javascript
// Full syntax
const add = (a, b) => {
  return a + b;
};

// Concise syntax (implicit return for single expression)
const add = (a, b) => a + b;

// Single param — no parentheses needed
const square = x => x * x;

// No params — empty parens required
const sayHello = () => console.log("Hello");

// Returning an object literal — wrap in parentheses
const makePerson = (name, age) => ({ name, age });

// Arrow functions DO NOT have their own `this`
// They inherit `this` from the enclosing scope
function Timer() {
  this.seconds = 0;
  setInterval(() => {
    this.seconds++; // `this` refers to Timer instance ✅
  }, 1000);
}
```

### Default Parameters

```javascript
function greet(name = "World", greeting = "Hello") {
  return `${greeting}, ${name}!`;
}
greet();           // "Hello, World!"
greet("Alice");    // "Hello, Alice!"
greet("Bob", "Hi"); // "Hi, Bob!"
```

### Rest Parameters

```javascript
// Collect remaining arguments into an array
function sum(...numbers) {
  return numbers.reduce((total, n) => total + n, 0);
}
sum(1, 2, 3, 4, 5); // 15

function logFirst(first, ...rest) {
  console.log("First:", first);
  console.log("Rest:", rest);
}
logFirst("a", "b", "c", "d"); // First: a, Rest: ["b","c","d"]
```

### Arguments Object (old way, avoid)

```javascript
function oldStyle() {
  console.log(arguments); // array-like object
  console.log(Array.from(arguments)); // convert to real array
}
// Arrow functions do NOT have `arguments`
```

### Immediately Invoked Function Expression (IIFE)

```javascript
(function() {
  console.log("Runs immediately!");
})();

// Arrow IIFE
(() => {
  console.log("Also runs immediately!");
})();

// With return value
const result = (function(x, y) {
  return x + y;
})(10, 20); // 30
```

### Higher-Order Functions

```javascript
// A function that takes a function as argument
function apply(fn, value) {
  return fn(value);
}
apply(x => x * 2, 5); // 10

// A function that returns a function
function multiplier(factor) {
  return (number) => number * factor;
}
const double = multiplier(2);
const triple = multiplier(3);
double(5); // 10
triple(5); // 15
```

### Recursion

```javascript
// Factorial
function factorial(n) {
  if (n <= 1) return 1;       // base case
  return n * factorial(n - 1); // recursive case
}
factorial(5); // 120

// Fibonacci
function fib(n) {
  if (n <= 1) return n;
  return fib(n - 1) + fib(n - 2);
}
fib(10); // 55

// Recursive sum of nested arrays
function flatSum(arr) {
  return arr.reduce((sum, item) => {
    return sum + (Array.isArray(item) ? flatSum(item) : item);
  }, 0);
}
flatSum([1, [2, [3, [4]]]]); // 10
```

### Function Properties & Methods

```javascript
function greet(greeting, name) {
  console.log(`${greeting}, ${name}! I am ${this.title}`);
}

const context = { title: "Dr." };

// call — invoke with specific `this`, args comma-separated
greet.call(context, "Hello", "Alice");

// apply — invoke with specific `this`, args as array
greet.apply(context, ["Hello", "Alice"]);

// bind — creates NEW function with bound `this`
const boundGreet = greet.bind(context, "Hello");
boundGreet("Alice");
boundGreet("Bob"); // can reuse

// Function length property
function fn(a, b, c) {}
console.log(fn.length); // 3 — number of expected params
console.log(fn.name);   // "fn"
```

---

## 6. Arrays

### Creating Arrays

```javascript
const arr1 = [1, 2, 3, 4, 5];
const arr2 = new Array(5);         // [empty × 5]
const arr3 = new Array(1, 2, 3);   // [1, 2, 3]
const arr4 = Array.from("hello");  // ['h','e','l','l','o']
const arr5 = Array.from({length: 5}, (_, i) => i * 2); // [0,2,4,6,8]
const arr6 = Array.of(1, 2, 3);    // [1, 2, 3]
const arr7 = [...arr1];            // copy via spread
```

### Accessing & Modifying

```javascript
const fruits = ["apple", "banana", "cherry"];

// Access
fruits[0];     // "apple"
fruits[fruits.length - 1]; // "cherry" — last element
fruits.at(-1); // "cherry" — at() with negative index (ES2022)
fruits.at(-2); // "banana"

// Modify
fruits[1] = "blueberry";
fruits.length; // 3

// Destructuring assignment (more in section 10)
const [first, second, ...rest] = fruits;
```

### Adding & Removing Elements

```javascript
const arr = [1, 2, 3];

// End
arr.push(4, 5);     // adds to end → [1,2,3,4,5], returns new length
arr.pop();          // removes last → returns 5, arr = [1,2,3,4]

// Start
arr.unshift(0);     // adds to start → [0,1,2,3,4], returns new length
arr.shift();        // removes first → returns 0, arr = [1,2,3,4]

// Middle — splice(start, deleteCount, ...itemsToAdd)
arr.splice(1, 2);          // remove 2 from index 1 → [1, 4], returns [2,3]
arr.splice(1, 0, 10, 11);  // insert without removing → [1,10,11,4]
arr.splice(2, 1, 99);      // replace 1 at index 2 → [1,10,99,4]
```

### Searching Arrays

```javascript
const arr = [10, 20, 30, 20, 40];

arr.indexOf(20);        // 1 — first occurrence index
arr.lastIndexOf(20);    // 3 — last occurrence index
arr.indexOf(99);        // -1 — not found

arr.includes(20);       // true
arr.includes(99);       // false

// find — returns first matching element
arr.find(x => x > 25);       // 30
arr.findIndex(x => x > 25);  // 2 — index instead of value
arr.findLast(x => x < 35);   // 30 (ES2023)
arr.findLastIndex(x => x < 35); // 2 (ES2023)
```

### Sorting Arrays

```javascript
const nums = [10, 1, 3, 2, 20];
const words = ["banana", "apple", "cherry"];

// Default sort — alphabetical (converts to string!)
nums.sort();  // [1, 10, 2, 20, 3] ← WRONG for numbers!

// Numeric sort — use compare function
nums.sort((a, b) => a - b);    // [1, 2, 3, 10, 20] ascending
nums.sort((a, b) => b - a);    // [20, 10, 3, 2, 1] descending

// String sort
words.sort();                          // alphabetical
words.sort((a, b) => a.localeCompare(b)); // locale-aware

// Sort objects by property
const people = [
  { name: "Charlie", age: 30 },
  { name: "Alice", age: 25 },
  { name: "Bob", age: 35 },
];
people.sort((a, b) => a.age - b.age);       // by age
people.sort((a, b) => a.name.localeCompare(b.name)); // by name
```

### Joining & Slicing

```javascript
const arr = [1, 2, 3, 4, 5];

// slice(start, end) — returns new array, DOES NOT modify original
arr.slice(1, 3);    // [2, 3] — index 1 up to (not including) 3
arr.slice(2);       // [3, 4, 5] — from index 2 to end
arr.slice(-2);      // [4, 5] — last 2 elements
arr.slice();        // [1,2,3,4,5] — shallow copy

// join — array to string
arr.join(", ");     // "1, 2, 3, 4, 5"
arr.join("-");      // "1-2-3-4-5"
arr.join("");       // "12345"

// concat — merge arrays
[1, 2].concat([3, 4], [5, 6]); // [1,2,3,4,5,6]
[...arr1, ...arr2]; // spread is more modern
```

### Flattening Arrays

```javascript
const nested = [1, [2, [3, [4]]]];

nested.flat();       // [1, 2, [3, [4]]] — one level
nested.flat(2);      // [1, 2, 3, [4]] — two levels
nested.flat(Infinity); // [1, 2, 3, 4] — fully flatten

// flatMap — map then flatten one level
[1, 2, 3].flatMap(x => [x, x * 2]); // [1,2,2,4,3,6]
```

### Filling Arrays

```javascript
new Array(5).fill(0);          // [0, 0, 0, 0, 0]
[1, 2, 3, 4, 5].fill(0, 1, 3); // [1, 0, 0, 4, 5]
```

---

## 7. Objects

### Creating Objects

```javascript
// Object literal
const person = {
  name: "Alice",
  age: 25,
  "full name": "Alice Smith", // special key with spaces
  greet() {                   // method shorthand (ES6)
    return `Hi, I'm ${this.name}`;
  }
};

// Constructor function
function Person(name, age) {
  this.name = name;
  this.age = age;
}
const p = new Person("Bob", 30);

// Object.create — create with specific prototype
const proto = { greet() { return `Hi, I'm ${this.name}`; } };
const obj = Object.create(proto);
obj.name = "Charlie";

// Class syntax (covered in OOP section)
```

### Accessing Properties

```javascript
const obj = { name: "Alice", age: 25, "fav-color": "blue" };

// Dot notation — preferred when key is valid identifier
obj.name;     // "Alice"
obj.age;      // 25

// Bracket notation — required for dynamic keys or special chars
obj["name"];          // "Alice"
obj["fav-color"];     // "blue"
const key = "age";
obj[key];             // 25 — dynamic access

// Optional chaining
obj?.address?.city;   // undefined (no error)
```

### Modifying Objects

```javascript
const obj = { name: "Alice" };

// Add property
obj.age = 25;
obj["email"] = "alice@example.com";

// Modify property
obj.name = "Alicia";

// Delete property
delete obj.email;

// Check if property exists
"name" in obj;               // true
obj.hasOwnProperty("name");  // true
Object.hasOwn(obj, "name");  // true (modern, ES2022)
```

### Object Methods

```javascript
const person = { name: "Alice", age: 25, city: "NYC" };

// Get all keys
Object.keys(person);    // ["name", "age", "city"]

// Get all values
Object.values(person);  // ["Alice", 25, "NYC"]

// Get key-value pairs
Object.entries(person); // [["name","Alice"],["age",25],["city","NYC"]]

// Merge objects (shallow copy)
const target = { a: 1 };
const source = { b: 2, c: 3 };
Object.assign(target, source); // { a:1, b:2, c:3 } — modifies target
const merged = Object.assign({}, target, source); // new object

// Spread (modern, preferred)
const merged2 = { ...target, ...source };
const overrideProps = { ...person, age: 30 }; // override specific props

// Freeze — prevent any modifications
const frozen = Object.freeze({ x: 1, y: 2 });
frozen.x = 99; // silently fails (throws in strict mode)

// Seal — allow modification of existing props but no add/delete
const sealed = Object.seal({ x: 1 });
sealed.x = 99; // OK
sealed.y = 2;  // silently fails

// Check if frozen/sealed
Object.isFrozen(frozen); // true
Object.isSealed(sealed); // true

// Create from entries
Object.fromEntries([["a", 1], ["b", 2]]); // {a:1, b:2}
Object.fromEntries(Object.entries(person).filter(([_, v]) => v !== 25));

// Property descriptors
Object.defineProperty(obj, "secret", {
  value: 42,
  writable: false,      // can't reassign
  enumerable: false,    // won't show in for...in or Object.keys
  configurable: false,  // can't delete or redefine
});
```

### Computed Property Names

```javascript
const key = "name";
const prefix = "get";

const obj = {
  [key]: "Alice",          // dynamic key
  [`${prefix}Name`]() {   // dynamic method name
    return this[key];
  }
};
obj.name;      // "Alice"
obj.getName(); // "Alice"
```

### Property Shorthand

```javascript
const name = "Alice";
const age = 25;

// Old way
const person1 = { name: name, age: age };

// Shorthand (ES6)
const person2 = { name, age };
```

### Getters & Setters

```javascript
const person = {
  firstName: "Alice",
  lastName: "Smith",
  
  get fullName() {
    return `${this.firstName} ${this.lastName}`;
  },
  
  set fullName(name) {
    [this.firstName, this.lastName] = name.split(" ");
  }
};

console.log(person.fullName);      // "Alice Smith"
person.fullName = "Bob Johnson";
console.log(person.firstName);     // "Bob"
```

---

## 8. String Methods

```javascript
const str = "  Hello, World!  ";

// Case
str.toUpperCase();         // "  HELLO, WORLD!  "
str.toLowerCase();         // "  hello, world!  "

// Trim whitespace
str.trim();                // "Hello, World!"
str.trimStart();           // "Hello, World!  "
str.trimEnd();             // "  Hello, World!"

// Search
str.includes("World");     // true
str.startsWith("  Hello"); // true
str.endsWith("!  ");       // true
str.indexOf("o");          // 5 (first occurrence)
str.lastIndexOf("o");      // 9 (last occurrence)

// Extract
str.slice(2, 7);           // "Hello"
str.slice(-3);             // "  " (last 3)
str.substring(2, 7);       // "Hello" (no negative support)
str.at(-2);                // " " (ES2022)

// Replace
str.replace("World", "JS");    // replaces first
str.replaceAll("l", "L");      // replaces all
str.replace(/World/g, "JS");   // with regex global flag

// Split & Join
"a,b,c".split(",");            // ["a","b","c"]
"hello".split("");             // ["h","e","l","l","o"]
"hello".split("", 3);          // ["h","e","l"] — limit

// Repeat & Pad
"ab".repeat(3);                // "ababab"
"5".padStart(4, "0");          // "0005"
"5".padEnd(4, "0");            // "5000"

// Character access
"hello"[0];                    // "h"
"hello".charAt(0);             // "h"
"hello".charCodeAt(0);         // 104 (ASCII)
String.fromCharCode(104);      // "h"

// Template strings (backticks)
const name = "Alice";
const age = 25;
`Name: ${name}, Age: ${age}`       // "Name: Alice, Age: 25"
`2 + 2 = ${2 + 2}`                 // "2 + 2 = 4"
`${age > 18 ? "Adult" : "Minor"}`  // ternary in template

// Tagged templates (advanced)
function highlight(strings, ...values) {
  return strings.reduce((result, str, i) => 
    `${result}${str}${values[i] ? `<strong>${values[i]}</strong>` : ""}`, "");
}
highlight`Hello ${name}, you are ${age} years old`; // wraps values in <strong>
```

---

## 9. Array Methods (Deep Dive)

These are arguably the most important methods to master in JavaScript.

### map — Transform Every Element

```javascript
// Returns a NEW array (same length)
const numbers = [1, 2, 3, 4, 5];

const doubled = numbers.map(n => n * 2);  // [2, 4, 6, 8, 10]
const strings = numbers.map(n => `#${n}`); // ["#1","#2","#3","#4","#5"]

const users = [
  { name: "Alice", age: 25 },
  { name: "Bob", age: 30 }
];
const names = users.map(user => user.name); // ["Alice", "Bob"]

// map with index
const indexed = numbers.map((n, i) => `${i}:${n}`);
// ["0:1", "1:2", "2:3", "3:4", "4:5"]
```

### filter — Select Matching Elements

```javascript
// Returns a NEW array with elements that pass the test
const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const evens = numbers.filter(n => n % 2 === 0);  // [2, 4, 6, 8, 10]
const odds = numbers.filter(n => n % 2 !== 0);   // [1, 3, 5, 7, 9]
const big = numbers.filter(n => n > 5);          // [6, 7, 8, 9, 10]

const users = [
  { name: "Alice", active: true },
  { name: "Bob", active: false },
  { name: "Charlie", active: true }
];
const activeUsers = users.filter(u => u.active); // Alice, Charlie
```

### reduce — Reduce to Single Value

```javascript
// reduce(callback, initialValue)
// callback(accumulator, currentValue, index, array)
const numbers = [1, 2, 3, 4, 5];

// Sum
const sum = numbers.reduce((acc, n) => acc + n, 0); // 15

// Product
const product = numbers.reduce((acc, n) => acc * n, 1); // 120

// Max value
const max = numbers.reduce((acc, n) => (n > acc ? n : acc), -Infinity);

// Count occurrences
const fruits = ["apple", "banana", "apple", "cherry", "banana", "apple"];
const counts = fruits.reduce((acc, fruit) => {
  acc[fruit] = (acc[fruit] || 0) + 1;
  return acc;
}, {}); // { apple: 3, banana: 2, cherry: 1 }

// Group by
const people = [
  { name: "Alice", dept: "Engineering" },
  { name: "Bob", dept: "Marketing" },
  { name: "Charlie", dept: "Engineering" }
];
const byDept = people.reduce((acc, person) => {
  if (!acc[person.dept]) acc[person.dept] = [];
  acc[person.dept].push(person);
  return acc;
}, {});

// Flatten array
[[1,2],[3,4],[5,6]].reduce((acc, arr) => [...acc, ...arr], []);
```

### find & findIndex

```javascript
const products = [
  { id: 1, name: "Laptop", price: 999 },
  { id: 2, name: "Phone", price: 599 },
  { id: 3, name: "Tablet", price: 449 }
];

// find — returns first matching element
products.find(p => p.id === 2);     // { id:2, name:"Phone", price:599 }
products.find(p => p.price < 500);  // { id:3, name:"Tablet", price:449 }

// findIndex — returns index of first match
products.findIndex(p => p.id === 2); // 1
products.findIndex(p => p.price < 500); // 2
```

### some & every

```javascript
const ages = [15, 18, 22, 14, 30];

// some — true if AT LEAST ONE passes
ages.some(age => age >= 18);  // true
ages.some(age => age > 50);   // false

// every — true if ALL pass
ages.every(age => age >= 18); // false
ages.every(age => age > 10);  // true
```

### Chaining Array Methods

```javascript
const students = [
  { name: "Alice", grade: 88, passed: true },
  { name: "Bob", grade: 45, passed: false },
  { name: "Charlie", grade: 92, passed: true },
  { name: "Diana", grade: 67, passed: true },
  { name: "Eve", grade: 38, passed: false }
];

// Get names of passed students sorted by grade (descending)
const topStudents = students
  .filter(s => s.passed)
  .sort((a, b) => b.grade - a.grade)
  .map(s => `${s.name}: ${s.grade}`);
// ["Charlie: 92", "Alice: 88", "Diana: 67"]

// Total grade of top 2 passed students
const total = students
  .filter(s => s.passed)
  .sort((a, b) => b.grade - a.grade)
  .slice(0, 2)
  .reduce((sum, s) => sum + s.grade, 0); // 180
```

---

## 10. Destructuring & Spread/Rest

### Array Destructuring

```javascript
const [a, b, c] = [1, 2, 3];
console.log(a, b, c); // 1 2 3

// Skip elements
const [first, , third] = [1, 2, 3];
console.log(first, third); // 1 3

// Default values
const [x = 10, y = 20] = [5];
console.log(x, y); // 5 20

// Rest in destructuring
const [head, ...tail] = [1, 2, 3, 4, 5];
console.log(head);  // 1
console.log(tail);  // [2, 3, 4, 5]

// Swap variables
let p = 1, q = 2;
[p, q] = [q, p];
console.log(p, q); // 2 1

// Nested array destructuring
const [[a1, a2], [b1, b2]] = [[1, 2], [3, 4]];

// From function return
function getCoords() { return [10, 20]; }
const [lat, lng] = getCoords();
```

### Object Destructuring

```javascript
const person = { name: "Alice", age: 25, city: "NYC" };

// Basic
const { name, age } = person;
console.log(name, age); // "Alice" 25

// Rename variables
const { name: personName, age: personAge } = person;

// Default values
const { name, job = "Developer" } = person;

// Rest in object destructuring
const { name, ...rest } = person;
console.log(rest); // { age: 25, city: "NYC" }

// Nested destructuring
const user = {
  name: "Bob",
  address: {
    city: "LA",
    zip: "90001"
  }
};
const { name, address: { city, zip } } = user;

// Function parameter destructuring
function greet({ name, age = 0 }) {
  return `${name} is ${age} years old`;
}
greet({ name: "Alice", age: 25 });

// Combined with default params
function config({ host = "localhost", port = 3000 } = {}) {
  return `${host}:${port}`;
}
config(); // "localhost:3000"
config({ port: 8080 }); // "localhost:8080"
```

### Spread Operator (...)

```javascript
// Spread array elements
const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];
const combined = [...arr1, ...arr2]; // [1,2,3,4,5,6]
const withExtra = [0, ...arr1, 4];   // [0,1,2,3,4]

// Copy array (shallow)
const copy = [...arr1]; // new array

// Spread into function args
Math.max(...arr1);  // 3
Math.min(...arr2);  // 4
console.log(...arr1); // 1 2 3

// Spread object
const obj1 = { a: 1, b: 2 };
const obj2 = { c: 3, d: 4 };
const merged = { ...obj1, ...obj2 }; // { a:1, b:2, c:3, d:4 }
const overridden = { ...obj1, b: 99 }; // { a:1, b:99 } — override

// Copy object
const objCopy = { ...obj1 };

// Convert string to array
const chars = [..."hello"]; // ["h","e","l","l","o"]

// Convert Set to array
const uniqueArr = [...new Set([1,2,2,3,3,3])]; // [1,2,3]
```

### Rest Parameters vs Spread

```javascript
// REST — collects multiple args into an array (in function params)
function sum(...nums) { return nums.reduce((a, b) => a + b, 0); }
sum(1, 2, 3, 4, 5); // 15

// SPREAD — expands an array into individual elements (in function calls)
const nums = [1, 2, 3, 4, 5];
sum(...nums); // same as sum(1, 2, 3, 4, 5)

// Same syntax ..., different context!
```

---

## 11. DOM Manipulation

### Selecting Elements

```javascript
// By ID (returns single element or null)
const el = document.getElementById("myId");

// By CSS selector (returns first match)
const el = document.querySelector(".myClass");
const el = document.querySelector("#myId");
const el = document.querySelector("div > p.active");

// By CSS selector (returns NodeList — all matches)
const els = document.querySelectorAll(".item");
const els = document.querySelectorAll("li");

// Legacy methods
document.getElementsByClassName("myClass"); // HTMLCollection
document.getElementsByTagName("div");       // HTMLCollection
document.getElementsByName("email");        // NodeList

// Convert NodeList/HTMLCollection to array
Array.from(els).forEach(el => ...);
[...els].forEach(el => ...);
```

### Navigating the DOM

```javascript
const el = document.querySelector("#parent");

// Children
el.children;          // HTMLCollection of child elements
el.childNodes;        // NodeList including text nodes
el.firstElementChild; // first child element
el.lastElementChild;  // last child element
el.childElementCount; // number of child elements

// Parent
el.parentElement;    // parent element
el.parentNode;       // parent node (could be document)
el.closest(".wrapper"); // first ancestor matching selector

// Siblings
el.nextElementSibling;     // next sibling element
el.previousElementSibling; // previous sibling element
```

### Creating & Inserting Elements

```javascript
// Create elements
const div = document.createElement("div");
const text = document.createTextNode("Hello");
const frag = document.createDocumentFragment(); // for batch inserts

// Set content
div.textContent = "Hello World"; // safe — escapes HTML
div.innerHTML = "<strong>Bold</strong>"; // parses HTML (XSS risk!)

// Attributes
div.setAttribute("class", "box");
div.getAttribute("class");        // "box"
div.removeAttribute("class");
div.hasAttribute("class");        // false

// Classes
div.className = "box active";     // replaces all classes
div.classList.add("active");
div.classList.remove("active");
div.classList.toggle("active");
div.classList.contains("active"); // true/false
div.classList.replace("old", "new");

// Styles (inline)
div.style.color = "red";
div.style.backgroundColor = "blue"; // camelCase
div.style.cssText = "color:red; background:blue;"; // multiple
window.getComputedStyle(div).color; // computed/final style

// Dataset (data-* attributes)
div.dataset.userId = "123";     // sets data-user-id="123"
div.dataset.userId;             // "123"
delete div.dataset.userId;

// Insert into DOM
const parent = document.getElementById("container");
parent.appendChild(div);            // add as last child
parent.prepend(div);                // add as first child
parent.insertBefore(div, refChild); // insert before ref
parent.append("text", div);        // append multiple, accepts strings

// insertAdjacentElement(position, element)
el.insertAdjacentElement("beforebegin", newEl); // before el
el.insertAdjacentElement("afterbegin", newEl);  // first child
el.insertAdjacentElement("beforeend", newEl);   // last child
el.insertAdjacentElement("afterend", newEl);    // after el

// insertAdjacentHTML (more performant for HTML strings)
el.insertAdjacentHTML("beforeend", "<p>Hello</p>");
```

### Removing Elements

```javascript
// Modern
el.remove(); // removes itself

// Old way
el.parentNode.removeChild(el);

// Remove children
while (parent.firstChild) {
  parent.removeChild(parent.firstChild);
}
parent.innerHTML = ""; // quick but loses event listeners
```

### Element Dimensions & Position

```javascript
el.getBoundingClientRect(); // { top, left, right, bottom, width, height }
el.offsetWidth;   // width including padding + border
el.offsetHeight;  // height including padding + border
el.clientWidth;   // width including padding (no border)
el.clientHeight;  // height including padding
el.scrollTop;     // scroll position
el.scrollHeight;  // total scrollable height

window.scrollX;   // horizontal scroll position
window.scrollY;   // vertical scroll position
window.scrollTo(0, 0);     // scroll to top
el.scrollIntoView({ behavior: "smooth" });
```

---

## 12. Events

### Adding Event Listeners

```javascript
const btn = document.querySelector("button");

// Best way — addEventListener
btn.addEventListener("click", function(event) {
  console.log("Clicked!", event);
});

// Arrow function
btn.addEventListener("click", (e) => {
  console.log(e.target); // element that triggered event
});

// Remove event listener (need same function reference)
const handler = (e) => console.log(e);
btn.addEventListener("click", handler);
btn.removeEventListener("click", handler);

// Options
btn.addEventListener("click", handler, {
  once: true,    // auto-remove after first call
  capture: true, // capture phase instead of bubble
  passive: true, // never calls preventDefault (improves scroll performance)
});
```

### Event Object

```javascript
btn.addEventListener("click", (event) => {
  event.target;           // element that triggered event
  event.currentTarget;    // element with the listener
  event.type;             // "click"
  event.preventDefault(); // stop default action (e.g., form submit)
  event.stopPropagation(); // stop event from bubbling up
  event.stopImmediatePropagation(); // stop all handlers
  
  // Mouse events
  event.clientX, event.clientY;  // position relative to viewport
  event.pageX, event.pageY;      // position relative to page
  event.offsetX, event.offsetY;  // position relative to element
  event.button;   // 0=left, 1=middle, 2=right
  event.ctrlKey;  // true if Ctrl held
  event.shiftKey; // true if Shift held
  event.altKey;   // true if Alt held
  event.metaKey;  // true if Meta/Cmd held
  
  // Keyboard events
  event.key;      // "Enter", "ArrowUp", "a", etc.
  event.code;     // "KeyA", "Space", "Enter", etc.
  event.keyCode;  // deprecated, avoid
});
```

### Common Events

```javascript
// Mouse
element.addEventListener("click", handler);
element.addEventListener("dblclick", handler);
element.addEventListener("mousedown", handler);
element.addEventListener("mouseup", handler);
element.addEventListener("mousemove", handler);
element.addEventListener("mouseenter", handler); // no bubbling
element.addEventListener("mouseleave", handler); // no bubbling
element.addEventListener("mouseover", handler);  // bubbles
element.addEventListener("mouseout", handler);   // bubbles
element.addEventListener("contextmenu", handler);

// Keyboard
document.addEventListener("keydown", handler);   // fires repeatedly
document.addEventListener("keyup", handler);
document.addEventListener("keypress", handler);  // deprecated

// Form
form.addEventListener("submit", (e) => {
  e.preventDefault(); // prevent page reload
  const data = new FormData(form);
  data.get("username");
});
input.addEventListener("change", handler);    // after value changes & blur
input.addEventListener("input", handler);     // immediately on every keystroke
input.addEventListener("focus", handler);
input.addEventListener("blur", handler);

// Window/Document
window.addEventListener("load", handler);            // after all resources load
document.addEventListener("DOMContentLoaded", handler); // after HTML parsed
window.addEventListener("resize", handler);
window.addEventListener("scroll", handler);
window.addEventListener("beforeunload", (e) => {
  e.preventDefault();
  e.returnValue = ""; // shows browser leave confirmation
});
```

### Event Bubbling & Delegation

```javascript
// Bubbling — events bubble from child to parent
// Capturing — events go from parent to child (capture phase)

document.querySelector("div").addEventListener("click", (e) => {
  console.log("div"); // fires even when inner button clicked
});
document.querySelector("button").addEventListener("click", (e) => {
  console.log("button"); // fires first
  e.stopPropagation(); // prevents div from also getting the event
});

// Event Delegation — attach ONE listener to parent instead of many children
// Efficient for dynamic lists!
const list = document.querySelector("ul");
list.addEventListener("click", (e) => {
  if (e.target.tagName === "LI") {
    console.log("Clicked item:", e.target.textContent);
  }
  // Using matches
  if (e.target.matches(".delete-btn")) {
    e.target.closest("li").remove();
  }
});
// Now works for dynamically added li elements too!
```

### Custom Events

```javascript
// Create custom event
const event = new CustomEvent("myEvent", {
  detail: { message: "Hello from custom event!" },
  bubbles: true,
  cancelable: true
});

// Dispatch
element.dispatchEvent(event);

// Listen
element.addEventListener("myEvent", (e) => {
  console.log(e.detail.message);
});
```

---

## 13. Error Handling

### try / catch / finally

```javascript
try {
  // Code that might throw
  const result = JSON.parse("invalid json");
  undefinedFunction(); // ReferenceError
} catch (error) {
  console.error("Error name:", error.name);
  console.error("Error message:", error.message);
  console.error("Error stack:", error.stack);
} finally {
  // Always runs — even if no error or after return
  console.log("Cleanup here");
}

// Re-throwing
try {
  JSON.parse(userInput);
} catch (e) {
  if (e instanceof SyntaxError) {
    console.error("Invalid JSON");
  } else {
    throw e; // re-throw unknown errors
  }
}
```

### Error Types

```javascript
new Error("Generic error");
new SyntaxError("Invalid syntax");
new ReferenceError("Variable not defined");
new TypeError("Wrong type");
new RangeError("Number out of range");
new URIError("Invalid URI");
new EvalError("Error in eval()");
```

### Custom Errors

```javascript
class ValidationError extends Error {
  constructor(message, field) {
    super(message);
    this.name = "ValidationError";
    this.field = field;
  }
}

class NetworkError extends Error {
  constructor(message, statusCode) {
    super(message);
    this.name = "NetworkError";
    this.statusCode = statusCode;
  }
}

function validateAge(age) {
  if (typeof age !== "number") throw new ValidationError("Must be a number", "age");
  if (age < 0 || age > 150) throw new ValidationError("Invalid age range", "age");
  return true;
}

try {
  validateAge("twenty");
} catch (e) {
  if (e instanceof ValidationError) {
    console.error(`Validation failed on field "${e.field}": ${e.message}`);
  }
}
```

---

## 14. Asynchronous JavaScript

### The Event Loop (Concept)

```
Call Stack     → Where synchronous code runs
Web APIs       → Timer, Fetch, DOM events (browser environment)
Callback Queue → Macrotasks: setTimeout, setInterval, I/O
Microtask Queue → Promise callbacks (.then, .catch), queueMicrotask
                  Microtasks run BEFORE the next macrotask!
```

```javascript
console.log("1");              // sync — runs immediately

setTimeout(() => {
  console.log("4");            // macrotask — runs after sync + microtasks
}, 0);

Promise.resolve().then(() => {
  console.log("3");            // microtask — runs after sync, before setTimeout
});

console.log("2");              // sync

// Output: 1, 2, 3, 4
```

### Callbacks

```javascript
// Old pattern — "callback hell"
function getData(callback) {
  setTimeout(() => {
    callback(null, { user: "Alice" }); // (error, data) convention
  }, 1000);
}

getData((err, data) => {
  if (err) return console.error(err);
  console.log(data);
  getMoreData(data.user, (err, moreData) => {
    if (err) return console.error(err);
    // deeply nested = "callback hell"
  });
});
```

### setTimeout & setInterval

```javascript
// setTimeout — run once after delay (ms)
const timeoutId = setTimeout(() => {
  console.log("Runs after 2 seconds");
}, 2000);
clearTimeout(timeoutId); // cancel

// setInterval — run repeatedly
const intervalId = setInterval(() => {
  console.log("Runs every second");
}, 1000);
clearInterval(intervalId); // cancel

// Useful patterns
setTimeout(() => {}, 0);        // defer to next cycle
requestAnimationFrame(callback); // before next repaint (~60fps)
```

---

## 15. Promises & Async/Await

### Promises

```javascript
// Creating a Promise
const myPromise = new Promise((resolve, reject) => {
  const success = true;
  if (success) {
    resolve("Data loaded!");     // fulfilled
  } else {
    reject(new Error("Failed")); // rejected
  }
});

// Consuming a Promise
myPromise
  .then(data => {
    console.log(data);           // "Data loaded!"
    return data.toUpperCase();   // return value passed to next .then
  })
  .then(upperData => {
    console.log(upperData);      // "DATA LOADED!"
  })
  .catch(error => {
    console.error(error.message); // handles any error in chain
  })
  .finally(() => {
    console.log("Done!");        // always runs
  });

// Promise wrapping a timeout
function delay(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}
await delay(1000); // wait 1 second

// Promisify callback-based functions
function readFile(path) {
  return new Promise((resolve, reject) => {
    fs.readFile(path, "utf8", (err, data) => {
      if (err) reject(err);
      else resolve(data);
    });
  });
}
```

### Promise Combinators

```javascript
const p1 = fetch("/api/users");
const p2 = fetch("/api/posts");
const p3 = fetch("/api/comments");

// Promise.all — waits for ALL, rejects if ANY fails
const [users, posts, comments] = await Promise.all([p1, p2, p3]);

// Promise.allSettled — waits for ALL, never rejects
const results = await Promise.allSettled([p1, p2, p3]);
results.forEach(result => {
  if (result.status === "fulfilled") console.log(result.value);
  else console.error(result.reason);
});

// Promise.race — returns first to settle (resolve or reject)
const firstResponse = await Promise.race([p1, p2, p3]);

// Promise.any — returns first to RESOLVE (ignores rejections)
const firstSuccess = await Promise.any([p1, p2, p3]);
// throws AggregateError only if ALL reject

// Promise.resolve / Promise.reject — instantly resolved/rejected
await Promise.resolve(42);        // 42
await Promise.reject(new Error("fail")); // throws
```

### Async/Await

```javascript
// async function always returns a Promise
async function fetchUser(id) {
  try {
    const response = await fetch(`/api/users/${id}`);
    
    if (!response.ok) {
      throw new Error(`HTTP ${response.status}`);
    }
    
    const user = await response.json();
    return user; // this gets wrapped in a Promise
  } catch (error) {
    console.error("Error fetching user:", error);
    throw error; // re-throw so caller knows it failed
  }
}

// Use it
const user = await fetchUser(1);

// Sequential vs Parallel
// Sequential (slower — waits one by one)
const user1 = await fetchUser(1);
const user2 = await fetchUser(2);

// Parallel (faster — runs simultaneously)
const [user1, user2] = await Promise.all([fetchUser(1), fetchUser(2)]);

// Async IIFE
(async () => {
  const data = await fetch("/api/data").then(r => r.json());
  console.log(data);
})();

// For await (async iteration)
async function processItems(items) {
  for await (const item of asyncGenerator()) {
    console.log(item);
  }
}
```

### Fetch API

```javascript
// GET request
const response = await fetch("https://api.example.com/users");
const users = await response.json();

// POST request
const response = await fetch("https://api.example.com/users", {
  method: "POST",
  headers: {
    "Content-Type": "application/json",
    "Authorization": "Bearer token123"
  },
  body: JSON.stringify({ name: "Alice", email: "alice@example.com" })
});

// Error handling (fetch doesn't reject on HTTP errors!)
if (!response.ok) {
  throw new Error(`HTTP Error: ${response.status} ${response.statusText}`);
}

// Response methods
response.json();    // parse as JSON → returns Promise
response.text();    // parse as text → returns Promise
response.blob();    // parse as Blob → returns Promise
response.arrayBuffer(); // raw binary
response.headers.get("Content-Type");
response.status;    // 200, 404, etc.
response.ok;        // true if status 200-299

// Abort fetch
const controller = new AbortController();
const signal = controller.signal;
setTimeout(() => controller.abort(), 5000); // timeout after 5s
const response = await fetch(url, { signal });
```

---

## 16. ES6+ Modern Features

### let & const, Arrow Functions (covered above)

### Template Literals (covered above)

### Classes (covered in OOP section)

### Map & Set

```javascript
// Map — key-value pairs with any key type
const map = new Map();
map.set("name", "Alice");
map.set(42, "the answer");
map.set({ key: 1 }, "object key");

map.get("name");    // "Alice"
map.has("name");    // true
map.delete("name");
map.size;           // number of entries
map.clear();

// Iterate
for (const [key, value] of map) { ... }
map.forEach((value, key) => { ... });
[...map.keys()];
[...map.values()];
[...map.entries()];

// Convert object to Map
const obj = { a: 1, b: 2 };
const mapFromObj = new Map(Object.entries(obj));

// Set — collection of unique values
const set = new Set([1, 2, 3, 2, 1]); // {1, 2, 3}
set.add(4);
set.has(3);    // true
set.delete(1);
set.size;      // 3

// Remove duplicates from array
const unique = [...new Set([1, 2, 2, 3, 3, 3])]; // [1, 2, 3]

// WeakMap & WeakSet — hold weak references (garbage collectible)
const weakMap = new WeakMap(); // keys must be objects
const weakSet = new WeakSet(); // values must be objects
```

### Generators

```javascript
// Generator functions use function* and yield
function* counter(start = 0) {
  while (true) {
    yield start++;
  }
}

const gen = counter(1);
gen.next(); // { value: 1, done: false }
gen.next(); // { value: 2, done: false }
gen.next(); // { value: 3, done: false }

// Finite generator
function* range(start, end, step = 1) {
  for (let i = start; i < end; i += step) {
    yield i;
  }
}
[...range(0, 10, 2)]; // [0, 2, 4, 6, 8]

// Async generator
async function* asyncRange(start, end) {
  for (let i = start; i <= end; i++) {
    await delay(100);
    yield i;
  }
}

for await (const n of asyncRange(1, 5)) {
  console.log(n);
}
```

### Proxy & Reflect

```javascript
// Proxy — intercept object operations
const handler = {
  get(target, prop, receiver) {
    console.log(`Getting ${prop}`);
    return Reflect.get(target, prop, receiver);
  },
  set(target, prop, value, receiver) {
    if (typeof value !== "number") throw new TypeError("Must be number");
    return Reflect.set(target, prop, value, receiver);
  },
  has(target, prop) {
    return prop in target;
  },
  deleteProperty(target, prop) {
    console.log(`Deleting ${prop}`);
    return Reflect.deleteProperty(target, prop);
  }
};

const obj = new Proxy({}, handler);
obj.age = 25;      // triggers set
console.log(obj.age); // triggers get
"age" in obj;      // triggers has
delete obj.age;    // triggers deleteProperty

// Use case: validation, logging, reactive data
```

### Symbols (Advanced)

```javascript
// Well-known symbols
const obj = {
  [Symbol.iterator]() {
    let n = 0;
    return {
      next() {
        return n < 3 ? { value: n++, done: false } : { done: true };
      }
    };
  }
};
[...obj]; // [0, 1, 2]

const customClass = {
  [Symbol.toPrimitive](hint) {
    if (hint === "number") return 42;
    if (hint === "string") return "forty-two";
    return true;
  }
};
+customClass;  // 42
`${customClass}`; // "forty-two"
```

### Nullish Coalescing & Optional Chaining (covered in Operators)

### Logical Assignment Operators (covered in Operators)

### Array & Object Methods (ES2019+)

```javascript
// Object.fromEntries (ES2019)
Object.fromEntries([["a", 1], ["b", 2]]); // {a:1, b:2}
Object.fromEntries(new Map([["a", 1]]));  // {a:1}

// Array.flat & flatMap (ES2019)
[1, [2, [3]]].flat(Infinity); // [1, 2, 3]
[1, 2, 3].flatMap(x => [x, x * 2]); // [1,2,2,4,3,6]

// String trimStart/trimEnd (ES2019)
"  hello  ".trimStart(); // "hello  "
"  hello  ".trimEnd();   // "  hello"

// Promise.allSettled (ES2020) — covered in Promises
// BigInt (ES2020) — covered in Data Types
// Nullish coalescing ?? (ES2020) — covered in Operators
// Optional chaining ?. (ES2020) — covered in Operators

// Logical assignment &&=, ||=, ??= (ES2021)
// String.replaceAll (ES2021)
"aababab".replaceAll("ab", "X"); // "aXXX"

// at() for arrays and strings (ES2022)
[1, 2, 3].at(-1);   // 3
"hello".at(-1);      // "o"

// Object.hasOwn (ES2022)
Object.hasOwn({ a: 1 }, "a"); // true

// Array findLast, findLastIndex (ES2023)
[1, 2, 3, 4].findLast(x => x % 2 === 0); // 4
```

---

## 17. Object-Oriented Programming (OOP)

### Classes

```javascript
class Animal {
  // Private fields (ES2022)
  #name;
  #sound;
  
  // Static property
  static count = 0;
  
  constructor(name, sound) {
    this.#name = name;
    this.#sound = sound;
    Animal.count++;
  }
  
  // Instance method
  speak() {
    return `${this.#name} says ${this.#sound}!`;
  }
  
  // Getter
  get name() {
    return this.#name;
  }
  
  // Setter
  set name(newName) {
    if (typeof newName !== "string") throw new TypeError("Name must be string");
    this.#name = newName;
  }
  
  // Static method
  static create(name, sound) {
    return new Animal(name, sound);
  }
  
  // toString
  toString() {
    return `Animal(${this.#name})`;
  }
}

const dog = new Animal("Rex", "Woof");
console.log(dog.speak());    // "Rex says Woof!"
console.log(dog.name);       // "Rex"
dog.name = "Max";
console.log(Animal.count);   // 1
```

### Inheritance

```javascript
class Dog extends Animal {
  #breed;
  
  constructor(name, breed) {
    super(name, "Woof"); // MUST call super() first
    this.#breed = breed;
  }
  
  // Override parent method
  speak() {
    return `${super.speak()} (${this.#breed})`;
  }
  
  fetch(item) {
    return `${this.name} fetches the ${item}!`;
  }
  
  get breed() {
    return this.#breed;
  }
}

const myDog = new Dog("Rex", "Labrador");
myDog.speak(); // "Rex says Woof! (Labrador)"
myDog.fetch("ball"); // "Rex fetches the ball!"

// instanceof
myDog instanceof Dog;    // true
myDog instanceof Animal; // true
```

### Mixins (Multiple Inheritance Pattern)

```javascript
const Serializable = (Base) => class extends Base {
  serialize() {
    return JSON.stringify(this);
  }
  
  static deserialize(json) {
    return Object.assign(new this(), JSON.parse(json));
  }
};

const Validatable = (Base) => class extends Base {
  validate() {
    return Object.keys(this).every(key => this[key] !== null);
  }
};

class User extends Serializable(Validatable(Animal)) {
  constructor(name, email) {
    super(name, "...");
    this.email = email;
  }
}

const user = new User("Alice", "alice@example.com");
user.serialize();  // JSON string
user.validate();   // true
```

### SOLID Principles (Brief)

```javascript
// S — Single Responsibility: one class, one job
class UserRepository { /* only handles data */ }
class EmailService { /* only handles emails */ }

// O — Open/Closed: open for extension, closed for modification
// Use inheritance or strategy pattern

// L — Liskov Substitution: subclasses must be substitutable
// D — Dependency Inversion: depend on abstractions, not concretions
class OrderService {
  constructor(paymentProcessor) { // inject dependency
    this.paymentProcessor = paymentProcessor;
  }
}
```

---

## 18. Prototypes & Inheritance

### Prototype Chain

```javascript
// Every object has __proto__ (points to its prototype)
const arr = [1, 2, 3];
arr.__proto__ === Array.prototype; // true
Array.prototype.__proto__ === Object.prototype; // true
Object.prototype.__proto__ === null; // end of chain

// Property lookup — goes up the chain
arr.push;   // found on Array.prototype
arr.toString; // found on Object.prototype
arr.nonexistent; // undefined — not found anywhere

// Object.getPrototypeOf (preferred over __proto__)
Object.getPrototypeOf(arr) === Array.prototype; // true

// Check if property is own (not inherited)
arr.hasOwnProperty("0"); // true — own
arr.hasOwnProperty("push"); // false — inherited
```

### Constructor Functions (Pre-ES6)

```javascript
function Person(name, age) {
  this.name = name;
  this.age = age;
}

// Methods on prototype (shared, not per-instance)
Person.prototype.greet = function() {
  return `Hi, I'm ${this.name}`;
};

Person.prototype.toString = function() {
  return `Person(${this.name}, ${this.age})`;
};

const alice = new Person("Alice", 25);
alice.greet(); // "Hi, I'm Alice"

// What `new` does:
// 1. Creates empty object: {}
// 2. Sets prototype: obj.__proto__ = Person.prototype
// 3. Calls constructor with `this` = new obj
// 4. Returns obj (unless constructor returns another object)
```

### Object.create

```javascript
const animalProto = {
  speak() {
    return `${this.name} makes a sound`;
  }
};

const dog = Object.create(animalProto);
dog.name = "Rex";
dog.speak(); // "Rex makes a sound"

// Null prototype (no inheritance)
const pureObj = Object.create(null);
// has no toString, hasOwnProperty, etc.
```

---

## 19. Closures & Scope

### Scope Types

```javascript
// Global scope
let globalVar = "I'm global";

function outer() {
  // Function scope
  let outerVar = "I'm in outer";
  
  function inner() {
    // Function scope (nested)
    let innerVar = "I'm in inner";
    
    // Can access all outer scopes
    console.log(globalVar);  // ✅
    console.log(outerVar);   // ✅
    console.log(innerVar);   // ✅
  }
  
  // Cannot access inner scope
  // console.log(innerVar); // ❌ ReferenceError
}

// Block scope (let & const only)
{
  let blockScoped = "only in this block";
  var notBlockScoped = "leaks out!";
}
// blockScoped — ❌ ReferenceError
// notBlockScoped — ✅ accessible (var is function-scoped, not block-scoped)
```

### Hoisting

```javascript
// var declarations are hoisted (moved to top of scope)
console.log(x); // undefined (not error) — hoisted but not initialized
var x = 5;

// let/const are hoisted but NOT initialized (Temporal Dead Zone)
console.log(y); // ❌ ReferenceError
let y = 5;

// Function declarations are fully hoisted
sayHi(); // ✅ works!
function sayHi() { console.log("Hi"); }

// Function expressions are NOT fully hoisted
sayBye(); // ❌ TypeError: sayBye is not a function
var sayBye = function() { console.log("Bye"); };
```

### Closures

```javascript
// A closure is a function that "remembers" its outer variables
function makeCounter(start = 0) {
  let count = start; // private variable
  
  return {
    increment() { return ++count; },
    decrement() { return --count; },
    getCount() { return count; },
    reset() { count = start; }
  };
}

const counter = makeCounter(10);
counter.increment(); // 11
counter.increment(); // 12
counter.decrement(); // 11
counter.getCount();  // 11
counter.reset();
counter.getCount();  // 10

// The `count` variable is private — can only be accessed via the methods!

// Practical closure: memoization
function memoize(fn) {
  const cache = new Map();
  return function(...args) {
    const key = JSON.stringify(args);
    if (cache.has(key)) {
      console.log("From cache");
      return cache.get(key);
    }
    const result = fn.apply(this, args);
    cache.set(key, result);
    return result;
  };
}

const memoizedFib = memoize(function fib(n) {
  return n <= 1 ? n : memoizedFib(n - 1) + memoizedFib(n - 2);
});
memoizedFib(40); // fast!

// Common closure mistake with var in loops
for (var i = 0; i < 3; i++) {
  setTimeout(() => console.log(i), 100); // prints 3, 3, 3 (shares same i)
}

// Fix 1: use let (block-scoped — each iteration gets own i)
for (let i = 0; i < 3; i++) {
  setTimeout(() => console.log(i), 100); // prints 0, 1, 2
}

// Fix 2: IIFE closure
for (var i = 0; i < 3; i++) {
  ((i) => setTimeout(() => console.log(i), 100))(i);
}
```

### `this` Keyword

```javascript
// 1. Global context — window (browser) or global (Node.js)
console.log(this); // Window in browser

// 2. Function context — depends on how called
function show() { console.log(this); }
show();            // Window / global (strict mode: undefined)

// 3. Method context — the object before the dot
const obj = { name: "Alice", show() { console.log(this.name); } };
obj.show();        // "Alice"

// 4. Constructor — the new object
function Person(name) { this.name = name; }
const p = new Person("Alice");
p.name; // "Alice"

// 5. Explicit binding
show.call({ name: "Bob" });   // "Bob"
show.apply({ name: "Bob" });  // "Bob"
const bound = show.bind({ name: "Bob" }); bound(); // "Bob"

// 6. Arrow functions — inherit `this` from surrounding scope
const obj2 = {
  name: "Charlie",
  regular() { console.log(this.name); },     // "Charlie"
  arrow: () => { console.log(this.name); }   // undefined (outer `this`)
};

// 7. Class — the instance
class Foo {
  constructor() { this.x = 1; }
  show() { console.log(this.x); }
}
```

---

## 20. Higher-Order Functions & Functional Programming

### Pure Functions

```javascript
// Pure: same input → same output, no side effects
function add(a, b) { return a + b; } // pure ✅

// Impure: depends on/modifies external state
let total = 0;
function addToTotal(n) { total += n; } // impure ❌

// Pure alternative
function addToTotal(total, n) { return total + n; } // pure ✅
```

### Function Composition

```javascript
// Compose functions right to left
const compose = (...fns) => x => fns.reduceRight((v, f) => f(v), x);

// Pipe functions left to right
const pipe = (...fns) => x => fns.reduce((v, f) => f(v), x);

const double = x => x * 2;
const addOne = x => x + 1;
const square = x => x * x;

const transform = pipe(double, addOne, square);
transform(3); // ((3*2)+1)^2 = 49

const transform2 = compose(square, addOne, double);
transform2(3); // same result: 49
```

### Currying

```javascript
// Transform f(a,b,c) → f(a)(b)(c)
function curry(fn) {
  return function curried(...args) {
    if (args.length >= fn.length) {
      return fn.apply(this, args);
    }
    return function(...more) {
      return curried.apply(this, args.concat(more));
    };
  };
}

const curriedAdd = curry((a, b, c) => a + b + c);
curriedAdd(1)(2)(3); // 6
curriedAdd(1, 2)(3); // 6
curriedAdd(1)(2, 3); // 6

// Practical: reusable specialized functions
const multiply = curry((factor, number) => factor * number);
const double = multiply(2);
const triple = multiply(3);
[1, 2, 3, 4].map(double); // [2, 4, 6, 8]
[1, 2, 3, 4].map(triple); // [3, 6, 9, 12]
```

### Immutability

```javascript
// Avoid mutating data
const state = { count: 0, items: ["a", "b"] };

// ❌ Mutating
state.count++;
state.items.push("c");

// ✅ Returning new objects
const newState = {
  ...state,
  count: state.count + 1,
  items: [...state.items, "c"]
};

// Immutable array operations
const arr = [1, 2, 3, 4, 5];
// Instead of push
[...arr, 6];
// Instead of splice/unshift
[0, ...arr];
// Instead of splice to remove
arr.filter(x => x !== 3);
// Instead of sort (mutates!)
[...arr].sort((a, b) => b - a);
```

---

## 21. Modules (ES Modules & CommonJS)

### ES Modules (Browser & Modern Node.js)

```javascript
// math.js — named exports
export const PI = 3.14159;
export function add(a, b) { return a + b; }
export function multiply(a, b) { return a * b; }

// Default export (one per file)
export default class Calculator {
  add(a, b) { return a + b; }
}

// Re-export
export { add as sum } from "./math.js";
export * from "./utils.js";

// main.js — imports
import Calculator from "./math.js";                    // default
import { PI, add } from "./math.js";                   // named
import { add as sum, multiply } from "./math.js";      // renamed
import * as MathUtils from "./math.js";                // namespace
import Calculator, { PI, add } from "./math.js";       // mixed

// Dynamic import (lazy loading)
const module = await import("./heavy-module.js");
module.default; // default export
module.namedExport; // named export

// Conditional dynamic import
if (userWantsChart) {
  const { Chart } = await import("./chart.js");
  new Chart();
}
```

### CommonJS (Node.js)

```javascript
// math.js
const PI = 3.14159;
function add(a, b) { return a + b; }

module.exports = { PI, add };
// or export single
module.exports = { default: Calculator, PI, add };

// main.js
const { PI, add } = require("./math");
const math = require("./math");
math.PI; math.add(1, 2);
```

---

## 22. Regular Expressions

### Creating RegEx

```javascript
const re1 = /hello/;          // literal
const re2 = new RegExp("hello"); // constructor
const re3 = /hello/gi;        // flags: global, case-insensitive
```

### Flags

```
g — global: find all matches (not just first)
i — case-insensitive
m — multiline: ^ and $ match line start/end
s — dotAll: . matches newlines too
u — unicode mode
y — sticky: match from lastIndex position
```

### Character Classes & Special Chars

```
.       — any character except newline
\d      — digit [0-9]
\D      — non-digit
\w      — word char [a-zA-Z0-9_]
\W      — non-word char
\s      — whitespace (space, tab, newline)
\S      — non-whitespace
\b      — word boundary
\B      — non-word boundary
^       — start of string (or line with m flag)
$       — end of string (or line with m flag)
[abc]   — character set (a, b, or c)
[^abc]  — negated set
[a-z]   — range
```

### Quantifiers

```
*       — 0 or more
+       — 1 or more
?       — 0 or 1 (optional)
{n}     — exactly n
{n,}    — n or more
{n,m}   — between n and m
*?      — non-greedy (lazy) version of *
+?      — non-greedy version of +
```

### Groups & Lookaheads

```
(abc)   — capturing group
(?:abc) — non-capturing group
(?<name>abc) — named capture group
a(?=b)  — positive lookahead: a followed by b
a(?!b)  — negative lookahead: a NOT followed by b
(?<=b)a — positive lookbehind: a preceded by b
(?<!b)a — negative lookbehind: a NOT preceded by b
a|b     — alternation: a or b
```

### Methods

```javascript
const text = "Hello, my email is alice@example.com and bob@test.org";
const emailRegex = /[\w.-]+@[\w.-]+\.\w+/g;

// test — returns boolean
/hello/i.test("Hello World"); // true

// exec — returns array with match details
/(\d+)/.exec("abc 123 def"); // ["123", "123", index: 4, ...]

// String methods with regex
text.match(emailRegex);         // ["alice@example.com", "bob@test.org"]
text.match(/(\w+)@(\w+)/);     // first match with groups
text.matchAll(emailRegex);      // iterator of all matches with groups
text.search(/\d+/);             // index of first match, or -1
text.replace(/alice/i, "ALICE"); // replace first
text.replace(emailRegex, "[REDACTED]"); // replace all
text.replaceAll(".", "!");       // replaceAll with string
text.split(/,\s*/);              // split on comma+spaces

// Named groups
const dateRe = /(?<year>\d{4})-(?<month>\d{2})-(?<day>\d{2})/;
const { groups: { year, month, day } } = dateRe.exec("2025-01-15");

// Practical patterns
const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
const phonePattern = /^\+?[\d\s\-().]{7,15}$/;
const urlPattern = /^https?:\/\/[\w\-.]+(\/[\w\-./?%&=]*)?$/;
const passwordPattern = /^(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
```

---

## 23. Web APIs

### Local Storage & Session Storage

```javascript
// localStorage — persists across sessions
localStorage.setItem("username", "Alice");
localStorage.getItem("username");   // "Alice"
localStorage.removeItem("username");
localStorage.clear(); // remove all
localStorage.length;  // number of items
localStorage.key(0);  // key at index 0

// Store objects (must serialize)
localStorage.setItem("user", JSON.stringify({ name: "Alice", age: 25 }));
const user = JSON.parse(localStorage.getItem("user"));

// sessionStorage — cleared when tab closes
sessionStorage.setItem("temp", "value");
```

### Geolocation API

```javascript
navigator.geolocation.getCurrentPosition(
  (position) => {
    const { latitude, longitude, accuracy } = position.coords;
    console.log(`${latitude}, ${longitude} (±${accuracy}m)`);
  },
  (error) => {
    console.error(error.code, error.message);
  },
  { enableHighAccuracy: true, timeout: 5000 }
);

// Watch position
const watchId = navigator.geolocation.watchPosition(callback);
navigator.geolocation.clearWatch(watchId);
```

### Clipboard API

```javascript
// Write to clipboard
await navigator.clipboard.writeText("Hello!");
await navigator.clipboard.write([new ClipboardItem({ "text/plain": blob })]);

// Read from clipboard
const text = await navigator.clipboard.readText();
```

### History API

```javascript
history.pushState({ page: 1 }, "Title", "/new-url");
history.replaceState({ page: 1 }, "Title", "/new-url");
history.back();
history.forward();
history.go(-2);

window.addEventListener("popstate", (e) => {
  console.log(e.state); // state object
});
```

### IntersectionObserver (Lazy Loading)

```javascript
const observer = new IntersectionObserver((entries) => {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
      entry.target.classList.add("visible");
      // Lazy load image
      if (entry.target.dataset.src) {
        entry.target.src = entry.target.dataset.src;
      }
      observer.unobserve(entry.target); // stop observing after visible
    }
  });
}, {
  rootMargin: "0px 0px -100px 0px", // trigger 100px before viewport
  threshold: 0.1 // 10% visible
});

document.querySelectorAll(".lazy").forEach(el => observer.observe(el));
```

### MutationObserver

```javascript
const observer = new MutationObserver((mutations) => {
  mutations.forEach(mutation => {
    console.log(mutation.type); // "childList" | "attributes" | "characterData"
    console.log(mutation.addedNodes);
    console.log(mutation.removedNodes);
  });
});

observer.observe(document.body, {
  childList: true,   // watch for added/removed children
  subtree: true,     // watch all descendants
  attributes: true,  // watch attribute changes
  characterData: true // watch text content changes
});

observer.disconnect(); // stop observing
```

### Web Workers

```javascript
// main.js
const worker = new Worker("worker.js");

worker.postMessage({ data: [1, 2, 3, 4, 5] }); // send message

worker.onmessage = (e) => {
  console.log("Result:", e.data);
};

worker.onerror = (e) => {
  console.error(e.message);
};

worker.terminate(); // stop worker

// worker.js (runs in separate thread — no DOM access)
self.onmessage = (e) => {
  const result = e.data.data.reduce((a, b) => a + b, 0);
  self.postMessage(result);
};
```

---

## 24. JavaScript Engine & Runtime

### How JS Engines Work

```
Source Code
    ↓
Parser (AST)
    ↓
Interpreter (Ignition in V8)
    ↓ hot code path
JIT Compiler (TurboFan in V8)
    ↓
Optimized Machine Code
```

### Memory Management

```javascript
// Stack — primitive values, function calls, references
// Heap — objects, arrays, functions

// Garbage Collection — Mark and Sweep algorithm
// Objects are collected when no references point to them

// Memory leaks — common causes:
// 1. Accidental globals
function leak() {
  leakedVar = "I'm global!"; // missing var/let/const
}

// 2. Forgotten timers
const id = setInterval(() => {
  // holds reference to closure variables
}, 1000);
// clearInterval(id); // must clean up!

// 3. Detached DOM nodes
let element = document.querySelector("#btn");
document.body.removeChild(element);
// element still referenced → memory leak
element = null; // clear reference

// 4. Closures holding large data
// 5. Event listeners not removed

// WeakRef and FinalizationRegistry (advanced)
const weakRef = new WeakRef(someObject);
weakRef.deref(); // returns object or undefined if garbage collected
```

### Performance Profiling

```javascript
// Mark & Measure
performance.mark("start");
// ... code ...
performance.mark("end");
performance.measure("My Operation", "start", "end");
const [measure] = performance.getEntriesByName("My Operation");
console.log(measure.duration); // ms

// High-res timestamp
performance.now(); // ms with sub-millisecond precision

// Memory (Chrome only)
performance.memory.usedJSHeapSize;
performance.memory.totalJSHeapSize;
```

---

## 25. Design Patterns

### Singleton

```javascript
class Database {
  static #instance = null;
  #connection = null;
  
  constructor() {
    if (Database.#instance) return Database.#instance;
    this.#connection = "Connected to DB";
    Database.#instance = this;
  }
  
  static getInstance() {
    if (!Database.#instance) new Database();
    return Database.#instance;
  }
}

const db1 = Database.getInstance();
const db2 = Database.getInstance();
db1 === db2; // true — same instance!
```

### Observer (Event System)

```javascript
class EventEmitter {
  #events = {};
  
  on(event, listener) {
    if (!this.#events[event]) this.#events[event] = [];
    this.#events[event].push(listener);
    return this; // for chaining
  }
  
  off(event, listener) {
    if (this.#events[event]) {
      this.#events[event] = this.#events[event].filter(l => l !== listener);
    }
    return this;
  }
  
  once(event, listener) {
    const wrapper = (...args) => {
      listener(...args);
      this.off(event, wrapper);
    };
    return this.on(event, wrapper);
  }
  
  emit(event, ...args) {
    (this.#events[event] || []).forEach(listener => listener(...args));
    return this;
  }
}

const emitter = new EventEmitter();
emitter.on("data", data => console.log("Got:", data));
emitter.emit("data", { id: 1, name: "Alice" });
```

### Factory

```javascript
class UserFactory {
  static create(type, options) {
    const types = {
      admin: AdminUser,
      moderator: ModeratorUser,
      guest: GuestUser
    };
    const UserClass = types[type];
    if (!UserClass) throw new Error(`Unknown user type: ${type}`);
    return new UserClass(options);
  }
}

const admin = UserFactory.create("admin", { name: "Alice" });
```

### Strategy

```javascript
class Sorter {
  constructor(strategy) {
    this.strategy = strategy;
  }
  
  sort(data) {
    return this.strategy.sort(data);
  }
}

const bubbleSort = {
  sort(arr) { /* bubble sort implementation */ }
};

const quickSort = {
  sort(arr) { /* quick sort implementation */ }
};

const sorter = new Sorter(quickSort);
sorter.strategy = bubbleSort; // swap strategy at runtime
```

### Module Pattern

```javascript
const ShoppingCart = (() => {
  // Private
  let items = [];
  let discount = 0;
  
  function calculateTotal() {
    return items.reduce((sum, item) => sum + item.price, 0) * (1 - discount);
  }
  
  // Public API
  return {
    addItem(item) { items.push(item); },
    removeItem(id) { items = items.filter(i => i.id !== id); },
    getTotal() { return calculateTotal(); },
    setDiscount(d) { discount = d / 100; },
    getItems() { return [...items]; } // return copy
  };
})();
```

---

## 26. Performance Optimization

### Debounce & Throttle

```javascript
// Debounce — delay execution until after pause in calls
// Use for: search input, window resize handler
function debounce(fn, delay) {
  let timeoutId;
  return function(...args) {
    clearTimeout(timeoutId);
    timeoutId = setTimeout(() => fn.apply(this, args), delay);
  };
}

const debouncedSearch = debounce((query) => {
  fetch(`/api/search?q=${query}`);
}, 300);

searchInput.addEventListener("input", (e) => debouncedSearch(e.target.value));

// Throttle — limit execution to once per interval
// Use for: scroll handler, mousemove
function throttle(fn, limit) {
  let inThrottle = false;
  return function(...args) {
    if (!inThrottle) {
      fn.apply(this, args);
      inThrottle = true;
      setTimeout(() => { inThrottle = false; }, limit);
    }
  };
}

const throttledScroll = throttle(() => {
  console.log("Scroll position:", window.scrollY);
}, 100);

window.addEventListener("scroll", throttledScroll);
```

### Memoization (covered in Closures section)

### Virtual DOM Concept

```javascript
// Instead of this (causes reflow/repaint for each operation)
for (const item of items) {
  const li = document.createElement("li");
  li.textContent = item;
  list.appendChild(li); // triggers reflow each time!
}

// Use DocumentFragment (batch DOM operations)
const fragment = document.createDocumentFragment();
for (const item of items) {
  const li = document.createElement("li");
  li.textContent = item;
  fragment.appendChild(li); // no reflow yet
}
list.appendChild(fragment); // single reflow!
```

### Performance Tips

```javascript
// 1. Avoid layout thrashing
// ❌ Bad — alternating read and write causes multiple reflows
const heights = elements.map(el => {
  el.style.width = "100px"; // write
  return el.offsetHeight;    // read (forces reflow!)
});

// ✅ Good — batch reads, then writes
const heights = elements.map(el => el.offsetHeight); // all reads
elements.forEach((el, i) => { el.style.width = "100px"; }); // all writes

// 2. Use requestAnimationFrame for animations
function animate() {
  element.style.transform = `translateX(${x++}px)`;
  if (x < 200) requestAnimationFrame(animate);
}
requestAnimationFrame(animate);

// 3. Event delegation (covered in Events section)
// 4. Lazy loading with IntersectionObserver (covered in Web APIs)
// 5. Code splitting with dynamic imports (covered in Modules)
```

---

## 27. Testing in JavaScript

### Unit Testing with Jest

```javascript
// math.js
export function add(a, b) { return a + b; }
export function divide(a, b) {
  if (b === 0) throw new Error("Division by zero");
  return a / b;
}

// math.test.js
import { add, divide } from "./math";

describe("Math functions", () => {
  describe("add", () => {
    test("adds two positive numbers", () => {
      expect(add(2, 3)).toBe(5);
    });
    
    test("adds negative numbers", () => {
      expect(add(-1, -2)).toBe(-3);
    });
  });
  
  describe("divide", () => {
    test("divides correctly", () => {
      expect(divide(10, 2)).toBe(5);
    });
    
    test("throws on division by zero", () => {
      expect(() => divide(10, 0)).toThrow("Division by zero");
    });
  });
});

// Common matchers
expect(value).toBe(5);          // strict equality
expect(value).toEqual({a: 1});  // deep equality
expect(value).toBeTruthy();
expect(value).toBeFalsy();
expect(value).toBeNull();
expect(value).toBeUndefined();
expect(value).toBeGreaterThan(3);
expect(arr).toHaveLength(3);
expect(arr).toContain(5);
expect(obj).toHaveProperty("name", "Alice");
expect(fn).toThrow();
expect(fn).toThrow(Error);
```

### Mocking

```javascript
// Mock a function
const mockFn = jest.fn().mockReturnValue(42);
mockFn(); // 42
mockFn(); // 42
expect(mockFn).toHaveBeenCalledTimes(2);
expect(mockFn).toHaveBeenCalledWith(/* args */);

// Mock a module
jest.mock("./api", () => ({
  fetchUser: jest.fn().mockResolvedValue({ name: "Alice" })
}));

// Spy on existing method
const spy = jest.spyOn(console, "log").mockImplementation(() => {});
// ... run code ...
expect(spy).toHaveBeenCalledWith("expected message");
spy.mockRestore();
```

---

## 28. TypeScript Basics

```typescript
// Types
let name: string = "Alice";
let age: number = 25;
let active: boolean = true;
let data: any = "anything";   // avoid!
let val: unknown = "safer";   // prefer over any

// Arrays
let nums: number[] = [1, 2, 3];
let words: Array<string> = ["a", "b"];

// Tuple
let pair: [string, number] = ["Alice", 25];

// Union types
let id: string | number = "abc123";

// Interfaces
interface User {
  name: string;
  age: number;
  email?: string; // optional
  readonly id: number; // can't reassign
}

// Type alias
type Point = { x: number; y: number };
type StringOrNumber = string | number;

// Generic types
function identity<T>(arg: T): T { return arg; }
identity<string>("hello");

// Enum
enum Direction { Up, Down, Left, Right }
Direction.Up; // 0

// Type assertions
const input = document.getElementById("name") as HTMLInputElement;
const value = (input as HTMLInputElement).value;

// Utility types
Partial<User>     // all props optional
Required<User>    // all props required
Readonly<User>    // all props readonly
Pick<User, "name" | "age"> // subset of props
Omit<User, "age"> // remove props
Record<string, number> // { [key: string]: number }
```

---

## 29. Node.js Essentials

### Core Modules

```javascript
// File System
const fs = require("fs");
const { promises: fsPromises } = require("fs");

// Read file
const data = fs.readFileSync("file.txt", "utf8"); // sync
const data = await fsPromises.readFile("file.txt", "utf8"); // async

// Write file
fs.writeFileSync("file.txt", "content");
await fsPromises.writeFile("file.txt", "content");
await fsPromises.appendFile("file.txt", "\nmore content");

// File exists
fs.existsSync("file.txt");

// Directory operations
fs.mkdirSync("dir", { recursive: true });
const files = fs.readdirSync("dir");
fs.unlinkSync("file.txt"); // delete file
fs.rmdirSync("dir", { recursive: true }); // delete dir

// Path module
const path = require("path");
path.join(__dirname, "utils", "helper.js");
path.resolve("./file.txt");  // absolute path
path.basename("/a/b/c.txt"); // "c.txt"
path.extname("file.txt");    // ".txt"
path.dirname("/a/b/c.txt");  // "/a/b"

// OS module
const os = require("os");
os.platform(); // "win32", "darwin", "linux"
os.arch();     // "x64"
os.cpus();     // array of CPU info
os.totalmem(); // total memory in bytes
os.homedir();  // home directory
os.tmpdir();   // temp directory

// Process
process.env.NODE_ENV;   // environment variables
process.argv;           // command line args
process.cwd();          // current working directory
process.exit(0);        // exit with code
process.on("exit", () => { /* cleanup */ });
process.on("uncaughtException", (err) => { console.error(err); });
process.on("unhandledRejection", (reason) => { console.error(reason); });
```

### HTTP Server

```javascript
const http = require("http");

const server = http.createServer((req, res) => {
  // Request
  req.url;     // "/path?query=value"
  req.method;  // "GET", "POST", etc.
  req.headers; // request headers
  
  // Parse body
  let body = "";
  req.on("data", chunk => { body += chunk; });
  req.on("end", () => {
    const data = JSON.parse(body);
    
    // Response
    res.writeHead(200, { "Content-Type": "application/json" });
    res.end(JSON.stringify({ message: "Hello!" }));
  });
});

server.listen(3000, () => {
  console.log("Server running on http://localhost:3000");
});
```

### NPM Essentials

```bash
npm init -y                    # create package.json
npm install express            # install package
npm install -D jest            # dev dependency
npm install -g nodemon         # global install
npm uninstall express          # remove package
npm run start                  # run script
npm update                     # update packages
npm audit                      # check vulnerabilities
npm ci                         # clean install from lock file
npx create-react-app my-app    # run without installing
```

---

## 30. Pro Tips & Best Practices

### Code Quality

```javascript
// 1. Use strict mode
"use strict";

// 2. Prefer const > let > var
// 3. Use === over ==
// 4. Avoid magic numbers
const MAX_RETRY_COUNT = 3; // ✅
if (retries > 3) { ... }   // ❌

// 5. Meaningful names
const d = new Date();                    // ❌
const currentDate = new Date();          // ✅
const getUserById = async (id) => { };   // ✅ verb + noun

// 6. Short-circuit for defaults
const name = user?.name ?? "Anonymous";

// 7. Early return (guard clauses)
function processUser(user) {
  if (!user) return null;         // guard clause
  if (!user.isActive) return null; // guard clause
  
  // main logic here (not nested!)
  return doSomething(user);
}

// 8. Avoid deeply nested code
// Use early returns, functional methods, async/await

// 9. Destructure function parameters
function createUser({ name, age, email = "" } = {}) { ... }

// 10. Array/Object spread for immutable updates
const newArr = [...arr, newItem];
const newObj = { ...obj, updatedProp: newValue };
```

### Common Patterns

```javascript
// Safe array access
const first = arr?.[0];
const last = arr?.[arr.length - 1];

// Check all or any condition
const allAdults = users.every(u => u.age >= 18);
const hasAdmins = users.some(u => u.role === "admin");

// Count items matching condition
const adultCount = users.filter(u => u.age >= 18).length;
// More efficient
const adultCount = users.reduce((count, u) => count + (u.age >= 18 ? 1 : 0), 0);

// Group items
const groupBy = (arr, key) =>
  arr.reduce((groups, item) => ({
    ...groups,
    [item[key]]: [...(groups[item[key]] || []), item]
  }), {});

// Deep clone
const deepClone = obj => JSON.parse(JSON.stringify(obj)); // simple (no functions/dates)
const deepClone = structuredClone(obj); // ES2022, handles more types

// Flatten nested array
const flatten = arr => arr.flat(Infinity);

// Range of numbers
const range = (start, end) => Array.from({ length: end - start }, (_, i) => i + start);
range(1, 6); // [1, 2, 3, 4, 5]

// Unique values
const unique = arr => [...new Set(arr)];

// Shuffle array
const shuffle = arr => [...arr].sort(() => Math.random() - 0.5);

// Random integer
const randomInt = (min, max) => Math.floor(Math.random() * (max - min + 1)) + min;

// Chunk array
const chunk = (arr, size) =>
  Array.from({ length: Math.ceil(arr.length / size) }, (_, i) =>
    arr.slice(i * size, i * size + size));
chunk([1,2,3,4,5], 2); // [[1,2],[3,4],[5]]

// Deep pick from object
const get = (obj, path) =>
  path.split(".").reduce((acc, key) => acc?.[key], obj);
get({ a: { b: { c: 42 } } }, "a.b.c"); // 42
```

### Debugging Tips

```javascript
// Pretty console output
console.log(JSON.stringify(obj, null, 2)); // formatted JSON
console.table(arrayOfObjects);             // table view
console.dir(element, { depth: null });     // full object
console.trace();                           // call stack

// Conditional logging
const DEBUG = true;
const log = (...args) => DEBUG && console.log("[DEBUG]", ...args);

// Time code
console.time("operation");
for (let i = 0; i < 1000000; i++) { /* ... */ }
console.timeEnd("operation"); // "operation: 12.345ms"

// Assert
console.assert(1 === 1, "This won't show");
console.assert(1 === 2, "This will show as error!");

// debugger statement (opens browser devtools)
function buggyFunction(data) {
  debugger; // execution pauses here when devtools is open
  return data.map(x => x * 2);
}
```

### Security Best Practices

```javascript
// 1. Never trust user input
const userInput = req.body.name;
// ❌ innerHTML with user input = XSS vulnerability
element.innerHTML = userInput;
// ✅ Use textContent or sanitize
element.textContent = userInput;
// ✅ DOMPurify library for HTML
element.innerHTML = DOMPurify.sanitize(userInput);

// 2. Use Content Security Policy headers
// 3. Validate and sanitize on SERVER too
// 4. Use parameterized queries for databases (prevent SQL injection)
// 5. Avoid eval() — it executes arbitrary code
eval("alert('hacked')"); // ❌ NEVER
// 6. Be careful with JSON.parse (use try/catch)
// 7. Don't expose sensitive data in client-side code
// 8. Use HTTPS for API calls
```

---

## 📌 Quick Reference Cheatsheet

### Array Methods Summary
| Method | Mutates? | Returns | Use Case |
|--------|----------|---------|----------|
| `map` | No | New array | Transform elements |
| `filter` | No | New array | Select elements |
| `reduce` | No | Single value | Accumulate |
| `find` | No | Element/undefined | First match |
| `findIndex` | No | Number | Index of first match |
| `some` | No | Boolean | Any match? |
| `every` | No | Boolean | All match? |
| `push/pop` | Yes | New length/removed | Add/remove end |
| `shift/unshift` | Yes | Removed/new length | Add/remove start |
| `splice` | Yes | Removed items | Insert/remove middle |
| `slice` | No | New array | Copy portion |
| `sort` | Yes | Sorted array | Sort in place |
| `flat` | No | New array | Flatten |
| `forEach` | No | undefined | Side effects |
| `includes` | No | Boolean | Contains value? |
| `indexOf` | No | Number | Find index |

### Comparison of `var`, `let`, `const`
| Feature | var | let | const |
|---------|-----|-----|-------|
| Scope | Function | Block | Block |
| Hoisted | Yes (undefined) | Yes (TDZ) | Yes (TDZ) |
| Re-declarable | Yes | No | No |
| Re-assignable | Yes | Yes | No |
| Global property | Yes | No | No |

### Promise States
```
Pending → Fulfilled (resolved)
        → Rejected
```

### Event Loop Order
```
1. Synchronous code (call stack)
2. Microtasks (Promises, queueMicrotask)
3. Macrotasks (setTimeout, setInterval, I/O)
4. Render (browser repaint)
```

---

## 🔗 Resources for Further Learning

- **MDN Web Docs**: https://developer.mozilla.org
- **JavaScript.info**: https://javascript.info (best free resource)
- **You Don't Know JS** (book series): https://github.com/getify/You-Dont-Know-JS
- **Node.js Docs**: https://nodejs.org/docs
- **TC39 Proposals** (upcoming features): https://github.com/tc39/proposals
- **V8 Blog** (engine internals): https://v8.dev/blog
- **web.dev**: https://web.dev (performance & best practices)

---

> 💡 **Tip:** The best way to truly learn JavaScript is to **build projects**. Start with small scripts, then build DOM projects, then APIs, then full-stack apps. Read other people's code on GitHub. Contribute to open source. You've got this! 🚀

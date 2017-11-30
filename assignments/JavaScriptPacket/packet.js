//1.Fibonacci
//Define function: fib(n)
//Return the nth number in the fibonacci sequence
function fib(num){
    if(num == 0){
        return 0;
    }else if(num == 1){
        return 1;
    }else{
    return fib(num - 1) + fib(num - 2);
    }
}

// 2. Bubble Sort
// Define function: bubbleSort(numArray)
// Use the bubble sort algorithm to sort the array.
// Return the sorted array.
function bubbleSort(numArray){
    swapped = false;
    while(!swapped){
        swapped = true;
        for(let i = 0; i < numArray.length -1; i++){
            if(numArray[i] > numArray[i + 1]){
                let temp = numArray[i];
                numArray[i] = numArray[i + 1];
                numArray[i + 1] = temp;
                swapped = false;
            }
        }
    }

    return numArray;
 }


// 3. Reverse String
// Define function: reverseStr(someStr)
// Reverse and return the String.
function reverseStr(someStr){
   let str = someStr.split("");
   str = str.reverse();
   str = str.join("");
   return str;
}

// 4. Factorial
// Define function: factorial(someNum)
// Use recursion to compute and return the factorial of someNum.
function factorial(someNum){
    if(someNum == 1){
        return 1;
    }else{
    return someNum * factorial(someNum - 1);
    }
}

// 5. Substring
// Define function substring(someStr, length, offset)
// Return the substring contained between offset and (offset + length) inclusively.
// If incorrect input is entered, use the alert function and describe why the input was incorrect.
function substring(someStr, length, offset){
    if(typeof(someStr) !== 'string'){
        alert('The input is of type ' + typeof(someStr) + ' not string');
    }else{
        let str = someStr.split("");
        let array = [];
        for(let i =offset; i < someStr.length; i++){
            array = array + str[i];
        }

        return array;
    }
}

// 6. Even Number
// Define function: isEven(someNum)
// Return true if even, false if odd.
// Do not use % operator.
function isEven(someNum){
    if((someNum / 2) - Math.floor(someNum / 2) === 0){
        return true;
    }else{
        return false;
    }
}

// 7. Palindrome
// Define function isPalindrome(someStr)
// Return true if someStr is a palindrome, otherwise return false
function isPalindrome(someStr){
    if(someStr.length <= 1){
        return true;
    }else{
        if(someStr[0] == someStr[someStr.length - 1]){
            console.log(someStr.substring(1,someStr.length -1));
            return isPalindrome(someStr.substring(1,someStr.length - 1));
        }
    }
    return false;
}

// 8. Shapes
// Define function: printShape(shape, height, character)
// shape is a String and is either "Square", "Triangle", "Diamond".
// height is a Number and is the height of the shape. Assume the number is odd.
// character is a String that represents the contents of the shape. Assume this String contains just one character.
// Use a switch statement to determine which shape was passed in.
// Use the console.log function to print the desired shape.
// Example for printShape("Square", 3, "%");
// %%%
// %%%
// %%%
// Example for printShape("Triangle", 3, "$");
// $
// $$
// $$$
// Example for printShape("Diamond", 5, "*");
//   *
//  ***
// *****
//  ***
//   *

function printShape(shape, height, character){
    let output = "";
    switch (shape) {
        case "Square":
            for(let i = 0; i < height; i++){
                for(let j = 0; j < height; j++){
                    output += character;
                }
                console.log(output);
                output = "";
            }
            break;
        case "Triangle":
            let output = "";
            for(let i = 0; i < height; i++){
               output += character;
               console.log(output);
            }

            break;
        case "Diamond":
           for( i = 1; i <= height; i+= 2){
               let line = "";
               for( let s = 0; s < (height - i/2 - height/2); s++){
                   line += " ";
               }
               for(let j = 1; j <= i; j++){
                   line += character; 
               }
               console.log(line);
           }
           for( i = height - 2; i >= 0; i = i -2){
               let bline = "";
               for(let s =0; s <(height - i/2-height/2); s++){
                    bline += " ";
               }
               for(let j = 1; j <= i; j++){
                   bline += character;
               }
               console.log(bline);
           }
            
            break;
    
        default:
            break;
    }
}

// 9. Object literal
// Define function traverseObject(someObj)
// Print every property and it's value.
function traverseObject(someObj){
    let value;
    for(let property in someObj){
        console.log(property, someObj[property]);
    }
}


// 10. Delete Element
// Define function deleteElement(someArr)
// Print length
// Delete the third element in the array.
// Print length
// The lengths should be the same.
function deleteElement(someArr){
    console.log(someArr.length);
    delete someArr[2];
    console.log(someArr.length);
}

// 11. Splice Element
// Define function spliceElement(someArr)
// Print length
// Splice the third element in the array.
// Print length
// The lengths should be one less than the original length.
function spliceElement(someArr){
    console.log(someArr.length);
    someArr.splice(3);
    console.log(someArr.length);
}

// 12. Defining an object using a constructor
// Define a function Person(name, age)
// The following line should set a Person object to the variable john:
// 	var john = new Person("John", 30);
function Person(name, age){
    this.name = name;
    this.age = 30;
}

// 13. Defining an object using an object literal
// Define function getPerson(name, age)
// The following line should set a Person object to the variable john:
// 	var john = getPerson("John", 30);
function getPerson(name, age){
    Person = {
    name: name,
    age: age
    }
}
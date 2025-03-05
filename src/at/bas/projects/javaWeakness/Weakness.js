
// JAVASCRIPTS WEAKNESSES 


//1.) 

/* 
    JavaScript ist eine dynamisch typisierte Sprache, was bedeutet, dass Variablen ihre Typen zur Laufzeit ändern können. 
    Das kann zu unerwarteten Fehlern führen, wenn z. B. eine Zahl plötzlich als String behandelt wird. */

let w = "10";  // String
let n = 5;

console.log(w + n);  // "105" (String-Konkatenation statt Addition!)
console.log(w - n);  // 5 (automatische Typkonvertierung!)
console.log(w * n);  // 50 (wieder automatische Umwandlung!)
console.log(w / n);  // 2 (auch hier!)

console.log("5" - "3");  // 2 (unerwartete Umwandlung)
console.log("5" + "3");  // "53" (String-Konkatenation)


//Richtige Lösung

let a = "10";
let b = 5;

console.log(Number(a) + b);  // 15 
console.log(parseInt(a) + b);  // 15 


//2.) 

//JavaScript konvertiert Werte oft automatisch, was zu seltsamen Vergleichen führt.

console.log(false == 0);   // true (!)
console.log(false === 0);  // false (strikte Überprüfung)
console.log(null == undefined);  // true (!)
console.log([] == false);  // true (!)
console.log([] == ![]);    // true (!)

/*Warum passiert das?

    false und 0 werden beide zu false konvertiert.
    null und undefined sind gleich, aber nicht identisch (=== überprüft den Typ).
    Lösung: */

console.log(false === 0);   // false 
console.log(null === undefined);  // false 


//3.) 

//JavaScript gibt Speicher nicht automatisch frei, wenn alte Daten nicht entfernt werden.

let data = [];
function addData() {
    let hugeObject = new Array(1000000).fill("Daten");
    data.push(hugeObject);  // Speicherverbrauch wächst unkontrolliert
}

addData();
addData();
addData();

// LÖsung 

function addData() {
    let hugeObject = new Array(1000000).fill("Daten");
    process(hugeObject);
    hugeObject = null;  // Speicher wird freigegeben
}

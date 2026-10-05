function makeCounter() {
    let count = 0;
    return function(){
        count++;
        return count;
    };
}


const counter = makeCounter();
console.log(counter());
console.log(counter());
console.log(counter());

// map , filter , reduce 

const arr = [7,8,9];

const doubled = arr.map(n => n * 5);
const evens = arr.filter(n => n % 2 === 0);
const sum = arr.reduce((sum , n) => sum + n , 0);

console.log(doubled);
console.log(evens);
console.log(sum);
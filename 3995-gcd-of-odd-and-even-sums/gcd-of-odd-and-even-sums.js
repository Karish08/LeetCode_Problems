/**
 * @param {number} n
 * @return {number}
 */
var gcdOfOddEvenSums = function(n) {
    let odd = 0
    let even = 0
    let ak = 1
    let kb = 2
    for(let i = 0; i<n; i++){
        even += kb
        kb += 2
    }
    for(let i = 0; i<n; i++){
        odd += ak
        ak += 2
    }
    return GCDOf(odd, even)
};

function GCDOf(a, b){
    if(b === 0) return a
    return GCDOf(b, a % b)
}
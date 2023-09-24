
const sumaNumeroImpares = (start, end, sum = 0, count = 0) => {
    if(start < end) return start%2 == 0 ? sumaNumeroImpares(start+1, end, sum, count): sumaNumeroImpares(start+1, end, sum+start, count+1);
    return `La cantidad de numero impares es: ${count} y la suma de estos es: ${sum}` 
}

console.log(sumaNumeroImpares(30, 500));

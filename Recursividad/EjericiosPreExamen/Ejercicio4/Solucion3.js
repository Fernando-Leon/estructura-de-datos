const SumaCuadrados = n => n === 0 ? 0 : n*n + SumaCuadrados(n-1);
console.log(SumaCuadrados(100))
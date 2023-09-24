const Serie = (n, c1 = 1, c2 = 1, r = 0) =>  (n == 0) ? r:  Serie(n-1, c1 * 2, c2 * 3, r + (c1/c2)); 
console.log(Serie(2))
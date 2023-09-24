const esPrimo = (numero, divisor) => {
    if (numero <= 1) return false;
    if (divisor <= 1) return true;
    if (numero % divisor == 0) return false;
    return esPrimo(numero, divisor - 1);
}

const contarPrimos = () => {
    numero = parseInt(prompt("Ingresa el numero"));
    respuesta = confirm("¿Estás seguro de que deseas ingresar un nuevo numero?")
    return esPrimo(numero, numero - 1) ? (respuesta ? 1 + contarPrimos() : 1) : (respuesta ? contarPrimos() : 0);
}

alert(`La cantidad de numeros primos es: ${contarPrimos()}`);
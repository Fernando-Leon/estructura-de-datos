
def sumNnumberImpares(start, end, suma = 0, count = 0):
    if start < end and start%2 != 0:
         return sumNnumberImpares(start+1, end, suma + start, count + 1)
    elif start < end:  
         return sumNnumberImpares(start+1, end, suma, count)
    return "La cantidad de numero impares es: " + str(count) + " y la suma de estos es: " + str(suma)

print(sumNnumberImpares(30, 500))
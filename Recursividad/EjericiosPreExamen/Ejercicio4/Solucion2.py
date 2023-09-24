def SumaCuadrados(n):
    if n != 0:
        return n*n + SumaCuadrados(n-1)
    else:
        return 0
    
print(SumaCuadrados(100))
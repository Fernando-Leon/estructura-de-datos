import tkinter as tk
from tkinter import messagebox

def esPrimo(numero, divisor):
    if numero <= 1:
        return False
    if divisor <= 1:
        return True
    if numero % divisor == 0:
        return False
    return esPrimo(numero, divisor - 1)

def contarPrimos():
    numero = int(input("Ingresa el número: "))  # Convierte la entrada a un entero
    respuesta = messagebox.askyesno("Confirmación", "¿Estás seguro de continuar?")

    if esPrimo(numero, numero - 1):
        if respuesta: 
            return 1 + contarPrimos() 
        else:
            return 1
    else:
        if respuesta:  # Cambia a "not respuesta" para verificar si es False
            return contarPrimos() 
        else:
            return 0

ventana = tk.Tk()
ventana.withdraw()
resultado = contarPrimos()
print("Cantidad de números primos ingresados:", resultado)

# Maximo comun divisor
# Usando el algoritmo de euclides

def mcd(a, b):
    a = abs(a)
    b = abs(b)

    if b == 0:
        return a
    else:
        return mcd(b, a % b)


a = int(input("Ingresa un numero a: "))
b = int(input("Ingresa un numero b: "))

print("El maximo comun divisor es:", mcd(a, b))

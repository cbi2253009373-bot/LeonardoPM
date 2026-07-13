# Algoritmo de Euclides
# Sirve para calcular el maximo comun divisor

def euclides(a, b):
    a = abs(a)
    b = abs(b)

    while b != 0:
        q = a // b
        r = a % b

        print(a, "=", b, "*", q, "+", r)

        a = b
        b = r

    return a


a = int(input("Ingresa el valor de a: "))
b = int(input("Ingresa el valor de b: "))

print("El maximo comun divisor es:", euclides(a, b))

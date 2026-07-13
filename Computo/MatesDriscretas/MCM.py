# minimo comun multiplo
# Para sacar el minimo comun multiplo tenemos que tener el mcd

def mcd(a, b):
    a = abs(a)
    b = abs(b)

    if b == 0:
        return a
    else:
        return mcd(b, a % b)


def mcm(a, b):
    return abs(a * b) // mcd(a, b)


a = int(input("Ingresa un numero a: "))
b = int(input("Ingresa un numero b: "))

print("El minimo comun multiplo es:", mcm(a, b))

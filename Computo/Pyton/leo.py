print("Hola mundo")

edad = int(input("Edad que tienes: "))
nombre = input("Ingresa tu nombre: ")

if edad >= 18:
    print(nombre, "eres mayor de edad")
else:
    print(nombre, "eres menor de edad")


nombre2 = input("Ingresa nombre 2: ")
edad2 = int(input("Pon tu edad 2: "))

if edad > edad2:
    print("Es mayor:", nombre)
elif edad2 > edad:
    print("Es mayor:", nombre2)
else:
    print(nombre, "y", nombre2, "tienen la misma edad")


for i in range(5):
  print ("hola", i)

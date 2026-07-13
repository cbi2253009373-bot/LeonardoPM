numero = int (input("Ingresa numero: "))
acum = 0
for i in range (1,numero+1):
  if i%2 == 0 :
    print (i)
  if i%2 == 0:
    acum = acum + 1

print ("numero pares son: ",acum)

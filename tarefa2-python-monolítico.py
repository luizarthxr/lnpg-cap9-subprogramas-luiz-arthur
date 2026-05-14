produto1 = input("Digite o nome do produto 1: ")
quantidade1 = int(input("Digite a quantidade: "))
preco1 = float(input("Digite o preço: "))

produto2 = input("Digite o nome do produto 2: ")
quantidade2 = int(input("Digite a quantidade: "))
preco2 = float(input("Digite o preço: "))

produto3 = input("Digite o nome do produto 3: ")
quantidade3 = int(input("Digite a quantidade: "))
preco3 = float(input("Digite o preço: "))

subtotal1 = quantidade1 * preco1
subtotal2 = quantidade2 * preco2
subtotal3 = quantidade3 * preco3

total = subtotal1 + subtotal2 + subtotal3

if total > 500:
    desconto = total * 0.10
elif total > 200:
    desconto = total * 0.05
else:
    desconto = 0

total_final = total - desconto

print()
print("CUPOM")
print(produto1, "-", quantidade1, "x", preco1, "=", subtotal1)
print(produto2, "-", quantidade2, "x", preco2, "=", subtotal2)
print(produto3, "-", quantidade3, "x", preco3, "=", subtotal3)

print("Total:", total)
print("Desconto:", desconto)
print("Total final:", total_final)

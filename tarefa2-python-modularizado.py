def calcular_subtotal(quantidade, preco):
    return quantidade * preco


def calcular_desconto(total):
    if total > 500:
        return total * 0.10
    elif total > 200:
        return total * 0.05
    else:
        return 0


def mostrar_produto(nome, quantidade, preco, subtotal):
    print(nome, "-", quantidade, "x", preco, "=", subtotal)


produto1 = input("Digite o nome do produto 1: ")
quantidade1 = int(input("Digite a quantidade: "))
preco1 = float(input("Digite o preço: "))

produto2 = input("Digite o nome do produto 2: ")
quantidade2 = int(input("Digite a quantidade: "))
preco2 = float(input("Digite o preço: "))

produto3 = input("Digite o nome do produto 3: ")
quantidade3 = int(input("Digite a quantidade: "))
preco3 = float(input("Digite o preço: "))

subtotal1 = calcular_subtotal(quantidade1, preco1)
subtotal2 = calcular_subtotal(quantidade2, preco2)
subtotal3 = calcular_subtotal(quantidade3, preco3)

total = subtotal1 + subtotal2 + subtotal3

desconto = calcular_desconto(total)

total_final = total - desconto

print()
print("CUPOM")

mostrar_produto(produto1, quantidade1, preco1, subtotal1)
mostrar_produto(produto2, quantidade2, preco2, subtotal2)
mostrar_produto(produto3, quantidade3, preco3, subtotal3)

print("Total:", total)
print("Desconto:", desconto)
print("Total final:", total_final)

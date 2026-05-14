# Atividade Prática — LNPG  
## Capítulo 9 — Subprogramas

**Nome:** Luiz Arthur Lisboa Cirilo Torres   
**Disciplina:** Linguagens de Programação  
**Tema:** Subprogramas, modularização e passagem de parâmetros

## Descrição da atividade

Esta atividade tem como objetivo praticar o uso de subprogramas, métodos e funções em programas simples.

O meu entendimento sobre a ideia principal foi entender como um programa pode ser dividido em partes menores, deixando o código mais organizado, mais fácil de ler e mais simples de corrigir.

Tentei desenvolver versões monolíticas e modularizadas, para comparar a diferença entre escrever tudo em um único bloco e separar o programa em métodos ou funções.

Tarefa 1 — Modularização em Java

Na primeira tarefa foi feito um programa em Java para controle acadêmico. O programa pede o nome de 5 alunos e também pede 3 notas para cada aluno. Depois disso, ele calcula a média e mostra a situação do aluno. As situações são:

aprovado;
recuperação;
reprovado.

Primeiro foi feita uma versão mais simples, deixando tudo dentro do método main, essa é a versão monolític. Depois foi feita uma segunda versão, separando o código em métodos. Essa é a versão modularizada. Usei usados métodos como:

lerAluno()
lerNotas()
calcularMedia()
determinarSituacao()
imprimirRelatorio()

Eu achei que a versão modularizada ficou melhor porque cada parte do programa ficou separada. Assim fica mais fácil saber onde está cada coisa. Por exemplo, se eu quiser mexer só no cálculo da média, eu vou direto no método que calcula a média. Não preciso ficar procurando no meio do programa inteiro.

Tarefa 2 — Modularização em Python

Na segunda tarefa foi feito um sistema simples de vendas em Python. O programa pede o nome do produto, a quantidade e o preço unitário. Depois ele calcula o subtotal, vê se tem desconto e mostra o valor final da venda.A regra de desconto foi:

5% de desconto quando o valor passa de R$ 200,00;
10% de desconto quando o valor passa de R$ 500,00.

Também foram feitas duas versões. A primeira versão foi monolítica, com tudo escrito em sequência.E a segunda versão foi modularizada, separando o código em funções. Usei funções como:

ler_produto()
calcular_subtotal()
calcular_desconto()
calcular_total()
imprimir_cupom()

Na minha opinião, a versão com funções ficou mais organizada, fica mais fácil de entender o que cada parte faz. Também achei melhor porque, se eu precisar usar o cálculo de desconto em outro programa, posso reaproveitar a função sem precisar escrever tudo de novo.

Tarefa 3 — Passagem de Parâmetros por Valor em Java

Na terceira tarefa foi feito um exemplo para entender a passagem de parâmetros por valor em Java. Foi criada uma variável do tipo inteiro no método main. Depois essa variável foi passada para outro método chamado alterarNumero. Dentro desse método, o valor foi alterado. Porém, quando o programa voltou para o main, o valor original continuou o mesmo. Isso acontece porque o Java não manda a variável original para o método. Ele manda uma cópia do valor. Então, se o número era 50, o método recebe uma cópia de 50. Quando essa cópia é alterada para 100, o número original continua sendo 50. Foi isso que eu entendi sobre passagem por valor: o método trabalha com uma cópia, e não com a variável original.

Comparação entre versão monolítica e modularizada:

A versão monolítica é mais simples no começo, porque tudo fica em um lugar só, mas quando o programa vai ficando maior, ela começa a ficar mais confusa. O código fica grande, com leitura de dados, cálculos e impressão tudo junto. Já a versão modularizada fica mais organizada, porque cada parte do programa fica separada, eu achei a versão modularizada melhor porque fica mais fácil de ler, de corrigir e de alterar depois, mesmo que tenha mais métodos ou funções, o código fica mais claro.

Legibilidade

A legibilidade melhora bastante quando o código é dividido. Na versão monolítica, é preciso ler o código todo para entender o que está acontecendo. Na versão modularizada, só pelo nome do método ou da função já dá para ter uma ideia do que aquela parte faz. Por exemplo, quando vejo calcularMedia(), já entendo que aquela parte serve para calcular a média.

Reutilização

A modularização também ajuda na reutilização do código. Quando eu crio uma função para calcular desconto, por exemplo, posso usar essa função novamente em outro programa. Isso evita ter que ficar escrevendo o mesmo código várias vezes.

Facilidade de manutenção

A manutenção fica mais fácil porque o programa fica dividido em partes menores. Se eu precisar mudar alguma regra, como a regra de aprovação ou a regra de desconto, eu posso mexer só na função responsável por aquilo. Na versão monolítica, isso seria mais difícil, porque tudo fica misturado.

Clareza do fluxo

O fluxo do programa também fica mais claro na versão modularizada. O método principal mostra a ordem das coisas que acontecem, e os detalhes ficam separados em outros métodos, isso ajuda a entender melhor o caminho que o programa segue.

Tamanho dos métodos

Na versão modularizada, os métodos ficam menores, eu entendi que isso é importante porque métodos muito grandes ficam mais difíceis de entender. Quando cada método faz só uma coisa, o código fica mais simples.

Coesão

A coesão é melhor quando cada método ou função tem uma responsabilidade própria. Por exemplo, um método só lê as notas, outro só calcula a média e outro só mostra o relatório, isso é melhor do que colocar tudo em um único lugar, porque o código fica mais organizado.

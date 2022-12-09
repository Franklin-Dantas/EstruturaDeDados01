## Enunciado da situação-problema

Implemente o cadastro de produtos de uma empresa utilizando uma árvore
binária de busca genérica. Cada nó da árvore deve armazenar as informações relativas a um produto: caigo descrição fornecedor preço e quantidade em estoque A chave de
ordenação da árvore é o código do produto. O programa deverá ter seguintes:

(a)Proccdimcnto para cadastrar um novo prcn-luto, O procedimento deverá
solicitar ao usuário as informações do produto a ser cadastrado e inserir
o produto no Não serão aceitos mais de um produto com mesmo código.

(b)Procedimento para exibir as informações (código, descrição,
fornecedor, preço e quantidade em estoque) de todos os produtos
cadastrados por ordem crescente dc código.

(c)Funçào para procurar um produto no cadastro. A função deverá receber
como parâmetro o código do produto procurado e deverá retornar uma
referência para o produto procurado ou caso nào encontre. Esta
função deverá ser utilizada procedimentos dos itens (e) e

(d)Procedimento para alterar o preço de um produto, O
procedimento deverá receber como parâmetro o eüligo do produto cuiO
preço será alterado. Este procedimento deverá utilizar a função definida
no item (c) para procurar o produto no cadastro. Caso encontre, deve
proceder com a alteração do preço. Caso não encontre, deve informar
ao usuário que o produto não existe no cadastro.

(e)Procedimento para alterar a quantidade em estoque de um produto- O
procedimento deverá receber como parâmetro o código do produto cuia
quantidade será alterada- Este procedimento deverá utilizar a função
definida no item (c) para procurar o produto no cadastro. Caso encontre,
deve proceder com a alteração da quantidade em estcK1ue. Caso não
encontre, deve informar ao usuário que o produto não existe no
cadastro.

(f)Procedimento para exibir as informações (código, descrição,
fornecedor, preço e quantidade em estoque) de um produto. O
procedimento deverá receber como parâmetro o código do produto
cujas informações serão exibidas, Este procedimento deverá utilizar a
funçào definida no item (c) para procurar o produto no cadastro. Caso
encontre, deve exibir as informações do produto. Caso não encontre,
deve informar ao usuário que o produto nào existe no cadastro,

(g)Procedimento para remover um produto do cadastro. O
procedimento deverá receber como parâmetro o código do produto a ser
removido.

## Observação:

I. Este programa deverá ter, no mínimo, cinco classes: a classe Produto, a
classe BinaryTree, a classe TresNode, a classe e a classe da Aplicação.

1. A classe Produto é a classe de informacào. Os atributos de Produtos
são: código (str_ing), descrição (string), fornecedor (gring), preço
e quantidade em estoque A elasse PIOduto é
3, A classe é genérica e deve conter apenas os métcwdos que
implementam as opemçOes de árvore.
1. Um cadastro de produtos deve ser definido uma árvore binária de
busca de Produtos. Na classe devem ficar os
subprogramas definidos acima nos itens de (a) a (g). Esses
subprogramas devem usar os métodos definidos na classe Pin;uyTxeg
para manipulá-la. A árvore deve ser ordenada por código de produto.
5, A aplicação deverá ter um menu de opções e um loop que possibilite a
manipulação do cadastro de produtos da empresa.
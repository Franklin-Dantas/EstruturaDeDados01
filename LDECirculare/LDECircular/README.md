## Atividade de Estruturas de Dados I
## Listas encadeadas circulares
Maria é professora de quatro turmas em uma escola. Ela necessita automatizar os cadastros com os dados de seus
alunos. Você foi contratado para realizar este trabalho. Implemente um programa para criar, preencher e manipular
os cadastros dos alunos de Maria (um cadastro para cada turma). Os cadastros deverão conter as seguintes
informações sobre os alunos: matrícula, nome, média final e a quantidade de faltas. Para implementar os cadastros,
utilize listas duplamente encadeadas circulares. O programa deverá ter as seguintes funcionalidades:

a) Cadastrar um novo aluno. Recebe como parâmetro o aluno e faz sua inserção no cadastro;
b) Listar cadastro. Exibe a matrícula, o nome, a média final e a quantidade de faltas de todos os alunos
existentes em um dado cadastro.
c) Função consultar aluno que recebe como parâmetro de entrada a matrícula do aluno e retorna como saída
o objeto aluno que possui aquela matrícula. Caso não encontre, a função deverá retornar o endereço nulo
(NULL). Esta função deverá ser utilizada pelos procedimentos de alterar média final e alterar
quantidade de faltas e exibir aluno.
d) Alterar a média final de um aluno. Recebe como parâmetro a matrícula do aluno. Faz uma busca para
verificar se a matrícula dada é válida, ou seja, se está cadastrada. Caso seja uma matrícula válida, solicita
que o usuário informe a nova média e procede com a operação de alteração; caso contrário, informa que a
alteração não pode ser efetuada, pois a matrícula não existe no cadastro;
e) Alterar a quantidade de faltas de um aluno. Recebe como parâmetro a matrícula do aluno. Faz uma busca
para verificar se a matrícula dada é válida, ou seja, se está cadastrada. Caso seja uma matrícula válida,
solicita que o usuário informe a quantidade de faltas e ser acrescida ou retirada (abono de faltas) do aluno
e procede com a operação de alteração; caso contrário, informa que a alteração não pode ser efetuada, pois
a matrícula dada não existe no cadastro;
f) Exibir os dados (média final e quantidade de faltas) de um aluno. Recebe como parâmetro a matrícula do
aluno. Faz uma busca para verificar se a matrícula dada é válida, ou seja, se está cadastrada. Caso seja uma
matrícula válida, procede com a exibição dos dados do aluno; caso contrário, informa que a matrícula dada
não é válida, pois não existe no cadastro;
g) Remover um aluno do cadastro. Recebe como parâmetro a matrícula do aluno a ser removido. Faz uma
busca para verificar se a matrícula dada é válida, ou seja, se está cadastrada. Caso seja uma matrícula
válida, procede com a remoção do aluno; caso contrário,

## OBSERVAÇÕES:
O programa a ser implementado deverá conter, no mínimo, as seguintes classes: a classe Aluno, a classe
LDECircular genérica, a classe LDENode genérica, a classe Cadastro e a classe principal (aplicação Java).
• A classe Aluno terá os seguintes atributos: matrícula, nome, média final e a quantidade de faltas. Esta classe
deverá conter os seguintes métodos: construtor(es), get’s, set’s, toString, compareTo. Para realizar a
comparação de dois objetos da classe Aluno, utilize o atributo matrícula.
• A classe LDENode genérica, conforme modelo implementado em sala.
• A classe LDECircular genérica deve ser ordenada, em ordem crescente, e não deve aceitar valores
repetidos. Esta classe deverá conter, no mínimo, os métodos de inserção ordenada, remoção, busca
sequencial melhorada e exibição.
• A classe Cadastro deverá conter, além do método construtor, os métodos definidos nos itens de (a) e (g)
acima.
• A aplicação deverá criar os cadastros das quatro turmas de Maria. A aplicação terá um loop e um menu a
partir do qual serão executadas as operações com as quatro turmas de Maria, conforme solicitação do
usuário.
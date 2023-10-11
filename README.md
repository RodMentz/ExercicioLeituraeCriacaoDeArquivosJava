# ExercicioLeituraeCriacaoDeArquivosJava
ALGORITMOS E PROGRAMAÇÃO: ESTRUTURAS LINEARES

Para o funcionamento do código:<br/>
Quando perguntando o nome do arquivo de itens da locadora, digite: itens.txt

 **Enunciado do exercício**

**1)** Crie a classe abstrata Item, que possui um nome, um preço e um identificador (inteiro). No construtor de
Item, receba as informações necessárias para inicializar os atributos. Crie os métodos de acesso.

**2)** Crie a classe DVD, que é um tipo de item. Um DVD possui uma descrição e um ano de lançamento. No
construtor de DVD, receba todas as informações necessárias para inicializar os atributos. Crie os métodos de
acesso para os atributos. Sobrescreva o método toString() com as informações do objeto.

**3)** Crie a classe CD, que é um tipo de item. Um CD possui um artista e uma quantidade de músicas. No construtor
de CD, receba todas as informações necessárias para inicializar os atributos. Crie os métodos de acesso para os
atributos. Sobrescreva o método toString() com as informações do objeto.

**4)** Crie uma classe Locadora, que possui um array de Item e um inteiro last referente à última posição ocupada
do array (ou seja, a última posição onde existe um Item). No construtor de Locadora, receba por parâmetro
apenas o nome do arquivo onde as informações dos itens da locadora estão armazenadas, inicialize o valor de
last em -1 (indicando que não há itens no array) e chame o método inicializaItens.

**5)** O método inicializaItens(String filename), na classe Locadora, abre o arquivo filename para leitura. A cada
item lido, este método cria o objeto correspondente e insere-o no array de itens, através do método
adicionaProduto. O arquivo não possui cabeçalho, e possui o seguinte formato:
1 | CD | CD Duplo da banda Calipso | 1.99 | Joelma e Chimbinha | 20
2 | DVD | DVD Ao vivo do Belo | 0.00 | Belo (Ao Vivo) | 1980
Ordem das colunas: ID | CD ou DVD | NOME | PREÇO | DESCRIÇÃO ou ARTISTA | ANO LANÇAMENTO ou QUANTIDADE DE
MÚSICAS
ATENÇÃO: utilize a String “\\|” para separar os campos lidos do arquivo e o método trim() da classe
String para remover os espaços antes e depois da String lida.

**6)** Ainda na classe Locadora, crie um método chamado adicionaProduto(Item a), que recebe um objeto do tipo
Item e insere-o no array (só é possível inserir um item novo caso não exista outro item com o mesmo
identificador e caso haja espaço no array). Cuide a atualização da variável last. Este método lança uma exceção
chamada ImpossibleToAddItemException caso o item recebido por parâmetro não possa ser inserido no array.
Você deve criar a exceção ImpossibleToAddItemException.

**7)** Crie o método chamado removeItem(int id), que remove o objeto do array de itens que possui o identificador
id. Seu método deve “tapar o espaço” que ficar no array quando um elemento for removido. Cuide, também, a
atualização da variável last. Este método lança uma exceção chamada ImpossibleToRemoveItemException caso
o item recebido por parâmetro não possa ser removido no array (ou seja, não exista). Você deve criar a exceção
ImpossibleToRemoveItemException.

**8)** Crie uma classe Principal, que possui o método main. Neste método, crie uma Locadora com o arquivo de
itens indicado pelo usuário. Caso o usuário digite um arquivo inválido, trate a exceção correspondente, de forma
a solicitar novamente o nome do arquivo ao usuário. Inicialize os itens da Locadora passando o nome do arquivo
baixado (itens.txt). Imprima as informações de todos os produtos do array de Item de dentro da Locadora.

**9)** No main, crie um arquivo chamado itensOrdenados.txt, que possui o nome e o preço de todos os itens, um
em cada linha, ordenados do menor ao maior.

**10)** No main, crie um arquivo chamado dvds.txt, que possui apenas as informações dos DVDs da locadora, um
em cada linha.

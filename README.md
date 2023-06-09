# Aula 1 - Sintaxe Java

**JavaBeans:** é uma convenção de escrita de código em Java. É uma especificação que define um conjunto de regras e convenções que devem ser seguidas para criar componentes reutilizáveis em Java. Essas regras incluem, por exemplo, a definição de atributos privados com métodos públicos para acessá-los (getters e setters), além de outras convenções para garantir a interoperabilidade entre diferentes componentes.
Seguir as regras do JavaBeans pode tornar o código mais fácil de entender, manter e reutilizar em diferentes aplicações e plataformas.

[Convenções de Código Java](https://www.devmedia.com.br/convencoes-de-codigo-java/23871)


## Operadores

- **Atribuição:** representado pelo símbolo '='. Atribui um valor para uma variável;
- **Aritméticos:** utilizado para realizar operações aritméticas.
    -  double soma = 10.5 + 15.7;
        - o símbolo '+', quando usado em strings, ele faz a função da concatenação.
    - int subtracao = 113 - 25;
    - int multiplicacao = 25 * 42;
    - int divisão = 15 + 3;
    - int modulo = 18 % 2;
- **Unários:** são operadores aplicados juntamente com outros operadores aritméticos.
    - (+) Operador unário de valor positivo: números são positivos seme sse operador explicitamente;
    - (-) Operador unário de valor negativo: nega um número ou expressão aritmética;
    - (++) Operador unário de incremento: incrementa o valor em 1 unidade;
    - (--) Operador unário de decremento: decrementa o valor em 1 unidade;
    - (!) nega um valor boolean (true or false).
- **Ternário:** forma resumidad para definir uma condição e escolher por um dentre dois valores. É representado pelos símbolos '?' e ':', sendo usados na seguinte estrutura: <expressão condicional> ? <caso condição seja true> : <caso condição seja false>;
- **Relacionais:** são símbolos que são capazes de realizar comparações entre determinados operandos e, em seguida, retornar um resultado.
    - (==) verifica se uma variável é igual a outra;
    - (!=) verifica se uma variável é diferente da outra;
    - (>) verifica se uma variável é maior que a outra;
    - (>=) verifica se uma variável é maior ou igual a outra;
    - (<) verifica se uma variável é menor que a outra;
    - (<=) verifica se uma variável é menor ou igual a outra;
- **Lógicos:**
    - Conjunção: (&&) operador lógico E - operação lógica que só é verdadeira quando ambos os operandos ou expressões envolvidas são verdadeiras.
    - Disjunção: (||) operador lógico OU - operação que só é falsa quando ambos os operandos ou expressões envolvidas são falsos.

## Métodos

Métodos são funções ou sub-rotinas disponíveis dentro das classes.
Devem ser nomeados com verbos no infinitivo e usando o padrão camelCase.


## Escopo

Ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis vai de acordo com o bloco onde ela foi declarada.
Se colocar uma variável dentro de um método, não é possível acessar essa variável em outro método, mas se a variável for declarada no escopo da classe, é possível acessar essa variável em todos os métodos da classe.

## Palavras reservadas

Palavras reservadas são identificadores de uma linguagem que já possuem uma finalidade específica, portanto, não podem ser utilizadas para nomear variáveis, classes, métodos ou atributos. 

A linguagem Java possui 52 palavras reservadas. [Ver aqui](https://www.devmedia.com.br/o-que-significa-cada-palavra-reservada/8320)

## JavaDoc

JavaDoc é uma ferramenta de documentação de código-fonte em Java que gera automaticamente documentação em formato HTML a partir de comentários inseridos no código-fonte. Esses comentários são formatados de acordo com uma convenção específica, que inclui tags para descrever a finalidade de uma classe, método, parâmetro, retorno e outras informações relevantes.

O objetivo do JavaDoc é fornecer documentação clara e concisa para o código-fonte Java, permitindo que outros desenvolvedores possam entender facilmente como usar e modificar o código. A documentação gerada pelo JavaDoc pode ser acessada em um navegador web ou integrada a ferramentas de desenvolvimento, como IDEs, para facilitar a compreensão do código e o processo de desenvolvimento em equipe.

[JavaDoc](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html)

---

# Aula 2 - Controle de Fluxo

São estruturas que tem a capacidade de direcionar o fluxo de execução do código.
Os tipos de controle de fluxos são:

- **Decisão:** if, if-else, if-else-if, switch e operador ternário;
- **Repetição:** for, while e do-while;
- **Interrupção:** break, continue e return.

## Decisão
Estrutura que avalia uma condição booleana ou variável para direcionar o fluxo de execução.

**IF**
```sh
if (condição){
}
```

```sh
if (condição){
}else{
}
```

```sh
if (condição){
}else if (condição 2){
}else{
}
```

**Operador ternário**

```sh
condição ? true : false;
```

```sh
condição ? true : null; //o null é para quando o resultado for false não é para fazer nada.
```
- (?) se
- (:) então

**Switch**

```sh
switch (variavel){
    case1 :
    break;
    case2 :
    break;
    case ... :
    break;
    default :
    break;
}
```

### Boas práticas

- Switch é para valores exatos e if para expressões booleanas;
- Evitar usar default do switch para cases genéricos;
- Evitar o efeito "flecha" do if;
- Evitar muitos if's aninhados.


## Blocos

Grupo de 0 ou mais códigos os quais trabalham em conjunto para executar uma operação.
Tipos:
- Locais: dentro de métodos;
- Estáticos: dentro de classes;
- Instância: dentro de classes.

---

# Aula 3- Estruturas de Repetição e Arrays

- O real poder dos computadores está na sua habilidade para repetir uma operação ou uma série de operações várias vezes.
- Cada repetição é chamada de laço (loop) é um dos conceitos básicos da programação estruturada.
- Uma estrutura de repetição permite que uma sequência de comandos seja executada repetidamente, caso determinadascondições sejam satisfeitas.
- Essas condições são representadas por expressões lógicas.
- As estruturas de repetição podem ser classificadas em:
    - Repetição com teste no início (while);
    - Repetição com teste no final (do-while);
    - Repetição contada (for).
- O comando break é utilizado para terminar de forma abrupta uma repetiçã.
- Quando o comando continue é executado, os comandos restantes da repetição são ignorados e o programa volta a testar novamente ou não.

### While
Executa um bloco de código enquanto uma condição for verdadeira.

### Do While
Executa um bloco de código pelo menos uma vez e depois continua a executá-lo enquanto uma condição for verdadeira.

### For
Permite executar um bloco de código um número específico de vezes, controlando o contador da iteração através de uma variável.

## Operadores de Incremento e Decremento

### Pré-fixados
Incrementam ou decrementam o valor da variável antes de serem utilizados em uma expressão.
- (++numero): numero = numero + 1; retorna o numero.
- (--numero): numero = numero - 1; retorna o numero.

### Pós-fixados
Primeiro utilizam o valor atual da variável na expressão e depois incrementam ou decrementam o valor da variável.
- (numero++): retorna o numero; numero = numero + 1.
- (numero--): retorna o numero; numero = numero - 1.

## Operações aritméticas
```sh
numero += k; //numero = numero + k;
```
```sh
numero -= k; //numero = numero - k;
```
```sh
numero *= k; //numero = numero * k;
```
```sh
numero /= k; //numero = numero / k;
```

## Arrays
Array é um objeto utilizado para armazenar sequencialmente dados do mesmo tipo. Ou seja, você guarda vários dados do mesmo tipo em uma única variável.
- Permanecem com o mesmo tamanho depois de criados;
- Sempre começam com zero;
- Array Unidimensional: apenas uma estrutura de armazenamento. c [0] = 25 --- o número 25 está armazenado na posição 0 do array c.
- Array Multidimensional: armazena mais de uma estrutura. a [0][0] = 32 --- o número 32 está armazenado na linha 0, coluna 0 do array a.

---

## _LINKS ÚTEIS_

Fonte: [GitHub Camila Cavalcante](https://github.com/cami-la/loops-e-arrays) :heart_eyes:

Exercícios: [Estrutura de Repetição](https://wiki.python.org.br/EstruturaDeRepeticao), [Arrays Unidimensionais](https://wiki.python.org.br/ExerciciosListas), [Arrays Multidimensionais](https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-20?from_action=save) 

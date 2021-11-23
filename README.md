# JogoDaForca-Console
O repositório guarda uma espécie de **simulador de Console**, que também pode ser conhecido como
cmd, Shell, prompt de comando, enfim, essa é a ideia.
Ao console, podem ser executados diversos programas, em separadas classes, facilitando a
criação e a integração de novos programas. É um projetinho de estudo, e com certeza me
diverti bastante fazendo ele.

###Recursos utilizados
Foram utilizadas listas; enumeradores (enum); programação orientada a objetos; tratamento de String;
organização por *packages*; alguma recursão; leitura de entrada com a classe Java.util.Scanner.

## Principais classes
* **Console.java**: é a classe que é executada primeimeiramente, uma classe *main*. Pode ser instanciada por um comando nela mesma,
por mais que isso não tenha grande utilidade, mas imita o comando `cmd` do próprio console do Windows, que só mostra uma mensagem de copyright;
* **ProgramasEnum.java**: enum que registra todos os programas existentes a serem integrados *(automaticamente!)* ao Console;
* **Forca.java**: um Jogo da Forca simples em TUI, que inclusive dá o nome ao repositório;
* **Batata.java**: easter-egg;
* **JogoDaVelha.java**: um jogo da velha simples ***[incompleto]***;
* **TratamentoString.java**: utilitário que realiza todas as operações necessárias para manusear listas,
Strings, caracteres e afins, muito utilizado pelo Forca.java.

## Instruções de execução:
### Para executar pelo prompt de comando _(cmd.exe)_:
1. Caso não ocorram problemas com a compilação que já vem pronta:
   1. navegue com o comando `cd` até o diretório `\src` do repositório;
   2. execute o comando `java Console`;
   3. deverá ter aparecido um prefixo `@root: ` dentro do seu console. Isto significa que o código está executando corretamente.
2. Caso precise compilar novamente:
   1. certifique-se que o seu compilador `javac.exe` (vem junto com a instalação da JDK) está sendo corretamente
reconhecido pelo cmd, ou seja, que está registrado no path.
      1. para conferir, execute `echo %path%`, deverá ser impresso algum texto escrito C:/program files/Java/jdk.suaversao/bin/.
      2. caso não, consegui ajuda neste fórum: [javac not working in windows command prompt (em inglês)](https://stackoverflow.com/questions/1678520/javac-not-working-in-windows-command-prompt)
   2. navegue até a pasta `\src` do repositório;
   3. execute `javac Console.java` e tudo deve ter dado certo, execute o passo 1 novamente.
### Para executar por sua IDE *(IntelliJ, Eclipse, etc.)*:
   1. Considerando que o repositório __já está clonado e reconhecido__ por sua IDE como projeto,
abra a classe Console.java;
   2. Execute o método (comando) `public static void main(String[] args) {` por algum botão de 'play' da sua IDE.
### Como utilizar este programa:
   Por enquanto, são 4 os comandos que você pode realizar: `console`, `forca`, `batata` e `jogodavelha`.

Ao aparecer `@root:` no seu console, digite algum dos comandos para executar tal programa.
* `forca` : Digite a palavra `forca` no console principal, insira a palavra a ser descoberta, pressione ENTER e vá
escrevendo letra por letra para tentar descobrir a palavra.

## Como criar novos programas e funcionalidades para este console
Poucas coisas precisam ser modificadas para integrar novos programas.
1. Na pasta `\src` crie a sua classe do programa que quiser codificar;
2. No seu programa novo, é **obrigatório** implementar a Interface "Executavel.java", faça isso.
3. No construtor, insira o prefixo de chamada do programa e uma descrição com o método super.
4. Toda a execução "factual" do seu programa deverá estar dentro do método implementado `void executar() { }`, de preferência dentro de um loop.
5. Abra a classe ProgramasEnum.java e insira o prefixo que deve ser escrito pelo usuário no console para executar seu programa:
   (Ex: Para um programa de 'Calculadora.java' o prefixo é -> `calc`);
6. Não esqueça de instanciar um novo objeto de sua classe. (Ex: para a calculadora, insira a linha `calc(new Calculadora());`)
   
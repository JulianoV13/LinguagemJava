# Estudo html
## O que é html?
    - É uma linguagem de marcas, em que seu código não é compilado, pelo contrario
    ele é interpretado e renderizado por meio de um motor web que faz a exibição dos 
    elementos html em formato gráfico.
        - Renderizar: pegar o código e transformar em elemento gráfico;
        - Motor Web: é uma ferramenta do navegador responsável por "ler" o código html, 
        realizar a "comparação e/ou busca" na biblioteca de comando do navegador e realiza 
        o processo de renderização.

## A Sigla html
    - HT -> hypertext (hiper texto);
    - M -> markup (marcas | marcação);
    - L -> language (linguagem);
    - Comandos para serem processados no formato de mídia.

## Como usar o html
    - Para usar os comando html é necessário escreve-lo usando tags(palavras-chave);
        - Tags(comandos|palavra-chave) podem ser compostas(casadas) ou simples(solteiras)
            - Tag Composta: é o comando que inicia e precisa ser finalizado para determinar 
            sua abrangencia de execução. Por exemplo: <body>...</body> | <strong>...</strong>;
            -  Tag Simples: são comandos que não precisam ser finalizados, apenas aplica-se.
            Exemplo: <br>...<img>...<meta>...<link>... 

## As tags html podem ter atributos
    - Atribitos são qualificadores para uma tag html. Eles podem adicionar recursos a mais para 
    a tag. Exemplo: <img src="foto.jpg" alt"foto">. No exemplo anterior a tag chama-se img os atributos são:
        - src (source = origem) determina a imagem que será exibida. Aqui, você deve passar o caminho 
        da imagem;
        - alt (alternate = alternativo) determina um texto que será exibido quando a imagem não carrega 
        e é utilizado pelo leitor de tela(screen reader) para deficientes visuais.
    Outro exemplo: <form action="cadastro.php" method="post"> ...</form>
        a tag form é composta e também pode ter atributos. Quando for finalizar a tag composta não será 
        necessário colocar os atributos no fechamento. Você deve fechar somente a tag
        No exemplo acima temos:
            Tag form -> criar o escopo do formulário;
            atributo action -> indica caminho para onde os dados do formulário irão;
            atributo method -> indica o método como os dados serrão enviados

## Estrutura básica de uma página html

```
    <html>
        <head>
        <meta charser=utf8>
        <title> Primeira Página </title>
        </head>
        <body>
            <h1> Primeira Página </h1>
        </body>
    </html>
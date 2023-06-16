/*
    A função a baixo é chamanda por um evento que está na página index.html.
    O evennto foi adiciona a um botão com o comando onclick, ou seja, quando 
    o usuário clicar no botão será chamanda a função mensagem  
 */
    function mensagem(){
        var nome = prompt("Digite seu nome:");
        document.getElementsByTagName("p")[0].innerHTML=nome;
    }
    
    /*
    Quando a página for carregada, ela irá chamar a função
    apagarDisplay, pois a função apaga a tela e a adicionar o valor 0(zero)
    
    O evento utilizando será onload(quando carregar a página) aplicado no body(document.body)
    */
    
    const body = document.body;
    body.onload = apagarDisplay;    
    
    
    const diplay = document.getElementsByTagName("input")[0];
    let valor1 = 0, resultado = 0, operador = "";
    
    function apagarDisplay(){
        diplay.value="0";
    }
    
    function adiciona1(){
        if(diplay.value=="0"){
            diplay.value="1";
        }
        else{
            diplay.value+="1";
        }
    }
    
    function adiciona2(){
        if(diplay.value=="0"){
            diplay.value="2";
        }
        else{
            diplay.value+="2";
        }
    }
    
    function adiciona3(){
        if(diplay.value=="0"){
            diplay.value="3";
        }
        else{
            diplay.value+="3";
        }
    }
    
    function adiciona4(){
        if(diplay.value=="0"){
            diplay.value="4";
        }
        else{
            diplay.value+="4";
        }
    }
    
    function adiciona5(){
        if(diplay.value=="0"){
            diplay.value="5";
        }
        else{
            diplay.value+="5";
        }
    }
    
    function adiciona6(){
        if(diplay.value=="0"){
            diplay.value="6";
        }
        else{
            diplay.value+="6";
        }
    }
    
    function adiciona7(){
        if(diplay.value=="0"){
            diplay.value="7";
        }
        else{
            diplay.value+="7";
        }
    }
    
    function adiciona8(){
        if(diplay.value=="0"){
            diplay.value="8";
        }
        else{
            diplay.value+="8";
        }
    }
    
    function adiciona9(){
        if(diplay.value=="0"){
            diplay.value="9";
        }
        else{
            diplay.value+="9";
        }
    }
    
    function adiciona0(){
        if(diplay.value=="0"){
            diplay.value="0";
        }
        else{
            diplay.value+="0";
        }
    }
    
    function adicionaPonto(){
        /*
        Para o botão ponto estamos verificando se o ponto já foi adicionado.
        Caso isto tenha acontecindo, o ponto não será mais acrescido. Mas 
        se o ponto não foi adicionado, então será acrescentado o display.
        Para verificar a existência do ponto utilizamos o comando indexOf, que
        tenta localizar o ponto no display. Quando o indexOF retorna -1 é porque
        não foi localizado e,assim nós adicionamos o ponto.
        */
        if(diplay.value.indexOf(".")==-1){
            diplay.value+=".";
        }
    }
    
    function adicionaVirgula(){
        if(diplay.value.indexOf(",")==-1){
            diplay.value+=",";
        }
    }
    
    function soma(){
        valor1 = parseFloat(diplay.value);
        operador = "+";
        apagarDisplay();
    }
    
    function subtrair(){
        valor1 = parseFloat(diplay.value);
        operador = "-";
        apagarDisplay();
    }
    
    function mutiplicacao(){
        valor1 = parseFloat(diplay.value);
        operador = "x";
        apagarDisplay();
    }
    
    function dividir(){
        valor1 = parseFloat(diplay.value);
        operador = "÷";
        apagarDisplay();
    }
    
    function raiz(){
        valor1 = parseFloat(diplay.value);
        operador = "√";
        resultado = Math.sqrt(diplay.value);
        diplay.value = resultado;
    }
    
    function porcentagem(){
        valor1 = parseFloat(diplay.value);
        operador = "%";
        resultado = (valor1*parseFloat(diplay.value)/100);          
        diplay.value = resultado;
    }
    
    function igual(){
        if(operador=="+"){
            resultado = valor1+parseFloat(diplay.value);
            diplay.value = resultado;
        }
        else if(operador=="-"){
            resultado = valor1+-parseFloat(diplay.value);
            diplay.value = resultado;
        }
        else if(operador=="x"){
            resultado = valor1*parseFloat(diplay.value);
            diplay.value = resultado;
        }
        else if(operador=="÷"){
            resultado = valor1/parseFloat(diplay.value);
            diplay.value = resultado;
        }
        else{
            console.log("Error");
        }
    }
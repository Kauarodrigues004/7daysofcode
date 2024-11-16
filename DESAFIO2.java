<form >

    <h1 >Sistema de Cadastro</h1>
    
    <label  for="nome">Nome:</label>
    <input type="text" id="nome" pattern="[A-Za-z]+" placeholder="Digite seu nome" oninput="this.value = this.value.replace(/[^A-Za-z]/g, '')"  required>
    <br>

    <label  for="idade">Idade:</label>
    <input type="number" id="idade"  placeholder="Digite sua idade">
    <br>

    <label  for="linguagem">Linguagem:</label>
    <input type="text" id="linguagem" pattern="[A-Za-z]+" placeholder="Digite a linguagem que está aprendendo" oninput="this.value = this.value.replace(/[^A-Za-z]/g, '')" required>
    <br>

  <div class="BotaoSelecionar">
    <label for="opcao">Você gosta de estudar programação?</label>
    <input type="radio" id="sim" name="opcao" value="sim">
    <label for="sim">sim</label>

    <input type="radio" id="nao" name="opcao" value="nao">
    <label for="nao">nao</label>
  </div> 
    <input type="button" value="Enviar" onclick="LerMensagem()">

  
</form>

<script>
    function LerMensagem(){
        let nome = document.getElementById('nome').value;
        let idade = document.getElementById('idade').value;
        let linguagem = document.getElementById('linguagem').value;
        let escolha = document.querySelector('input[name="opcao"]:checked');

        let mensagem = 'Olá ' + nome + ', você tem ' + idade + ' anos e já está aprendendo ' + linguagem + '! ' ;

        if (nome === '' || idade === '' || linguagem === '' || !escolha){
          alert('Preencha todos os dados pedidos')
        }
        else{
          let mensagem = 'Olá ' + nome + ', você tem ' + idade + ' anos e já está aprendendo ' + linguagem + '! \n';
            
            if (escolha.value === 'sim')
              mensagem += 'Que legal você gosta de estudar programação!';
            else if (escolha.value === 'nao')
              mensagem += 'Nossa não esperava essa resposta ';

              alert(mensagem);
        }
        
     }
</script>
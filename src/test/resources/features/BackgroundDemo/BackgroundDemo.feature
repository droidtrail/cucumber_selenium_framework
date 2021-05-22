# language:pt
# encoding UTF-8

  Funcionalidade: Verificar funcionalidade da página principal

    Contexto: usuário logado no sistema
      Dado usuário está na página de autenticação
      Quando o usuário digita o usuário e a senha
      E clica no botão de login
      Então o usuário navega até a página principal

    Cenário: Validar o link de logout
      Quando usuário clicar no link welcome
      Então o link de logout deve estar visível

    Cenário: Verificar quick launch toolbar está presente
      Quando usuário clicar no dashboard link
      Então quick launch toolbar deve estar visível
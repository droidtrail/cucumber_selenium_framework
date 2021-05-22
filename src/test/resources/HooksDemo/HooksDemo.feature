# language:pt
# encoding UTF-8

  Funcionalidade: Validar funcionalidade de autenticação

    @smoke
    Cenário:
      Dado o usuário está na página de login
      Quando o usuário preencher o username e a senha
      E o usuário clica em login
      Então o usário é redirecionado para a home page

    Cenário:
      Dado o usuário está na página de login
      Quando o usuário preencher o username e a senha
      E o usuário clica em login
      Então o usário é redirecionado para a home page
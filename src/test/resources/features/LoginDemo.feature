# language:pt
# encoding UTF-8

  Funcionalidade: Teste de login
   Esquema do Cenário: Testar o login feito com sucesso
      Dado navegador está aberto
      E o usuário está na página de login
      Quando o usuário preencher o <username> e a <senha>
      E o usuário clica em login
      Então o usário é redirecionado para a home page
     Exemplos:
       | username | senha |
       | teste1   | 12345 |
       | teste2   | 12345 |
       | teste3   | 12345 |
       | teste4   | 12345 |
       | teste5   | 12345 |
       | teste6   | 12345 |
       | teste7   | 12345 |
       | teste8   | 12345 |


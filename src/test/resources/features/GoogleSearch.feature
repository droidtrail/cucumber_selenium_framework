# language:pt
# encoding UTF-8


Funcionalidade: Página de busca do Google

  Cenário: Validar página principal do Google
    Dado browser está aberto
    E o usuário está na página de busca do Google
    Quando o usuário digita o texto da busca
    E clica em Enter
    Então o usuário visualiza o resultado da busca



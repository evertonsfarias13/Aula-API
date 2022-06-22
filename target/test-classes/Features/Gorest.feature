#language: pt
  #Author: Everton de Farias
  #Version: 1.0
  #Enconding: UTF-8

@Gorest
Funcionalidade: Criar e editar contas de usuários
  Eu como administrador do sistema, quero cadastrar e editar usuários do sistema.

  Cenario: Cadastrar novo usuário API Gorest
    Dado  que possuo gorest token
    Quando envio um request de castro de usuário com dados validos
    Entao o usuário deve ser criado corretamente
    E o status code do request deve ser 200



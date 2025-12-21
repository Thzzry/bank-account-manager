# 🏦 Bank Account Management – Java (POO)

Este projeto é um exercício prático desenvolvido em **Java**, com foco em **Programação Orientada a Objetos (POO)**, simulando o gerenciamento básico de uma conta bancária por meio do console.

O objetivo principal é reforçar conceitos fundamentais utilizados no desenvolvimento de aplicações **back-end**, indo além de apenas fazer o código funcionar, mas pensando em **organização, domínio do problema e manutenção futura**.

---

## 📌 Funcionalidades

- Criação de conta bancária com:
  - Número da conta
  - Nome do titular
  - Depósito inicial opcional
- Realização de depósitos
- Realização de saques com taxa fixa
- Exibição dos dados da conta após cada operação

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento de dados
- Uso de construtores
- Separação de responsabilidades entre classes
- Implementação de regras de negócio
- Sobrescrita do método `toString()` com `@Override`
- Entrada de dados via `Scanner`
- Formatação de valores monetários

---

## 🏗️ Estrutura do Projeto

📦 src
┣ 📂 application
┃ ┗ 📜 Program.java
┣ 📂 entities
┃ ┗ 📜 Account.java



- `Program.java`: responsável pela interação com o usuário e fluxo do programa  
- `Account.java`: representa a entidade conta bancária e suas regras de negócio

---

## ▶️ Exemplo de Execução


<table>
  <tr>
    <td>
      <strong>Código Java</strong>
      <pre>
Account account = new Account(2039, "André", 500.35);
account.deposit(200);
account.withdraw(300);
System.out.println(account);
      </pre>
    </td>
    <td>
      <strong>Saída no Console</strong><br>
      <img src="https://github.com/Thzzry/bank-account-manager/blob/master/images/console.png?raw=true" width="400">
    </td>
  </tr>
</table>

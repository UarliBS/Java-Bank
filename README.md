# 💰 Java Bank

### 🧩 Descrição do Desafio
Este projeto foi desenvolvido como parte de um laboratório prático com o objetivo de **consolidar conceitos fundamentais da Programação Orientada a Objetos (POO)** — como **herança**, **encapsulamento**, **polimorfismo**, **abstração** e **reuso de código**.

A aplicação simula um **sistema bancário básico**, permitindo:

- Criação de contas bancárias;  
- Depósitos, saques e transferências via **PIX**;  
- Criação e gestão de **investimentos**;  
- Acompanhamento de **histórico de transações**;  
- Simulação de rendimentos e atualização de investimentos.

---

### 🏗️ Estrutura do Projeto

#### **Pacote `br.com.dio.model`**
Contém as classes e entidades principais do sistema:
- `Wallet` — classe abstrata que representa uma carteira genérica.
- `AccountWallet` — carteira bancária de conta corrente, com suporte a chaves PIX.
- `InvestmentWallet` — carteira de investimentos associada a uma conta.
- `Investment` — record que representa os dados de um investimento.
- `Money` e `MoneyAudit` — controlam o histórico e auditoria das transações.
- `BankService` — enum para distinguir serviços (CONTA e INVESTIMENTO).

#### **Pacote `br.com.dio.repository`**
- `CommonsRepository` — contém métodos utilitários de verificação e geração de transações (ex: verificação de saldo, geração de histórico de dinheiro).

#### **Pacote `br.com.dio.exception`**
- `NoFundsEnoughException` — exceção personalizada lançada quando o saldo é insuficiente.

---

### ⚙️ Funcionalidades Principais

- ✅ Criar conta bancária com saldo inicial e chaves PIX;  
- 💸 Realizar depósitos, saques e transferências entre contas;  
- 📈 Criar e atualizar investimentos a partir de uma conta;  
- 🔁 Controlar movimentações com histórico detalhado;  
- 📜 Listar contas, investimentos e carteiras de investimento;  
- ⚠️ Tratamento de erros e exceções (ex: saldo insuficiente ou PIX inválido).

---

### 💡 Tecnologias e Conceitos Utilizados

- **Java 17+**
- **Lombok** — para redução de boilerplate (getters, constructors, etc.)
- **POO Avançada:** abstração, polimorfismo, herança e composição  
- **Records e Enums** — para imutabilidade e legibilidade  
- **Streams API** — para manipulação de listas e coleções  
- **Tratamento de exceções personalizado**

---

### 🧮 Exemplo de Execução

```

Olá, seja bem-vindo ao DIO Bank!
Selecione a operação desejada:

1 - Criar uma Conta Bancária
2 - Criar um Investimento
3 - Criar Carteira de Investimentos
4 - Depositar na Conta
5 - Sacar da Conta
6 - Transferência entre Contas
7 - Investir
8 - Sacar Investimentos
9 - Listar Contas
10 - Listar Investimentos
11 - Listar Carteiras de Investimento
12 - Atualizar Investimentos
13 - Histórico de Conta
14 - Sair

````

---

### 🧠 Aprendizados

Durante o desenvolvimento, foram reforçados conceitos como:
- Estruturação de código limpo e orientado a objetos;  
- Controle de fluxo de transações via composição de classes;  
- Boas práticas de encapsulamento e coesão;  
- Utilização de ferramentas modernas do ecossistema Java (Lombok, Records, Streams);  
- Versionamento e documentação técnica com Git e GitHub.

---

# Sistema de Gestão de Colaboradores

Projeto desenvolvido em Java com o objetivo de demonstrar os principais conceitos de Programação Orientada a Objetos (POO), incluindo:

- Herança
- Polimorfismo
- Encapsulamento
- Sobrescrita de métodos (Override)
- Coleções (ArrayList)
- Validação de entrada de dados
- Geração de folha de pagamento

## Estrutura do Projeto

```
.
├── Principal.java
├── colaborador.java
├── ColaboradorPadrao.java
├── ColaboradorComissionado.java
└── ColaboradorProducao.java
```

## Classes

### colaborador

Classe base do sistema.

#### Atributos

- matricula
- nome
- salarioBase

#### Métodos

- calcularSalarioFinal()
- exibirDados()
- getMatricula()
- getNome()

Todas as demais classes herdam desta classe. 【1-60a664】

---

### ColaboradorPadrao

Representa um colaborador sem benefícios adicionais.

#### Regra salarial

```
Salário Final = Salário Base
```

【2-d10952】

---

### ColaboradorComissionado

Representa colaboradores que recebem comissão sobre vendas.

#### Atributos adicionais

- valorVendas
- percentualComissao

#### Regra salarial

```
Comissão = valorVendas × percentualComissao / 100

Salário Final = Salário Base + Comissão
```

【3-e5593f】

---

### ColaboradorProducao

Representa colaboradores remunerados por produtividade.

#### Atributos adicionais

- quantidadePecas
- valorPorPeca

#### Regra salarial

```
Produtividade = quantidadePecas × valorPorPeca

Salário Final = Salário Base + Produtividade
```

【4-94253f】

---

### Principal

Classe responsável pela execução do programa e interação com o usuário através de um menu no terminal. 【5-973748】

#### Funcionalidades

- Cadastro de Colaborador Padrão
- Cadastro de Colaborador Comissionado
- Cadastro de Colaborador de Produção
- Geração da folha de pagamento
- Exibição do resumo da folha
- Listagem de colaboradores cadastrados
- Controle por menu interativo

【5-973748】

---

## Menu do Sistema

```text
1 - Cadastrar Colaborador Padrao
2 - Cadastrar Colaborador Comissionado
3 - Cadastrar Colaborador Producao
4 - Gerar folha de pagamento
5 - Exibir resumo da folha de pagamento
6 - Lista cadastro
0 - Sair
```

【5-973748】

---

## Diagrama Simplificado

```text
                    colaborador
                         │
        ┌────────────────┼────────────────┐
        │                │                │
        ▼                ▼                ▼

ColaboradorPadrao  ColaboradorComissionado  ColaboradorProducao
                         │                        │
                         │                        │
                  valorVendas            quantidadePecas
                  percentualComissao     valorPorPeca
```

---

## Exemplo de Utilização

### Cadastro de colaborador padrão

```java
new ColaboradorPadrao(
    1,
    "João",
    3000.00
);
```

### Cadastro de colaborador comissionado

```java
new ColaboradorComissionado(
    2,
    "Maria",
    2500.00,
    10000.00,
    5.0
);
```

### Cadastro de colaborador de produção

```java
new ColaboradorProducao(
    3,
    "Carlos",
    2200.00,
    500,
    2.50
);
```

---

## Compilação

```bash
javac *.java
```

## Execução

```bash
java Principal
```

---

## Conceitos Aplicados

✔ Classes e Objetos

✔ Herança

✔ Polimorfismo

✔ Sobrescrita de Métodos

✔ Encapsulamento

✔ ArrayList

✔ Entrada de Dados com Scanner

✔ Estruturas de Repetição

✔ Estruturas de Decisão

✔ Validação de Dados

---

## Objetivo Acadêmico

Este projeto foi desenvolvido para praticar conceitos.

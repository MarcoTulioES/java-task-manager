# Java Task Manager

Aplicação desenvolvida em Java para gerenciamento simples de tarefas através de um sistema de menu no terminal.  
O projeto foi criado com o objetivo de praticar conceitos fundamentais de **Programação Orientada a Objetos (POO)**, estruturação de código e manipulação de coleções em Java.

---

## Funcionalidades

- Adicionar novas tarefas
- Listar todas as tarefas cadastradas
- Marcar tarefas como concluídas
- Interface interativa via terminal

---

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Estrutura de dados `ArrayList`
- Interface de terminal (CLI)

---

## Estrutura do Projeto

```
java-task-manager
│
├── Main.java
├── Task.java
├── TaskManager.java
└── README.md
```

---

## Descrição dos Arquivos

**Main.java**

Classe principal responsável pela execução do programa e interação com o usuário através do menu.

**Task.java**

Classe que representa o modelo de uma tarefa, contendo atributos como:

- id
- descrição
- status de conclusão

**TaskManager.java**

Classe responsável pelo gerenciamento das tarefas, contendo métodos para:

- adicionar tarefas
- listar tarefas
- concluir tarefas

---

## Como Executar o Projeto

### 1. Clonar o repositório

```
git clone https://github.com/MarcoTulioES/java-task-manager.git
```

### 2. Entrar na pasta do projeto

```
cd java-task-manager
```

### 3. Compilar o programa

```
javac *.java
```

### 4. Executar a aplicação

```
java Main
```

---

## Exemplo de Execução

```
GERENCIADOR DE TAREFAS

1 - Adicionar tarefa
2 - Listar tarefas
3 - Concluir tarefa
0 - Sair

Escolha:
```

---

## Objetivo do Projeto

Este projeto foi desenvolvido com o objetivo de praticar:

- Programação Orientada a Objetos
- Estruturação de aplicações em Java
- Manipulação de listas com `ArrayList`
- Criação de sistemas simples baseados em menu

---

## Possíveis Melhorias Futuras

- Remover tarefas
- Editar tarefas
- Persistência de dados em arquivos
- Interface gráfica
- Organização em pacotes

---

## Autor

**Marco Túlio Sales de Deus**

Estudante de Engenharia de Software – PUC Minas  

GitHub:  
https://github.com/MarcoTulioES

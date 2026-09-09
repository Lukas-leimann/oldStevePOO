[README.md — Old Steve.md](https://github.com/user-attachments/files/32026318/README.md.Old.Steve.md)
#     Old Steve — Sistema de Mineração em Java

Projeto desenvolvido para praticar os fundamentos de **Programação Orientada a Objetos (POO)** em Java.

## Sobre o projeto

O projeto simula um sistema simples de mineração no qual o Old Steve utiliza diferentes tipos de picaretas para quebrar blocos com diferentes níveis de dureza.

Cada **Picareta** possui características próprias, como:

- Material
- Durabilidade
- Força
- Velocidade de mineração

Cada **Bloco** possui:

- Nome
- Dureza

A picareta verifica se possui força suficiente para quebrar determinado bloco. Caso consiga, a mineração é realizada e sua durabilidade é reduzida.

## Objetivos da atividade

O principal objetivo é aplicar conceitos básicos de **Programação Orientada a Objetos**, substituindo uma abordagem procedural por uma estrutura baseada em objetos.

Durante o desenvolvimento são praticados:

- Criação de classes
- Criação de objetos
- Atributos
- Métodos
- Construtores
- Encapsulamento
- Uso de `private`
- Uso de métodos `get`
- Interação entre objetos

## Estrutura do projeto

```text
OldSteve/
│
├── src/
│   ├── OldSteve.java
│   ├── Picareta.java
│   └── Bloco.java
│
└── README.md
```

### `OldSteve.java`

Arquivo principal do projeto. É responsável por criar os objetos e executar os testes da aplicação.

### `Picareta.java`

Representa uma picareta e contém seus atributos e comportamentos, como:

- Verificar se consegue quebrar um bloco
- Minerar
- Reparar
- Exibir informações

### `Bloco.java`

Representa um bloco e contém suas características:

- Nome
- Dureza

## Funcionamento

A lógica principal da mineração funciona comparando a **força da picareta** com a **dureza do bloco**.

```text
Força da picareta >= Dureza do bloco
                ↓
              Pode quebrar
```

Caso contrário:

```text
Força da picareta < Dureza do bloco
                ↓
          Não pode quebrar
```

A velocidade também é utilizada para representar o tempo necessário para realizar a mineração.

De forma simplificada:

```text
Tempo de mineração = Dureza do bloco / Velocidade da picareta
```

## Exemplo

Uma picareta de ferro pode ser criada da seguinte forma:

```java
Picareta ferro = new Picareta(
    "Ferro",
    250,
    3,
    6.0
);
```

E um bloco:

```java
Bloco pedra = new Bloco(
    "Pedra",
    5
);
```

A picareta pode então tentar minerá-lo:

```java
ferro.minerar(pedra);
```

## Encapsulamento

Os atributos das classes são declarados como `private`, impedindo que sejam alterados diretamente por outras partes do programa.

Exemplo:

```java
private int durabilidade;
private int forca;
```

O acesso aos dados é feito por métodos da própria classe, mantendo o controle sobre o estado dos objetos.

## Conceitos de POO aplicados

### Classe

Define a estrutura e os comportamentos de um objeto.

```java
class Picareta
class Bloco
```

### Objeto

É uma instância de uma classe.

```java
Picareta ferro = new Picareta(...);
Bloco pedra = new Bloco(...);
```

### Encapsulamento

Protege os atributos internos dos objetos utilizando `private` e métodos de acesso.

### Construtor

É utilizado para definir o estado inicial de cada objeto no momento de sua criação.

##  Tecnologias utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub

##  Como executar

1. Clone este repositório.
2. Abra o projeto no IntelliJ IDEA.
3. Localize o arquivo `OldStevePOO.java`.
4. Execute o método `main`.
5. Observe no console as tentativas de mineração e o estado da picareta.

##  Aprendizado

Este projeto faz parte de um estudo inicial de Programação Orientada a Objetos e tem como foco compreender como transformar um problema descrito por dados e funções em um modelo composto por **objetos que possuem estado e comportamento**.

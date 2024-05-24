# Personagem Java

Este projeto Java define uma classe `Personagem` que pode ser usada para criar e manipular personagens em um jogo ou simulação. A classe permite definir atributos como nome, nível e força do personagem, e inclui métodos para exibir o status do personagem, calcular o dano e simular ataques.

## Funcionalidades

- **Definição de Personagem**: Crie um personagem com nome, nível e força.
- **Mostrar Status**: Exiba o status atual do personagem.
- **Calcular Dano**: Calcule o dano baseado na força e em um dado de 20 faces.
- **Atacar**: Simule um ataque a um alvo com ou sem uma habilidade específica.

## Estrutura do Código

O código consiste em uma única classe `Personagem` e um método `main` para testar a classe.

### Classe `Personagem`

#### Atributos

- `private String nome` — O nome do personagem.
- `private int nivel` — O nível do personagem.
- `private int forca` — A força do personagem.
- `private Random gerador` — Um gerador de números aleatórios para calcular o dano.

#### Construtor

```java
public Personagem(String nome, int nivel, int forca)

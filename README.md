# 🔢 API de Cálculo de Operações Matemáticas

Este projeto é uma API REST desenvolvida com Spring Boot que realiza operações matemáticas básicas de forma simples.

O projeto foi desenvolvido para o **Teste de Performance 1** da disciplina de **Desenvolvimento de Serviços com Spring Boot**.

A API disponibiliza 5 operações matemáticas:

- Soma
- Subtração
- Multiplicação
- Divisão
- Exponenciação

---

## 🗂️ Arquitetura do projeto

O projeto está organizado em camadas:

- **Controller** → Responsável pelas requisições HTTP
- **Service** → Contém a lógica das operações matemáticas
- **DTO** → Transporta dados entre camadas
- **Model** → Estrutura dos dados da aplicação

---

## 🚀 Como configurar e executar o projeto

### Pré-requisitos

- Java 21+
- Maven

### Passos para execução

1. **Clone o repositório**

   ```bash
   git clone https://github.com/LeticiaFAAGomes/TP1-Servicos-com-Spring-Boot.git
   ```

2. **Execute a classe principal na IDE de seu preferência**:

3. **Acesse a API de acordo com os endpoints**:

---

## 📍 Endpoints

### Somar

| Método | Tipo | URL                                          |
| ------ | ---- | -------------------------------------------- |
| Somar  | GET  | http://localhost:8080/op/somar?op1=10&op2=10 |

| Método | Tipo | URL                            |
| ------ | ---- | ------------------------------ |
| Somar  | POST | http://localhost:8080/op/somar |

**Exemplo de JSON**:

```json
   {
        "op1": 10,
        "op2": 10
    }

```

### Subtrair

| Método   | Tipo | URL                                            |
| -------- | ---- | ---------------------------------------------- |
| Subtrair | GET  | http://localhost:8080/op/subtrair?op1=10&op2=5 |

| Método   | Tipo | URL                               |
| -------- | ---- | --------------------------------- |
| Subtrair | POST | http://localhost:8080/op/subtrair |

**Exemplo de JSON**:

```json
   {
        "op1": 10,
        "op2": 5
    }

```

### Multiplicar

| Método      | Tipo | URL                                               |
| ----------- | ---- | ------------------------------------------------- |
| Multiplicar | GET  | http://localhost:8080/op/multiplicar?op1=10&op2=2 |

| Método      | Tipo | URL                                  |
| ----------- | ---- | ------------------------------------ |
| Multiplicar | POST | http://localhost:8080/op/multiplicar |

**Exemplo de JSON**:

```json
   {
        "op1": 10,
        "op2": 2
    }

```

### Dividir

| Método  | Tipo | URL                                           |
| ------- | ---- | --------------------------------------------- |
| Dividir | GET  | http://localhost:8080/op/dividir?op1=10&op2=2 |

| Método  | Tipo | URL                              |
| ------- | ---- | -------------------------------- |
| Dividir | POST | http://localhost:8080/op/dividir |

**Exemplo de JSON**:

```json
   {
        "op1": 10,
        "op2": 2
    }

```

### Exponeciar

| Método     | Tipo | URL                                              |
| ---------- | ---- | ------------------------------------------------ |
| Exponeciar | GET  | http://localhost:8080/op/exponeciar?op1=10&op2=2 |

| Método     | Tipo | URL                                 |
| ---------- | ---- | ----------------------------------- |
| Exponeciar | POST | http://localhost:8080/op/exponeciar |

**Exemplo de JSON**:

```json
   {
        "op1": 10,
        "op2": 2
    }

```

## 📦 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Maven

---

## 👩‍💻 Autora

Letícia Gomes  
Projeto desenvolvido para a disciplina de Desenvolvimento de Serviços com Spring Boot – DR1.

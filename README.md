#  GTA VI - Vice City API (CRUD)

![Java](https://img.shields.io/badge/Java-25-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-ff69b4?style=for-the-badge)

> *"Bem-vindo a Leonida."*  
> Uma API RESTful desenvolvida em **Java** com **Spring Boot** inspirada no universo de **Grand Theft Auto VI**, permitindo o gerenciamento completo (CRUD) de personagens, armamentos, veículos e missões.

---

##  Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de consolidar conceitos fundamentais de desenvolvimento back-end, arquitetura REST, persistência de dados e boas práticas com o ecossistema Spring. 

A aplicação permite **criar, listar, buscar por ID, atualizar e deletar** registros das quatro entidades principais que movem o submundo de Vice City.

---

##  Tecnologias Utilizadas

* **Java** (JDK 25)
* **Spring Boot** (Spring Web, Spring Data JPA, MySQL Drive)
* **Banco de Dados:** (MySQL) 
* **Maven** (Gerenciamento de dependências)


---

##  Entidades e Funcionalidades

O sistema conta com operações completas de **CRUD** para os seguintes recursos:

* ** Personagens (`/personagens`):** Gerenciamento de protagonistas, NPCs, afiliações e nível de procurado.
* ** Armas (`/armas`):** Catálogo de equipamentos, calibres, capacidade de munição e dano.
* ** Veículos (`/veiculos`):** Registro de carros, motos, embarcações, modelos e velocidade máxima.
* ** Missões (`/missoes`):** Controle de contratos, objetivos, recompensas em dinheiro e status de conclusão.

---

##  Endpoints da API

Todas as entidades seguem o padrão REST abaixo (exemplo utilizando `/personagens`):

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `POST` | `/personagens` | Cadastra um novo personagem |
| `GET` | `/personagens` | Lista todos os personagens cadastrados |
| `GET` | `/personagens/{id}` | Busca um personagem específico pelo ID |
| `PUT` | `/personagens/{id}` | Atualiza os dados de um personagem existente |
| `DELETE` | `/personagens/{id}` | Remove um personagem do sistema |

> **Nota:** Os mesmos padrões de rotas aplicam-se para `/armas`, `/veiculos` e `/missoes`.


# colaboradores

[![Build](https://github.com/pcfurlanetto/colaboradores/actions/workflows/ci.yml/badge.svg)](https://github.com/pcfurlanetto/colaboradores/actions/workflows/ci.yml) [![Coverage](https://codecov.io/gh/pcfurlanetto/colaboradores/branch/main/graph/badge.svg)](https://codecov.io/gh/pcfurlanetto/colaboradores) [![License: MIT](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE)

Descrição
---------
"colaboradores" é um projeto Java que visa facilitar o gerenciamento de colaboradores (funcionários/usuários) em aplicações empresariais. Ele fornece modelos, serviços e utilitários para criação, leitura, atualização e remoção (CRUD) de colaboradores, além de exemplos de integração com persistência e APIs REST.

Recursos
--------
- Modelos e DTOs para colaboradores
- Serviços com validação e regras de negócio
- Repositório de exemplo (JPA) e adaptadores para persistência
- Endpoints REST de exemplo (controladores)
- Suporte para testes unitários e de integração
- Estrutura modular e fácil de estender

Tecnologias
-----------
- Java 11+
- Maven
- (Opcional) Spring Boot, JPA/Hibernate, H2/Postgres, JUnit, Mockito

Pré-requisitos
--------------
- JDK 11 ou superior
- Maven 3.6+
- (Opcional) Docker para bancos externos

Como rodar (Maven)
------------------
1. Build:
```bash
mvn clean package
```

2. Rodar (jar gerado):
```bash
java -jar target/colaboradores-<versao>.jar
```

Configuração
-----------
- Arquivo de exemplo: `src/main/resources/application.properties` ou `application.yml`
- Propriedades comuns:
  - server.port=8080
  - spring.datasource.url=jdbc:...
  - spring.datasource.username=
  - spring.datasource.password=

Exemplos de uso (REST)
----------------------
- Listar colaboradores:
  GET /api/colaboradores

- Obter colaborador por id:
  GET /api/colaboradores/{id}

- Criar colaborador:
  POST /api/colaboradores
  Body (JSON):
  ```json
  {
    "nome": "João Silva",
    "email": "joao@exemplo.com",
    "cargo": "Desenvolvedor"
  }
  ```

- Atualizar colaborador:
  PUT /api/colaboradores/{id}

- Deletar colaborador:
  DELETE /api/colaboradores/{id}

Estrutura do projeto
--------------------
- src/main/java
  - com.seudominio.colaboradores
    - model/        -> entidades e DTOs
    - repository/   -> interfaces de persistência
    - service/      -> lógica de negócio
    - controller/   -> endpoints REST
    - config/       -> configuração e beans
- src/test/java  -> testes unitários e de integração

Testes
------
- Executar testes com Maven:
```bash
mvn test
```

Boas práticas e contribuições
----------------------------
Contribuições são bem-vindas! Sugestões:
1. Abra uma issue descrevendo o problema/feature.
2. Crie uma branch com nome descritivo: `feature/minha-nova-funcionalidade` ou `fix/corrige-bug`.
3. Faça commits pequenos e claros.
4. Abra um Pull Request referenciando a issue e descrevendo as mudanças.
5. Inclua testes para novas funcionalidades e garanta que o build esteja verde.

Modelo de commit
- feat: adicionar endpoint de busca por departamento
- fix: corrigir validação de e-mail no service
- docs: atualizar README com instruções de setup

Licença
-------
Este repositório está licenciado sob a MIT License — veja o arquivo LICENSE para detalhes.

Contato
-------
- Autor: Paulo César Furlanetto Marques
- E-mail: paulo.furlanetto@ulife.com.br
- GitHub: https://github.com/pcfurlanetto

Próximos passos sugeridos
-------------------------
- Adicionar um exemplo funcional com banco em memória (H2) e testes de integração
- Adicionar badges adicionais (ex.: cobertura por branch) e configurar Codecov
- Ajustar o README com detalhes do framework (Spring Boot) se você decidir adotá-lo

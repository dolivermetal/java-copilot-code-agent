# Sistema de Gestão Escolar - Mergington High School

Sistema de gestão de atividades extracurriculares desenvolvido com Spring Boot e arquitetura limpa (Clean Architecture).

## 📋 Visão Geral

O **School Management System** é uma aplicação web que permite o gerenciamento de atividades extracurriculares da Mergington High School. O sistema possibilita que professores administrem atividades e que estudantes se inscrevam nelas através de uma interface web intuitiva.

## 🏗️ Arquitetura

### Princípios Arquiteturais

- **Clean Architecture**: Separação clara entre camadas de domínio, aplicação, infraestrutura e apresentação
- **Domain-Driven Design (DDD)**: Modelagem focada no domínio escolar
- **SOLID Principles**: Código bem estruturado e extensível
- **Hexagonal Architecture**: Isolamento das regras de negócio

### Estrutura de Camadas

```text
src/main/java/com/mergingtonhigh/schoolmanagement/
├── domain/                    # 🎯 Camada de Domínio
│   ├── entities/             # Entidades principais
│   │   ├── Activity.java     # Atividade extracurricular
│   │   └── Teacher.java      # Professor/Administrador
│   ├── repositories/         # Interfaces de repositório
│   │   ├── ActivityRepository.java
│   │   └── TeacherRepository.java
│   └── valueobjects/         # Objetos de valor
│       ├── Email.java        # Validação de email
│       └── ScheduleDetails.java # Detalhes de horário
├── application/              # 🔧 Camada de Aplicação
│   ├── dtos/                 # Data Transfer Objects
│   │   ├── ActivityDTO.java
│   │   ├── ActivityTypeDTO.java
│   │   ├── LoginRequestDTO.java
│   │   ├── StudentRegistrationDTO.java
│   │   └── TeacherDTO.java
│   └── usecases/             # Casos de uso
│       ├── ActivityUseCase.java
│       ├── AuthenticationUseCase.java
│       └── StudentRegistrationUseCase.java
├── infrastructure/           # 🏭 Camada de Infraestrutura
│   ├── config/               # Configurações
│   ├── migrations/           # Migrações do banco
│   │   └── V001_InitialDatabaseSetup.java
│   └── persistence/          # Implementações de repositório
│       ├── ActivityRepositoryImpl.java
│       ├── MongoActivityRepository.java
│       ├── MongoTeacherRepository.java
│       └── TeacherRepositoryImpl.java
└── presentation/             # 🎨 Camada de Apresentação
    ├── controllers/          # Controllers REST
    │   ├── ActivityController.java
    │   ├── AuthController.java
    │   └── StaticController.java
    └── mappers/              # Mapeadores DTO ↔ Entity
        ├── ActivityMapper.java
        └── TeacherMapper.java
```

## 🚀 Tecnologias Utilizadas

### Backend

- **Java 21** - Linguagem de programação
- **Spring Boot 3.5.4** - Framework principal
- **Spring Data MongoDB** - Integração com MongoDB
- **Spring Security** - Autenticação e autorização
- **Spring Web** - APIs REST
- **Spring Validation** - Validação de dados
- **Mongock 5.5.1** - Migrações do banco de dados
- **BouncyCastle** - Criptografia para senhas

### Frontend

- **HTML5/CSS3/JavaScript** - Interface web
- **Vanilla JavaScript** - Interatividade do frontend

### Banco de Dados

- **MongoDB** - Banco de dados NoSQL

### Ferramentas de Desenvolvimento

- **Maven** - Gerenciamento de dependências
- **JUnit 5** - Testes unitários
- **Mockito** - Mocks para testes
- **Testcontainers** - Testes de integração
- **Jacoco** - Cobertura de testes

## 📦 Funcionalidades Principais

### 🎓 Gestão de Atividades

- **Listagem de atividades** com filtros por:
  - Dia da semana
  - Horário (manhã, tarde, fim de semana)
  - Categoria (esportes, artes, acadêmico, etc.)
- **Detalhes de atividades**:
  - Nome e descrição
  - Horários e dias da semana
  - Capacidade máxima
  - Lista de participantes

### 👨‍🏫 Sistema de Autenticação

- **Login de professores** com username/senha via endpoint REST
- **Validação de sessão** para verificar usuários autenticados
- **Controle de acesso** baseado em roles (TEACHER/ADMIN)
- **Autenticação requerida** para inscrições e cancelamentos
- **Armazenamento local** da sessão no frontend para manter usuário logado

### 📝 Gestão de Inscrições

- **Inscrição de estudantes** em atividades
- **Cancelamento de inscrições**
- **Validações**:
  - Capacidade máxima
  - Duplicatas
  - Autenticação do professor

### 🎨 Interface Web

- **Design responsivo** e intuitivo
- **Filtros dinâmicos** para busca de atividades
- **Modais** para login e inscrições
- **Feedback visual** para ações do usuário

## 🔧 Configuração e Execução

### Pré-requisitos

- Java 21
- Maven 3.8+
- MongoDB 4.4+

### Variáveis de Ambiente

Crie um arquivo `.env` baseado no `.env.example`

### Executando o Projeto

1. **Iniciar MongoDB**:

   ```bash
   # Docker
   docker run -d -p 27017:27017 --name mongodb mongo:latest
   
   # Ou MongoDB local
   mongod
   ```

2. **Compilar e executar**:

   ```bash
   # Compilar o projeto
   mvn clean compile
   
   # Executar os testes
   mvn test
   
   # Iniciar a aplicação
   mvn spring-boot:run
   ```

3. **Acessar a aplicação**:
   - Frontend: <http://localhost:8080>
   - API REST: <http://localhost:8080/activities>

### Tasks Maven Disponíveis

- `mvn clean install` - Build completo
- `mvn test` - Executar testes
- `mvn spring-boot:run` - Iniciar aplicação
- `mvn package -DskipTests` - Gerar JAR

## 🌐 API REST

### Endpoints Principais

#### Autenticação

```http
POST /auth/login
Content-Type: application/x-www-form-urlencoded

username=mrodriguez&password=art123

Response: { "username": "mrodriguez", "name": "Sr. Rodriguez", "role": "TEACHER" }
```

```http
GET /auth/check-session?username=mrodriguez

Response: { "username": "mrodriguez", "name": "Sr. Rodriguez", "role": "TEACHER" }
```

#### Atividades

```http
GET /activities
GET /activities?day=Monday&start_time=15:00&end_time=17:00
GET /activities/days
```

#### Inscrições

```http
POST /activities/{activityName}/signup
Content-Type: application/x-www-form-urlencoded

email=student@mergington.edu&teacher_username=mrodriguez

POST /activities/{activityName}/unregister
Content-Type: application/x-www-form-urlencoded

email=student@mergington.edu&teacher_username=mrodriguez
```

## 🧪 Testes

### Estrutura de Testes

```text
src/test/java/
├── application/usecases/     # Testes de casos de uso
├── domain/entities/          # Testes de entidades
└── integration/             # Testes de integração
```

### Executar Testes

```bash
# Todos os testes
mvn test

# Testes específicos
mvn test -Dtest=ActivityTest
mvn test -Dtest=StudentRegistrationUseCaseTest

# Com cobertura
mvn jacoco:report
```

## 📊 Dados Iniciais

O sistema utiliza **Mongock** para realizar migrações automáticas do banco de dados, incluindo:

### Professores Padrão

| Username | Nome | Role | Senha Padrão |
|----------|------|------|--------------|
| `mrodriguez` | Sr. Rodriguez | TEACHER | `art123` |
| `mchen` | Sra. Chen | TEACHER | `chess123` |
| `principal` | Diretor Martinez | ADMIN | `admin123` |

> **Nota**: As senhas podem ser configuradas via variáveis de ambiente (`TEACHER_RODRIGUEZ_PASSWORD`, `TEACHER_CHEN_PASSWORD`, `PRINCIPAL_PASSWORD`)

### Atividades Exemplo

O sistema inclui 14 atividades pré-cadastradas:

| Atividade | Dias | Horário | Tipo | Capacidade |
|-----------|------|---------|------|------------|
| Clube de Xadrez | Seg, Sex | 15:15-16:45 | ACADEMIC | 12 |
| Aula de Programação | Ter, Qui | 07:00-08:00 | TECHNOLOGY | 20 |
| Fitness Matinal | Seg, Qua, Sex | 06:30-07:45 | SPORTS | 30 |
| Time de Futebol | Ter, Qui | 15:30-17:30 | SPORTS | 22 |
| Time de Basquete | Qua, Sex | 15:15-17:00 | SPORTS | 15 |
| Clube de Arte | Qui | 15:15-17:00 | ARTS | 15 |
| Clube de Teatro | Seg, Qua | 15:30-17:30 | ARTS | 20 |
| Clube de Matemática | Ter | 07:15-08:00 | ACADEMIC | 10 |
| Equipe de Debates | Sex | 15:30-17:30 | ACADEMIC | 12 |
| Oficina de Robótica | Sáb | 10:00-14:00 | TECHNOLOGY | 15 |
| Olimpíada de Ciências | Sáb | 13:00-16:00 | ACADEMIC | 18 |
| Torneio de Xadrez | Dom | 14:00-17:00 | ACADEMIC | 16 |
| Serviço Comunitário | Sáb | 09:00-12:00 | COMMUNITY | 25 |
| Manga Maniacs | Ter | 19:00-20:30 | ARTS | 15 |

Todas as atividades já possuem alguns estudantes inscritos para demonstração.

## 🔒 Segurança

- **Autenticação HTTP Basic** para endpoints administrativos
- **Criptografia Argon2** para senhas
- **Validação de dados** em todas as camadas
- **CORS** configurado para desenvolvimento

## 📈 Monitoramento

- **Spring Actuator** - Métricas da aplicação
- **Logs estruturados** - Nível DEBUG para desenvolvimento
- **Health checks** - Status da aplicação e banco

## 🚀 Deploy

### Perfis de Ambiente

- **dev** - Ambiente de desenvolvimento

## 📋 Solicitando Mudanças

Professores podem solicitar alterações no sistema usando os **templates de issue** criados especialmente para facilitar o processo.

### Templates Disponíveis:

O sistema oferece templates para as seguintes tarefas comuns:

- 🎯 **Adicionar Nova Atividade** - Criar atividades extracurriculares
- ✏️ **Modificar Atividade** - Alterar detalhes de atividades existentes
- 📊 **Alterar Capacidade** - Ajustar limite de participantes
- 📅 **Alterar Horário** - Modificar dias e horários
- 🗑️ **Remover Atividade** - Excluir atividades do sistema
- 👥 **Gerenciar Inscrições** - Operações em massa com estudantes
- 🐛 **Reportar Bug** - Relatar problemas no sistema
- ✨ **Solicitar Funcionalidade** - Sugerir melhorias

### Como Usar:

1. Acesse a aba [Issues](https://github.com/dolivermetal/java-copilot-code-agent/issues)
2. Clique em "New issue"
3. Escolha o template apropriado
4. Preencha o formulário com os detalhes necessários
5. Submeta - o Copilot será automaticamente designado!

📚 **Guia Completo:** Consulte [Issue Templates Guide](./ISSUE_TEMPLATES_GUIDE.md) para instruções detalhadas sobre como usar cada template.

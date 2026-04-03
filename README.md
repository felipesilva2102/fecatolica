# ✝️ FeCatolica

**Plataforma web católica completa** — orações, terços interativos, novenas, liturgia diária, ladainhas, quaresmas, vida espiritual e ferramentas de apoio à oração. Funciona como **PWA (Progressive Web App)** instalável no celular ou desktop.

> *"Se o Filho vos libertar, verdadeiramente sereis livres."* — João 8,36

🌐 **Acesse:** [fecatolica.onrender.com](https://fecatolica.site)

---

## 📋 Índice

- [Visão Geral](#-visão-geral)
- [Stack Tecnológica](#-stack-tecnológica)
- [Funcionalidades](#-funcionalidades)
- [Conteúdo Disponível](#-conteúdo-disponível)
- [Arquitetura](#-arquitetura)
- [API REST](#-api-rest)
- [Instalação e Execução](#-instalação-e-execução)
- [Deploy com Docker](#-deploy-com-docker)
- [Estrutura de Pastas](#-estrutura-de-pastas)
- [Como Contribuir](#-como-contribuir)
- [Licença](#-licença)

---

## 🏆 Visão Geral

O FeCatolica é uma aplicação web construída com **Java 21** e **Spring Boot 3.3.3** que reúne mais de **185 páginas** de conteúdo católico. O sistema conta com:

| Categoria | Quantidade |
|---|---|
| Terços e Rosários interativos | 42 |
| Orações | 38 |
| Ladainhas | 18 |
| Novenas (dinâmicas via API) | 40 |
| Quaresmas | 27 |
| Páginas de Vida Espiritual | 63 |
| Ferramentas | 12 |
| Liturgia | 2 |

---

## 🛠️ Stack Tecnológica

| Camada | Tecnologia |
|---|---|
| **Backend** | Java 21, Spring Boot 3.3.3, Spring Data JPA |
| **Banco de Dados** | H2 (file-based) |
| **Frontend** | HTML5, CSS3, JavaScript, jQuery 3.7.1 |
| **PWA** | Service Worker (cache-first), Web App Manifest |
| **PDF Parsing** | Apache PDFBox 2.0.31 (extração de intenções do Papa) |
| **Build** | Maven (wrapper incluído) |
| **Deploy** | Docker multi-stage (Maven 3.9.9 + Eclipse Temurin 21) |
| **Hosting** | Render.com |

---

## ✨ Funcionalidades

### 📿 Terço Interativo (FeBeads)
- Contas clicáveis com animação pulsante e transição visual
- Seleção automática de mistério do Rosário por dia da semana (Gozosos seg/sáb, Dolorosos ter/sex, Gloriosos dom/qua, Luminosos qui)
- Barra de progresso com efeito shimmer e anel SVG percentual
- Haptic feedback (vibração) ao toque
- Memória de estado no localStorage (retoma de onde parou)

### 🎨 Cores Litúrgicas Dinâmicas
- Backend calcula o tempo litúrgico atual (Advento, Natal, Quaresma, Páscoa, Tempo Comum) usando o algoritmo de Meeus/Computus para cálculo de Páscoa
- Injeta CSS custom properties (`--cor-primaria`, etc.) dinamicamente no frontend
- Cores mudam automaticamente conforme o calendário litúrgico

### ♿ Acessibilidade
- Controle de tamanho de fonte (0.8x a 1.6x) com persistência
- **Dark mode** completo com todos os componentes estilizados
- Folha de estilo otimizada para impressão (fontes serif, margens adequadas, sem UI interativa)

### 📤 Compartilhamento
- Web Share API nativa com fallback para clipboard
- Notificação toast de confirmação

### 🔥 Streaks (Gamificação)
- Rastreamento de sequência diária de orações
- Contagem de dias consecutivos com histórico
- Persistência via localStorage

### 📖 Liturgia Diária
- Consome API externa para leituras, salmos e orações do dia
- Calendário litúrgico com cálculo de Páscoa, Quaresma, Pentecostes, Corpus Christi

### 🙏 Mural de Intenções
- CRUD de intenções de oração comunitárias
- Sanitização de input HTML, limite de 200 intenções
- Persistência em banco H2

### 📲 PWA
- Instalável como app no celular e desktop
- Service Worker com estratégia cache-first
- Pré-cache de 50+ URLs principais
- Funciona offline com conteúdo em cache

---

## 📚 Conteúdo Disponível

### 📿 Terços e Rosários (42)
Santo Terço, Santo Rosário (com seletor de mistérios), Terço da Misericórdia, Terço da Libertação, Terço da Providência, Terço das Almas, Terço do Combate Espiritual, Terço dos Anjos, Terço da Imaculada Conceição, Terço das Lágrimas de Sangue, Coroa do Espírito Santo, Coroa das Doze Estrelas, Coroa das Sete Dores, Coroa Franciscana, Coroa do Preciosíssimo Sangue, e terços dedicados a: N. Sra. Aparecida, Assunção, Auxiliadora, Carmo, Dores, Fátima, Graças, Perpétuo Socorro, Sagrada Família, Sagrado Coração, Padre Pio, São Bento, São Cristóvão, São Expedito, São Francisco, São João Batista, São João Paulo II, São Jorge, São José, São Judas Tadeu, São Miguel, São Sebastião, Santa Bárbara, Santa Luzia, Santa Rita, Santa Teresinha, Santo Antônio.

### 🙏 Orações (38)
Angelus, Ato de Contrição, Bem-Aventuranças, Bênçãos do Lar, Cântico das Criaturas, Cânticos Bíblicos, Cinco Primeiros Sábados, Consagrações, Devoções Marianas, Guia de Confissão, Hora da Misericórdia, Hora Santa, Lectio Divina, Obras de Misericórdia, Ofício da Imaculada, Orações a Anjos, Orações de Cura, Orações pelos Defuntos, Orações Eucarísticas, Orações de Jovens, Orações em Latim, Orações de Ocasião, Orações de Pais e Filhos, Orações de Proteção, Orações a Santos, Orações de Viagem, Orações Vocacionais, Preces de São Patrício, Primeiras Sextas, Sagrada Família, Salmos, Te Deum e Hinos, Via-Lúcis, Via-Matris, Via-Sacra, Advento e Natal, Novena ao Espírito Santo.

### 📜 Ladainhas (18)
Ladainha de Loreto, dos Santos, do Sagrado Coração, do Espírito Santo, do Santo Nome de Jesus, do Preciosíssimo Sangue, da Humildade, da Divina Misericórdia, dos Defuntos, dos Anjos da Guarda, de São José, de São Miguel, de São Jorge, de São João Batista, de N. Sra. Aparecida, de N. Sra. de Fátima, de Santa Bárbara, de Santa Rita.

### 🕯️ Novenas (40 — dinâmicas via API)
Renderizadas por uma única página SPA que consome a API REST. Cada novena possui 9 dias com meditações, orações e jaculatórias.

### ✟ Quaresmas (27)
Quaresma Litúrgica e 26 quaresmas temáticas de santos e devoções, com cálculo automático de período baseado no calendário litúrgico.

### 🕊️ Vida Espiritual (63)
Catecismo para crianças e adultos, Credo explicado, Sacramentos, Mandamentos, Partes da Missa, Liturgia das Horas, Sacramento da Confissão, Pecados Capitais, Virtudes e Dons, Glossário Católico, Dicionário Bíblico, Livros da Bíblia, Evangelhos Explicados, Parábolas de Jesus, Milagres de Jesus, Milagres Eucarísticos, Mariologia, Dogmas Marianos, Maria na Bíblia, Aparições Marianas, Profecias de Fátima, Cristologia, Pneumatologia, Trindade Santíssima, Escatologia (Novíssimos), Padres da Igreja, Doutores da Igreja, História da Igreja, Concílios Ecumênicos, Papas na História, Santos Mártires, Santos Brasileiros, Santos Jovens, Santos Padroeiros, Estigmatizados, Ordens Religiosas, Vida Monástica, Espiritualidade Carmelita, Espiritualidade Inaciana, Mística Cristã, Apologética, Heresias Históricas, Doutrina Social, Bioética, Ritos Católicos, Sacramentais, Símbolos Litúrgicos, Missa Tridentina, Teologia do Corpo, Tipos de Oração, Frases de Santos, Promessas de Jesus, Promessas do Rosário, Discernimento, Exame de Consciência, Exame Diário, Diário Espiritual, Plano de Leitura Bíblica, Ano Litúrgico, Mural de Intenções.

### 🔧 Ferramentas (12)
Bíblia do Dia, Busca, Contador de Oração, Exame de Consciência Interativo, Intenções do Papa (extração automática de PDF do Vaticano), Jejum e Oração, Meditação, Modo Retiro, Quiz de Formação, Rosário dos Mistérios, Santo do Dia, Timer de Oração.

### 📅 Liturgia (2)
Liturgia Diária (leituras, salmos, orações) e Calendário Litúrgico.

---

## 🏗️ Arquitetura

```
┌─────────────────────────────────────────────────┐
│                   Frontend                       │
│  HTML + CSS + JS + jQuery 3.7.1                  │
│  PWA (Service Worker + Manifest)                 │
│  FeBeads Engine (terço interativo)               │
│  Cores litúrgicas dinâmicas (CSS vars)           │
├─────────────────────────────────────────────────┤
│                   Backend                        │
│  Spring Boot 3.3.3 / Java 21                     │
│  5 Controllers · 31 Services · 40 Novena Beans   │
├─────────────────────────────────────────────────┤
│              Dados / Integrações                 │
│  H2 Database (file-based)                        │
│  API Liturgia (liturgia.up.railway.app)           │
│  PDF Vatican (popesprayer.va via PDFBox)          │
└─────────────────────────────────────────────────┘
```

---

## 🔌 API REST

### `/api`

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/api/tempo-liturgico` | Tempo litúrgico atual com cores CSS |
| GET | `/api/intencoes-papa` | Intenções mensais do Papa (PDF do Vaticano) |
| GET | `/api/health` | Health check |
| GET | `/api/keepalive` | Keep-alive para Render.com |

### `/api/liturgia`

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/api/liturgia` | Liturgia do dia (aceita `?dia=&mes=`) |

### `/api/novena`

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/api/novena/lista` | Lista todas as 40 novenas |
| GET | `/api/novena/{nome}` | Dados completos de uma novena |

### `/api/mural`

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/api/mural/intencoes` | Lista intenções (max 200) |
| GET | `/api/mural/total` | Total de intenções |
| POST | `/api/mural/intencoes` | Cria intenção (nome + texto) |

### `/api/quaresma`

27 endpoints GET, um por devoção: `/liturgica`, `/sao-jose`, `/sao-miguel`, `/santo-antonio`, `/nossa-senhora-aparecida`, `/espirito-santo`, `/nossa-senhora-carmo`, `/santa-teresinha`, `/sao-francisco`, `/natal`, `/sagrado-coracao`, `/nossa-senhora-gracas`, `/santa-rita`, `/sao-judas-tadeu`, `/padre-pio`, `/sao-bento`, `/nossa-senhora-fatima`, `/nossa-senhora-dores`, `/joao-paulo-ii`, `/sao-sebastiao`, `/sao-jorge`, `/sao-joao-batista`, `/santa-luzia`, `/nossa-senhora-auxiliadora`, `/nossa-senhora-assuncao`, `/sao-cristovao`, `/santa-barbara`.

---

## 🚀 Instalação e Execução

### Pré-requisitos

- **Java 21** (JDK)
- **Maven 3.9+** (ou usar o wrapper `mvnw` incluído)

### Executar localmente

```bash
git clone https://github.com/felipesilva2102/fecatolica.git
cd fecatolica

# Compilar e rodar (porta 8082)
./mvnw spring-boot:run
```

```powershell
# Windows
mvnw.cmd spring-boot:run
```

Acesse: **http://localhost:8082**

### Banco de dados

O H2 cria automaticamente o arquivo do banco em `~/.fecatolica/h2/intencoes`. Não é necessária nenhuma configuração adicional.

---

## 🐳 Deploy com Docker

```bash
# Build
docker build -t fecatolica .

# Run (porta 8080 no container → 8082 no host)
docker run -p 8082:8080 fecatolica
```

O Dockerfile usa build multi-stage:
1. **Build stage** — `maven:3.9.9-eclipse-temurin-21` compila o projeto
2. **Runtime stage** — `eclipse-temurin:21-jre` executa o JAR otimizado

---

## 📂 Estrutura de Pastas

```
fecatolica/
├── src/main/java/com/mycompany/santo/terco/
│   ├── SantoTercoApplication.java       # Main + @EnableScheduling
│   ├── config/
│   │   └── KeepAliveScheduler.java      # Ping anti-sleep (Render)
│   ├── controller/
│   │   ├── ApiController.java           # /api (tempo litúrgico, intenções papa)
│   │   ├── LiturgiaController.java      # /api/liturgia
│   │   ├── MuralController.java         # /api/mural (intenções)
│   │   ├── NovenaController.java        # /api/novena
│   │   └── QuaresmaController.java      # /api/quaresma (27 endpoints)
│   ├── service/
│   │   ├── TempoLiturgicoService.java   # Cores litúrgicas dinâmicas
│   │   ├── LiturgiaService.java         # Consome API externa
│   │   ├── IntencoesPapaService.java    # PDF parsing (Vatican)
│   │   ├── MuralService.java            # CRUD intenções
│   │   ├── NovenaRegistry.java          # Registro de 40 novenas
│   │   └── Quaresma*Service.java        # 27 services de quaresma
│   ├── novena/                          # 40 beans de novenas
│   ├── DTO/                             # DTOs e entidades
│   ├── mural/                           # Entidade + DTO de intenções
│   ├── repository/                      # JPA Repository
│   └── util/
│       └── CalendarioLiturgicoUtils.java # Computus (Páscoa)
├── src/main/resources/
│   ├── application.properties
│   └── static/
│       ├── index.html                   # Página inicial
│       ├── manifest.json                # PWA manifest
│       ├── sw.js                        # Service Worker
│       ├── css/                         # 4 arquivos CSS
│       ├── js/                          # 6 arquivos JS
│       ├── imagens/                     # Logos, favicons, ícones
│       ├── includes/                    # menu.html, footer.html
│       ├── tercos/                      # 42 terços interativos
│       ├── oracoes/                     # 38 orações
│       ├── ladainhas/                   # 18 ladainhas
│       ├── novenas/                     # 1 página SPA (40 novenas via API)
│       ├── quaresmas/                   # 27 quaresmas
│       ├── liturgia/                    # 2 páginas
│       ├── ferramentas/                 # 12 ferramentas
│       └── vida-espiritual/             # 63 páginas de formação
├── Dockerfile                           # Multi-stage build
├── pom.xml                              # Maven (Java 21, Spring Boot 3.3.3)
└── mvnw / mvnw.cmd                      # Maven Wrapper
```

---

## 🤝 Como Contribuir

1. Faça um **fork** do repositório
2. Crie uma branch: `git checkout -b minha-feature`
3. Faça commit das alterações: `git commit -m "Adiciona nova oração"`
4. Envie para o fork: `git push origin minha-feature`
5. Abra um **Pull Request** detalhando as mudanças

### Padrões do projeto
- Terços interativos usam `FeBeads.build({ themeColor, decades })` definido em `terco-interativo.js`
- Seções colapsáveis usam o padrão `accordion-panel > accordion-tab > accordion-header + accordion-content`
- Menu e footer são carregados via `includes/menu.html` e `includes/footer.html`
- Conteúdo novo de terço deve incluir seções "📖 Como Rezar" e "✝️ Início" com accordions

---

## 📄 Licença

Sem licença definida. Consulte o proprietário antes de reutilizar o código.

---

## 💬 Contato

Abra uma **Issue** no GitHub para dúvidas, sugestões ou reportar problemas.

---

<p align="center">
  <em>Feito com fé ✝️</em>
</p>

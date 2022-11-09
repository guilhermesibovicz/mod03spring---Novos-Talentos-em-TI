# Projeto modulo 3  Spring Boot

## Spring Framework
Conjunto de bibliotecas escritas em Java para simplificar o desenvolvimento de aplicações WEB

## Spring Boot
Ferramenta para acelerar o início de um projeto utilizando o Spring Framework
- Documentação: https://spring.io/projects/spring-boot
- Start: https://start.spring.io/
Site que cria a estrutura de um projeto utilizando o Spring Boot

## Configuração do ambiente
- Java Development Kit (JDK)
- Maven (gerenciador de pacotes e ferramneta de build)
- VSCode
    - Extension Pack for Java (Microsoft)
    - Extension Pack for Spring Boot (Pivotal)
- Banco de Dados (MariaDB)

## Passo a passo para criar um novo projeto Springboot no VSCode
- Criar uma pasta no disco do computador 
- Abrir a pasta mo VSCode usando a opção FIle (Arquivo) -> Open Folder (abrir pasta)
- Ctrl + shift + P 
- Digitar Spring 
- Selecionar Spring Inializer: Create a Maven Project
- Qual a versão do Spring Framework ( a última )
- Qual a linguagem: Java ♥
- Qual o pacote base do projeto: domínio da empresa (univille.br) usar invertido (br.univille)
- Qual o nome do projeto? (não usar espaço ou caracter especial)
- Qual a forme de empacotamento: JAR
- Qual a versão do JDK: 11 (depende da versão instalada no seu computador)
- Quais são as dependências do projeto: 
    - Spring Web
    - Spring boot DevTools (clicar para selecionar)
- Selecionar a pasta onde o projeto será criado (usar a mesma que foi utilizada no passo 1)
- Retorno que o projeto foi criado com sucesso, clicar em OPEN

## Como adicionar uma nova dependência no projeto

- Opção 1
- Ctrl + shift + P
- Spring Initializr: Add Starters
- Digito o nome da dependência: exemplo Thymeleaf
- Clicar sobre o nome da dependência desejada
- Clicar sobre Selected N dependencies
- Clicar em Proceed
- Salvar o arquivo POM
- "A build file was modified. Do you want to synchronize de java classpath?" Always (SEMPRE)

- Opção 2

- Acessar o site https://mvnrepository.com/
- Procurar pela dependência desejada: ex: bootstrap / jquery
- Listar as versões e então você seleciona a versão desejada
- O site sugere o XML necessário para incluir a dependência, então copie o XML
- Volta no projeto, abre o arquivo POM.xml
- Procura a TAG
- Dentro do corpo da tag, colar o XML copiado do site
- Salvar o arquivo

## Configuração para conexão no banco de dados relacional 
- Adicionar dependências (Spring Data JPA, H2, MariaDB JDBC Driver)
- Configurar a conexão da aplicação com o banco de dados no arquivo application.properties


## Estrutura do projeto 
- Pacote src: todo o código da aplicação (Java, HTML, CSS, JS)
- Pacote target: código compilado e gerado pelo Maven
- Arquivo pom.xml: arquivo escritor utilizado pelo Maven para download das dependênias e build de aplicação
- <nomedoprojeto>Application,java - main da aplicação Java
- Pacote Controller: classes que são responsáveis por tratar as requisições HTTP enviadas para as rotas definidas por anotação 


## Executar a aplicação
- Encontar o Spring Boot Dashboard 
- Clicar mo ícone de Play do lado do nome do projeto 


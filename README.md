```
OficinaDeCarro/
├── .mvn/                            # Configurações do Maven Wrapper
│   ├── wrapper/
│       ├── maven-wrapper.properties # Configurações do Maven Wrapper
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── lucas/lemos/oficina/de/carro/
│   │   │       ├── Controller.java             # Controlador principal da aplicação
│   │   │       ├── llp_Peca.java               # Modelo para representar dados de peças
│   │   │       ├── llp_PecaController.java     # Controlador para operações de peças
│   │   │       ├── llp_PecaRepository.java     # Repositório para interação com banco de peças
│   │   │       ├── llp_PecaService.java        # Serviço contendo lógica para peças
│   │   │       ├── llp_Veiculo.java            # Modelo para representar dados de veículos
│   │   │       ├── llp_VeiculoController.java  # Controlador para operações de veículos
│   │   │       ├── llp_VeiculoRepository.java  # Repositório para interação com banco de veículos
│   │   │       ├── llp_VeiculoService.java     # Serviço contendo lógica para veículos
│   │   │       ├── VeiculoPeca.java            # Modelo que relaciona veículos e peças
│   │   │       ├── VeiculoPecaController.java  # Controlador para operações entre veículos e peças
│   │   │       ├── VeiculoPecaRepository.java  # Repositório para relação entre veículos e peças
│   │   │       └── OficinaDeCarroApplication.java # Classe principal da aplicação
│   ├── resources/
│   │   ├── static/                  # Arquivos estáticos (vazio no momento)
│   │   ├── templates/               # Templates para renderização de páginas
│   │   │   ├── llp_veiculo_peca/
│   │   │   │   ├── formulario.html             # Página de formulário principal
│   │   │   │   ├── home.html                   # Página inicial da aplicação
│   │   │   │   ├── listar.html                 # Página para listar itens gerais
│   │   │   │   ├── llp_addVeiculoPeca.html     # Página para adicionar relação entre veículos e peças
│   │   │   │   ├── llp_editVeiculoPeca.html    # Página para editar relação entre veículos e peças
│   │   │   │   ├── llp_form_peca.html          # Formulário para adicionar/editar uma peça
│   │   │   │   ├── llp_formVeiculoPeca.html    # Formulário para adicionar/editar veículo e peça
│   │   │   │   ├── llp_lista_pecas.html        # Página para listar peças
│   │   │   │   ├── llp_lista_veiculo_peca.html # Página para listar relação entre veículos e peças
│   │   │   │   ├── llp_listVeiculoPeca.html    # Página para listar veículos relacionados às peças
│   │   │   │   ├── llp_veiculo_peca_form.html  # Página de formulário geral para veículos e peças
│   │   │   │   └── llp_veiculo_peca_list.html  # Página de lista geral para veículos e peças
│   │   │   └── veiculos/
│   │   │       ├── form.html                   # Formulário base para veículos
│   │   │       ├── index.html                  # Página inicial
│   │   └── application.properties              # Configurações da aplicação
│   └── test/
│       └── java/
│           └── lucas/lemos/oficina/de/carro/
│               └── OficinaDeCarroApplicationTests.java # Classe de testes automatizados para a aplicação
├── target/                                     # Diretório de build gerado pelo Maven
├── .gitignore                                  # Arquivo para ignorar diretórios/arquivos no Git
├── HELP.md                                     # Documentação ou ajuda sobre o projeto
├── mvnw                                        # Script para rodar o Maven Wrapper
├── mvnw.cmd                                    # Script para rodar o Maven Wrapper no Windows
└── pom.xml                                     # Configurações do Maven, incluindo dependências
```

# Desafio Dio modelagem de funções IPhone

### Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class SmartPhone {
    }

    class IPhone {
    }

    SmartPhone --> ReprodutorMusical
    SmartPhone --> AparelhoTelefonico
    SmartPhone --> NavegadorInternet

    IPhone -->SmartPhone
```

public class Main {
    public static void main(String[] args) {    
        Biblioteca biblioteca = new Biblioteca();

        UsuarioNormal einstein = new UsuarioNormal("Alberto Einstein", "1800", "genio#PrêmioNobel@relatividade.com", "1");
        UsuarioEspecial minhaFuturaNamorada = new UsuarioEspecial("Linda pra cacete", "Tira o zói", "linda@demais.com", "2");

        Livro sereia = new Livro("A Pequena Sereia", "12/12/2012", "2ª Edição", "Tubarão", "567");
        Autor ronaldo = new Autor("Ronaldo", "Fenômeno");
        Autor neymar = new Autor("Neymar", "Junior");

        sereia.registrarAutor(ronaldo);
        sereia.registrarAutor(neymar);


        Artigo muieBonita = new Artigo("Por que as mulheres são tão bonitas e tão chatas?", "03/08/2021", "Porque tudo nessa vida que é bom, custa.");
        Autor carlos = new Autor("Carlos", "Careca");
        Autor carnal = new Autor("Leandro", "Carnal");

        muieBonita.registrarAutor(carlos);
        muieBonita.registrarAutor(carnal);


        Tese comuna = new Tese("Comunismo é bom.", "01/01/2021", 124, "Camarada. Bonoro. Pinguço....", "05/08/2021", "IF Goiano");
        Autor bolsonaro = new Autor("Bolsonaro", "Presidente");
        Autor lula = new Autor("Lula", "Ex-presidente e presidiário.");

        comuna.registrarAutor(bolsonaro);
        comuna.registrarAutor(lula);

        biblioteca.registrarPublicacao(sereia);
        biblioteca.registrarPublicacao(sereia);
        biblioteca.registrarPublicacao(sereia);

        biblioteca.registrarPublicacao(muieBonita);
        biblioteca.registrarPublicacao(muieBonita);
        biblioteca.registrarPublicacao(muieBonita);

        biblioteca.registrarPublicacao(comuna);
        biblioteca.registrarPublicacao(comuna);
        biblioteca.registrarPublicacao(comuna);

        
        // for(int x = 0; x <= biblioteca.getPublicacoes().size() - 1; x++) {
        //     System.out.println(biblioteca.getPublicacoes().get(x).toString());
        // }
        //einstein.escolherLivros(0, "04/08/2021", "14/08/2021", biblioteca.getPublicacoes());



        // for(int x = 0; x <= biblioteca.getPublicacoes().size() - 1; x++) {
        //     System.out.println(biblioteca.getPublicacoes().get(x).toString());
        //     //ok agora eu sei que ele desaparece da biblioteca. isso é bom. Agora vou testar com o especial.
        // }

        //minhaFuturaNamorada.escolherLivros(0, "04/08/2021", "15/08/2021", biblioteca.getPublicacoes());

        // for(int x = 0; x <= biblioteca.getPublicacoes().size() - 1; x++) {
        //     System.out.println(biblioteca.getPublicacoes().get(x).toString());
        //     //o teste deu certo. MinhaFuturaNamorada pegou muié bonita. Não sei se estou feliz ou triste com isso. 
        // }


        // System.out.println(einstein.getEmprestadosLim()[0].toString());
        // System.out.println(minhaFuturaNamorada.getEmprestados().get(0).toString());
        //ok. cada usuário está recebendo os livros. agora vou testar a lógica de entregar o livro. 
        
        // einstein.entregarLivro(0, biblioteca, "04/08/2021");
        
        //  for(int x = 0; x <= biblioteca.getPublicacoes().size() - 1; x++) {
        //     System.out.println(biblioteca.getPublicacoes().get(x).toString());
        //     //deu certo.
        // }
        //System.out.println(einstein.getEmprestadosLim()[0].toString()); agora tá apagando depois que o usuario entrega. Ainda bem

        // minhaFuturaNamorada.entregarLivro(0, biblioteca, "04/08/2021");

        // for(int x = 0; x <= biblioteca.getPublicacoes().size() - 1; x++) {
        //     System.out.println(biblioteca.getPublicacoes().get(x).toString());
        //     //deu certo.
        // }
        //System.out.println(einstein.getEmprestados().get(0).toString()); deu certo também

        // agora vamos testar toda a minha lógica de renovacao de escolher livros.



        
        // einstein.escolherLivros(0, "04/08/2021", "14/08/2021", biblioteca.getPublicacoes());
        // einstein.escolherLivros(0, "04/08/2021", "14/08/2021", biblioteca.getPublicacoes());
        // einstein.escolherLivros(0, "04/08/2021", "14/08/2021", biblioteca.getPublicacoes());


        // System.out.println(einstein.getEmprestadosLim()[0].toString());
        // System.out.println(einstein.getEmprestadosLim()[1].toString());
        // System.out.println(einstein.getEmprestadosLim()[2].toString());
        // einstein.entregarLivro(0, biblioteca, "12/13/2018");

        // einstein.escolherLivros(0, "04/08/2021", "14/08/2021", biblioteca.getPublicacoes());

        // System.out.println(einstein.getEmprestadosLim()[0].toString());

        // //ok, agora ele tem 3 livros.  Ele não pode ter mais de três livros. 
        //     System.out.println("0--------------------------------------------------------------000000");
        //  for(int x = 0; x <= biblioteca.getPublicacoes().size() - 1; x++) {
        //     System.out.println(biblioteca.getPublicacoes().get(x).toString());
        //  }

        // minhaFuturaNamorada.escolherLivros(0, "04/08/2021", "14/08/2021", biblioteca.getPublicacoes());
        // minhaFuturaNamorada.escolherLivros(0, "04/08/2021", "14/08/2021", biblioteca.getPublicacoes());
        // minhaFuturaNamorada.escolherLivros(0, "04/08/2021", "14/08/2021", biblioteca.getPublicacoes());
        // minhaFuturaNamorada.escolherLivros(0, "04/08/2021", "14/08/2021", biblioteca.getPublicacoes());

        // System.out.println(minhaFuturaNamorada.getEmprestados().get(0).toString());
        // System.out.println(minhaFuturaNamorada.getEmprestados().get(1).toString());
        // System.out.println(minhaFuturaNamorada.getEmprestados().get(2).toString());
        // System.out.println(minhaFuturaNamorada.getEmprestados().get(3).toString());

        // minhaFuturaNamorada.entregarLivro(3, biblioteca, "12/12/2012");
        // System.out.println(minhaFuturaNamorada.getEmprestados().get(3).toString());


        // for(int x = 0; x <= biblioteca.getPublicacoes().size() - 1; x++) {
        //           System.out.println(biblioteca.getPublicacoes().get(x).toString());
        // } ok tamém

        //TESTAR LÓGICA DE RENOVACAO DE EMPRÉSTIMO E CÁLCULO DE MULTAS

        sereia.setMulta(1);
        muieBonita.setMulta(2);
        comuna.setMulta(3);
        einstein.escolherLivros(0, "04/08/2021", "14/08/2021", biblioteca.getPublicacoes());
        einstein.escolherLivros(0, "04/08/2021", "14/08/2021", biblioteca.getPublicacoes());
        einstein.escolherLivros(0, "04/08/2021", "14/08/2021", biblioteca.getPublicacoes());
        
        einstein.renovarEmprestimo(0, "0");
        einstein.renovarEmprestimo(0, "0");
        einstein.renovarEmprestimo(0, "0");
        einstein.renovarEmprestimo(0, "0");
        einstein.renovarEmprestimo(0, "0");
        
        // System.out.println(einstein.getEmprestadosLim()[0].renovacao);
        // System.out.println(einstein.getEmprestadosLim()[1].renovacao);

        double multa = einstein.entregarLivro(0, biblioteca, "o");
        //System.out.println(einstein.getEmprestadosLim()[0].renovacao);//parece-me que zerar a renovação é inútil nesse caso, pois o objeto desaparece jutno com ela.

        //ok por enquanto.

        minhaFuturaNamorada.escolherLivros(0, "04/08/2021", "14/08/2021", biblioteca.getPublicacoes());
        minhaFuturaNamorada.escolherLivros(0, "04/08/2021", "14/08/2021", biblioteca.getPublicacoes());
        minhaFuturaNamorada.escolherLivros(0, "04/08/2021", "14/08/2021", biblioteca.getPublicacoes());  
            
        minhaFuturaNamorada.renovarEmprestimo(0, "0");
        minhaFuturaNamorada.renovarEmprestimo(0, "0");
        minhaFuturaNamorada.renovarEmprestimo(0, "0");
        minhaFuturaNamorada.renovarEmprestimo(0, "0");
        minhaFuturaNamorada.renovarEmprestimo(0, "0");
        minhaFuturaNamorada.renovarEmprestimo(0, "0");
        minhaFuturaNamorada.renovarEmprestimo(0, "0");

        System.out.println(minhaFuturaNamorada.getEmprestados().get(0).renovacao);
        minhaFuturaNamorada.entregarLivro(0, biblioteca, "o");

        multa = minhaFuturaNamorada.entregarLivro(0, biblioteca, "o");
        System.out.println(minhaFuturaNamorada.getEmprestados().get(0).renovacao); //é. cada vez mais eu me convenço de que esse bagulho de zerar a renovaão é inútil. O objeto vai ser destruído mesmo. Enfim. Vou ver no que dá. Bom trabalho.

        System.out.println(multa);
//terminei. Eu acho. 
    }
        
        


    //eu tô tão feliz que essa geringonça ta funcionando. 
}


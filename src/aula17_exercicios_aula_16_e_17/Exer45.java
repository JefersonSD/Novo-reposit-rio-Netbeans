package aula17_exercicios_aula_16_e_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer45 {

    public static void main(String[] args) {
//		45 - Desenvolver um programa para verificar a nota do aluno em uma prova com 10 questões, o programa deve 
//			 perguntar ao aluno a resposta de cada questão e ao final comparar com o gabarito da prova e assim 
//			 calcular o total de acertos e a nota (atribuir 1 ponto por resposta certa). Após cada aluno utilizar 
//			 o sistema deve ser feita uma pergunta se outro aluno vai utilizar o sistema. Após todos os alunos terem 
//			 respondido informar:
//			 Maior e Menor Acerto;
//			 Total de Alunos que utilizaram o sistema;
//			 A Média das Notas da Turma.

//			 Gabarito da Prova:
//
//				01 - B
//				02 - C
//				03 - A
//				04 - A
//				05 - B
//				06 - C
//				07 - B
//				08 - D
//				09 - A
//				10 - B
//			Após concluir isto você poderia incrementar o programa permitindo que o professor digite o gabarito da prova 
//			antes dos alunos usarem o programa.
        Scanner t = new Scanner(System.in);

        String resposta1 = "", resposta2 = "", resposta3 = "", resposta4 = "", resposta5 = "", resposta6 = "",
                resposta7 = "", resposta8 = "", resposta9 = "", resposta10 = "";
        String aluno1 = "Fernando", aluno2 = "Isabel", aluno3 = "Caio", aluno4 = "Jose", aluno5 = "debora",
                nomeAluno = "";
        int contador = 0, controleAluno = 0;
        String[][] alunosNotas = new String[5][2];
        List<String> alunos = new ArrayList();
        String opcao;

        do {
            System.out.println("Responda as questões e visualize o resultado ao final");
            System.out.println("Informe o seu nome:");
            nomeAluno = t.next();
            while (!nomeAluno.equalsIgnoreCase(aluno1) && !nomeAluno.equalsIgnoreCase(aluno2)
                    && !nomeAluno.equalsIgnoreCase(aluno3) && !nomeAluno.equalsIgnoreCase(aluno4)
                    && !nomeAluno.equalsIgnoreCase(aluno5)) {
                System.err.println("Aluno não pertence a turma");
                System.out.println("Informe o seu nome:");
                nomeAluno = t.next();
            }
            if (controleAluno == 0) {
                alunos.add(nomeAluno);
            }
            while (alunos.contains(nomeAluno) && controleAluno != 0) {
                System.out.println("Aluno já realizou a prova!");
                System.out.println("Informe o seu nome:");
                nomeAluno = t.next();
                while (!nomeAluno.equalsIgnoreCase(aluno1) && !nomeAluno.equalsIgnoreCase(aluno2)
                        && !nomeAluno.equalsIgnoreCase(aluno3) && !nomeAluno.equalsIgnoreCase(aluno4)
                        && !nomeAluno.equalsIgnoreCase(aluno5)) {
                    System.err.println("Aluno não pertence a turma");
                    System.out.println("Informe o seu nome:");
                    nomeAluno = t.next();
                }
            }

            alunos.add(nomeAluno);

            for (int i = 1; i <= 10; i++) {

                switch (i) {
                    case 1:
                        /*
					 * Fonte das questões:
					 * https://estudaquepassa.com.br/concursos/questoes?subjects=3016&page=2
                         */
                        System.out.println(
                                "1 - A educação a distância (EaD) é um processo de ensino-aprendizagem mediado por tecnologias "
                                + "nas quais professores e alunos\nestãoseparados espacial e(ou) temporalmente. Considerando essa "
                                + "informação, assinale a alternativa correta.\r\n\n"
                                + "a) Com a educação a distância, há a possibilidade de interação on-line. Esse é um processo "
                                + "de mudança uniforme e fácil que\ndepende apenas da motivação e da vontade das pessoas.\r\n"
                                + "b) Com o avanço das tecnologias de comunicação virtual, o conceito de presencialidade se "
                                + "altera, mudando o conceito de curso,\nde aula, que passa a existir em um tempo e em um espaço "
                                + "cada vez mais flexíveis.\r\n"
                                + "c) Os ambientes virtuais de aprendizagem (AVA), proporcionados pelas novas tecnologias de "
                                + "informação e comunicação (TIC), são\nos únicos meios de realização da educação a distância."
                                + "\r\n"
                                + "d) Os cursos oferecidos na modalidade a distância não são os mesmos daqueles ofertados "
                                + "presencialmente, porque as aulas\npráticas não podem ser realizadas por meio de ambientes "
                                + "virtuais.\r\n"
                                + "e) A avaliação da educação a distância necessita de ser realizada presencialmente pelo f"
                                + "ato de não existirem mecanismos de\navaliação virtual que sejam eficazes.");
                        resposta1 = t.next();
                        while (!resposta1.equalsIgnoreCase("a") && !resposta1.equalsIgnoreCase("b")
                                && !resposta1.equalsIgnoreCase("c") && !resposta1.equalsIgnoreCase("d")
                                && !resposta1.equalsIgnoreCase("e")) {
                            System.err.println("Resposta inválida");
                            System.out.println("Opções válidas (a-b-c-d-e)");
                            resposta1 = t.next();
                        }
                        break;
                    case 2:
                        System.out.println(
                                "2 - Coll e Monereo (2010) fazem um estudo sobre o impacto das tecnologias da informação e "
                                + "da comunicação (TIC) na educação\nformal e escolar a partir de uma revisão dos estudos sobre a "
                                + "incorporação dessas tecnologias na educação e de seus efeitos\nsobre as práticas educacionais "
                                + "e os processos de ensino e aprendizagem.\r\n" + "\r\n"
                                + "Na perspectiva dessas considerações, segundo os autores, avalie as seguintes asserções:\r\n"
                                + "\r\n"
                                + "I. São os contextos de uso das TIC que acabam determinando seu maior ou menor impacto nas "
                                + "práticas educacionais e sua maior\nou menor capacidade para transformar o ensino e melhorar "
                                + "a aprendizagem.\nPORTANTO\r\n"
                                + "II. O potencial educacional das TIC, como ferramentas para pensar, sentir e agir sozinhos "
                                + "e com outros, está em sua natureza\nde tecnologias “para” a informação e a comunicação e na "
                                + "introdução de um novo sistema simbólico para manejar a informação.\r\n" + "\r\n"
                                + "A respeito dessas afirmações, assinale a alternativa correta.\r\n"
                                + "a) As duas afirmações são verdadeiras, e a segunda é uma justificativa correta da primeira.\n"
                                + "b) As duas afirmações são verdadeiras, mas a segunda não é uma justificativa da primeira\n"
                                + "c) A primeira afirmação é verdadeira, e a segunda falsa.\r\n"
                                + "d) A primeira afirmação é falsa, e a segunda verdadeira.\n"
                                + "e) Tanto a primeira quanto a segunda afirmações são falsas.");
                        resposta2 = t.next();
                        while (!resposta2.equalsIgnoreCase("a") && !resposta2.equalsIgnoreCase("b")
                                && !resposta2.equalsIgnoreCase("c") && !resposta2.equalsIgnoreCase("d")
                                && !resposta2.equalsIgnoreCase("e")) {
                            System.err.println("Resposta inválida");
                            System.out.println("Opções válidas (a-b-c-d-e)");
                            resposta2 = t.next();
                        }
                        break;
                    case 3:
                        System.out.println(
                                "3 - A capacidade de se comunicar e utilizar as novas tecnologias de informação e comunicação "
                                + "são saberes consideradosde grande\nimportância para o desenvolvimento humano nas organizações. Sobre"
                                + " o tema, leia o depoimento abaixo:\n\nÉ fundamental que você domine os conceitos de 'fim e meio'. "
                                + "A educação é o fator fim e a comunicação é o meio. Se você já\npossui os conhecimentos necessários "
                                + "sobre a educação, também tem que saber se "
                                + "expressar, convencer, persuadir,\nbuscandoatingir o seu objetivo maior. Você tem que incorporar o "
                                + "vocabulário e o uso das tecnologias de comunicação da sua nova\nárea de trabalho.\n\n(Quirinos; Laudares, 2008, p. 89)"
                                + "A importância de se desenvolver a habilidade de comunicação na Gestão de Pessoas deve-se:\n\n"
                                + "a) à necessidade de circulação e divulgação da informação, para garantir o equilíbrio das relações "
                                + "intrapessoais e\ninterpessoais no contexto institucional.\r\n"
                                + "b) ao uso dos meios eletrônicos no contexto das organizações, já que esse é o canal de veiculação "
                                + "mais eficaz no ambiente\norganizacional.\r\n"
                                + "c) à adoção de processos burocráticos na comunicação, como forma de atingir todos os subordinados "
                                + "simultaneamente.\r\n"
                                + "d) à adequação do canal de veiculação das mensagens às necessidades dos funcionários.\r\n"
                                + "e) à diminuição das interações mediatizadas e aumento das relações diretas.");
                        resposta3 = t.next();
                        while (!resposta3.equalsIgnoreCase("a") && !resposta3.equalsIgnoreCase("b")
                                && !resposta3.equalsIgnoreCase("c") && !resposta3.equalsIgnoreCase("d")
                                && !resposta3.equalsIgnoreCase("e")) {
                            System.err.println("Resposta inválida");
                            System.out.println("Opções válidas (a-b-c-d-e)");
                            resposta3 = t.next();
                        }
                        break;
                    case 4:
                        System.out.println(
                                "4 - O uso das novas tecnologias na educação podepromover algumas mudanças na abordagem "
                                + "pedagógica tornando o processo de\ntransmissão de conhecimento mais dinâmico e criativo. Diversas "
                                + "habilidades podem ser praticadas no ensino escolar,facilitando\nos tipos de comunicação e "
                                + "interação entreos professores e os alunos. Dessa forma, o uso das novas tecnologias na escola pode:\n\n"
                                + "I. Oportunizar ao professor diferentes formas e recursosde ensino e aprendizagem.\r\n"
                                + "II. Estabelecer novas relações com o saber.\r\n"
                                + "III. Envolver os alunos para novas descobertas. \r\n"
                                + "IV. Contribuir para as práticas educacionais.\r\n"
                                + "V. Utilizar o computador somente como fonte deinformação.\r\n" + "\r\n"
                                + "Assinale a alternativa correta:\r\n" + "a) I, II, III e IV apenas\r\n"
                                + "b) I, II e III apenas\r\n" + "c) I, II, III e V apenas\r\n"
                                + "d) I, II, IV e V apenas\n" + "e) II, III, IV e V apenas");
                        resposta4 = t.next();
                        while (!resposta4.equalsIgnoreCase("a") && !resposta4.equalsIgnoreCase("b")
                                && !resposta4.equalsIgnoreCase("c") && !resposta4.equalsIgnoreCase("d")
                                && !resposta4.equalsIgnoreCase("e")) {
                            System.err.println("Resposta inválida");
                            System.out.println("Opções válidas (a-b-c-d-e)");
                            resposta4 = t.next();
                        }
                        break;
                    case 5:
                        System.out.println(
                                "5 - No que diz respeito ao uso das Tecnologias da Informação e da Comunicação (TIC) nas práticas "
                                + "pedagógicas fundamentadas nas\nteorias críticas, é INCORRETO afirmar:\r\n\n"
                                + "a) As TIC precisam ser consideradas como produtos da atividade humana, historicamente construídas,"
                                + "portanto como artefatos\nsociais e culturais que expressam relações de poder, intenções e "
                                + "interesses diversos.\r\n"
                                + "b) A mediação tecnológica é adotada com o objetivo primeiro de estabelecer relações intrínsecas entre "
                                + "educação e preparação\npara o mundo do trabalho, observando, sobretudo, a lógica da competitividade "
                                + "instaurada no mundo globalizado.\r\n"
                                + "c) Os ambientes interativos (como chats e grupos de discussão on-line) mostram-se como recursos "
                                + "potenciais nas relações\neducacionais.\r\n"
                                + "d) No mundo marcado pela tecnologia, a escola necessita fazer uso das TIC não apenas para democratizar "
                                + "o acesso a elas como\ntambém para favorecer a compreensão das potencialidades da educação.\n"
                                + "e) Nenhuma das anteriores");
                        resposta5 = t.next();
                        while (!resposta5.equalsIgnoreCase("a") && !resposta5.equalsIgnoreCase("b")
                                && !resposta5.equalsIgnoreCase("c") && !resposta5.equalsIgnoreCase("d")
                                && !resposta5.equalsIgnoreCase("e")) {
                            System.err.println("Resposta inválida");
                            System.out.println("Opções válidas (a-b-c-d-e)");
                            resposta5 = t.next();
                        }
                        break;
                    case 6:
                        System.out.println(
                                "6 - O expressivo desenvolvimento das Tecnologias da Informação e da Comunicação (TIC) ocorrido "
                                + "nas últimas décadas\npotencializou a Educação a Distância (EaD). Em relação a essa temática, marque "
                                + "V para as afirmativas verdadeiras e F para as\nfalsas.\r\n\n"
                                + "( ) O uso das TIC na educação foi previsto na Lei de Diretrizes e Bases da Educação Nacional de 1996 "
                                + "exclusivamente para\na modalidade a distância, uma vez que a educação presencial fundamenta-se no "
                                + "diálogo e na interação direta entre os atores\nenvolvidos no processo educativo.\r\n"
                                + "( ) A EaD altera os conceitos de espaço e tempo historicamente adotados pelas escolas e universidades,"
                                + "pois permite\nintercomunicação síncrona e assíncrona entre educadores e educandos posicionados em "
                                + "diferentes contextos geográficos\ne culturais.\r\n"
                                + "( ) A educação a distância é potencializada pela integração de várias mídias que podem ser acessadas "
                                + "tanto em tempo real\ncomo no horário favorável a cada educador e educando.\r\n"
                                + "( ) O professor que atua na EaD precisa estar atento ao ritmo de cada aluno, às suas formas pessoais "
                                + "de navegação. Na condição\nde docente não impõe; acompanha, sugere, incentiva, questiona, aprende "
                                + "junto com o aluno.\r\n" + "Assinale a sequência correta. \r\n"
                                + "a) V, F, V, F\r\n" + "b) V, V, F, F\r\n" + "c) F, V, V, V\r\n"
                                + "d) F, F, F, V\r\n" + "e) F, F, F, V");
                        resposta6 = t.next();
                        while (!resposta6.equalsIgnoreCase("a") && !resposta6.equalsIgnoreCase("b")
                                && !resposta6.equalsIgnoreCase("c") && !resposta6.equalsIgnoreCase("d")
                                && !resposta6.equalsIgnoreCase("e")) {
                            System.err.println("Resposta inválida");
                            System.out.println("Opções válidas (a-b-c-d-e)");
                            resposta6 = t.next();
                        }
                        break;
                    case 7:
                        System.out.println(
                                "7 - “Para que o uso das tecnologias signifique uma transformação educativa, os professores "
                                + "terão que mudar e redesenhar seu\npapel na escola atual”.(SANCHO, Juana Maria; HERNÁNDEZ,Fernando. "
                                + "Tecnologias para transformar a educação. Porto Alegre:\nArtmed, 2006, p.36) .Combase no texto e nos "
                                + "debates sobre o ensino de História e as novas tecnologias, é correto afirmar que:\r\n\n"
                                + "a) A maioria dos professores ainda não se encontra preparada para o aporte das tecnologias no ensino "
                                + "de História, mesmo com a\nobrigatoriedade definida nos Parâmetros Curriculares Nacionais.\r\n"
                                + "b) Os professores devem sensibilizar-se a respeito das mudanças de papéis vinculados à presença das "
                                + "tecnologias na educação.\nPor isso, eles devem estar dispostos a experimentar novas formas de ensino, "
                                + "a discutir e refletir sobre os resultados.\r\n"
                                + "c) É preciso refletir sobre o que significa ensinar no século XXI, o papel dos professores e das "
                                + "diferentes linguagens para o\nensino, considerando que, a linguagem tecnológica ou uso dastecnologias, assume a liderança nas metodologias de ensino nas escolas públicas de todopaís.\r\n"
                                + "d) O computador, por exemplo, pode ser utilizado de maneira criativa pelos alunos, por meio de "
                                + "pesquisas em sites, consulta a\narquivos, museus etc, tornando a disciplina de História mais dinâmica."
                                + " Porém, pouco amplia a consciência histórica dos\ndiscentes e a construção deconceitos e visões sobre"
                                + " o mundo, só possível por meio dos manuais didáticos convencionais.\r\n"
                                + "e) A incorporação das tecnologias no âmbito escolar deve ser considerada como parte da estratégia da"
                                + " política educacional para\no desenvolvimento do aluno e seus saberes, e independe da formação do "
                                + "professor para trabalhar com as mesmas, pois os próprios\nalunos do século XXI podem operar os "
                                + "materiais.");
                        resposta7 = t.next();
                        while (!resposta7.equalsIgnoreCase("a") && !resposta7.equalsIgnoreCase("b")
                                && !resposta7.equalsIgnoreCase("c") && !resposta7.equalsIgnoreCase("d")
                                && !resposta7.equalsIgnoreCase("e")) {
                            System.err.println("Resposta inválida");
                            System.out.println("Opções válidas (a-b-c-d-e)");
                            resposta7 = t.next();
                        }
                        break;
                    case 8:
                        System.out.println(
                                "8 - A obra organizada por Veiga, “Técnicas de Ensino: novos tempos, novas configurações”, traz"
                                + " um capítulo escrito por Jose\nCarlos Souza Araujo, intitulado “Do quadro-negro à lousa virtual: "
                                + "técnica, tecnologia e tecnicismo”. São ideias deste autor\ntodas elencadas a seguir, exceto:\r\n"
                                + "a) Os métodos, as técnicas e as tecnologias educativas, apesar de serem um objeto teórico que se "
                                + "explicita projetivamente\nnum planejamento de ordem institucional e professoral, concorrem para o "
                                + "processo de ensino, viabilizando-o.\r\n"
                                + "b) Os objetivos de ensino são direcionados à operacionalização, o que não significa afirmar que não "
                                + "necessitam de mediações.\r\n"
                                + "c) Os métodos, as técnicas e as tecnologias educativas estão inseridos no planejamento educacional, são "
                                + "objetos das diretrizes\npolítico-educacionais e da legislação educacional, estão presentes nos planos"
                                + " interdisciplinares de ensino "
                                + "ou nos planos de\ncurso das diferentes disciplinas, e explicitam no projeto pedagógico da instituição,"
                                + " ou mesmo no planejamento de um dado curso\n"
                                + "d) O ensino viabilizado por técnicas, tecnologias e métodos educativos tem independência e autonomia e "
                                + "se\nconstitui e se exterioriza fenomenicamente por meio destas técnicas, destas tecnologias e destes"
                                + " métodos educativos.\n"
                                + "e) O processo de ensino não é neutro, como se a técnica, a tecnologia e o método educativos significassem "
                                + "uma intervenção\nisenta de intenções, de finalidades, de expectativas, de concepções, de ideais, de "
                                + "aspirações ou crenças.");
                        resposta8 = t.next();
                        while (!resposta8.equalsIgnoreCase("a") && !resposta8.equalsIgnoreCase("b")
                                && !resposta8.equalsIgnoreCase("c") && !resposta8.equalsIgnoreCase("d")
                                && !resposta8.equalsIgnoreCase("e")) {
                            System.err.println("Resposta inválida");
                            System.out.println("Opções válidas (a-b-c-d-e)");
                            resposta8 = t.next();
                        }
                        break;
                    case 9:
                        System.out.println(
                                "9 - No que diz respeito à Webconferência comoinstrumento metodológico de ensino superior "
                                + "na modalidade virtual, marque V\npara as afirmativas verdadeiras e F para as falsas: \r\n\n"
                                + "( ) É a mais eficiente ferramenta do Ambiente Virtual de Aprendizagem, na construção do processo de "
                                + "socialização de\nexperiências escolares, poispermite, em tempo real, a interação entre os "
                                + "participantes de diversas regiões do país e do mundo\nsimultaneamente.\r\n"
                                + "( ) Sua função é testar e carregar os dispositivosinstalados no computador e iniciar o sistema "
                                + "operacional.\r\n"
                                + "( ) É um periférico clássico de saída, onde asinformações armazenadas internamente sob aforma binária"
                                + " são convertidas em\nsímbolos impressos em um meio externo qualquer e em formatos inteligíveis para o "
                                + "usuário.\r\n"
                                + "( ) Com essa ferramenta é possível utilizar áudio,vídeo e socializar apresentação de slides ou outros "
                                + "documentos, trocando\narquivos.\r\n" + "A sequência correta é: \r\n"
                                + "a) V, F, F, V.\r\n" + "b) V, V, F, F.\r\n" + "c) V, V, V, V.\r\n"
                                + "d) F, F, F, F.\r\n" + "e) F, V, V, F");
                        resposta9 = t.next();
                        while (!resposta9.equalsIgnoreCase("a") && !resposta9.equalsIgnoreCase("b")
                                && !resposta9.equalsIgnoreCase("c") && !resposta9.equalsIgnoreCase("d")
                                && !resposta9.equalsIgnoreCase("e")) {
                            System.err.println("Resposta inválida");
                            System.out.println("Opções válidas (a-b-c-d-e)");
                            resposta9 = t.next();
                        }
                        break;
                    case 10:
                        System.out.println("10 - Leia o texto.\r\n" + "\r\n"
                                + "Os Objetos de Aprendizagem são elementos de uma nova metodologia de ensino e aprendizagem baseada no "
                                + "uso do computador e da\nInternet. É uma tecnologia recente que abre caminhos naeducação a distância, "
                                + "trazendo inovações e soluções que podem\nbeneficiar todos os envolvidos noprocesso.\r\n"
                                + "\r\n"
                                + "Acerca dos objetos de aprendizagem, marque as afirmações verdadeiras com (V) e as falsas com(F)."
                                + "\r\n"
                                + "( ) Os objetos de aprendizagem são recursos digitais que podem ser usados, reutilizados ecombinados "
                                + "com outros objetos para\nformar um ambiente de aprendizado rico e flexível.\r\n"
                                + "( ) Os objetos de aprendizagem podem ser produzidos em qualquer mídia ou formato, podendo ser simples "
                                + "como uma apresentação de\nslides ou complexos como uma simulação.\r\n"
                                + "( ) Os repositórios dos objetos de aprendizagem possibilitam atender somente aos professores doensino "
                                + "superior, com recursos\nde alta qualidade que podem ser identificados e reutilizados emsua prática "
                                + "pedagógica.\r\n"
                                + "( ) A Interoperabilidade e a flexibilidade não constituem características para o desenvolvimento "
                                + "de objetos de aprendizagem.\r\n"
                                + "( ) A utilização de objetos de aprendizagem representa um novo modo de aprender mediada pelo "
                                + "computador"
                                + ", dessa forma constitui\num recurso pedagógico que propicia a participação ativa doaprendiz, "
                                + "eliminando a mediação do professor.\r\n"
                                + "( ) Os objetos de aprendizagem que se utilizam das potencialidades interativas de multimídia e "
                                + "hipermídia representam uma\ncomunicação didática entre professor-estudante e estudante-estudante."
                                + "\r\n" + "Assinale a alternativa que contém a sequência CORRETA de cima para baixo.\r\n"
                                + "a) F, V, F, V, F, V\r\n" + "b) V, V, F, F, F, V\r\n" + "c) F, F, F, F, F, V\r\n"
                                + "d) V, V, F, F, V, V\r\n" + "e) V, V, V, V, F, F");
                        resposta10 = t.next();
                        while (!resposta10.equalsIgnoreCase("a") && !resposta10.equalsIgnoreCase("b")
                                && !resposta10.equalsIgnoreCase("c") && !resposta10.equalsIgnoreCase("d")
                                && !resposta10.equalsIgnoreCase("e")) {
                            System.err.println("Resposta inválida");
                            System.out.println("Opções válidas (a-b-c-d-e)");
                            resposta10 = t.next();
                        }
                        break;

                }

            }

            System.out.println("\t\t\tGabarito das questões\n01 - B\n02 - C\n03 - A\n04 - A\n05 - B\n06 - C\n07 - B\n"
                    + "08 - D\n09 - A\n10 - B");

            if (resposta1.equalsIgnoreCase("B")) {
                contador++;
            }
            if (resposta2.equalsIgnoreCase("C")) {
                contador++;
            }
            if (resposta3.equalsIgnoreCase("A")) {
                contador++;
            }
            if (resposta4.equalsIgnoreCase("A")) {
                contador++;
            }
            if (resposta5.equalsIgnoreCase("B")) {
                contador++;
            }
            if (resposta6.equalsIgnoreCase("C")) {
                contador++;
            }
            if (resposta7.equalsIgnoreCase("B")) {
                contador++;
            }
            if (resposta8.equalsIgnoreCase("D")) {
                contador++;
            }
            if (resposta9.equalsIgnoreCase("A")) {
                contador++;
            }
            if (resposta10.equalsIgnoreCase("B")) {
                contador++;
            }

            for (int i = controleAluno; i <= controleAluno; i++) {
                for (int j = 0; j < alunosNotas[i].length; j++) {
                    if (j == 0) {
                        alunosNotas[i][j] = nomeAluno;
                    } else {
                        alunosNotas[i][j] = Integer.toString(contador);
                    }

                }
                System.out.println("A sua nota final é igual a: " + alunosNotas[i][1]);
            }
            controleAluno++;
            contador = 0;

            System.out.println("Outro aluno para fazer a prova? (s/n)");
            opcao = t.next();
            while (!opcao.equalsIgnoreCase("n") && !opcao.equalsIgnoreCase("s")) {
                System.err.println("Opção incorreta");
                System.out.println("Digite \"s\" para sim e \"n\" para não:");
                opcao = t.next();
            }

            if (controleAluno >= 5) {
                System.out.println("Todos os alunos já fizeram prova");
                break;
            }

        } while (opcao.equalsIgnoreCase("s"));
        int maiorNota = 0, menorNota = 0, convertInt;
        boolean verifica = false, print = true;
        double media = 0;
        System.out.println("Notas dos alunos:");
        for (int i = 0; i < alunosNotas.length; i++) {
            if (print == false) {
                break;
            }
            for (int j = 0; j < alunosNotas[i].length; j++) {
                if (alunosNotas[i][j] == null) {
                    print = false;
                    break;
                }
                System.out.print(alunosNotas[i][j] + "\t");
                if (j != 0) {
                    convertInt = Integer.parseInt(alunosNotas[i][j]);
                    if (verifica == false) {
                        menorNota = convertInt;
                        verifica = true;
                    }
                    if (convertInt > maiorNota) {
                        maiorNota = convertInt;
                    }
                    if (convertInt <= menorNota) {
                        menorNota = convertInt;
                    }
                    media += convertInt;
                }
            }
            if (print == true) {
                System.out.println();
            }

        }
        media = media / controleAluno;
        System.out.println("Maior nota:" + maiorNota);
        System.out.println("Menor nota:" + menorNota);
        System.out.println("Quantidade de alunos que utilizaram o sistema:" + controleAluno);
        System.out.printf("Média das notas dos alunos: %.1f\n", media);

    }
}

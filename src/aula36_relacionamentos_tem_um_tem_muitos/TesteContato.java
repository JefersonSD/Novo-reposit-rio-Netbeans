/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula36_relacionamentos_tem_um_tem_muitos;

/**
 *
 * @author jsjef
 */
public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("Jeferson");
        /*Vai ocorrer um erro porque o set do contato está aguardando um parâmetro do tipo endereco e telefone
        contato.setEndereco("Kings Landing");
        contato.setTelefone("99999-9999");*/

        //Criação do objeto do tipo endereco [relacionamento tem-um]
        Endereco end = new Endereco();
        end.setCidade("Londres");
        end.setCep("0000000");
        end.setComplemento("Lote 1");
        end.setEstado("Masashusets");
        end.setNomeRua("Clauio Martins");
        end.setNumero("301");
        //setando o Endereco com o objeto end
        contato.setEndereco(end);

        //Criação do objeto do tipo telefone [relacionamento tem-um]
        Telefone tel = new Telefone();
        tel.setDdd("61");
        tel.setNumero("99999-9999");
        tel.setTipo("celular");
        
        Telefone tel2 = new Telefone();
        tel2.setDdd("62");
        tel2.setNumero("88888-8888");
        tel2.setTipo("home");
        
        Telefone [] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;

        //setando o Telefone com o objeto telefones
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCep());
        }
//        if (contato != null && contato.getTelefones() != null) {
//            for (int i = 0; i < telefones.length; i++) {
//                System.out.println(contato.getTelefones()[i].getDdd() + " " + contato.getTelefones()[i].getNumero());
//                
//            }
//        }
        
        if(contato != null && contato.getTelefones() != null){
            for(Telefone t : telefones){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

    }

}


import exercicios_aula36_tem_um_tem_muitos.Agenda;
import exercicios_aula36_tem_um_tem_muitos.Contato;
import java.util.ArrayList;
import java.util.List;


class Exemplo {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        List<Contato> ListaContatos = new ArrayList();
        int i = 0;
        
        while(i<=3){
            Contato contato = new Contato();
            i++;
            contato.setEmail("@");
            contato.setNome("jj");
            contato.setTelefone("00");
            ListaContatos.add(contato);
        }
    
        agenda.setContatos(ListaContatos);
        
        for(Contato c : agenda.getContatos()){
            System.out.println(c.getNome());
            System.out.println(c.getTelefone());
            System.out.println(c.getEmail());
        }
                  
    }

}

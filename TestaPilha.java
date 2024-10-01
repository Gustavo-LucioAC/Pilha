import java.util.Stack;

public class TestaPilha {

    public static void main(String[] args) {

        Stack<Object> pilha = new Stack<>();
        TestaPilha programa = new TestaPilha();

        System.out.println("1)");
        pilha.push(10);
        System.out.println("Topo novo: " + pilha.peek());
        pilha.push(20);
        pilha.push(30);

        System.out.println("2)");
        System.out.println("Tamanho da pilha: " + pilha.size());

        System.out.println("3)");
        System.out.println("Elementos da pilha (desempilhando):");
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }

        pilha.push(40);
        pilha.push(50);

        System.out.println("4)");
        System.out.println("Topo da pilha: " + pilha.peek());

        int elementoParaVerificar = 40;
        if (pilha.contains(elementoParaVerificar)) {
            System.out.println("5)");
            System.out.println("Elemento " + elementoParaVerificar + " existe na pilha na posicaoo " + pilha.search(elementoParaVerificar));
        } else {
            System.out.println("Elemento " + elementoParaVerificar + " não existe na pilha.");
        }

        pilha.push(new Contato("Carlos", "319454574", "test01@teste.com"));
        pilha.push(new Contato("Lucas", "12345678", "teste02@teste.com"));

        Contato contatoBuscado = programa.buscaPorNome("Carlos", pilha);
        if (contatoBuscado != null) {
            System.out.println("6)");
            System.out.println("Contato encontrado por nome: " + contatoBuscado);
        } else {
            System.out.println("6)");
            System.out.println("Contato não encontrado por nome.");
        }

        contatoBuscado = programa.buscaPorEmail("teste02@teste.com", pilha);
        if (contatoBuscado != null) {
            System.out.println("7)");
            System.out.println("Contato encontrado por email: " + contatoBuscado);
        } else {
            System.out.println("7)");
            System.out.println("Contato não encontrado por email.");
        }

        contatoBuscado = programa.buscaPorTelefone("319454574", pilha);
        if (contatoBuscado != null) {
            System.out.println("8)");
            System.out.println("Contato encontrado por telefone: " + contatoBuscado);
        } else {
            System.out.println("8)");
            System.out.println("Contato não encontrado por telefone.");
        }

        System.out.println("9)");
        System.out.println("Desempilhando elemento: " + pilha.pop());
        System.out.println("Topo novo: " + pilha.peek());
    }

    public Contato buscaPorNome(String nome, Stack<Object> pilha) {
        for (Object obj : pilha) {
            if (obj instanceof Contato) {
                Contato c = (Contato) obj;
                if (c.getNome().equals(nome)) {
                    return c;
                }
            }
        }
        return null;
    }

    public Contato buscaPorEmail(String email, Stack<Object> pilha) {
        for (Object obj : pilha) {
            if (obj instanceof Contato) {
                Contato c = (Contato) obj;
                if (c.getEmail().equals(email)) {
                    return c;
                }
            }
        }
        return null;
    }

    public Contato buscaPorTelefone(String telefone, Stack<Object> pilha) {
        for (Object obj : pilha) {
            if (obj instanceof Contato) {
                Contato c = (Contato) obj;
                if (c.getTelefone().equals(telefone)) {
                    return c;
                }
            }
        }
        return null;
    }
}

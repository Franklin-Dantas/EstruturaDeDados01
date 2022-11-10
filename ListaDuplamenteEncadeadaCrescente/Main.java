public class Main {
    
    public static void main(String[] args) throws Exception {
        LDE<Integer> listaInt = new LDE();
        
        listaInt.inserirFinal(124);
        listaInt.inserirFinal(1);
        listaInt.inserirFinal(32);
        listaInt.inserirInicio(3325);
        listaInt.inserirInicio(12);
        listaInt.exibirTodos();

        listaInt.removerInicio();
        listaInt.exibirTodos();
        listaInt.removerFinal();
        listaInt.exibirTodos();
    }    
}

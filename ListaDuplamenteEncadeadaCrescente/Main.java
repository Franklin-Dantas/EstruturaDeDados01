public class Main {
    public static void main(String[] args) throws Exception {
        LDECrescente<Integer> listaCrescente = new LDECrescente();
        LDE<Integer> Lista = new LDE();
        
        Lista.inserirFinal(12);
        Lista.inserirFinal(16);
        Lista.inserirFinal(32);
        Lista.inserirInicio(35);
        Lista.inserirInicio(42);
        Lista.exibirTodos();

        Lista.removerInicio();
        Lista.exibirTodos();
        Lista.removerFinal();
        Lista.exibirTodos();
        Lista.exibirAoContrario();
    }    
}

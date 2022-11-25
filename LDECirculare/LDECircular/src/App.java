package LDECirculare.LDECircular.src;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    /*

    /amanda
      LDECircular<Integer> l1 = new LDECircular();

        LDECircular<Integer> l2 = new LDECircular();
    

        //Testa método concatenar
        l1.inserirOrdemDecrescente(5);
        l1.inserirOrdemDecrescente(9);
        l1.inserirOrdemDecrescente(3);
        l1.inserirOrdemDecrescente(12);

        l2.inserirOrdemDecrescente(7);
        l2.inserirOrdemDecrescente(8);
        l2.inserirOrdemDecrescente(34);

        l1.concatenar(l1, l2);
        l1.exibirTodos();

        //Testa método dividir
        l2.inserirOrdemDecrescente(5);
        l2.inserirOrdemDecrescente(9);
        l2.inserirOrdemDecrescente(3);
        l2.inserirOrdemDecrescente(12);

        
        LDECircular<Integer> l3 = l2.dividir();
        l3.exibirTodos();
        l2.exibirTodos();
        
    /



     Scanner s = new Scanner(System.in);
        int capacity;
        System.out.println("Insert the list capacity:");
        capacity = Integer.parseInt(s.nextLine());
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>(capacity);
        int op;
        Integer number;

        do {
            options();
            op = Integer.parseInt(s.nextLine());
            switch (op) {

                case 1:
                    if (!list.isFull()) {
                        System.out.println("Insert a number: ");
                        number = Integer.parseInt(s.nextLine());
                        list.insertionDescendingSort(number);
                    } else {
                        System.out.println("List is full!");
                    }
                    break;
                case 2:
                    System.out.println("Insert a number: ");
                    number = Integer.parseInt(s.nextLine());
                    list.removeNode(number);
                    break;
                case 3:
                    System.out.println("Insert a number: ");
                    number = Integer.parseInt(s.nextLine());
                    DoublyLinkedNode<Integer> search = list.search(number);
                    if (search == null) {
                        System.out.println("Number not found!");
                    } else {
                        System.out.println("Number is on the list. Result: " + search.getContent());
                    }
                    break;
                case 4:
                    list.showAll();
                    break;
                case 0:
                    System.out.println("End of the program!");
                    break;
                default:
                    System.out.println("Not an option!");
                    break;
            }

        } while (op != 0);
    }

    public static void options() {
        System.out.println("1 - Add a number to the list\n" + "2 - Remove a number from the list\n"
                + "3 - Search for a number on the list\n" + "4 - Show all numbers on the list");
    }
    */
}

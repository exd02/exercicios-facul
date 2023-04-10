import classes.*;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

/*
 * FALTOU FAZER ON CASCADE DELETE (quando apagar cliente ou produto, apagar todos os pedidos referentes a aquele dado)
 */

public class App {
    public static void main(String[] args) throws Exception {
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        List<Produto> listaProdutos = new ArrayList<Produto>();
        List<Pedido> listaPedidos = new ArrayList<Pedido>();

        Scanner sc = new Scanner(System.in);
        char option = '0';
        do
        {
            printMenu();
            System.out.print("Selecione a opção: ");
            option = sc.next().charAt(0);

            // clearConsole();
            if (option == '1') // Inserir Cliente
            {
                Cliente c = new Cliente();
                c.fill();

                if (buscarClienteCpf(listaClientes, c.getCpf()) != null) // Caso já exista um cliente com esse CPF, ñ adicionar
                {
                    System.out.println(" Não foi possível adicionar, já existe cliente com esse CPF");
                }
                else
                {
                    listaClientes.add(c);
                }
            }
            else if (option == '2') // Remover Cliente a partir do CPF
            {
                System.out.print("Digite o CPF: ");
                String buscar = sc.next(); // nextLine da problema

                Cliente c = buscarClienteCpf(listaClientes, buscar);

                if (c == null)
                {
                    System.out.println("Não é possível encontrar o cliente com o CPF desejado!");
                }
                else 
                {
                    listaClientes.remove(c);
                }
            }
            else if (option == '3') // Listar os clientes
            {
                if (listaClientes.isEmpty())
                {
                    System.out.println("Não é possível Listar Clientes, a lista está vazia!");
                }
                else
                {
                    for (Cliente c : listaClientes) {
                        System.out.println(c.toString());
                    }
                }
            }
            else if (option == '4') // Inserir Produto
            {
                Produto p = new Produto();
                p.fill();
                listaProdutos.add(p);
            }
            else if (option == '5') // Remover Produto a partir do ID
            {
                System.out.print("Digite o ID do Produto: ");
                int buscar = sc.nextInt();

                Produto p = buscarProdutoId(listaProdutos, buscar);
                if (p == null)
                {
                    System.out.println("Não há produtos com o ID desejado! ");
                    break;
                }
                else
                {
                    listaProdutos.remove(p);
                }
            }
            else if (option == '6') // Imprimir Produtos
            {
                if (listaProdutos.isEmpty())
                {
                    System.out.println("Não é possível Listar os Produtos, a lista está vazia!");
                }
                else
                {
                    for (Produto p : listaProdutos) {
                        System.out.println(p.toString());
                    }
                }
            }
            else if (option == '7') // Inserir Pedido
            {
                System.out.print("Digite o CPF do Cliente que fez o pedido: ");
                String cpfBuscar = sc.next();
                Cliente c = buscarClienteCpf(listaClientes, cpfBuscar);

                if (c == null)
                {
                    System.out.println("Não é possível encontrar o cliente com o CPF desejado!");
                }
                else 
                {
                    System.out.println("O cliente '" + c.getNome() + "' foi selecionado, preencha o seu carrinho!");
                    List<Produto> carrinho = new ArrayList<Produto>();
                    char adicionarOutroProduto = 's';
                    do
                    {
                        System.out.print("Adicionar mais um Produto (s/n)?: ");
                        adicionarOutroProduto = sc.next().charAt(0);
                        if (adicionarOutroProduto == 'n')
                        {
                            break;
                        }
                        
                        System.out.print("Digite o ID do produto para adicionar ao carrinho: ");
                        int buscarId = sc.nextInt();

                        Produto p = buscarProdutoId(listaProdutos, buscarId);
                        if (p == null)
                        {
                            System.out.println("Não há produtos com o ID desejado! ");
                        }
                        else
                        {
                            carrinho.add(p);
                        }
                    } while (adicionarOutroProduto != 'n');
                    System.out.println("Pedido Registrado!");
                    Pedido p = new Pedido(c, carrinho);
                    listaPedidos.add(p);
                }
                
            }
            else if (option == '8') // Remover Pedido (a partir do ID)
            {
                System.out.print("Digite o ID do Pedido: ");
                int buscar = sc.nextInt();

                Pedido ped = buscarPedidoId(listaPedidos, buscar);
                if (ped == null)
                {
                    System.out.println("Não há Pedidos com o ID desejado! ");
                    break;
                }
                else
                {
                    listaPedidos.remove(ped);
                }
            }
            else if (option == '9') // Imprimir Pedidos
            {
                for (Pedido ped : listaPedidos) {
                    System.out.println("Pedido [id=" + ped.getId() + ", cliente= " + ped.getCliente().getNome() + ", listaIds=" + ped.stringIdsCarrinho() + "]");
                }
            }
            else if (option == 'a' || option == 'A') // Total de pedidos
            {
                int totalPedidos = 0;
                for (Pedido pedido : listaPedidos) {
                    totalPedidos++;   
                }
                System.out.println("Total de pedidos: " + totalPedidos);
            }
            else if (option == 'b' || option == 'B') // Faturamento total dos pedidos
            {
                double faturamento = 0;
                for (Pedido pedido : listaPedidos) {
                    faturamento += pedido.getFaturamento();
                }
                System.out.println("Faturamento total: " + faturamento);
            }
            else if (option == 'c' || option == 'C') // Qual produto teve mais saída
            {
                Map<Produto, Integer> quantidadePedidos = new HashMap<>(); // HashMap para guardar o ID do pedido e a quantidade de Pedidos feitas para ele
                for (Produto prod : listaProdutos)
                {
                    quantidadePedidos.put(prod, 0); // Inicializar o HashMap com todos os produtos com total pedido = 0
                }

                for (Pedido ped : listaPedidos) {
                    for (Produto prod : ped.getCarrinho()) {
                        quantidadePedidos.put(prod, quantidadePedidos.get(prod)+1);
                    }
                }

                Produto produtoMaisPedido = null;
                int maiorQuantidadePedidos = -1;

                for (Map.Entry<Produto, Integer> entry : quantidadePedidos.entrySet()) {
                    Produto p = entry.getKey();
                    int qtd = entry.getValue();

                    if (qtd > maiorQuantidadePedidos) {
                        produtoMaisPedido = p;
                        maiorQuantidadePedidos = qtd;
                    }
                }
                System.out.println("Produto mais pedido: " + produtoMaisPedido.getNome() + " (" + maiorQuantidadePedidos + "x)");
            }
            else if (option == 'd' || option == 'D') // Qual produto teve menos saída
            {
                Map<Produto, Integer> quantidadePedidos = new HashMap<>();
                for (Produto prod : listaProdutos)
                {
                    quantidadePedidos.put(prod, 0); // Inicializar o HashMap com todos os produtos com total pedido = 0
                }

                for (Pedido ped : listaPedidos) {
                    for (Produto prod : ped.getCarrinho()) {
                        quantidadePedidos.put(prod, quantidadePedidos.get(prod)+1);
                    }
                }

                Produto produtoMenosPedido = null;
                int menorQuantidadePedidos = Integer.MAX_VALUE;

                for (Map.Entry<Produto, Integer> entry : quantidadePedidos.entrySet()) {
                    Produto p = entry.getKey();
                    int qtd = entry.getValue();
                    
                    if (qtd < menorQuantidadePedidos) {
                        produtoMenosPedido = p;
                        menorQuantidadePedidos = qtd;
                    }
                }
                System.out.println("Produto menos pedido: " + produtoMenosPedido.getNome() + " (" + menorQuantidadePedidos + "x)");
            }
            else if (option == 'e' || option == 'E') // Qual cliente fez mais pedidos
            {
                Map<Cliente, Integer> quantidadePedidos = new HashMap<>();
                for (Cliente cliente : listaClientes)
                {
                    quantidadePedidos.put(cliente, 0);
                }

                for (Pedido pedido : listaPedidos)
                {
                    quantidadePedidos.put(pedido.getCliente(), (quantidadePedidos.get(pedido.getCliente()))+1);
                }
                
                Cliente clienteComMaisPedidos = null;
                int maisPedidos = -1;
                for (Map.Entry<Cliente, Integer> entry : quantidadePedidos.entrySet())
                {
                    Cliente cli = entry.getKey();
                    int qtd = entry.getValue();
                    
                    if (qtd > maisPedidos) {
                        clienteComMaisPedidos = cli;
                        maisPedidos = qtd;
                    }
                }
                System.out.println("Cliente com mais pedidos: " + clienteComMaisPedidos.getNome() + " (" + maisPedidos + "x)");
            }
            else if (option == 'f' || option == 'F') // Qual cliente gastou mais dinheiro
            {
                Map<Cliente, Double> mapQuantidadeGastaPorCliente = new HashMap<>();
                for (Cliente cliente : listaClientes)
                {
                    mapQuantidadeGastaPorCliente.put(cliente, 0.0);
                }

                for (Pedido pedido : listaPedidos)
                {
                    for (Produto produto : listaProdutos)
                    {
                        mapQuantidadeGastaPorCliente.put(pedido.getCliente(), (mapQuantidadeGastaPorCliente.get(pedido.getCliente())+produto.getValor()));
                    }
                }

                Cliente clienteQueMaisGastou = null;
                Double totalGasto = -1.0;
                for (Map.Entry<Cliente, Double> entry : mapQuantidadeGastaPorCliente.entrySet())
                {
                    Cliente cli = entry.getKey();
                    Double val = entry.getValue();
                    
                    if (val > totalGasto) {
                        clienteQueMaisGastou = cli;
                        totalGasto = val;
                    }
                }
                System.out.println("Cliente que mais gastou: " + clienteQueMaisGastou.getNome() + " (" + totalGasto + "x)");
            }
        } while (option != '0');
    }
    public static void printMenu()
    {
        System.out.println("\t------------- Menu -------------");
        System.out.println("\t1 - Inserir Cliente");
        System.out.println("\t2 - Remover Cliente");
        System.out.println("\t3 - Imprimir Clientes");

        System.out.println("\t4 - Inserir Produto");
        System.out.println("\t5 - Remover Produto");
        System.out.println("\t6 - Imprimir Produtos");

        System.out.println("\t7 - Inserir Pedido");
        System.out.println("\t8 - Remover Pedido");
        System.out.println("\t9 - Imprimir Pedidos");

        /*System.out.println("\tA - Qual total de pedidos");
        System.out.println("\tB - Qual o faturamento total dos pedidos");
        System.out.println("\tC - Qual produto teve mais saída ");
        System.out.println("\tD - Qual produto teve menos saída");
        System.out.println("\tE - Qual cliente fez mais pedidos");
        System.out.println("\tF - Qual cliente gastou mais dinheiro");*/

        System.out.println("\t0 - Sair");
        System.out.println("\t--------------------------------");
    }

    public static void clearConsole()
    {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    /* Retorna o cliente com CPF desejado */
    public static Cliente buscarClienteCpf(List<Cliente> listaClientes, String cpfBuscar)
    {
        if (listaClientes.isEmpty())
            return null;
        
        for (Cliente c : listaClientes) {
            if (cpfBuscar.equals(c.getCpf()))
            {
                return c;
            }
        }

        return null;
    }

    /* Retorna o produto com o ID desejado */
    public static Produto buscarProdutoId(List<Produto> listaProdutos, int idBusca)
    {
        if (listaProdutos.isEmpty())
            return null;
        
        for (Produto p : listaProdutos) {
            if (p.getId() == idBusca)
            {
                return p;
            }
        }

        return null;
    }

    /* Retorna o pedido com o ID desejado */
    public static Pedido buscarPedidoId(List<Pedido> listaPedidos, int idBusca)
    {
        if (listaPedidos.isEmpty())
            return null;
        
        for (Pedido ped : listaPedidos) {
            if (ped.getId() == idBusca)
            {
                return ped;
            }
        }

        return null;
    }
}
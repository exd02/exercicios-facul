import classes.PF;

public class App {
    public static double getTotalDevedorPessoa(PF pessoa)
    {
        double total = 0;

        for (int i=0; i<pessoa.getListContasPag().size(); i++)
        {
            total += pessoa.getListContasPag().get(i).getValor();
        }

        return total;
    }

    public static PF getPessoaComMaiorSaldoDevedor(PF[] pessoas)
    {
        double maiorSaldoDevedor = 0;
        PF pessoaComMaiorSaldoDevedor = null;

        for (PF pf : pessoas) {
            double totalDevedor = getTotalDevedorPessoa(pf);
            System.out.println(pf.getNome() + " deve R$ " + totalDevedor);

            if (totalDevedor > maiorSaldoDevedor)
            {
                maiorSaldoDevedor = totalDevedor;
                pessoaComMaiorSaldoDevedor = pf;
            }
        }

        if (pessoaComMaiorSaldoDevedor == null)
            System.out.println("Lista Vazia!");
        else
            System.out.println(pessoaComMaiorSaldoDevedor.getNome() + " tem o maior saldo devedor.");

        return pessoaComMaiorSaldoDevedor;
    }
    public static void main(String[] args) throws Exception {
        PF[] pessoas = new PF[3];

        for (int i=0; i<pessoas.length; i++)
        {
            pessoas[i] = new PF();
            pessoas[i].fill();
        }
        
        getPessoaComMaiorSaldoDevedor(pessoas);
    }
}

public class App {
    public static void main(String[] args) {
    
    ContaBanco p1 = new ContaBanco();//instanciando a classe ContaBanco.
    p1.setNumConta(1111);
    p1.setDono("Ceu");
    p1.abrirConta("CC");
    p1.depositar(100);

    ContaBanco p2 = new ContaBanco();
    p2.setNumConta(2222);
    p2.setDono("Luciana");
    p2.abrirConta("CP");
    p2.depositar(500);
    p2.sacar(100);

    p1.estadoAtual();
    p2.estadoAtual();
    }
}

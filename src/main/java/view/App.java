package view;

import javax.swing.JOptionPane;

import controller.ClienteJpaDAO;
import model.Cliente;

public class App 
{
    public static void main( String[] args )
    {
    	Cliente cliente = new Cliente();
    	int cont = 0;
    	int i =1;
    	do {
    		cliente.setNome(JOptionPane.showInputDialog("Digite seu Nome:"));
    		cliente.setCpf(JOptionPane.showInputDialog("Digite seu CPF:"));
        	cliente.setId(i);
        	cliente.setRg(JOptionPane.showInputDialog("Digite seu RG:"));
            ClienteJpaDAO.getInstance().merge(cliente);
            System.out.println("Cliente salvo com sucesso!");
            cont = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            i++;
    	}while(cont == 0);
    }
}
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AlunoView {
	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JLabel rotuloNome;
	private JLabel rotuloNumeroMatricula;
	private JLabel rotuloSexo;
	private JTextField campoNome;
	private JTextField campoMatricula;
	private JTextField campoSexo;
	
	
	public AlunoView() {
		iniciaGui();
	}
	public void iniciaGui(){
		//criar janela
		janela = new JFrame("Cadastro");
		//criar os botões
		botao1 = new JButton("Salvar");
		botao2 = new JButton("Cancelar");
		//criar campos
		campoNome = new JTextField();
		campoMatricula = new JTextField();
		campoSexo = new JTextField();
		//criar os rotulos
		rotuloNome = new JLabel();
		rotuloNumeroMatricula = new JLabel();
		rotuloSexo = new JLabel();
		//ajustando janela
		janela.setSize(500, 300);
		janela.setVisible(true);
		janela.getContentPane().setLayout(null);
		//ajustando os botões
		botao1.setBounds(280, 400, 50, 20);
		botao2.setBounds(420, 400, 50, 20);
		//ajustando os rotulos
		rotuloNome.setText("Nome: ");
		rotuloNome.setBounds(x, y, width, height);
		rotuloNumeroMatricula.setText("Número da matrícula: ");
		rotuloNumeroMatricula.setBounds(x, y, width, height);
		rotuloSexo.setText("Digite o sexo: ");
		rotuloSexo.setBounds(x, y, width, height);
		
			
	}
	public class campoDoNome implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
	
}

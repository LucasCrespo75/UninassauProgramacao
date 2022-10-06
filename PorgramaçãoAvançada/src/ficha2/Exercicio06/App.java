package ficha2.Exercicio06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws ParseException {
		
		List<Dependente> dependentes = new ArrayList<Dependente>();
		Funcionario funcionario = new Funcionario();
		String helper;
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		
		for (int i = 0; i < 3; i++) {
			dependentes.add(new Dependente());
		}
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a MATRICULA do Funcionário: ");
		funcionario.setMatricula(input.nextInt());
		
		System.out.print("Digite o SEXO do Funcionário [1 - Masculino // 2 - Feminino]: ");
		funcionario.setSexo(input.nextInt());
		
		System.out.print("Digite o TELEFONE do Funcionário: ");
		funcionario.setTelefone(input.nextInt());
		
		System.out.print("Digite o NOME do Funcionário: ");
		funcionario.setNomeCompleto(input.next());
		
		System.out.print("Digite o CPF do Funcionário: ");
		funcionario.setCpf(input.next());
		
		System.out.print("Digite o SALÁRIO do Funcionário: ");
		funcionario.setSalario(input.nextDouble());
		
		System.out.print("Digite a DATA DE NASCIMENTO do Funcionário: ");
		helper = input.next();
		funcionario.setDataNascimento(formatador.parse(helper));
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite o SEQUENCIAL do Dependente: ");
			dependentes.get(i).setSequencial(input.nextInt());
			
			System.out.print("Digite o NOME do Dependente: ");
			dependentes.get(i).setNomeCompleto(input.next());
			
			System.out.print("Digite o SEXO do Dependente [1 - Masculino // 2 - Feminino]: ");
			dependentes.get(i).setSexo(input.nextInt());
			
			System.out.print("Digite a DATA DE NASCIMENTO do Dependente: ");
			helper = input.next();
			dependentes.get(i).setDataNascimento(formatador.parse(helper));
			
			System.out.print("O Dependente PARTICIPA DO PLANO ?[true / false]: ");
			String participa = input.next();
			dependentes.get(i).setParticipaPlano(Boolean.parseBoolean(participa));
			
			System.out.println("Dependente indicado para o Funcionário de Matricula: " + funcionario.getMatricula());
			
		}
		
		funcionario.setDependentes(dependentes);
		
		System.out.println(dependentes.size());
		
		for (int i = 0; i < dependentes.size(); i++) {
			System.out.println("Nome do Dependente: " + funcionario.getDependentes().get(i).getNomeCompleto());
			System.out.println("Data de Nascimento: " + formatador.format(funcionario.getDependentes().get(i).getDataNascimento()));
			System.out.println("Participa do Plano: " + funcionario.getDependentes().get(i).getParticipaPlano());
			System.out.println("Sequencial: " + funcionario.getDependentes().get(i).getSequencial());
		}
		
		input.close();
	}
}

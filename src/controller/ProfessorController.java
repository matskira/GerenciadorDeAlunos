package controller;

import model.Professor;

public class ProfessorController {

	public void testaProfessor() {
		Professor p1 = new Professor();
		p1.setNome("Matheus Poda");
		p1.setCpf("48872345672");
		p1.setSalario(4230.00);
		p1.setMateria("Inform�tica");
		p1.exibe();
	}
}

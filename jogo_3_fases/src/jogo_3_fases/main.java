package jogo_3_fases;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

  String[] nomes = new String[100];
  int[] pontos = new int[100];
  int registros = 0;
  int pontos1 = 0;
  int jogada1;
  int jogada2;
  int i = 0;
  int empate = 0;
  int quiz1 = 0;
  int p1, p2, p3, p4, p5, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
  int fim = 0;
  
  do {  
  JOptionPane.showMessageDialog(null, "   !Pedra, Papel ou Tesoura! \n Aperte 'Enter' para começar");
  
  String jogador = JOptionPane.showInputDialog("Insira o nome do jogador: ");
  
	  do {
  
  jogada1 = Integer.parseInt(JOptionPane.showInputDialog("Insira sua jogada em números: \n 1 para pedra \n 2 para papel \n 3 para tesoura"));
  jogada2 = ((int)(Math.random()*3))+1;

  if (jogada1 == 1 && jogada2 == 3 || jogada1 == 2 && jogada2 == 1 || jogada1 == 3 && jogada2 == 2) {
	  pontos1 += 15;
	  JOptionPane.showMessageDialog(null, "Você venceu a rodada");
  }
  
  else if (jogada2 == 1 && jogada1 == 3 || jogada2 == 2 && jogada1 == 1 || jogada2 == 3 && jogada1 == 2) {
	  JOptionPane.showMessageDialog(null, "Você perdeu a rodada");
  }
  
  else if (jogada1 == jogada2){
	  empate++;
	  JOptionPane.showMessageDialog(null, "A rodada empatou");
  }
  
  i++;
	  } while(i < 3);
  
  if (i == 3 && pontos1 >= 30) {
	  JOptionPane.showMessageDialog(null, "Você venceu o jogo com " + pontos1 + "pontos");
  }
  
  if (i == 3 && pontos1 < 30) {
	  JOptionPane.showMessageDialog(null, "Você perdeu para o robo");
  }
  
  if (empate == 2 || pontos1 < 30) {
	  JOptionPane.showMessageDialog(null, "Pontos Insuficientes para avançar no jogo");
	  break;
  }
		  
  JOptionPane.showMessageDialog(null, "!Quiz de JAVA! \n Aperte 'Enter' para começar");
  
  p1 = Integer.parseInt(JOptionPane.showInputDialog("1° Pergunta: \n"
  		+ "Qual dessas palavras NÃO é uma palavra reservada? \n"
		+ "1) super \n"
		+ "2) program \n"
		+ "3) final"));
  
  switch (p1) {
  
  case 1:
	  JOptionPane.showMessageDialog(null, "Você errou!");
	  break;
  case 2:
	  JOptionPane.showMessageDialog(null, "Você acertou!");
	  quiz1 += 15;
	  break;
  case 3:
	  JOptionPane.showMessageDialog(null, "Você errou!");
	  break;
  }
	  
  p2 = Integer.parseInt(JOptionPane.showInputDialog("2° Pergunta: \n"
  		+ "Qual o nome original do JAVA? \n"
		+ "1) o nome original é OAK \n"
		+ "2) o nome original era Green Project \n"
		+ "3) o nome sempre foi JAVA"));
		  
	  switch (p2) {
		  
  case 1:
	  JOptionPane.showMessageDialog(null, "Você acertou!");
	  quiz1 += 15;
	  break;
  case 2:
	  JOptionPane.showMessageDialog(null, "Você errou!");
	  break;
  case 3:
	  JOptionPane.showMessageDialog(null, "Você errou!");	
	  break;
  }
	  
  p3 = Integer.parseInt(JOptionPane.showInputDialog("3° Pergunta: \n"
	  		+ "O que significa Multithreading? \n"
			+ "1) Ler varios tipos de codigos, não importando a linguagem \n"
			+ "2) Ser portavel para outras plataformas \n"
			+ "3) executar diferentes processos ao mesmo tempo."));
			  
		  switch (p3) {
			  
  case 1:
	  JOptionPane.showMessageDialog(null, "Você errou!");
	  break;  
  case 2:
	  JOptionPane.showMessageDialog(null, "Você errou!");	
	  break;
  case 3:
	  JOptionPane.showMessageDialog(null, "Você acertou!");
	  quiz1 += 15;  	  
	  break;
		  }
  p4 = Integer.parseInt(JOptionPane.showInputDialog("4° Pergunta: \n"
	 		+ "Qual desses é um Ambiente de desenvolvimento Java? \n"
			+ "1) API \n"
			+ "2) JJE \n"
			+ "3) JPE "));
		  
		  switch (p4) {
		  
	  case 1:
	      JOptionPane.showMessageDialog(null, "Você acertou!");
	      quiz1 += 15;	
		  break;
	  case 2:
		  JOptionPane.showMessageDialog(null, "Você errou!");	
		  break;
	  case 3:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
		  }
		  
  p5 = Integer.parseInt(JOptionPane.showInputDialog("5° Pergunta: \n"
		    + "Qual a utilidade do JVM? \n"
			+ "1) Ambiente de desenvolvimento para dispositivos móveis ou\r\n"
			+ "portáteis, como telefones celulares e palmtops.\n"
			+ "2) Conjunto de ferramentas para a compilação, documentação e\r\n"
			+ "debug de aplicativos Java.  \n"
			+ "3) Software que emula uma CPU e Memória para a execução\\r\\n\"\r\n"
			+ "de programas Java."));
  
  switch(p5) {
	  case 1:
	      JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  case 2:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  case 3:
		  JOptionPane.showMessageDialog(null, "Você acertou!");
		  quiz1 += 15;
		  break;
  }
		  
	  if (quiz1 >= 60) {
	      JOptionPane.showMessageDialog(null, "Você concluiu o quiz de java, !Parabens!");

	  }
	  if (quiz1 < 60) {
	      JOptionPane.showMessageDialog(null, "Você reprovou no quiz de java");
	      break;
	  }
	  
	  JOptionPane.showMessageDialog(null, "!Quiz de BTS! \n Aperte 'Enter' para começar");
	  
	  q1 = Integer.parseInt(JOptionPane.showInputDialog("1° Pergunta: \n"
	  		+ "Quantos integrantes formam o grupo coreano 'BTS' \n"
			+ "1) 6 \n"
			+ "2) 7 \n"
			+ "3) 8"));
	  
    	  switch (q1) {
	  
	  case 1:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  case 2:
		  JOptionPane.showMessageDialog(null, "Você acertou!");
		  quiz1 += 15;
		  break;
	  case 3:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  }
		  
	  q2 = Integer.parseInt(JOptionPane.showInputDialog("2° Pergunta: \n"
	  		+ "Em coreano, a sigla 'BTS' é uma abreviação a 'Bangtan Sonyeondan'. O que essa frase significa em português?\n"
			+ "1) crianças perdidas \n"
			+ "2) adolescentes de A a Z \n"
			+ "3) escoteiros à prova de balas"));
			  
		  switch (q2) {
			  
	  case 1:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  case 2:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  case 3:
		  JOptionPane.showMessageDialog(null, "Você acertou!");
		  quiz1 += 15;
		  break;  
	  }
		  
	  q3 = Integer.parseInt(JOptionPane.showInputDialog("3° Pergunta: \n"
	 		+ "Quem é o membro mais novo? \n"
			+ "1) Jimin\r\n"
			+ "2) Taehyung \r\n"
			+ "3) Jungkook "));
				  
   		  switch (q3) {
				  
	  case 1:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  case 2:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  case 3:
		  JOptionPane.showMessageDialog(null, "Você acertou!");
		  quiz1 += 15;  
		  break;
			  }
	  q4 = Integer.parseInt(JOptionPane.showInputDialog("4° Pergunta: \n"
	 		+ "Qual a idade do membro mais novo? \n"
			+ "1) 29\r\n"
			+ "2) 26\r\n"
			+ "3) 20"));
			  
	      switch (q4) {
			  
	  case 1:
	      JOptionPane.showMessageDialog(null, "Você acertou!");
	      quiz1 += 15;
		  break;
	  case 2:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  case 3:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
			  }
			  
	  q5 = Integer.parseInt(JOptionPane.showInputDialog("5° Pergunta: \n"
			    + "Quem é o membro mais velho? \n"
				+ "a. Namjoon \r\n"
				+ "b. Yoongi \r\n"
				+ "c. Jin"));
	 
          switch(q5) {
	         
	  case 1:
	      JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  case 2:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  case 3:
		  JOptionPane.showMessageDialog(null, "Você acertou!");
		  quiz1 += 15;
		  break;
          }

	  q6 = Integer.parseInt(JOptionPane.showInputDialog("6° Pergunta: \n"
			  		+ "Qual a idade do membro mais velho? \n"
					+ "1) 33\r\n"
					+ "2) 28\r\n"
					+ "3) 36"));
			  
    	  switch (q6) {
			  
	  case 1:
		  JOptionPane.showMessageDialog(null, "Você acertou!");
		  quiz1 += 15;
		  break;
	  case 2:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  case 3:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  }
				  
	  q7 = Integer.parseInt(JOptionPane.showInputDialog("7° Pergunta: \n"
	  		+ "Quando o BTS estreou? \n"
			+ "1) 20 de fevereiro de 2015\r\n"
			+ "2) 13 de junho de 2013\r\n"
			+ "3) 18 de agosto de 2014"));
					  
		  switch (q7) {
					  
	  case 1:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  case 2:
		  JOptionPane.showMessageDialog(null, "Você acertou!");
		  quiz1 += 15;
		  break;
	  case 3:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  }
				  
	  q8 = Integer.parseInt(JOptionPane.showInputDialog("8° Pergunta: \n"
		  + "Qual foi o primeiro álbum do grupo? \n"
		  + "1) Wings \r\n"
		  + "2) Skool Luv Affair \r\n"
		  + "3) 2 Cool 4 Skool"));
				  
		  switch (q8) {
						  
	  case 1:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  case 2:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  case 3:
		  JOptionPane.showMessageDialog(null, "Você acertou!");
		  quiz1 += 15;  
		  break;
}
	  q9 = Integer.parseInt(JOptionPane.showInputDialog("9° Pergunta: \n"
	   	  + "Qual foi o último álbum lançado? \n"
		  + "1) BTS World OST\r\n"
		  + "2) Arirang \r\n"
	      + "3) LY: Answer "));
					  
	     switch (q9) {
					  
	  case 1:
	      JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	  case 2:
		  JOptionPane.showMessageDialog(null, "Você acertou!");
		  quiz1 += 15;
		  break;
	  case 3:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
}
					  
	  q10 = Integer.parseInt(JOptionPane.showInputDialog("10° Pergunta: \n"
	      + "Quantos shows o BTS fez em 2026 no Brasil? \n"
		  + "1) 1\r\n"
	   	  + "2) 2\r\n"
		  + "3) 3"));
			  
	     switch(q10) {
			         
	   case 1:
	      JOptionPane.showMessageDialog(null, "Você errou!");
	      break;
	   case 2:
		  JOptionPane.showMessageDialog(null, "Você errou!");
		  break;
	   case 3:
		  JOptionPane.showMessageDialog(null, "Você acertou!");
		  quiz1 += 15;
		  break;
	  }
	     
	     nomes[registros] = jogador;
			pontos[registros] = pontos1 + quiz1;
			registros++;


			String Ranking = " Ranking de Jogadores \n\n";
			for (int index = 0; index < registros; index++) {
				Ranking += (index + 1) + ". " + nomes[index] + ": " + pontos[index] + " pontos\n";
			}
			JOptionPane.showMessageDialog(null, Ranking);
	     
    String decisão = JOptionPane.showInputDialog("Você deseja jogar novamente? (S/N)");
    
    if (decisão.equalsIgnoreCase("n")) {
        fim++;
    }
    
    else {
    }
    
  }while (fim == 0);
	
   }
		
	}
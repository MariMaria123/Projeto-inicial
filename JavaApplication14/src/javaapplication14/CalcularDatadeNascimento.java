/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author silva
 */
public class CalcularDatadeNascimento {
     
   public static int calcularIdade(Date dataNascimento) {
        Calendar dataNasc = Calendar.getInstance();
        dataNasc.setTime(dataNascimento);

        Calendar hoje = Calendar.getInstance();
        hoje.getTime();

        int idade = hoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);
        dataNasc.add(Calendar.YEAR, idade);

        if (hoje.before(dataNasc)) {
            idade--;
        }
        return idade;
    }


    }


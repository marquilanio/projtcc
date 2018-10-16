package br.com.buonapizzaria.teste;

import java.util.Date;
import java.text.SimpleDateFormat;

public class FormatarData {
		
	public String formataDataJdbc(String data) {
		
		SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
        Date d1 = null;
        try {
            d1 = f.parse(data);            
        } catch (Exception e) {
            e.printStackTrace();
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        data = format.format(d1);
        return data;   
	}
	
	public String formataDataUsuario(String data) {
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-mm-dd");
        Date d1 = null;
        try {
            d1 = f.parse(data);            
        } catch (Exception e) {
            e.printStackTrace();
        }
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        data = format.format(d1);
        return data;
	}
}

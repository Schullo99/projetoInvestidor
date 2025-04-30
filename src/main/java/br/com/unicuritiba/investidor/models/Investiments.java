package br.com.unicuritiba.investidor.models;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity()
public class Investiments {
		


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private double quants;
	private double values;
	private String begin;
	private double valuesEnd;
	private String end;
	private double rent;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getQuants() {
		return quants;
	}
	public void setQuants(Double quants) {
		this.quants = quants;
	}
	public Double getValues() {
		return values;
	}
	public void setValues(Double values) {
		this.values = values;
	}
	public String getBegin() {
		return begin;
	}
	public void setBegin(String begin) {
		this.begin = begin;
	}
	public Double getValuesEnd() {
		return valuesEnd;
	}
	public void setValuesEnd(Double valuesEnd) {
		this.valuesEnd = valuesEnd;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public Double getRent() {
		return rent;
	}
	public void setRent(Double rent) {
		this.rent = rent;
	}
}




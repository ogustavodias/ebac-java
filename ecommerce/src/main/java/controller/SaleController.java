package controller;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import dao.SaleDAO;
import domain.Sale;

@Named
@ViewScoped
public class SaleController {

	private Sale sale;

	private Collection<Sale> sales;

	private SaleDAO dao;

	private Boolean isUpdate;

	@PostConstruct
	public void init() {
		try {
			this.isUpdate = false;
			this.sale = new Sale();
			this.sales = dao.searchAll();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar listar as vendas"));
		}
	}

	public void cancel() {
		try {
			this.isUpdate = false;
			this.sale = new Sale();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar cancelar ação"));
		}

	}

	public void edit(Sale sale) {
		try {
			this.isUpdate = true;
			this.sale = sale;
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar editar a venda"));
		}

	}

	public void delete(Sale sale) {
		try {
			dao.remove(sale);
			sales.remove(sale);
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar excluir a venda"));
		}

	}

	public void add() {
		try {
			dao.register(sale);
			this.sales = dao.searchAll();
			this.sale = new Sale();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar criar a venda"));
		}

	}

	public void update() {
		try {
			dao.edit(this.sale);
			cancel();
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Venda atualizada com sucesso"));
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar atualizar a venda"));
		}

	}

	public Collection<Sale> getSales() {
		return sales;
	}

	public void setSales(Collection<Sale> sales) {
		this.sales = sales;
	}

	public Sale getSale() {
		return this.sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public Boolean getIsUpdate() {
		return isUpdate;
	}

	public void setIsUpdate(Boolean isUpdate) {
		this.isUpdate = isUpdate;
	}

}

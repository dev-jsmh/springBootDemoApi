
package com.example.demo.model;

/**
 *
 * @author samuel
 * 
 * this class represents an invoice for clients when they buy a service
 */
public class ClientProductPurchaseInvoiceModel {
    
    private Long invoice_product_id;
            private String date;
            private Long client_id;
            private double subtotal;
            private double discount;
            private double total_value;

    public Long getInvoice_product_id() {
        return invoice_product_id;
    }

    public void setInvoice_product_id(Long invoice_product_id) {
        this.invoice_product_id = invoice_product_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotal_value() {
        return total_value;
    }

    public void setTotal_value(double total_value) {
        this.total_value = total_value;
    }
  
}

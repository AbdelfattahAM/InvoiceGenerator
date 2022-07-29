/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javafx.scene.shape.Line;

/**
 *
 * @author Ahmed
 */
public class Invoice {

    private int num;
    private String date;
    private String customer;
    private ArrayList<Line> lines;

    public Invoice() {
    }

    public Invoice(int num, String date, String customer) {
        this.num = num;
        this.date = date;
        this.customer = customer;
    }

    Line line = new Line();
   
    public double getInvoiceTotal() {
        double total = 0.0;
        for (Line line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }

    public ArrayList<Line> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public int getNum() {
        return num;
    }

    public String getDate() {
        return date;
    }

    public String getCustomer() {
        return customer;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + num + ", date=" + date + ", customer=" + customer + '}';
    }

    public String getAsCSV() {
        return num + "," + date + "," + customer;
    }

}

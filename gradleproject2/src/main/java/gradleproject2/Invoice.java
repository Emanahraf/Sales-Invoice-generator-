/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject2;

/**
 *
 * @author user
 */
public class Invoice  {
    public   int InvoiceNo ;
     public String InvoiceDate ;
     public String InvoiceCustomerName;
      public InvoicItem[] InvoiceItems = new InvoicItem[5] ;
     public Double Total=0.0;
     public int  Noitem;
     
     public Invoice(){
     
     }
     public Invoice( int InvoiceNo,String InvoiceDate ,String InvoiceCustomerName){
     this.InvoiceNo=InvoiceNo;
     this.InvoiceDate=InvoiceDate;
     this.InvoiceCustomerName=InvoiceCustomerName;
     this.Noitem=0;
     
     }
     
     // calCuale total invoice based on item Name 
     public void addinvoceItem(String name, double p ,int c ){
         
         InvoiceItems[Noitem]  = new InvoicItem(name,p,c);
         Total +=InvoiceItems[Noitem].CalcTotalItem(p,c);
        Noitem++;
      
     }
     }
    
    


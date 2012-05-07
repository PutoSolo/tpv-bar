package es.tpv_bar.persistencia.pojos;
// Generated 07-may-2012 8:14:14 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Configuracion generated by hbm2java
 */
@Entity
@Table(name="configuracion"
    ,catalog="mydb"
)
public class Configuracion  implements java.io.Serializable {


     private int id;
     private String clave;
     private String value;

    public Configuracion() {
    }

	
    public Configuracion(int id) {
        this.id = id;
    }
    public Configuracion(int id, String clave, String value) {
       this.id = id;
       this.clave = clave;
       this.value = value;
    }
   
     @Id 
    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Column(name="clave", length=45)
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    @Column(name="value", length=45)
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }




}



package Hibernate.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Enemigos
 */
@Entity
@Table(name = "Enemigos")
public class Enemigos implements java.io.Serializable {

    @Id
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "imagen")
    private String imagen;
    @Column(name = "nivel")
    private int nivel;
    @Column(name = "pg")
    private int pg;
    @Column(name = "mp")
    private int mp;
    @Column(name = "exp")
    private int exp;
    @Column(name = "ap")
    private int ap;
    @Column(name = "gil")
    private int gil;
    @Column(name = "debil")
    private String debil;
    @Column(name = "fuerte")
    private String fuerte;
    @Column(name = "absorve")
    private String absorve;
    @Column(name = "inmune")
    private String inmune;
    @Column(name = "jefe")
    private String jefe;

    public Enemigos() {
    }

    public Enemigos(String nombre, String imagen, int nivel, int pg, int mp, int exp, int ap, int gil, String debil, String fuerte, String absorve, String inmune, String jefe) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.nivel = nivel;
        this.pg = pg;
        this.mp = mp;
        this.exp = exp;
        this.ap = ap;
        this.gil = gil;
        this.debil = debil;
        this.fuerte = fuerte;
        this.absorve = absorve;
        this.inmune = inmune;
        this.jefe = jefe;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return this.imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPg() {
        return this.pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getExp() {
        return this.exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getAp() {
        return this.ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getGil() {
        return this.gil;
    }

    public void setGil(int gil) {
        this.gil = gil;
    }

    public String getDebil() {
        return this.debil;
    }

    public void setDebil(String debil) {
        this.debil = debil;
    }

    public String getFuerte() {
        return this.fuerte;
    }

    public void setFuerte(String fuerte) {
        this.fuerte = fuerte;
    }

    public String getAbsorve() {
        return this.absorve;
    }

    public void setAbsorve(String absorve) {
        this.absorve = absorve;
    }

    public String getInmune() {
        return this.inmune;
    }

    public void setInmune(String inmune) {
        this.inmune = inmune;
    }

    public String getJefe() {
        return this.jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

}

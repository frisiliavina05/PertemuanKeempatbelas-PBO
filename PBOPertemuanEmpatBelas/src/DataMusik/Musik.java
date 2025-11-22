/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataMusik;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "musik")
@NamedQueries({
    @NamedQuery(name = "Musik.findAll", query = "SELECT m FROM Musik m"),
    @NamedQuery(name = "Musik.findByIdMusik", query = "SELECT m FROM Musik m WHERE m.idMusik = :idMusik"),
    @NamedQuery(name = "Musik.findByJudul", query = "SELECT m FROM Musik m WHERE m.judul = :judul"),
    @NamedQuery(name = "Musik.findByArtis", query = "SELECT m FROM Musik m WHERE m.artis = :artis")})
public class Musik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_musik")
    private String idMusik;
    @Basic(optional = false)
    @Column(name = "judul")
    private String judul;
    @Basic(optional = false)
    @Column(name = "artis")
    private String artis;
    @JoinColumn(name = "id_album", referencedColumnName = "id_album")
    @ManyToOne
    private Album idAlbum;

    public Musik() {
    }

    public Musik(String idMusik) {
        this.idMusik = idMusik;
    }

    public Musik(String idMusik, String judul, String artis) {
        this.idMusik = idMusik;
        this.judul = judul;
        this.artis = artis;
    }

    public String getIdMusik() {
        return idMusik;
    }

    public void setIdMusik(String idMusik) {
        this.idMusik = idMusik;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getArtis() {
        return artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public Album getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Album idAlbum) {
        this.idAlbum = idAlbum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMusik != null ? idMusik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musik)) {
            return false;
        }
        Musik other = (Musik) object;
        if ((this.idMusik == null && other.idMusik != null) || (this.idMusik != null && !this.idMusik.equals(other.idMusik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataMusik.Musik[ idMusik=" + idMusik + " ]";
    }
    
}

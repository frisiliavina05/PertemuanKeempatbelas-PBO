/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataMusik;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "album")
@NamedQueries({
    @NamedQuery(name = "Album.findAll", query = "SELECT a FROM Album a"),
    @NamedQuery(name = "Album.findByIdAlbum", query = "SELECT a FROM Album a WHERE a.idAlbum = :idAlbum"),
    @NamedQuery(name = "Album.findByNamaAlbum", query = "SELECT a FROM Album a WHERE a.namaAlbum = :namaAlbum"),
    @NamedQuery(name = "Album.findByGenre", query = "SELECT a FROM Album a WHERE a.genre = :genre"),
    @NamedQuery(name = "Album.findByTahunRilis", query = "SELECT a FROM Album a WHERE a.tahunRilis = :tahunRilis")})
public class Album implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_album")
    private String idAlbum;
    @Basic(optional = false)
    @Column(name = "nama_album")
    private String namaAlbum;
    @Basic(optional = false)
    @Column(name = "genre")
    private String genre;
    @Basic(optional = false)
    @Column(name = "tahun_rilis")
    private int tahunRilis;
    @OneToMany(mappedBy = "idAlbum")
    private Collection<Musik> musikCollection;

    public Album() {
    }

    public Album(String idAlbum) {
        this.idAlbum = idAlbum;
    }

    public Album(String idAlbum, String namaAlbum, String genre, int tahunRilis) {
        this.idAlbum = idAlbum;
        this.namaAlbum = namaAlbum;
        this.genre = genre;
        this.tahunRilis = tahunRilis;
    }

    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getNamaAlbum() {
        return namaAlbum;
    }

    public void setNamaAlbum(String namaAlbum) {
        this.namaAlbum = namaAlbum;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public Collection<Musik> getMusikCollection() {
        return musikCollection;
    }

    public void setMusikCollection(Collection<Musik> musikCollection) {
        this.musikCollection = musikCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlbum != null ? idAlbum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Album)) {
            return false;
        }
        Album other = (Album) object;
        if ((this.idAlbum == null && other.idAlbum != null) || (this.idAlbum != null && !this.idAlbum.equals(other.idAlbum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataMusik.Album[ idAlbum=" + idAlbum + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Savio
 */
@Entity
@Table(name = "tbl_courses", catalog = "university", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblCourses.findAll", query = "SELECT t FROM TblCourses t"),
    @NamedQuery(name = "TblCourses.findByCrsId", query = "SELECT t FROM TblCourses t WHERE t.crsId = :crsId"),
    @NamedQuery(name = "TblCourses.findByCrsCode", query = "SELECT t FROM TblCourses t WHERE t.crsCode = :crsCode"),
    @NamedQuery(name = "TblCourses.findByCrsName", query = "SELECT t FROM TblCourses t WHERE t.crsName = :crsName"),
    @NamedQuery(name = "TblCourses.findByCrsDescription", query = "SELECT t FROM TblCourses t WHERE t.crsDescription = :crsDescription"),
    @NamedQuery(name = "TblCourses.findByCrsType", query = "SELECT t FROM TblCourses t WHERE t.crsType = :crsType"),
    @NamedQuery(name = "TblCourses.findByCrsNumberofcredit", query = "SELECT t FROM TblCourses t WHERE t.crsNumberofcredit = :crsNumberofcredit"),
    @NamedQuery(name = "TblCourses.findByCrsLab", query = "SELECT t FROM TblCourses t WHERE t.crsLab = :crsLab")})
public class TblCourses implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "crs_id")
    private Integer crsId;
    @Basic(optional = false)
    @Column(name = "crs_code")
    private String crsCode;
    @Basic(optional = false)
    @Column(name = "crs_name")
    private String crsName;
    @Column(name = "crs_description")
    private String crsDescription;
    @Basic(optional = false)
    @Column(name = "crs_type")
    private String crsType;
    @Basic(optional = false)
    @Column(name = "crs_numberofcredit")
    private int crsNumberofcredit;
    @Basic(optional = false)
    @Column(name = "crs_lab")
    private String crsLab;

    public TblCourses() {
    }

    public TblCourses(Integer crsId) {
        this.crsId = crsId;
    }

    public TblCourses(Integer crsId, String crsCode, String crsName, String crsType, int crsNumberofcredit, String crsLab) {
        this.crsId = crsId;
        this.crsCode = crsCode;
        this.crsName = crsName;
        this.crsType = crsType;
        this.crsNumberofcredit = crsNumberofcredit;
        this.crsLab = crsLab;
    }

    public Integer getCrsId() {
        return crsId;
    }

    public void setCrsId(Integer crsId) {
        Integer oldCrsId = this.crsId;
        this.crsId = crsId;
        changeSupport.firePropertyChange("crsId", oldCrsId, crsId);
    }

    public String getCrsCode() {
        return crsCode;
    }

    public void setCrsCode(String crsCode) {
        String oldCrsCode = this.crsCode;
        this.crsCode = crsCode;
        changeSupport.firePropertyChange("crsCode", oldCrsCode, crsCode);
    }

    public String getCrsName() {
        return crsName;
    }

    public void setCrsName(String crsName) {
        String oldCrsName = this.crsName;
        this.crsName = crsName;
        changeSupport.firePropertyChange("crsName", oldCrsName, crsName);
    }

    public String getCrsDescription() {
        return crsDescription;
    }

    public void setCrsDescription(String crsDescription) {
        String oldCrsDescription = this.crsDescription;
        this.crsDescription = crsDescription;
        changeSupport.firePropertyChange("crsDescription", oldCrsDescription, crsDescription);
    }

    public String getCrsType() {
        return crsType;
    }

    public void setCrsType(String crsType) {
        String oldCrsType = this.crsType;
        this.crsType = crsType;
        changeSupport.firePropertyChange("crsType", oldCrsType, crsType);
    }

    public int getCrsNumberofcredit() {
        return crsNumberofcredit;
    }

    public void setCrsNumberofcredit(int crsNumberofcredit) {
        int oldCrsNumberofcredit = this.crsNumberofcredit;
        this.crsNumberofcredit = crsNumberofcredit;
        changeSupport.firePropertyChange("crsNumberofcredit", oldCrsNumberofcredit, crsNumberofcredit);
    }

    public String getCrsLab() {
        return crsLab;
    }

    public void setCrsLab(String crsLab) {
        String oldCrsLab = this.crsLab;
        this.crsLab = crsLab;
        changeSupport.firePropertyChange("crsLab", oldCrsLab, crsLab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crsId != null ? crsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCourses)) {
            return false;
        }
        TblCourses other = (TblCourses) object;
        if ((this.crsId == null && other.crsId != null) || (this.crsId != null && !this.crsId.equals(other.crsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "university.TblCourses[ crsId=" + crsId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

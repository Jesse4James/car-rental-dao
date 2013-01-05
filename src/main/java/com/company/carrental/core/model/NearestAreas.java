package com.company.carrental.core.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Nearest_Areas")
public class NearestAreas {

    @Id private AreaMaster areaId;
    @Id private AreaMaster nearestAreaId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Area_Id" ,table = "AreaMaster")
    public AreaMaster getAreaId() {
        return areaId;
    }

    public void setAreaId(AreaMaster areaId) {
        this.areaId = areaId;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Nearest_Area_Id")
    public AreaMaster getNearestAreaId() {
        return nearestAreaId;
    }

    public void setNearestAreaId(AreaMaster nearestAreaId) {
        this.nearestAreaId = nearestAreaId;
    }

}

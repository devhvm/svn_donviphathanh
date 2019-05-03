package com.manager.donviphathanh.service.dto.common;

import com.manager.donviphathanh.service.dto.StatusDTO;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the NhomNoiDung entity.
 */
public class NhomNoiDungDTO extends AbstractAuditingDTO implements Serializable {

    private Long id;

    @NotNull
    private String nhomNoiDungCode;

    @NotNull
    private String name;

    @NotNull
    private StatusDTO status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNhomNoiDungCode() {
        return nhomNoiDungCode;
    }

    public void setNhomNoiDungCode(String nhomNoiDungCode) {
        this.nhomNoiDungCode = nhomNoiDungCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusDTO getStatus() {
        return status;
    }

    public void setStatus(StatusDTO status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        NhomNoiDungDTO nhomNoiDungDTO = (NhomNoiDungDTO) o;
        if (nhomNoiDungDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), nhomNoiDungDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "NhomNoiDungDTO{" +
            "id=" + getId() +
            ", nhomNoiDungCode='" + getNhomNoiDungCode() + "'" +
            ", name='" + getName() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
}